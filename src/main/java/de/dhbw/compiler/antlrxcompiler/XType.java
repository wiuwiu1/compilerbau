package de.dhbw.compiler.antlrxcompiler;

public enum XType { 
	NoType, InvalidType, IntType, FloatType, StringType; 
	
	public String toString() {
		switch (this) {
		case InvalidType: return "invalid";
		case IntType: return "int";
		case FloatType: return "float";
		case StringType: return "string";
		default: return "";
		}
	}
	
}