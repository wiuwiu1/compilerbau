/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Hilfsklasse für Scanner-tests
 * 
 * **********************************************
 */

package de.dhbw.compiler.antlrxtreegrammar.test;

import org.antlr.runtime.CommonToken;

public class TestToken extends CommonToken {
	
	private static final long serialVersionUID = 1L;

	public TestToken(int type, String text, int line, int column) {
		super(type, text);
		super.setLine(line);
		// Antlr beginnt mit 0, Kompatibilit�t zu anderen Tests
		super.setCharPositionInLine(column-1);
	}

}
