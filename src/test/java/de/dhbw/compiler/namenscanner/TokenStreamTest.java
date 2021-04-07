/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Testfall-Utility
 * 
 * **********************************************
 */

package de.dhbw.compiler.namenscanner;

import static org.junit.Assert.assertEquals;

import java.io.StringReader;

import de.dhbw.compiler.namenscanner.Token;

public abstract class TokenStreamTest {
	
	protected void testTokenList(String in, Token... TokenList) throws Exception {
		NamenScanner scanner = new NamenScanner(new StringReader(in));
		Token myToken;
		
		for (Token expected : TokenList) {
			myToken = scanner.nextToken();
			assertEquals("Expect Token "+expected.toString()+". Error in type.", 
					expected.getType(), myToken.getType());
			assertEquals("Expect Token "+expected.toString()+". Error in text.", 
					expected.getText(), myToken.getText());
		}
		
		myToken = scanner.nextToken();
		assertEquals("Expected End of File (EOF), read " + myToken.toString() + ".", Token.EOF, myToken.getType());	
	}
	
}
