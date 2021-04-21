/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition floatConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.xScanner;

public class FloatConstToken extends Token {

	private final double value;

	public FloatConstToken(int type, String text, int line, int column, double value) {
		super(type, text, line, column);
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}


}
