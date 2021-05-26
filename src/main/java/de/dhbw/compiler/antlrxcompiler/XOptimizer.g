tree grammar XOptimizer;

options {
  language = Java;
  output = AST;
  tokenVocab = XTypeCheck;
  ASTLabelType = XTree;
  filter=true;
}



@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {
    private String addString(String first, String last) {
      return first.substring(0, first.length()-1)+last.substring(1);
    }
    
    private String opInt(String first, String last, char op) {
      int firstValue = 0;
      int lastValue = 0;
      try {
        firstValue = Integer.parseInt(first);
        lastValue = Integer.parseInt(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Integer.toString(firstValue+lastValue);
        case '-': return Integer.toString(firstValue-lastValue);
        case '*': return Integer.toString(firstValue*lastValue);
        case '/': return Integer.toString(firstValue/lastValue);
        default: return "";
      }
     }
      
    private String opFloat(String first, String last, char op) {
      double firstValue = 0.0;
      double lastValue = 0.0;
      try {
	      firstValue = Double.parseDouble(first);
	      lastValue = Double.parseDouble(last);
      } catch (Exception e) {
        e.printStackTrace();
      }
      switch (op) {
        case '+': return Double.toString(firstValue+lastValue);
        case '-': return Double.toString(firstValue-lastValue);
        case '*': return Double.toString(firstValue*lastValue);
        case '/': return Double.toString(firstValue/lastValue);
        default: return "";
      }
     }

    private boolean isZero(String x) {
     	double value = Double.NaN;
      	try {
        	value = Double.parseDouble(x);
      	} catch (Exception e) {
        	e.printStackTrace();
      	}
      	return value==0.0;
     }
      
     private boolean isOne(String x) {
     	double value = Double.NaN;
      	try {
        	value = Double.parseDouble(x);
      	} catch (Exception e) {
        	e.printStackTrace();
      	}
      	return value==1.0;
     }
  
 }


bottomup: uminus;

uminus:	  
    ^(UMINUS x=INTCONST) -> INTCONST[ "-"+$x.text ]
  | ^(UMINUS x=FLOATCONST) -> FLOATCONST["-"+$x.text ];

