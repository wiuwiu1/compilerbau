/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert 1
 * 
 * **********************************************
 */

package de.dhbw.compiler.namenscanner;

import java.io.Reader;

public class NamenScanner {
		
	private final int ignore = -2;
	
	private Reader in = null;
	private StringBuffer text = new StringBuffer();
	
	private enum NamenState { WS, P, PE, PET, PETR, PETRA, PETE, PETER, A, AN, ANN, ANNA, EOF};
	
	private NamenState state = NamenState.WS;
	private int tokentype = Token.INVALID;
	
	public NamenScanner(Reader input) {
		this.in = input;
	}
	
	private Token step(int c, NamenState newState, boolean create, int newTokenType) {
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
			switch (state) {
				case EOF:
					token = step(c, NamenState.EOF, true, Token.EOF);
					break;
				case WS:
					switch (c) {
						case ' ':
						case '\t':
						case '\n':
						case '\r':
							token = step(ignore, NamenState.WS, false, Token.INVALID);
							break;
						case 'a':
							token = step(c, NamenState.A, false, Token.INVALID);
							break;
						case 'p':
							token = step(c, NamenState.P, false, Token.INVALID);
							break;
						case -1:
							token = step(ignore, NamenState.EOF, false, Token.EOF);
							break;
						default:
							throwError(c);
					}
					break;
				case A:
					switch (c) {
						case 'n':
							token = step(c, NamenState.AN, false, Token.INVALID);
							break;
						default:
							throwError(c);
					}
					break;
				case AN:
					switch (c) {
						case 'n':
							token = step(c, NamenState.ANN, false, Token.INVALID);
							break;
						default:
							throwError(c);
					}
					break;
				case ANN:
					switch (c) {
						case 'a':
							token = step(c, NamenState.ANNA, false, Token.ANNA);
							break;
						default:
							throwError(c);
					}
					break;
				case ANNA:
				case PETRA:
				case PETER:
					token = fetchName(c);
					break;
				case P:
					switch (c) {
						case 'e':
							token = step(c, NamenState.PE, false, Token.INVALID);
							break;
						default:
							throwError(c);
					}
					break;
				case PE:
					switch (c) {
						case 't':
							token = step(c, NamenState.PET, false, Token.INVALID);
							break;
						default:
							throwError(c);
					}
					break;
				case PET:
					switch (c) {
						case 'e':
							token = step(c, NamenState.PETE, false, Token.INVALID);
							break;
						case 'r':
							token = step(c, NamenState.PETR, false, Token.INVALID);
							break;
						default:
							throwError(c);
					}
					break;
				case PETE:
					switch (c) {
						case 'r':
							token = step(c, NamenState.PETER, false, Token.PETER);
							break;
						default:
							throwError(c);
					}
					break;
				case PETR:
					switch (c) {
						case 'a':
							token = step(c, NamenState.PETRA, false, Token.PETRA);
							break;
						default:
							throwError(c);
					}
					break;
			}
		}
		return token;
	}

	private Token fetchName(int c) throws Exception {
		Token token = null;
		switch (c) {
			case ' ':
			case '\t':
			case '\n':
			case '\r':
				token = step(ignore, NamenState.WS, true, Token.INVALID);
				break;
			case 'a':
				token = step(c, NamenState.A, true, Token.INVALID);
				break;
			case 'p':
				token = step(c, NamenState.P, true, Token.INVALID);
				break;
			case -1:
				token = step(ignore, NamenState.EOF, true, Token.EOF);
				break;
			default:
				throwError(c);
		}
		return token;
	}

	private void throwError(int c) throws Exception {
		throw new Exception("Unexpected character: "+ (char) c + " (" + c + ")");
	}

}
