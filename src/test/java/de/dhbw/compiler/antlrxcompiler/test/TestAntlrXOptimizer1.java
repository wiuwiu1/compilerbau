/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testf�lle für Optimierer
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxcompiler.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAntlrXOptimizer1 extends OptimizerTest {
	
	@Test
	public void optimize00() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize01() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1+2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 3)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void optimize02() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1-2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x -1)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void optimize03() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1*2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 2)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize04() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1/2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize05() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1+-2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x -1)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize05a() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1+-2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x -1.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize06() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=1+12*(4-5)/6+7-(8+-9);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 7)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize06a() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1+12*(4-5)/6+7-(8+-90e-1);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 7.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize10() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize11() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0+2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 3.0)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void optimize12() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0-2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x -1.0)))";
		testTypeCheckTree(test, expected);
	}


	@Test
	public void optimize13() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0*2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 2.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize14() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0/2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 0.5)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize15() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0+-2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x -1.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize16() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0+12.0*(4.0-5.0)/6.0+7.0-(8.0+-9.0);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 7.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize30() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1+2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 3.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize31() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0+2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 3.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize32() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1-2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x -1.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize33() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0-2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x -1.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize34() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1*2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 2.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize35() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0*2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 2.0)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize36() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1/2.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 0.5)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize37() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0/2;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 0.5)))";
		testTypeCheckTree(test, expected);
	}

	@Test
	public void optimize38() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=1.0+12*(4.0-5)/6.0+7-(8.0+-9);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 7.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize40() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=1+y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x (+ 1 y))))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize41() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=1+3+y+5*6;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x (+ (+ 4 y) 30))))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize50() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0*y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize51() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=y*0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize52() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=(1+y)*0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize53() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0*(1-y);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize54() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=(1*y)*0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize55() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0*(1/y);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize60() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0.0*y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize61() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=y*0.0e4;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0e4)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize62() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=(1+y)*0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize63() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0.0*(1-y);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize64() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=(1*y)*0.0e-5;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0e-5)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize65() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0.0*(1/y);\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y int)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize70() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"begin\n"+
						"  x:=-0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float)) (STATLIST (:= x 0.0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize71() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"begin\n"+
						"  x:=-0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int)) (STATLIST (:= x 0)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize80() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=0+y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int) (DECL y int)) (STATLIST (:= x y)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize81() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=y+0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int) (DECL y int)) (STATLIST (:= x y)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize82() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : int;\n"+
						"  y : int;\n"+
						"begin\n"+
						"  x:=y-0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x int) (DECL y int)) (STATLIST (:= x y)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize83() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : float;\n"+
						"begin\n"+
						"  x:=0.0+y;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y float)) (STATLIST (:= x y)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize84() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : float;\n"+
						"begin\n"+
						"  x:=y+0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y float)) (STATLIST (:= x y)))";
		testTypeCheckTree(test, expected);
	}
	
	@Test
	public void optimize85() throws Exception {
		String test =	"program beginEnd;\n"+
						"  x : float;\n"+
						"  y : float;\n"+
						"begin\n"+
						"  x:=y-0.0;\n"+
						"end.";
		String expected = "(program beginEnd (DECLLIST (DECL x float) (DECL y float)) (STATLIST (:= x y)))";
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
				+ "(STATLIST (:= y (- (+ 25 (* 2 x)) (* 6 x))) (if (< x y) "
				+ "(STATLIST (:= x 0) (if (< y x) (:= y (+ y 3)) (:= y (+ y 4)))) "
				+ "(STATLIST (if (< y x) (:= y (+ y 3))) (:= x (/ (* y (- y x)) y)))) (:= y (* x y))))";
		testTypeCheckTree(test, expected);
	}

	
}
