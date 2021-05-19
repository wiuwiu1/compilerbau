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




program: 'program' ID ';' decl block '.' EOF -> ^('program' ID DECLLIST (STATLIST)+);


block: 'begin'  ( stat ';')+  'end' -> ^('begin' stat 'end');

stat: numAssign | strAssign | condStat | whileStat | forStat | block;
decl: ('read')? ('print')? ID ':' ( 'int' | 'float' | 'string' ) ';' ;
numAssign: 'id' ':=' 'numExpr';
strAssign: 'id' ':=' 'strExpr';
condStat: 'if' cond 'then' stat (options{greedy=true;}: 'else' stat )? ;
whileStat: 'while' '(' cond ')' stat;
forStat: 'for' '(' numAssign ';' cond ';' numAssign ')' stat;
cond: expr ('<' expr | '>' expr | '=' expr);

expr: expr1 (('+' expr) | ('-' expr))?;
expr1: expr2 (('*' expr1) | ('/' expr1))?;
expr2: '-' INTCONST | INTCONST | '-' FLOATCONST | FLOATCONST | STRINGCONST | ID | '(' expr ')';

fragment LETTER: ('a'..'z' | 'A'..'Z')+;
fragment DIGIT: ('0'..'9')+;
fragment OTHER: ' ' | '.' | ':' | '\\"';
INTCONST: NUMBER;
FLOATCONST: (NUMBER ( '.' ( DIGIT )* )?  (('e'|'E') ('+'|'-')? NUMBER)?) => INTCONST ('.' DIGIT*)? ('e'|'E')('+'|'-')? INTCONST
| INTCONST ('.' DIGIT*)?;
STRINGCONST: '\"' (LETTER | DIGIT | OTHER)* '\"';
ID: LETTER ( LETTER | DIGIT )*;
fragment NUMBER: '0' | ( ('1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')  (DIGIT)* );
WS: ( '\t' | ' ' | '\r' | '\n' )+   { skip(); };

INVALID:  .;

/*if cond.. (options: {greedy=true;} 'else' stat)?*/