/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition intConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.xScanner;

public class IntConstToken extends Token {

	private final int value;
	
	public IntConstToken(int type, String text, int line, int column, int value) {
		super(type, text, line, column);
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}


}
