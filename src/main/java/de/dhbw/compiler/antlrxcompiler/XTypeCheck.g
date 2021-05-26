tree grammar XTypeCheck;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = XTree;
}

tokens{
  PLUS='+';
}

@header {
package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;
}

@members {

   private SymbolTable  symbols = SymbolTable.getInstance();  
   
}


decl:      ^(DECL ID ('int'|'float'|'string') r='read'? p='print'?)
            { symbols.put($ID.text, new Symbol($ID.text, XType.IntType, $r!=null, $p!=null)); };
decllist:  ^(DECLLIST decl*);
expr:      ^(('+' | '-' | '*' | '/') expr expr)         //TODO
            | ^(UMINUS (INTCONST {$INTCONST.tree.exprType = XType.IntType;} | FLOATCONST {$FLOATCONST.tree.exprType = XType.FloatType;}))         //TODO
            | INTCONST {$INTCONST.tree.exprType = XType.IntType;}
            | FLOATCONST {$FLOATCONST.tree.exprType = XType.FloatType;}
            | STRINGCONST {$STRINGCONST.tree.exprType = XType.StringType;}
            | ID {symbols.get()};   //TODO

cond: ^(('<' | '>' | '=') expr expr);
whilestat: ^('while' cond stat);
assignstat:  ^(':=' ID expr);  // TODO
condstat:  ^('if' cond stat stat?);
forstat:   ^('for' assignstat cond assignstat stat);
stat:      assignstat | condstat | whilestat | forstat | statlist;
statlist:  ^(STATLIST stat*);

program:   ^('program' ID decllist statlist);

