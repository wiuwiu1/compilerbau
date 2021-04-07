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
			token = new Token(Token.INVALID, "Change this");
		}
		return token;
	}

}
