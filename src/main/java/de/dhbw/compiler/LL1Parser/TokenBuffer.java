/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - Token-Puffer
 * 
 * **********************************************
 */

package de.dhbw.compiler.LL1Parser;

import java.io.IOException;

public class TokenBuffer {
	
	private JFlexXScanner scanner;
	private int count = 0;
	private Token token = null;
	
	public TokenBuffer(JFlexXScanner scanner) throws IOException {
		this.scanner = scanner;
		token = scanner.nextToken();
		count++;
	}
	
	public Token nextToken() throws IOException {
		Token help = token;
		if (help.getType()!=Token.EOF) {
			token = scanner.nextToken();
			count++;
		}
		return help;
	}
	
	public Token lookaheadToken()  {
		return token;
	}
	
	public int getTokenCount() {
		return count;
	}

}
