/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - Token-Definition stringConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.LL1Parser;

public class StringConstToken extends Token {
	
	private String value="";
	
	public StringConstToken(int type, String text, int line, int column, String value) {
		super(type,text,line,column);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}


}
