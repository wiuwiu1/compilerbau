/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * - Scanner-Klasse
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

import de.dhbw.compiler.namenscanner.NamenScanner;

import java.io.Reader;

public class ASScanner {

	private final int ignore = -2;

	private enum ASState {BEGIN, AS, WS, Z, NA, N, KO, AE, NU, NUL, NULL, EOF}

	private Reader in = null;
	private ASState state = ASState.BEGIN;
	private int tokentype = Token.INVALID;
	private StringBuffer text = new StringBuffer();
	
	public ASScanner(Reader input) {
		this.in = input;
	}

	private Token step(int c, ASState newState, boolean create, int newTokenType) {
		Token res = null;
		if (create) {
			res = new Token(tokentype, text.toString());
			text = new StringBuffer();
		}
		if (c!=ignore) {
			text.append((char)c);
		}
		state = newState;
		tokentype = newTokenType;
		return res;
	}
	
	public Token nextToken() throws Exception {

		Token token = null;
		while (token == null) {
			int c = in.read();
			switch(state){
				case BEGIN:
					if(c == '[')
						token = step(c, ASState.AS, false, Token.AS);
					else
						throwError(c);
					break;
				case WS:
					switch(c){
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, ASState.WS, false, Token.INVALID);
							break;
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							token = step(c, ASState.Z, false, Token.Z);
							break;
						case ',':
							token = step(c, ASState.KO, false, Token.KO);
							break;
						case ']':
							token = step(c, ASState.AE, false, Token.AE);
							break;
						case 'n':
							token = step(c, ASState.N, false, Token.NA);
							break;
						default:
							if(c != 'n' && (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))){
								token = step(c, ASState.NA, false, Token.NA);
								//includes every letter except 'n' --> to change excluded letter change 'n' above
							}else{
								throwError(c);
							}
					}
					break;
				case AS:
				case KO:
					switch(c){
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, ASState.WS, true, Token.INVALID);
							break;
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							token = step(c, ASState.Z, true, Token.Z);
							break;
						case 'n':
							token = step(c, ASState.N, true, Token.NA);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, true, Token.NA);
								//includes every letter except 'n' --> to change excluded letter change 'n' above
							}else{
								throwError(c);
							}
					}
					break;
				case AE:
					switch(c){
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, ASState.WS, true, Token.INVALID);
							break;
						case -1:
							token = step(c, ASState.EOF, true, Token.EOF);
							break;
					}
					break;
				case Z:
					switch(c){
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							token = step(c, ASState.Z, false, Token.Z);
							break;
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, ASState.WS, true, Token.INVALID);
							break;
						case ',':
							token = step(c, ASState.KO, true, Token.KO);
							break;
						case ']':
							token = step(c, ASState.AE, true, Token.AE);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, false, Token.NA);
								// includes every letter (a-z;A-Z)
							}else{
								throwError(c);
							}
					}
					break;
				case NA:
				case NULL:
					switch(c){
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, ASState.WS, true, Token.INVALID);
							break;
						case ',':
							token = step(c, ASState.KO, true, Token.KO);
							break;
						case ']':
							token = step(c, ASState.AE, true, Token.AE);
							break;
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
							token = step(c, ASState.NA, false, Token.NA);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, false, Token.NA);
							}else{
								throwError(c);
							}
					}
					break;
				case N:
					switch(c){
						case 'u':
							token = step(c, ASState.NU, false, Token.NA);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, false, Token.NA);
							}else{
								throwError(c);
							}
					}
					break;
				case NU:
					switch(c){
						case 'l':
							token = step(c, ASState.NUL, false, Token.NA);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, false, Token.NA);
							}else{
								throwError(c);
							}
					}
					break;
				case NUL:
					switch(c){
						case 'l':
							token = step(c, ASState.NULL, false, Token.NULL);
							break;
						default:
							if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
								token = step(c, ASState.NA, false, Token.NA);
							}else{
								throwError(c);
							}
					}
					break;
				case EOF:
					token = step(c, ASState.EOF, true, Token.EOF);
			}
		}
		return token;
	}

	private void throwError(int c) throws Exception{

		throw new Exception("Unexpected character: "+ (char) c +" (" + c + ").");
	}

}
