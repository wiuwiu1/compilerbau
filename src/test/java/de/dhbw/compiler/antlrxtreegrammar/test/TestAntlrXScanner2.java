/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Scanner 2
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxtreegrammar.test;

import org.junit.Test;

public class TestAntlrXScanner2 extends TokenStreamTest {
	
	@Test
	public void tokenIntConst() throws Exception {
		testTokenList("  0 ", true, new TestToken(getType("INTCONST"),"0",1,3));
		testTokenList("  1 ", true, new TestToken(getType("INTCONST"),"1",1,3));
		testTokenList("  12 ", true, new TestToken(getType("INTCONST"),"12",1,3));
		testTokenList("  123 ", true, new TestToken(getType("INTCONST"),"123",1,3));
		testTokenList("  1234567890 ", true, new TestToken(getType("INTCONST"),"1234567890",1,3));
		testTokenList("  78 ", true, new TestToken(getType("INTCONST"),"78",1,3));
	}

	@Test
	public void tokenFloatConst0() throws Exception {
		testTokenList("  0. ", true, new TestToken(getType("FLOATCONST"),"0.",1,3));
		testTokenList("  0.0 ", true, new TestToken(getType("FLOATCONST"),"0.0",1,3));
		testTokenList("  0.0e0 ", true, new TestToken(getType("FLOATCONST"),"0.0e0",1,3));
	}
	
	@Test
	public void tokenFloatConst1() throws Exception {
		testTokenList("  1. ", true, new TestToken(getType("FLOATCONST"),"1.",1,3));
		testTokenList("  1.1 ", true, new TestToken(getType("FLOATCONST"),"1.1",1,3));
		testTokenList("  1.1e1 ", true, new TestToken(getType("FLOATCONST"),"1.1e1",1,3));
		testTokenList("  1e1 ", true, new TestToken(getType("FLOATCONST"),"1e1",1,3));
	}
	
	@Test
	public void tokenFloatConst123() throws Exception {
		testTokenList("  0.12e34 ", true, new TestToken(getType("FLOATCONST"),"0.12e34",1,3));
		testTokenList("  0.045e23 ", true, new TestToken(getType("FLOATCONST"),"0.045e23",1,3));
		testTokenList("  123.4560e7890 ", true, new TestToken(getType("FLOATCONST"),"123.4560e7890",1,3));
		testTokenList("  0.12E34 ", true, new TestToken(getType("FLOATCONST"),"0.12E34",1,3));
		testTokenList("  0.045E23 ", true, new TestToken(getType("FLOATCONST"),"0.045E23",1,3));
		testTokenList("  123.4560E7890 ", true, new TestToken(getType("FLOATCONST"),"123.4560E7890",1,3));
	}
	
	@Test
	public void tokenStringConst() throws Exception {
		testTokenList("  \"hallo .: \" ", true, new TestToken(getType("STRINGCONST"),"\"hallo .: \"",1,3));
		testTokenList("  \" \\\" \" ", true, new TestToken(getType("STRINGCONST"),"\" \\\" \"",1,3));
		/*
		testTokenList("  \"hallo , \" ", true, 
				new TestToken(getType("INVALID"),"\"hallo ",1,3), 
				new TestToken(getType("INVALID"),"\" ",1,12));
		testTokenList("  \",\"", true, 
				new TestToken(getType("INVALID"),"\"",1,3), 
				new TestToken(getType("INVALID"),"\"",1,5)); */
	}
	
}
