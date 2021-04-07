/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Testfälle Aufgabe 1
 * 
 * **********************************************
 */

package de.dhbw.compiler.namenscanner;

import org.junit.Test;

public class TestNamenScanner1 extends TokenStreamTest {

	@Test
	public void tokenPeter() throws Exception {
		testTokenList("peter", new Token(Token.PETER, "peter"));
		testTokenList(" peter ", new Token(Token.PETER, "peter"));
		testTokenList(" peter peter ", new Token(Token.PETER, "peter"),
				new Token(Token.PETER, "peter"));
		testTokenList(" peterpeter ", new Token(Token.PETER, "peter"),
				new Token(Token.PETER, "peter"));
		testTokenList("peterpeter", new Token(Token.PETER, "peter"),
				new Token(Token.PETER, "peter"));
	}

	@Test
	public void tokenPetra() throws Exception {
		testTokenList("petra", new Token(Token.PETRA, "petra"));
		testTokenList(" petra ", new Token(Token.PETRA, "petra"));
		testTokenList(" petra petra ", new Token(Token.PETRA, "petra"),
				new Token(Token.PETRA, "petra"));
		testTokenList(" petrapetra ", new Token(Token.PETRA, "petra"),
				new Token(Token.PETRA, "petra"));
		testTokenList("petrapetra", new Token(Token.PETRA, "petra"),
				new Token(Token.PETRA, "petra"));
	}

	@Test
	public void tokenAnna() throws Exception {
		testTokenList("anna", new Token(Token.ANNA, "anna"));
		testTokenList(" anna ", new Token(Token.ANNA, "anna"));
		testTokenList(" anna anna ", new Token(Token.ANNA, "anna"), 
				new Token(Token.ANNA, "anna"));
		testTokenList(" annaanna ", new Token(Token.ANNA, "anna"), 
				new Token(Token.ANNA, "anna"));
		testTokenList("annaanna", new Token(Token.ANNA, "anna"), 
				new Token(Token.ANNA, "anna"));
	}

	@Test
	public void tokenPeterPetraAnna() throws Exception {
		testTokenList("peter petra anna", new Token(Token.PETER, "peter"),
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"));
		testTokenList(" peter petra anna ", new Token(Token.PETER, "peter"),
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"));
		testTokenList("peterpetraanna", new Token(Token.PETER, "peter"),
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"));
	}

	@Test
	public void tokenAnnaPetraPeter() throws Exception {
		testTokenList("anna petra peter",
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETRA, "petra"), 
				new Token(Token.PETER, "peter"));
		testTokenList(" anna petra peter ",
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETRA, "petra"), 
				new Token(Token.PETER, "peter"));
		testTokenList("annapetrapeter",
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETRA, "petra"), 
				new Token(Token.PETER, "peter"));
	}

	@Test
	public void tokenPetraAnnaPeter() throws Exception {
		testTokenList("petra anna peter",
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETER, "peter"));
		testTokenList(" petra anna peter ",
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETER, "peter"));
		testTokenList("petraannapeter",
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"),
				new Token(Token.PETER, "peter"));
	}

	@Test
	public void tokenViele() throws Exception {
		testTokenList("petra anna peterannapeterpetra petra annaanna peter",
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETER, "peter"),
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETER, "peter"),
				new Token(Token.PETRA, "petra"), 
				new Token(Token.PETRA, "petra"), 
				new Token(Token.ANNA, "anna"), 
				new Token(Token.ANNA, "anna"), 
				new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenX() throws Exception {
		testTokenList("x", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenWSx() throws Exception {
		testTokenList(" x", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenP() throws Exception {
		testTokenList("p", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPe() throws Exception {
		testTokenList("pe", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPet() throws Exception {
		testTokenList("pet", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPetr() throws Exception {
		testTokenList("petr", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPete() throws Exception {
		testTokenList("pete", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenA() throws Exception {
		testTokenList("a", new Token(Token.ANNA, "anna"));
	}

	@Test(expected = Exception.class)
	public void tokenAn() throws Exception {
		testTokenList("an", new Token(Token.ANNA, "anna"));
	}

	@Test(expected = Exception.class)
	public void tokenAnn() throws Exception {
		testTokenList("ann", new Token(Token.ANNA, "anna"));
	}

	@Test(expected = Exception.class)
	public void tokenPx() throws Exception {
		testTokenList("px", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPex() throws Exception {
		testTokenList("pex", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPetx() throws Exception {
		testTokenList("petx", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPetrx() throws Exception {
		testTokenList("petrx", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPetrax() throws Exception {
		testTokenList("petrax", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPetex() throws Exception {
		testTokenList("petex", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenPeterx() throws Exception {
		testTokenList("peterx", new Token(Token.PETER, "peter"));
	}

	@Test(expected = Exception.class)
	public void tokenAx() throws Exception {
		testTokenList("ax", new Token(Token.ANNA, "anna"));
	}

	@Test(expected = Exception.class)
	public void tokenAnx() throws Exception {
		testTokenList("anx", new Token(Token.ANNA, "anna"));
	}

	@Test(expected = Exception.class)
	public void tokenAnnx() throws Exception {
		testTokenList("annx", new Token(Token.ANNA, "anna"));
	}
	
	@Test(expected = Exception.class)
	public void tokenAnnax() throws Exception {
		testTokenList("annx", new Token(Token.ANNA, "anna"));
	}

}
