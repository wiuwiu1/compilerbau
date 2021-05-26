/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Typ-Pr�fung
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAntlrXTypeCheck1 extends TypeCheckTest {
	
	@Test
	public void typecheck00Undefined() throws Exception {
		String test =	"program beginEnd;\n"+
						"begin\n"+
						"  x:=0;\n"+
						"end.";
		String expected = "(program beginEnd DECLLIST (STATLIST (:=<invalid> x<invalid> 0<int>)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void typecheck11AssignIntValid1() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"begin\n"+
						"  x:=0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:=<int> x<int> 0<int>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck12AssignIntValid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"  y: int;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int) (DECL y int)) (STATLIST (:=<int> x<int> y<int>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck13AssignIntInvalid1() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"begin\n"+
						"  x:=0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:=<invalid> x<int> 0.0<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck14AssignIntInvalid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"begin\n"+
						"  x:=\"Hello\";\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:=<invalid> x<int> \"Hello\"<string>)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void typecheck15AssignIntInvalid3() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:=<invalid> x<int> y<invalid>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck16AssignIntInvalid4() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: int;"+
						"  y: float;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int) (DECL y float)) (STATLIST (:=<invalid> x<int> y<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck20AssignFloatValid1() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"begin\n"+
						"  x:=0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> 0.0<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck21AssignFloatValid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"  y: float;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y float)) (STATLIST (:=<float> x<float> y<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck22AssignFloatValid3() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"begin\n"+
						"  x:=0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> 0<int>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck22AssignFloatInvalid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"begin\n"+
						"  x:=\"Hello\";\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:=<invalid> x<float> \"Hello\"<string>)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void typecheck23AssignFloatInvalid3() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:=<invalid> x<float> y<invalid>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck24AssignFloatInvalid4() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: float;"+
						"  y: string;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y string)) (STATLIST (:=<invalid> x<float> y<string>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck30AssignStringValid1() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"begin\n"+
						"  x:=\"Hello\";\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string)) (STATLIST (:=<string> x<string> \"Hello\"<string>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck31AssignStringValid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"  y: string;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string) (DECL y string)) (STATLIST (:=<string> x<string> y<string>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck32AssignStringInvalid1() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"begin\n"+
						"  x:=0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string)) (STATLIST (:=<invalid> x<string> 0.0<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck33AssignStringInvalid2() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"begin\n"+
						"  x:=0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string)) (STATLIST (:=<invalid> x<string> 0<int>)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void typecheck34AssignStringInvalid3() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string)) (STATLIST (:=<invalid> x<string> y<invalid>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck35AssignStringInvalid4() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x: string;"+
						"  y: float;"+
						"begin\n"+
						"  x:=y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x string) (DECL y float)) (STATLIST (:=<invalid> x<string> y<float>)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck40ExprPlus1() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x int)) (STATLIST (:=<int> x<int> (+<int> 0<int> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck41ExprPlus2() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1.0;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x int)) (STATLIST (:=<invalid> x<int> (+<float> 0<int> 1.0<float>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck42ExprPlus3() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=\"Hello\"+1;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x int)) (STATLIST (:=<invalid> x<int> (+<invalid> \"Hello\"<string> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck43ExprPlus5() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0+1;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> (+<int> 0<int> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck44ExprPlus6() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0+1.0;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> (+<float> 0<int> 1.0<float>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck45ExprPlus7() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0.0+1.0;"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> (+<float> 0.0<float> 1.0<float>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void typecheck46ExprPlus8() throws Exception {
		String test =	"program ExprPlus;\n"+
						"  x: string;"+
						"begin\n"+
						"	x :=\"Hello\"+\"World\";"+
						"end.";
		String expected = "(program ExprPlus (DECLLIST (DECL x string)) (STATLIST (:=<string> x<string> (+<string> \"Hello\"<string> \"World\"<string>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program13ExprMul() throws Exception {
		String test =	"program exprMul;\n"+
						"  x: float;"+
						"begin\n"+
						"	x :=0*1;"+
						"end.";
		String expected = "(program exprMul (DECLLIST (DECL x float)) (STATLIST (:=<float> x<float> (*<int> 0<int> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program14ExprDiv() throws Exception {
		String test =	"program exprDiv;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0/1;"+
						"end.";
		String expected = "(program exprDiv (DECLLIST (DECL x int)) (STATLIST (:=<int> x<int> (/<int> 0<int> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program15ExprUMinus() throws Exception {
		String test =	"program exprUMinus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0--1;"+
						"end.";
		String expected = "(program exprUMinus (DECLLIST (DECL x int)) (STATLIST (:=<int> x<int> (-<int> 0<int> (UMINUS<int> 1<int>)))))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void program16ExprPlusMinus() throws Exception {
		String test =	"program exprPlus;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0+1+-2-3+4;"+
						"end.";
		String expected = "(program exprPlus (DECLLIST (DECL x int)) "
				+ "(STATLIST (:=<int> x<int> (+<int> (-<int> (+<int> (+<int> 0<int> 1<int>) (UMINUS<int> 2<int>)) 3<int>) 4<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program17ExprMulDiv() throws Exception {
		String test =	"program exprMul;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0*1/2*-3*4;"+
						"end.";
		String expected = "(program exprMul (DECLLIST (DECL x int)) "
				+ "(STATLIST (:=<int> x<int> (*<int> (*<int> (/<int> (*<int> 0<int> 1<int>) 2<int>) (UMINUS<int> 3<int>)) 4<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program18ExprAll() throws Exception {
		String test =	"program exprAll;\n"+
						"  x: int;"+
						"begin\n"+
						"	x :=0*1+2/-3*(4-5+6)*7;"+
						"end.";
		String expected = "(program exprAll (DECLLIST (DECL x int)) "
				+ "(STATLIST (:=<int> x<int> (+<int> (*<int> 0<int> 1<int>) (*<int> (*<int> (/<int> 2<int> (UMINUS<int> 3<int>)) (+<int> (-<int> 4<int> 5<int>) 6<int>)) 7<int>)))))";
		testTypeCheckTree(test, expected);
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
		String expected = "(program exprAll (DECLLIST (DECL x int) (DECL y int) (DECL z int)) "
				+ "(STATLIST (:=<int> x<int> (+<int> (*<int> 0<int> x<int>) y<int>))))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void program20Cond() throws Exception {
		String test =	"program cond;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then x:=1;"+
						"end.";
		String expected = "(program cond (DECLLIST (DECL x int)) (STATLIST (if (<<int> 2<int> 3<int>) (:=<int> x<int> 1<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program21CondElse() throws Exception {
		String test =	"program condElse;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2>3 then x:=1 else x:=2;"+
						"end.";
		String expected = "(program condElse (DECLLIST (DECL x int)) (STATLIST (if (><int> 2<int> 3<int>) (:=<int> x<int> 1<int>) (:=<int> x<int> 2<int>))))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void program22CondElse2() throws Exception {
		String test =	"program condelse2;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2=3 then if 4<5 then x:=1 else x:=2 else x:=3;"+
						"end.";
		String expected = "(program condelse2 (DECLLIST (DECL x int)) "
				+ "(STATLIST (if (=<int> 2<int> 3<int>) (if (<<int> 4<int> 5<int>) (:=<int> x<int> 1<int>) (:=<int> x<int> 2<int>)) (:=<int> x<int> 3<int>))))";
		testTypeCheckTree(test, expected);
	}

	
	@Test
	public void program23CondElse3() throws Exception {
		String test =	"program condelse3;\n"+
						"  x: float;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else if 6=7 then x:=2 else x:=3;"+
						"end.";
		String expected = "(program condelse3 (DECLLIST (DECL x float)) "
				+ "(STATLIST (if (<<int> 2<int> 3<int>) (if (><int> 4<int> 5<int>) (:=<float> x<float> 1<int>) (if (=<int> 6<int> 7<int>) (:=<float> x<float> 2<int>) (:=<float> x<float> 3<int>))))))";
		testTypeCheckTree(test, expected);
	}

	
	@Test
	public void program24CondElse4() throws Exception {
		String test =	"program condelse4;\n"+
						"  x: int;"+
						"begin\n"+
						"	if 2<3 then if 4>5 then x:=1 else x:=2 else if 6=7 then x:=3 else x:=4;"+
						"end.";
		String expected = "(program condelse4 (DECLLIST (DECL x int)) "
				+ "(STATLIST (if (<<int> 2<int> 3<int>) (if (><int> 4<int> 5<int>) (:=<int> x<int> 1<int>) (:=<int> x<int> 2<int>)) (if (=<int> 6<int> 7<int>) (:=<int> x<int> 3<int>) (:=<int> x<int> 4<int>)))))";
		testTypeCheckTree(test, expected);
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
		String expected = "(program xmin1 (DECLLIST (DECL x int read) (DECL y int print)) "
				+ "(STATLIST (:=<int> y<int> (-<int> (+<int> 25<int> (*<int> 2<int> x<int>)) (*<int> 6<int> x<int>))) (if (<<int> x<int> y<int>) "
				+ "(STATLIST (:=<int> x<int> (*<int> (/<int> (UMINUS<int> 3<int>) 6<int>) (+<int> y<int> 2<int>))) (if (<<int> y<int> x<int>) (:=<int> y<int> (+<int> y<int> 3<int>)) (:=<int> y<int> (+<int> y<int> 4<int>)))) "
				+ "(STATLIST (if (<<int> y<int> x<int>) (:=<int> y<int> (+<int> y<int> 3<int>))) (:=<int> x<int> (/<int> (*<int> y<int> (-<int> y<int> x<int>)) y<int>)))) (:=<int> y<int> (*<int> x<int> y<int>))))";
		testTypeCheckTree(test, expected);
	}

	
}
