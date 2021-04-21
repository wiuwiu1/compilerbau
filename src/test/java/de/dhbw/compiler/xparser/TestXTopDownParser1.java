/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X Abstiegsparser
 * - Testklasse Syntax für Xmin-Anteil
 * 
 * **********************************************
 */

package de.dhbw.compiler.xparser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestXTopDownParser1 extends ParseTreeTest {
	
	@Test
	public void program00BeginEnd() throws Exception {
		String test =	"program beginEnd;\n"+
						"begin\n"+
						"end.";
		String expected = "(APROGRAM program beginEnd ; DECLLIST (BLOCK begin STATLIST end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program01BeginEndMore() throws Exception {
		String test =	"program beginEndMore;\n"+
						"begin\n"+
						"end. falsch";
		String expected = null;
		testParseTree(test, expected);
	}
	
	@Test
	public void program02BeginEnd2() throws Exception {
		String test =	"program beginEnd2;\n"+
						"begin\n"+
						"	begin\n"+
						"	end;"+
						"end.";
		String expected = "(APROGRAM program beginEnd2 ; DECLLIST (BLOCK begin (STATLIST "+
						  "(STATWITHSEMI (STAT (BLOCK begin STATLIST end)) ;)) end) . )";
		testParseTree(test, expected);
	}

	
	@Test
	public void program10Assign() throws Exception {
		String test =	"program assign;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0;"+
						"end.";
		String expected = "(APROGRAM program assign ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program11ExprPlus() throws Exception {
		String test =	"program exprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1;"+
						"end.";
		String expected = "(APROGRAM program exprPlus ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0)) + (EXPR (EXPR2 (EXPR3 1)))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program12ExprMinus() throws Exception {
		String test =	"program exprMinus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0-1;"+
						"end.";
		String expected = "(APROGRAM program exprMinus ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0)) - (EXPR (EXPR2 (EXPR3 1)))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program13ExprMul() throws Exception {
		String test =	"program exprMul;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0*1;"+
						"end.";
		String expected = "(APROGRAM program exprMul ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0) * (EXPR2 (EXPR3 1)))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program14ExprDiv() throws Exception {
		String test =	"program exprDiv;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0/1;"+
						"end.";
		String expected = "(APROGRAM program exprDiv ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0) / (EXPR2 (EXPR3 1)))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program15ExprUMinus() throws Exception {
		String test =	"program exprUMinus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0--1;"+
						"end.";
		String expected = "(APROGRAM program exprUMinus ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0)) - (EXPR (EXPR2 (EXPR3 - 1)))))) ;)) end) . )";
		testParseTree(test, expected);
	}


	@Test
	public void program16ExprPlusMinus() throws Exception {
		String test =	"program exprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1+-2-3+4;"+
						"end.";
		String expected = "(APROGRAM program exprPlus ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0)) + (EXPR (EXPR2 (EXPR3 1)) + "+
						  "(EXPR (EXPR2 (EXPR3 - 2)) - (EXPR (EXPR2 (EXPR3 3)) + (EXPR (EXPR2 (EXPR3 4))))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program17ExprMulDiv() throws Exception {
		String test =	"program exprMul;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0*1/2*-3*4;"+
						"end.";
		String expected = "(APROGRAM program exprMul ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0) * (EXPR2 (EXPR3 1) / (EXPR2 (EXPR3 2) *"+
						  " (EXPR2 (EXPR3 - 3) * (EXPR2 (EXPR3 4))))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program18ExprAll() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0*1+2/-3*(4-5+6)*7;"+
						"end.";
		String expected = "(APROGRAM program exprAll ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0) * (EXPR2 (EXPR3 1))) + (EXPR (EXPR2 (EXPR3 2) "+
						  "/ (EXPR2 (EXPR3 - 3) * (EXPR2 (EXPR3 ( (EXPR (EXPR2 (EXPR3 4)) - (EXPR (EXPR2 (EXPR3 5)) "+
						  "+ (EXPR (EXPR2 (EXPR3 6))))) )) * (EXPR2 (EXPR3 7))))))))) ;)) end) . )";
		testParseTree(test, expected);
	}
	
	@Test
	public void program19ExprVar() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: int;"+
						"  y: int;"+
						"  z: int;"+
						"begin\n"+
						"	x :=0*x+y;"+
						"end.";
		String expected = "(APROGRAM program exprAll ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;) "+
						  "(DECL MODIFIER y : (TYPE int) ;) (DECL MODIFIER z : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 0) * (EXPR2 (EXPR3 x))) + (EXPR (EXPR2 (EXPR3 y)))))) ;)) end) . )";
		testParseTree(test, expected);
	}
	
	@Test
	public void program20Cond() throws Exception {
		String test =	"program cond;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then x:=1;"+
						"end.";
		String expected = "(APROGRAM program cond ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 2))) < (EXPR (EXPR2 (EXPR3 3)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 1))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program21CondElse() throws Exception {
		String test =	"program condElse;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2>3 then x:=1 else x:=2;"+
						"end.";
		String expected = "(APROGRAM program condElse ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 2))) > (EXPR (EXPR2 (EXPR3 3)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 1))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 2))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	@Test
	public void program22CondElse2() throws Exception {
		String test =	"program condelse2;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2=3 then if 4<5 then x:=1 else x:=2 else x:=3;"+
						"end.";
		String expected = "(APROGRAM program condelse2 ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 2))) = (EXPR (EXPR2 (EXPR3 3)))) "+
						  "then (STAT (CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 4))) < (EXPR (EXPR2 (EXPR3 5)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 1))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 2))))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 3))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	
	@Test
	public void program23CondElse3() throws Exception {
		String test =	"program condelse3;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else if 6=7 then x:=2 else x:=3;"+
						"end.";
		String expected = "(APROGRAM program condelse3 ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 2))) < (EXPR (EXPR2 (EXPR3 3)))) "+
						  "then (STAT (CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 4))) > (EXPR (EXPR2 (EXPR3 5)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 1))))) "+
						  "else (STAT (CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 6))) = (EXPR (EXPR2 (EXPR3 7)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 2))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 3))))))))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	
	@Test
	public void program24CondElse4() throws Exception {
		String test =	"program condelse4;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else x:=2 else if 6=7 then x:=3 else x:=4;"+
						"end.";
		String expected = "(APROGRAM program condelse4 ; (DECLLIST (DECL MODIFIER x : (TYPE int) ;))"+
						  " (BLOCK begin (STATLIST (STATWITHSEMI (STAT "+
						  "(CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 2))) < (EXPR (EXPR2 (EXPR3 3)))) "+
						  "then (STAT (CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 4))) > (EXPR (EXPR2 (EXPR3 5)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 1))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 2))))))) "+
						  "else (STAT (CONDSTAT if (COND (EXPR (EXPR2 (EXPR3 6))) = (EXPR (EXPR2 (EXPR3 7)))) "+
						  "then (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 3))))) "+
						  "else (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 4))))))))) ;)) end) . )";
		testParseTree(test, expected);
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
		String expected = "(APROGRAM program xmin1 ; (DECLLIST (DECL (MODIFIER read) x : (TYPE int) ;) "+
				"(DECL (MODIFIER print) y : (TYPE int) ;)) "+
				"(BLOCK begin (STATLIST (STATWITHSEMI (STAT (ASSIGNSTAT y := (EXPR (EXPR2 (EXPR3 25)) "+
				"+ (EXPR (EXPR2 (EXPR3 2) * (EXPR2 (EXPR3 x))) - (EXPR (EXPR2 (EXPR3 6) "+
				"* (EXPR2 (EXPR3 x)))))))) ;) (STATWITHSEMI (STAT (CONDSTAT "+
				"if (COND (EXPR (EXPR2 (EXPR3 x))) < (EXPR (EXPR2 (EXPR3 y)))) "+
				"then (STAT (BLOCK begin (STATLIST (STATWITHSEMI (STAT (ASSIGNSTAT x "+
				":= (EXPR (EXPR2 (EXPR3 - 3) / (EXPR2 (EXPR3 6) * (EXPR2 (EXPR3 ( (EXPR (EXPR2 (EXPR3 y)) "+
				"+ (EXPR (EXPR2 (EXPR3 2)))) )))))))) ;) (STATWITHSEMI (STAT (CONDSTAT "+
				"if (COND (EXPR (EXPR2 (EXPR3 y))) < (EXPR (EXPR2 (EXPR3 x)))) "+
				"then (STAT (ASSIGNSTAT y := (EXPR (EXPR2 (EXPR3 y)) + (EXPR (EXPR2 (EXPR3 3)))))) "+
				"else (STAT (ASSIGNSTAT y := (EXPR (EXPR2 (EXPR3 y)) + (EXPR (EXPR2 (EXPR3 4)))))))) ;)) "+
				"end)) else (STAT (BLOCK begin (STATLIST (STATWITHSEMI (STAT (CONDSTAT "+
				"if (COND (EXPR (EXPR2 (EXPR3 y))) < (EXPR (EXPR2 (EXPR3 x)))) "+
				"then (STAT (ASSIGNSTAT y := (EXPR (EXPR2 (EXPR3 y)) + (EXPR (EXPR2 (EXPR3 3)))))))) ;) "+
				"(STATWITHSEMI (STAT (ASSIGNSTAT x := (EXPR (EXPR2 (EXPR3 y) * "+
				"(EXPR2 (EXPR3 ( (EXPR (EXPR2 (EXPR3 y)) - (EXPR (EXPR2 (EXPR3 x)))) )) / "+
				"(EXPR2 (EXPR3 y))))))) ;)) end)))) ;) (STATWITHSEMI (STAT (ASSIGNSTAT y "+
				":= (EXPR (EXPR2 (EXPR3 x) * (EXPR2 (EXPR3 y)))))) ;)) end) . )";
		testParseTree(test, expected);
	}

	
}
