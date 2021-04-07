/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * - Token-Definition
 * 
 * **********************************************
 */

package de.dhbw.compiler.namenscanner;

public class Token {
	
	public static final int EOF = 0;
	public static final int INVALID = -1;
	public static final int PETER = 1;
	public static final int PETRA = 2;
	public static final int ANNA = 3;
	
	private int type;
	private String text;
	
	public Token(int type, String text) {
		this.type = type;
		this.text = text;
	}
	
	public int getType() {
		return type;
	}

	public String getText() {
		return text;
	}
	
	public String toString() {
		return "(" + getTypeName(type) + "," + text + ")";
	}
	
	public static String getTypeName(int tokenType) {
		switch (tokenType) {
			case EOF: return "EOF";
			case INVALID: return "INVALID";
			case PETER: return "peter";
			case PETRA: return "petra"; 
			case ANNA: return "anna"; 
			default: return "Unknown token type!";
		}
			
	}

}
