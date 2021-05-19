/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - Token-Definition floatConst
 * 
 * **********************************************
 */

package de.dhbw.compiler.LL1Parser;

public class FloatConstToken extends Token {
	
	private double value=0.0;
	
	public FloatConstToken(int type, String text, int line, int column, double value) {
		super(type,text,line,column);
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}


}
