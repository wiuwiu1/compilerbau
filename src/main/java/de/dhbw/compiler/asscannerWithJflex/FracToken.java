/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Token-Definition frac
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscannerWithJflex;

public class FracToken extends Token {
	
	private double value;
	
	public FracToken(int type, String text, int line, int column, double value) {
		super(type,text,line,column);
		this.value = value;
	}
	
	double getValue() {
		return value;
	}


}
