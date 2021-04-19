/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Token-Definition stringConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.xScanner;

public class StringConstToken extends Token {

	private final String value;
	
	public StringConstToken(int type, String text, int line, int column, String value) {
		super(type, text, line, column);
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
