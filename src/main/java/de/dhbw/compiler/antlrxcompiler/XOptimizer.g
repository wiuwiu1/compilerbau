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


bottomup: uminus | foldConstAddInt | foldConstMinusInt | foldConstMultInt | foldConstDivInt | foldConstAddFloat
| foldConstMinusFloat | foldConstMultFloat | foldConstDivFloat | foldConstAddFloatInt | foldConstMinusFloatInt
| foldConstMultFloatInt | foldConstDivFloatInt | foldConstAddIntFloat| foldConstMinusIntFloat |foldConstMultIntFloat | foldConstDivIntFloat | foldMultZero;


uminus:	  
    ^(UMINUS x=INTCONST) -> INTCONST[ "-"+$x.text ]
  | ^(UMINUS x=FLOATCONST) -> FLOATCONST["-"+$x.text ];

multZeroOne:
^('*' x=INTCONST {$x.text.equals("0")||$x.text.equals("1") }?  ^(op=('+' | '-' | '*' | '/' | ID) y=.* ))
    -> {$x.text.equals("0") }? $x
    -> ^($op$y*)
| ^('*' ^(op=('+' | '-' | '*' | '/' | ID) y=.*) x=INTCONST {$x.text.equals("0")||$x.text.equals("0")}?)
    -> {$x.text.equals("0") }? $x
    -> ^($op$y*);


foldConstAddInt:
    ^('+' l=INTCONST r=INTCONST) -> INTCONST[opInt($l.text, $r.text, '+')];

foldConstMinusInt:
    ^('-' l=INTCONST r=INTCONST) -> INTCONST[opInt($l.text, $r.text, '-')];

foldConstMultInt:
    ^('*' l=INTCONST r=INTCONST) -> INTCONST[opInt($l.text, $r.text, '*')];

foldConstDivInt:
    ^('/' l=INTCONST r=INTCONST) -> INTCONST[opInt($l.text, $r.text, '/')];

foldConstAddFloat:
    ^('+' l=FLOATCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '+')];

foldConstMinusFloat:
    ^('-' l=FLOATCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '-')];

foldConstMultFloat:
    ^('*' l=FLOATCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '*')];

foldConstDivFloat:
    ^('/' l=FLOATCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '/')];

foldConstAddFloatInt:
    ^('+' l=FLOATCONST r=INTCONST) -> FLOATCONST[opFloat($l.text, $r.text, '+')];

foldConstMinusFloatInt:
    ^('-' l=FLOATCONST r=INTCONST) -> FLOATCONST[opFloat($l.text, $r.text, '-')];

foldConstMultFloatInt:
    ^('*' l=FLOATCONST r=INTCONST) -> FLOATCONST[opFloat($l.text, $r.text, '*')];

foldConstDivFloatInt:
    ^('/' l=FLOATCONST r=INTCONST) -> FLOATCONST[opFloat($l.text, $r.text, '/')];

foldConstAddIntFloat:
    ^('+' l=INTCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '+')];

foldConstMinusIntFloat:
    ^('-' l=INTCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '-')];

foldConstMultIntFloat:
    ^('*' l=INTCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '*')];

foldConstDivIntFloat:
    ^('/' l=INTCONST r=FLOATCONST) -> FLOATCONST[opFloat($l.text, $r.text, '/')];

foldMultZero:
    ^('*' l=ID r=INTCONST) {isZero($r.text)}?  -> INTCONST["0"];