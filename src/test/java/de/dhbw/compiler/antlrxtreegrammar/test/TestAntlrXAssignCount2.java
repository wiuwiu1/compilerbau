/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Parser 2
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxtreegrammar.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAntlrXAssignCount2 extends AssignCountTest {
	
	@Test
	public void program40FloatAssign() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=1.23e-45;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	
	@Test
	public void program41FloatExpr1() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0.0*1.1+2/-3.4e-6*(4.4-5+6.5)*7.4;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	
	@Test
	public void program42FloatExpr2() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0.0+-1.2--2.3*-4.5/-6.7;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	

	@Test
	public void program43StringAssign() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"begin\n"+
						"  x :=\"Hello\";"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	
	@Test
	public void program44StringExpr1() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"begin\n"+
						"	x := x + \"Hello\";"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	
	@Test
	public void program50LoopWhile1() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"begin\n"+
						"	while (2<x) x:= x+1;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}
	
	@Test
	public void program51LoopWhile2() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"begin\n"+
						"	while (2<x) begin "+
						"		x:= x+1;"+
						"		x:= x+1;"+
						"   end;"+
						"end.";
		testTreeGrammarTree(test, 2);
	}
	
	@Test
	public void program52LoopFor1() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"  y: string;"+
						"begin\n"+
						"	for (x:=1; x<10; x:=x+1) y:= y+1;"+
						"end.";
		testTreeGrammarTree(test, 3);
	}
	
	@Test
	public void program53LoopFor2() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: string;"+
						"  y: string;"+
						"begin\n"+
						"	for (x:=1; x<10; x:=x+1) begin y:= y+1; end;"+
						"end.";
		testTreeGrammarTree(test, 3);
	}
	
	
	@Test
	public void program91BeispielFolien() throws Exception {
		String test =	"program test5;\n"+
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
		testTreeGrammarTree(test, 6);
	}

	
}
