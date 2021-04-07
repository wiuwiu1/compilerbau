/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner tabellengesteuert
 * - Token-Definition
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscanner;

public class Token {
	
	public static final int EOF = 0;
	public static final int INVALID = -1;
	public static final int AS = 1;
	public static final int AE = 2;
	public static final int KO = 3;
	public static final int Z = 4;
	public static final int NA = 5;
	public static final int NULL = 6;
	public static final int FRAC = 7;

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
			case AS: return "LSBR";
			case AE: return "RSBR";
			case KO: return "COMMA";
			case Z: return "NUM";
			case NA: return "ID";
			case NULL: return "NULL";
			case FRAC: return "FRAC";
			default: return "Unknown token type!";
		}
			
	}

}
