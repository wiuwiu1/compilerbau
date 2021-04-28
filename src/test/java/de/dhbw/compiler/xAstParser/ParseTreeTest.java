/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X Abstiegsparser
 * - Testfall-Utility für Parser
 * 
 * **********************************************
 */


package de.dhbw.compiler.xAstParser;



import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public abstract class ParseTreeTest {
	
	protected void testParseTree(String in, String expected) throws Exception {
		JFlexXScanner scanner = new JFlexXScanner(new StringReader(in));
		TokenReader 	reader	= new TokenReader(scanner);
		XParser			parser	= new XParser(reader);
		
		Tree out = parser.parseProgram();
		
		if (out==null) {
			assertEquals(expected, out);
		} else {
			assertEquals(expected, out.toString());
		}
	}
	
}
