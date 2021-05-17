/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Scanner 3
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxparser.test;

import org.junit.Test;

public class TestAntlrXScanner3 extends TokenStreamTest {
	
	@Test
	public void program1() throws Exception {
		testTokenList("program test1;\nbegin\nend.",false, 
				new TestToken(getType("PROGRAM"),"program",1,1),
				new TestToken(getType("ID"),"test1",1,9),
				new TestToken(getType(";"),";",1,14),
				new TestToken(getType("BEGIN"),"begin",2,1),
				new TestToken(getType("END"),"end",3,1),
				new TestToken(getType("."),".",3,4));
	}

	@Test
	public void program2() throws Exception {
		testTokenList(	"program test2;\n"+
						"	x : int;\n"+
						"	y : float;\n"+
						"	z : string;\n"+
						"begin\n"+
						"	x := 4+5+6.2;\n"+
						"	y := 3.56+1.2e3+45.e-67+4e34+3E-1;\n"+
						"	z := \"Hello \\\"World\\\"\" + \":\";\n"+
						"	z := \"Peter\" + 4;\n"+
						"	a := 3+4;\n"+
						"end.", false,
						// program test2;
						new TestToken(getType("PROGRAM"),"program",1,1),
						new TestToken(getType("ID"),"test2",1,9),
						new TestToken(getType(";"),";",1,14),
						// 	x : int;
						new TestToken(getType("ID"),"x",2,2),
						new TestToken(getType(":"),":",2,4),
						new TestToken(getType("INT"),"int",2,6),
						new TestToken(getType(";"),";",2,9),
						// 	y : float;
						new TestToken(getType("ID"),"y",3,2),
						new TestToken(getType(":"),":",3,4),
						new TestToken(getType("FLOAT"),"float",3,6),
						new TestToken(getType(";"),";",3,11),
						// 	z : string;
						new TestToken(getType("ID"),"z",4,2),
						new TestToken(getType(":"),":",4,4),
						new TestToken(getType("STRING"),"string",4,6),
						new TestToken(getType(";"),";",4,12),
						// begin
						new TestToken(getType("BEGIN"),"begin",5,1),
						// 	x := 4+5+6.2;
						new TestToken(getType("ID"),"x",6,2),
						new TestToken(getType(":="),":=",6,4),
						new TestToken(getType("INTCONST"),"4",6,7),
						new TestToken(getType("+"),"+",6,8),
						new TestToken(getType("INTCONST"),"5",6,9),
						new TestToken(getType("+"),"+",6,10),
						new TestToken(getType("FLOATCONST"),"6.2",6,11),
						new TestToken(getType(";"),";",6,14),
						// 	y := 3.56+1.2e3+45.e-67+4e34+3E-1;
						new TestToken(getType("ID"),"y",7,2),
						new TestToken(getType(":="),":=",7,4),
						new TestToken(getType("FLOATCONST"),"3.56",7,7),
						new TestToken(getType("+"),"+",7,11),
						new TestToken(getType("FLOATCONST"),"1.2e3",7,12),
						new TestToken(getType("+"),"+",7,17),
						new TestToken(getType("FLOATCONST"),"45.e-67",7,18),
						new TestToken(getType("+"),"+",7,25),
						new TestToken(getType("FLOATCONST"),"4e34",7,26),
						new TestToken(getType("+"),"+",7,30),
						new TestToken(getType("FLOATCONST"),"3E-1",7,31),
						new TestToken(getType(";"),";",7,35),
						// 	z := \"Hello \\\"World\\\"\" + \":\";
						new TestToken(getType("ID"),"z",8,2),
						new TestToken(getType(":="),":=",8,4),
						new TestToken(getType("STRINGCONST"),"\"Hello \\\"World\\\"\"",8,7),
						new TestToken(getType("+"),"+",8,25),
						new TestToken(getType("STRINGCONST"),"\":\"",8,27),
						new TestToken(getType(";"),";",8,30),
						// 	z := \"Peter\" + 4;
						new TestToken(getType("ID"),"z",9,2),
						new TestToken(getType(":="),":=",9,4),
						new TestToken(getType("STRINGCONST"),"\"Peter\"",9,7),
						new TestToken(getType("+"),"+",9,15),
						new TestToken(getType("INTCONST"),"4",9,17),
						new TestToken(getType(";"),";",9,18),
						// 	a := 3+4;
						new TestToken(getType("ID"),"a",10,2),
						new TestToken(getType(":="),":=",10,4),
						new TestToken(getType("INTCONST"),"3",10,7),
						new TestToken(getType("+"),"+",10,8),
						new TestToken(getType("INTCONST"),"4",10,9),
						new TestToken(getType(";"),";",10,10),
						// end.
						new TestToken(getType("END"),"end",11,1),
						new TestToken(getType("."),".",11,4));
	}
}
