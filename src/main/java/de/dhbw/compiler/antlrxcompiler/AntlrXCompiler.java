/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Main-Klasse
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;

public class AntlrXCompiler {

	public static void saveToGrapvizDOT(Tree tree, String name) throws FileNotFoundException {
		StringTemplate dot = (new DOTTreeGenerator()).toDOT(tree);
		PrintWriter out = new PrintWriter(name);
		out.println(dot.toString());
		out.close();
	}
	
	public static void saveToJavaFile(StringTemplate template, String name) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(name);
		out.println(template.toString());
		out.close();
	}
	
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
	
	private static final String TEST2 = 
			"program test2;\n"+
			"begin\n"+
			"	x := 4-5*6*7+8/9;\n"+
			"	y := 0*x;\n"+
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
		
		XTreeAdaptor xTreeAdaptor = new XTreeAdaptor(); 
		
		ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(TEST2.getBytes())); 
		XLexer lexer = new XLexer(input);
		XParser parser = new XParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(xTreeAdaptor);
		CommonTree tree = parser.program().getTree();
		
		XtoJava xtoJava = new XtoJava(new CommonTreeNodeStream(xTreeAdaptor,tree));
		StringTemplate template = (StringTemplate) xtoJava.program().getTemplate();
		System.out.println(template.toString());
		
	}
}
