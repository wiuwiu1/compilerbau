package de.dhbw.compiler.antlrxcompiler;

public class Symbol {
	
	public String	name	= "";
	public XType  	type	= XType.NoType;
	public boolean 	read 	= false;
	public boolean 	print 	= false;
	public boolean 	isConst	= false;
	
	public Symbol(String name, XType type) {
		this.name = name;
		this.type = type;
	}

	public Symbol(String name, XType type, boolean read, boolean print) {
		this(name, type);
		this.read = read;
		this.print = print;
	}
	
	public String toString() {
		String res = "["+name+","+type;
		if (read) 		{ res+=",read"; } 
		if (print) 		{ res+=",print"; } 
		if (isConst)	{ res+=",const"; } 
		res += "]";
		return res;
	}

}
