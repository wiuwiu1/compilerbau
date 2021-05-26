/* **********************************************
 * Duale Hochschule Baden-W�rttemberg Karlsruhe
 * Prof. Dr. J�rn Eisenbiegler
 * 
 * Vorlesung �bersetzerbau
 * Praxis ANTLR-Parser f�r X
 * - Grammatik f�r Scanner und Parser
 * 
 * **********************************************
 */

tree grammar XTreeGrammar;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}
//Code mit der freundlichen Erlaubnis von Prof Dr. J. Buergel
@header {package de.dhbw.compiler.antlrxtreegrammar;}

decl:      ^(DECL ID ('int'|'float'|'string') r='read'? p='print'?);
decllist:  ^(DECLLIST decl*);
expr:      ^(('+' | '-' | '*' | '/') expr expr)
            | ^(UMINUS (INTCONST | FLOATCONST))
            | INTCONST | FLOATCONST | STRINGCONST | ID;

cond: ^(('<' | '>' | '=') expr expr);
whilestat: ^('while' cond stat);
assignstat:  ^(':=' ID expr);
condstat:  ^('if' cond stat stat?);
forstat:   ^('for' assignstat cond assignstat stat);
stat:      assignstat | condstat | whilestat | forstat | statlist;
statlist:  ^(STATLIST stat*);

program:   ^('program' ID decllist statlist);


