package de.dhbw.compiler.antlrxcompiler;

import java.util.HashMap;

public class SymbolTable extends HashMap<String, Symbol>{
	
	private static final long serialVersionUID = 1L;
	
	/* Singleton */
	private static SymbolTable instance = new SymbolTable();
	
	private SymbolTable() {}
	
	public static SymbolTable getInstance() {
		return instance;
	}
	
	public String toString() {
		StringBuffer res = new StringBuffer();
		for (Symbol s: this.values()) { res.append(s.toString()+"\n"); }
		return res.toString();
	}
	
}
