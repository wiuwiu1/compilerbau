/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * - Testfälle Aufgabe 1
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

import org.junit.Test;

public class TestASScanner1 extends TokenStreamTest {
	
	@Test
	public void tokenLSBR() throws Exception {
		testTokenList("  [ ", new Token(Token.AS,"["));
	}

	@Test
	public void tokenRSBR() throws Exception {
		testTokenList("  ] ", new Token(Token.AE,"]"));
	}

	@Test
	public void tokenCOMMA() throws Exception {
		testTokenList("  , ", new Token(Token.KO,","));
	}

	@Test
	public void tokenZAHL() throws Exception {
		testTokenList("  0 ", new Token(Token.Z,"0"));
		testTokenList("  9 ", new Token(Token.Z,"9"));
		testTokenList("  1234567890 ", new Token(Token.Z,"1234567890"));
	}

	@Test
	public void tokenID() throws Exception {
		testTokenList("  a ", new Token(Token.NA,"a"));
		testTokenList("  A ", new Token(Token.NA,"A"));
		testTokenList("  x ", new Token(Token.NA,"x"));
		testTokenList("  X ", new Token(Token.NA,"X"));
		testTokenList("  0a ", new Token(Token.NA,"0a"));
		testTokenList("  X0 ", new Token(Token.NA,"X0"));
		testTokenList("  1234567890a ", new Token(Token.NA,"1234567890a"));
		testTokenList("  abcdefghijklmnopqrstuvwxyz ", new Token(Token.NA,"abcdefghijklmnopqrstuvwxyz"));
		testTokenList("  ABCDEFGHIJKLMNOPQRSTUVWXYZ ", new Token(Token.NA,"ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		testTokenList("  NULL ", new Token(Token.NA,"NULL"));
		testTokenList("  NulL ", new Token(Token.NA,"NulL"));
	}

	@Test
	public void tokenNULL() throws Exception {
		testTokenList("  null ", new Token(Token.NULL,"null"));
	}

	@Test
	public void tokenEOF() throws Exception {
		testTokenList(" ");
		testTokenList(" ", new Token(Token.EOF,""));
		testTokenList("", new Token(Token.EOF,""));
	}

	@Test(expected=Exception.class)
	public void invalidÄ() throws Exception {
		testTokenList(" Ä ", new Token(Token.INVALID,"Ä"));	
	}
	
	public void invalidGatter() throws Exception {
		testTokenList(" # ", new Token(Token.INVALID,"#"));	
	}
	
	@Test
	public void sentence1() throws Exception {
		testTokenList(" [ [ ] hallo ,,,Duda,123,76",
				new Token(Token.AS,"["),
				new Token(Token.AS,"["),
				new Token(Token.AE,"]"),
				new Token(Token.NA,"hallo"),
				new Token(Token.KO,","),
				new Token(Token.KO,","),
				new Token(Token.KO,","),
				new Token(Token.NA,"Duda"),
				new Token(Token.KO,","),
				new Token(Token.Z,"123"),
				new Token(Token.KO,","),
				new Token(Token.Z,"76"));
	}

	
	@Test
	public void sentence2() throws Exception {
		testTokenList("[34, x,peter,  34kurt, g56, null,null, 8]",
				new Token(Token.AS,"["),
				new Token(Token.Z,"34"),
				new Token(Token.KO,","),
				new Token(Token.NA,"x"),
				new Token(Token.KO,","),
				new Token(Token.NA,"peter"),
				new Token(Token.KO,","),
				new Token(Token.NA,"34kurt"),
				new Token(Token.KO,","),
				new Token(Token.NA,"g56"),
				new Token(Token.KO,","),
				new Token(Token.NULL,"null"),
				new Token(Token.KO,","),
				new Token(Token.NULL,"null"),
				new Token(Token.KO,","),
				new Token(Token.Z,"8"),
				new Token(Token.AE,"]"));
	}
	
	@Test
	public void sentence3() throws Exception {
		testTokenList("[ a, b, \n c, \r\nd]",
				new Token(Token.AS,"["),
				new Token(Token.NA,"a"),
				new Token(Token.KO,","),
				new Token(Token.NA,"b"),
				new Token(Token.KO,","),
				new Token(Token.NA,"c"),
				new Token(Token.KO,","),
				new Token(Token.NA,"d"),
				new Token(Token.AE,"]"));
	}

	
}
