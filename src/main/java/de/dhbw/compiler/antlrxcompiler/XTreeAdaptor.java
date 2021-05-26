package de.dhbw.compiler.antlrxcompiler;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;


public class XTreeAdaptor extends CommonTreeAdaptor {

    @Override
   public Object create(Token token) {
        return new XTree(token);
    }
    
    @Override
    public Object dupNode(Object t) {
        if ( t==null ) {
            return null;
        }
        return create(((XTree)t).token);
    }
    
    @Override
    public Object create(int tokenType, String text) {
    	return create(tokenType, null, text);
    }
    
    @Override
    public Object create(int tokenType, Token fromToken) {
    	return create(tokenType, fromToken, null);
    }
    
    @Override
    public Object create(int tokenType, Token fromToken, String text) {
    	if (fromToken==null) {
    		fromToken = new CommonToken(tokenType, text);
    	} else {
    		fromToken.setType(tokenType);
    		fromToken.setText(text);
    	}
    	return new XTree(fromToken);
    }
    
    

}
