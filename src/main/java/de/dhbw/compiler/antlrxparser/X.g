/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Grammatik für Scanner und Parser
 * 
 * **********************************************
 */

grammar X; 
  
options {
  language = Java;
  output = AST;
}
 
// AST-Tokens
tokens { 
  DECL; 
  STATLIST;
  DECLLIST;
  UMINUS;
} 

@parser::header {package de.dhbw.compiler.antlrxparser;}
@lexer::header  {package de.dhbw.compiler.antlrxparser;}




program: 'program' EOF;


block: 'begin'  ( stat ';')+  'end';

stat: numAssign | strAssign | condStat | whileStat | forStat | block;
numAssign: 'id' ':=' 'numExpr';
strAssign: 'id' ':=' 'strExpr';
condStat: 'if' 'cond' 'then' stat ( 'else' stat )? ;
whileStat: 'while' '(' cond ')' stat;
forStat: 'for' '(' numAssign ';' cond ';' numAssign ')' stat;
cond: expr '<' expr | expr '>' expr | expr '=' expr;

expr: expr1 '+' expr | expr1 '-' expr | expr1;
expr1: expr2 '*' expr1 | expr2 '/' expr1 | expr2;
expr2: '-' intConst | intConst | '-' floatConst | floatConst | 'id' | '(' expr ')';

intConst: '-'? 'number';
floatConst: '-'? 'number' ( '.' ( digit )* )?  (('e'|'E') '-'? 'number')?;
stringConst: '\"' (letter | digit | 'other')* '\"';
id: letter ( letter | digit )*;
letter: ('a'..'z' | 'A'..'Z)+;
digit: ('0'..'9')+;
WS: ( '\t' | ' ' | '\r' | '\n' )+   { skip(); };

INVALID:  .;

/*if cond.. (options {greedy=true;} 'else' stat)?*/