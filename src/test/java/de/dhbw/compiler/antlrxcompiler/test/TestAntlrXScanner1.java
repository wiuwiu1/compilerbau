/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Scanner 1
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler.test;

import org.junit.Test;

public class TestAntlrXScanner1 extends TokenStreamTest {
	
	@Test
	public void tokenID() throws Exception {
		testTokenList("  a ", false, new TestToken(getType("ID"),"a",1,3));
		testTokenList("  A ", false, new TestToken(getType("ID"),"A",1,3));
		testTokenList("  x ", false, new TestToken(getType("ID"),"x",1,3));
		testTokenList("  X ", false, new TestToken(getType("ID"),"X",1,3));
		testTokenList("  X0 ", false, new TestToken(getType("ID"),"X0",1,3));
		testTokenList("  a1 ", false, new TestToken(getType("ID"),"a1",1,3));
		testTokenList("  abcdefghijklmnopqrstuvwxyz ", false, new TestToken(getType("ID"),"abcdefghijklmnopqrstuvwxyz",1,3));
		testTokenList("  ABCDEFGHIJKLMNOPQRSTUVWXYZ ", false, new TestToken(getType("ID"),"ABCDEFGHIJKLMNOPQRSTUVWXYZ",1,3));
		testTokenList("  NULL ", false, new TestToken(getType("ID"),"NULL",1,3));
		testTokenList("  NulL ", false, new TestToken(getType("ID"),"NulL",1,3));
		testTokenList("  null ", false, new TestToken(getType("ID"),"null",1,3));
		testTokenList("  elsethen ", false, new TestToken(getType("ID"),"elsethen",1,3));
		testTokenList("  beginner ", false, new TestToken(getType("ID"),"beginner",1,3));
		testTokenList("  0a1 ", false, new TestToken(getType("INTCONST"),"0",1,3), new TestToken(getType("ID"),"a1",1,4));
		testTokenList("  9a8 ", false, new TestToken(getType("INTCONST"),"9",1,3), new TestToken(getType("ID"),"a8",1,4));
	}

	@Test
	public void tokenIntConst1() throws Exception {
		testTokenList("  0 ", false, new TestToken(getType("INTCONST"),"0",1,3));
		testTokenList("  9 ", false, new TestToken(getType("INTCONST"),"9",1,3));
		testTokenList("  1234567890 ", false, new TestToken(getType("INTCONST"),"1234567890",1,3));
	}

	@Test
	public void tokenIntConst2() throws Exception {
		testTokenList("  00 ", true, new TestToken(getType("INTCONST"),"0",1,3), 
									 new TestToken(getType("INTCONST"),"0",1,4));
		testTokenList("  004500 ", true, new TestToken(getType("INTCONST"),"0",1,3), 
										 new TestToken(getType("INTCONST"),"0",1,4), 
										 new TestToken(getType("INTCONST"),"4500",1,5));
		testTokenList("  078 ", true, new TestToken(getType("INTCONST"),"0",1,3), 
									  new TestToken(getType("INTCONST"),"78",1,4));
		testTokenList("  -0 ", true, new TestToken(getType("-"), "-", 1,3), 
									 new TestToken(getType("INTCONST"),"0",1,4));
		testTokenList("  -1 ", true, new TestToken(getType("-"), "-", 1,3), 
				 					 new TestToken(getType("INTCONST"),"1",1,4));
	}
	
	@Test
	public void tokenFloatConst1() throws Exception {
		testTokenList("  0. ", false, new TestToken(getType("FLOATCONST"),"0.",1,3));
		testTokenList("  1. ", false, new TestToken(getType("FLOATCONST"),"1.",1,3));
		testTokenList("  1.2 ", false, new TestToken(getType("FLOATCONST"),"1.2",1,3));
		testTokenList("  1.23 ", false, new TestToken(getType("FLOATCONST"),"1.23",1,3));
		testTokenList("  3.4e5 ", false, new TestToken(getType("FLOATCONST"),"3.4e5",1,3));
		testTokenList("  3.4e567 ", false, new TestToken(getType("FLOATCONST"),"3.4e567",1,3));
		testTokenList("  3.4e-5 ", false, new TestToken(getType("FLOATCONST"),"3.4e-5",1,3));
		testTokenList("  3.4e-567 ", false, new TestToken(getType("FLOATCONST"),"3.4e-567",1,3));
		testTokenList("  6.7E8 ", false, new TestToken(getType("FLOATCONST"),"6.7E8",1,3));
		testTokenList("  6.7E-8 ", false, new TestToken(getType("FLOATCONST"),"6.7E-8",1,3));
		testTokenList("  6.7E-890 ", false, new TestToken(getType("FLOATCONST"),"6.7E-890",1,3));
		testTokenList("  0.0 e ", false, 
				new TestToken(getType("FLOATCONST"),"0.0",1,3),
				new TestToken(getType("ID"),"e",1,7));
		testTokenList("  0.0e ", false, 
				new TestToken(getType("FLOATCONST"),"0.0",1,3),
				new TestToken(getType("ID"),"e",1,6));
		testTokenList("  0.0E ", false,  
				new TestToken(getType("FLOATCONST"),"0.0",1,3),
				new TestToken(getType("ID"),"E",1,6));
		testTokenList("  0.0e- ", false,  
				new TestToken(getType("FLOATCONST"),"0.0",1,3),
				new TestToken(getType("ID"),"e",1,6),
				new TestToken(getType("-"),"-",1,7));
		testTokenList("  0.0E- ", false,  
				new TestToken(getType("FLOATCONST"),"0.0",1,3),
				new TestToken(getType("ID"),"E",1,6),
				new TestToken(getType("-"),"-",1,7));
		testTokenList("  0.0-e ", false, new TestToken(getType("FLOATCONST"),"0.0",1,3),
										 new TestToken(getType("-"),"-",1,6),
										 new TestToken(getType("ID"),"e",1,7));
		testTokenList("  0.03 ", false, new TestToken(getType("FLOATCONST"),"0.03",1,3));
	}

	@Test
	public void tokenFloatConst2() throws Exception {
		testTokenList("  -1. ", false, new TestToken(getType("-"), "-", 1,3), 
				 				new TestToken(getType("FLOATCONST"),"1.",1,4));
		testTokenList("  -1.2 ", false, new TestToken(getType("-"), "-", 1,3), 
				 					    new TestToken(getType("FLOATCONST"),"1.2",1,4));
		testTokenList("  3.4e05 ", false, new TestToken(getType("FLOATCONST"),"3.4e0",1,3), 
										  new TestToken(getType("INTCONST"),"5",1,8));
		testTokenList("  06.7e8 ", false, new TestToken(getType("INTCONST"),"0",1,3), 
										  new TestToken(getType("FLOATCONST"),"6.7e8",1,4));
		testTokenList("  9.01e-05. ", false, new TestToken(getType("FLOATCONST"),"9.01e-0",1,3), 
				    						 new TestToken(getType("FLOATCONST"),"5.",1,10));
		testTokenList("  6.07E089 ", false, new TestToken(getType("FLOATCONST"),"6.07E0",1,3), 
				  							new TestToken(getType("INTCONST"),"89",1,9));
	}

	@Test
	public void tokenStringConst() throws Exception {
		testTokenList("  \"a\" ", false, new TestToken(getType("STRINGCONST"),"\"a\"",1,3));
		testTokenList("  \"\" ", false, new TestToken(getType("STRINGCONST"),"\"\"",1,3));
		testTokenList("  \"abcdefghijklmnopqrstuvwxyz\" ", false, 
				new TestToken(getType("STRINGCONST"),"\"abcdefghijklmnopqrstuvwxyz\"",1,3));
		testTokenList("  \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\" ", false, 
				new TestToken(getType("STRINGCONST"),"\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"",1,3));
		testTokenList("  \"\\\".: abcd\"", false, 
				new TestToken(getType("STRINGCONST"),"\"\\\".: abcd\"",1,3)); 
		/* 
		testTokenList("  \"+\" ", false, new TestToken(getType("INVALID"),"\"",1,3), 
				 						 new TestToken(getType("+"),"+",1,4), 
				 						 new TestToken(getType("INVALID"),"\"",1,5));
		testTokenList("  \";\" ", false, new TestToken(getType("INVALID"),"\"",1,3), 
				 						 new TestToken(getType(";"),";",1,4), 
				 						 new TestToken(getType("INVALID"),"\"",1,5));
		testTokenList("  \"?\" ", false, new TestToken(getType("INVALID"),"\"",1,3), 
				 						 new TestToken(getType("INVALID"),"?",1,4), 
				 						 new TestToken(getType("INVALID"),"\"",1,5));
		testTokenList("  \"\\\" ", false, new TestToken(getType("INVALID"),"\"",1,3), 
										  new TestToken(getType("INVALID"),"\\",1,4), 
										  new TestToken(getType("INVALID"),"\"",1,5));
		testTokenList("  \"abcd ", false, new TestToken(getType("INVALID"),"\"",1,3), 
				  						  new TestToken(getType("INVALID"),"abcd",1,4)); */
	}

	@Test
	public void tokenLBR() throws Exception {
		testTokenList("  ( ", false, new TestToken(getType("("),"(",1,3));
	}

	@Test
	public void tokenRBR() throws Exception {
		testTokenList("  ) ", false, new TestToken(getType(")"),")",1,3));
	}

	@Test
	public void tokenMULT() throws Exception {
		testTokenList("  * ", false, new TestToken(getType("*"),"*",1,3));
	}
	
	@Test
	public void tokenPLUS() throws Exception {
		testTokenList("  + ", false, new TestToken(getType("+"),"+",1,3));
	}
	
	@Test
	public void tokenMINUS() throws Exception {
		testTokenList("  - ", false, new TestToken(getType("-"),"-",1,3));
	}
	
	@Test
	public void tokenDOT() throws Exception {
		testTokenList("  . ", false, new TestToken(getType("."),".",1,3));
	}
	
	@Test
	public void tokenDIV() throws Exception {
		testTokenList("  / ", false, new TestToken(getType("/"),"/",1,3));
	}
	
	@Test
	public void tokenCOLON() throws Exception {
		testTokenList("  : ", false, new TestToken(getType(":"),":",1,3));
	}
	
	@Test
	public void tokenASSIGN() throws Exception {
		testTokenList("  := ", false, new TestToken(getType(":="),":=",1,3));
	}
	
	@Test
	public void tokenSEMICOLON() throws Exception {
		testTokenList("  ; ", false, new TestToken(getType(";"),";",1,3));
	}
	
	@Test
	public void tokenLESS() throws Exception {
		testTokenList("  < ", false, new TestToken(getType("<"),"<",1,3));
	}
	
	@Test
	public void tokenEQUALS() throws Exception {
		testTokenList("  = ", false, new TestToken(getType("="),"=",1,3));
	}
	
	@Test
	public void tokenMORE() throws Exception {
		testTokenList("  > ", false, new TestToken(getType(">"),">",1,3));
	}

	@Test
	public void tokenBEGIN() throws Exception {
		testTokenList("  begin ", false, new TestToken(getType("BEGIN"),"begin",1,3));
	}

	@Test
	public void tokenELSE() throws Exception {
		testTokenList("  else ", false, new TestToken(getType("ELSE"),"else",1,3));
	}

	@Test
	public void tokenEND() throws Exception {
		testTokenList("  end ", false, new TestToken(getType("END"),"end",1,3));
	}

	@Test
	public void tokenFLOAT() throws Exception {
		testTokenList("  float ", false, new TestToken(getType("FLOAT"),"float",1,3));
	}

	@Test
	public void tokenFOR() throws Exception {
		testTokenList("  for ", false, new TestToken(getType("FOR"),"for",1,3));
	}

	@Test
	public void tokenIF() throws Exception {
		testTokenList("  if ", false, new TestToken(getType("IF"),"if",1,3));
	}

	@Test
	public void tokenINT() throws Exception {
		testTokenList("  int ", false, new TestToken(getType("INT"),"int",1,3));
	}

	@Test
	public void tokenPRINT() throws Exception {
		testTokenList("  print ", false, new TestToken(getType("PRINT"),"print",1,3));
	}

	@Test
	public void tokenPROGRAM() throws Exception {
		testTokenList("  program ", false, new TestToken(getType("PROGRAM"),"program",1,3));
	}

	@Test
	public void tokenREAD() throws Exception {
		testTokenList("  read ", false, new TestToken(getType("READ"),"read",1,3));
	}

	@Test
	public void tokenSTRING() throws Exception {
		testTokenList("  string ", false, new TestToken(getType("STRING"),"string",1,3));
	}

	@Test
	public void tokenTHEN() throws Exception {
		testTokenList("  then ", false, new TestToken(getType("THEN"),"then",1,3));
	}

	@Test
	public void tokenWHILE() throws Exception {
		testTokenList("  while ", false, new TestToken(getType("WHILE"),"while",1,3));
	}

	@Test
	public void tokenEOF() throws Exception {
		testTokenList(" ", false);
		testTokenList(" ", false, new TestToken(-1,"",1,2));
		testTokenList("", false, new TestToken(-1,"",1,1));
	}

	@Test
	public void invalidÄ() throws Exception {
		testTokenList(" Ä ", false, new TestToken(getType("INVALID"),"Ä",1,2));	
	}
	
	@Test
	public void invalidGatter() throws Exception {
		testTokenList(" # ", false, new TestToken(getType("INVALID"),"#",1,2));	
	}
	
}
