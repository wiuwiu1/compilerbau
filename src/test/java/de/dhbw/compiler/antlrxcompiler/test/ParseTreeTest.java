/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testfall-Utility für Parser
 * 
 * **********************************************
 */


package de.dhbw.compiler.antlrxcompiler.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;

import de.dhbw.compiler.antlrxcompiler.XLexer;
import de.dhbw.compiler.antlrxcompiler.XParser;
import de.dhbw.compiler.antlrxcompiler.XTreeAdaptor;

public abstract class ParseTreeTest {
	
	protected void testParseTree(String in, String expected) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(in.getBytes())); 
		XLexer scanner = new XLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(scanner);
		XParser			parser	= new XParser(tokens);
		parser.setTreeAdaptor(new XTreeAdaptor());
		ParserRuleReturnScope result = parser.program();
		CommonTree out = (CommonTree) result.getTree();
		
		if (out==null) {
			assertEquals(expected, out);
		} else {
			assertEquals(expected, out.toStringTree());
		}
	}
	
}
