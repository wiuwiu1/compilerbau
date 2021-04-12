/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Token-Definition num
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscannerWithJflex;

public class NumToken extends Token {
	
	private int value;
	
	public NumToken(int type, String text, int line, int column, int value) {
		super(type,text,line,column);
		this.value = value;
	}
	
	int getValue() {
		return value;
	}


}
