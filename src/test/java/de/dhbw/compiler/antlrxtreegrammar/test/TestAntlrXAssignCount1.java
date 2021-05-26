/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für leere Baum-Grammmatik
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxtreegrammar.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAntlrXAssignCount1 extends AssignCountTest {
	
	@Test
	public void program00BeginEnd() throws Exception {
		String test =	"program beginEnd;\n"+
						"begin\n"+
						"end.";
		testTreeGrammarTree(test, 0);
	}

	@Test
	public void program02BeginEnd2() throws Exception {
		String test =	"program beginEnd2;\n"+
						"begin\n"+
						"	begin\n"+
						"	end;"+
						"end.";
		testTreeGrammarTree(test, 0);
	}

	
	@Test
	public void program10Assign() throws Exception {
		String test =	"program assign;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}

	@Test
	public void program16ExprPlusMinus() throws Exception {
		String test =	"program exprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1+-2-3+4;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}

	@Test
	public void program20Cond() throws Exception {
		String test =	"program cond;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then x:=1;"+
						"end.";
		testTreeGrammarTree(test, 1);
	}

	@Test
	public void program21CondElse() throws Exception {
		String test =	"program condElse;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2>3 then x:=1 else x:=2;"+
						"end.";
		testTreeGrammarTree(test, 2);
	}

	@Test
	public void program22CondElse2() throws Exception {
		String test =	"program condelse2;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2=3 then if 4<5 then x:=1 else x:=2 else x:=3;"+
						"end.";
		testTreeGrammarTree(test, 3);
	}

	
	@Test
	public void program23CondElse3() throws Exception {
		String test =	"program condelse3;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else if 6=7 then x:=2 else x:=3;"+
						"end.";
		testTreeGrammarTree(test, 3);
	}

	
	@Test
	public void program24CondElse4() throws Exception {
		String test =	"program condelse4;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else x:=2 else if 6=7 then x:=3 else x:=4;"+
						"end.";
		testTreeGrammarTree(test, 4);
	}

	
	@Test
	public void program90Xmin1() throws Exception {
		String test = "program xmin1;\n"+
				"	read x : int;\n"+
				"	print y : int;\n"+
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
		testTreeGrammarTree(test, 7);
	}

	
}
