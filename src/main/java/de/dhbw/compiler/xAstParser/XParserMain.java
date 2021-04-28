/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X Abstiegsparser
 * 
 * **********************************************
 */

package de.dhbw.compiler.xAstParser;

import java.io.PrintWriter;
import java.io.StringReader;



public class XParserMain {
	
	private static final String TESTMIN =	"program beginend;\n"+
											"begin\n"+
											"end.";
	
	private static final String TESTXmin1 = 
			"program xmin1;\n"+
			"begin\n"+
			"	y := 25+2*x-6*x;\n"+
			"   if x<y then \n"+
			"		begin\n" +
			"			x:= -3/6*(y+2);\n"+
			"   		if y<x then y:=y+3 else y:=y+4;\n"+
			"		end\n" +
			"	else\n" +
			"		begin\n" +
			"   		if y<x then y:=y+3;\n"+
			"			x:= y*(y-x)/y;\n"+
			"		end;\n" +
			"	y := x*y;\n"+
			"end.";
	
	private static final String TEST = 
			"program test2;\n"+
			"	x : int;\n"+
			"	y : float;\n"+
			"	z : string;\n"+
			"begin\n"+
			"	x := 4+5+6.2;\n"+
			"	y := 3.56+1.2e3+45.e-67+4e34+3E-1;\n"+
			"	z := \"Hello \\\"World\\\"\" + \":\";\n"+
			"	z := \"Peter\" + 4;\n"+
			"   if 2<3 then abc := 5 else abc := 7;\n"+
			"   while (x>y) y := y+1;\n"+
			"   begin\n"+
			"      for (x:=1; x<6; x:=x+1) y:=y+2;\n"+
			"   end;\n"+
			"end.";
	
	private static final String BEISPIELFOLIEN = 
			"program test5;\n"+
			"	read  x : int;\n"+
			"	print y : float;\n"+
			"	z : int;\n"+
			"begin\n"+
			"	while (x<4) begin\n"+
			"		for (z:=0; z<4; z:=z+1) x:=x+2;\n"+
			"		if x=4 then begin\n"+
			"			x:=z*(x+2);\n"+
			"			x:=x+10;\n"+
			"		end else y:=100.e-3;\n"+
			"	end;\n"+
			"end.\n";
	
	public static void main(String[] args) throws Exception {
		
		JFlexXScanner	scanner = new JFlexXScanner(new StringReader(TESTXmin1));
		TokenReader 	reader	= new TokenReader(scanner);
		XParser			parser	= new XParser(reader);
		
		Tree parseTree	= parser.parseProgram();

		System.out.println(parseTree);
		System.out.println("Anzahl Token:      "+reader.getTokenCount());
		System.out.println("Anzahl Vergleiche: "+parser.getComparecount());
		PrintWriter writer = new PrintWriter("parseTree.dot", "UTF-8");
		if (parseTree!=null) {
			writer.println(parseTree.toGraphvizDot());
		}
		writer.close();
	}

}
