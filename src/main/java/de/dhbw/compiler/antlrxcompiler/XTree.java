package de.dhbw.compiler.antlrxcompiler;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;


public class XTree extends CommonTree {
	
	public XType exprType = XType.NoType;
	
	public XTree() {
		super();
	};

	public XTree(Token t) {
		super(t);
	}
	
	public XTree(CommonTree t ) {
		super(t);
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		if (exprType!=XType.NoType) {
			s+="<"+exprType+">";
		}
		return s;
	}

}
