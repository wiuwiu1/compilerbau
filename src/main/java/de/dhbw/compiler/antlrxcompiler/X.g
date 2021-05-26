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
  ASTLabelType = XTree;
}

// AST-Tokens
tokens { 
  DECL;
  STATLIST;
  DECLLIST;
  UMINUS;
}

@parser::header {package de.dhbw.compiler.antlrxcompiler;}
@lexer::header  {package de.dhbw.compiler.antlrxcompiler;}

// Ignore Whitespace
WS:     ( '\t' | ' ' | '\r' | '\n' | '\f')+   { skip(); };
COMMENT: '/*' .* '*/' { skip(); };

// Zeichensatz
fragment LETTER:   'a'..'z' | 'A'..'Z';
fragment POSDIGIT: '1'..'9';
fragment ZERO:     '0';
fragment DIGIT:    '0'..'9';
fragment OTHER:    ' ' | '.' | ':' | '\\"';

// Konstanten und Namen
INTCONST: ZERO | (POSDIGIT DIGIT*);
     
FLOATCONST:    (INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST) => INTCONST ('.' DIGIT*)? ('e'|'E')('+' |'-' )? INTCONST |
               INTCONST ('.' DIGIT*)?;
          
STRINGCONST:   '\"' (LETTER|DIGIT|OTHER)* '\"'; 

ID:       LETTER (LETTER|DIGIT)*;

INVALID:  .;

// Deklarationen
decl:        ID ':' (type='int' | type='float' | type='string') ';' -> ^(DECL ID $type)
           | 'read' ID ':' (type='int' | type='float' | type='string') ';' -> ^(DECL ID $type 'read')
           | 'print' ID ':' (type='int' | type='float' | type='string') ';' -> ^(DECL ID $type 'print')
           | 'read' 'print' ID ':' (type='int' | type='float' | type='string') ';' -> ^(DECL ID $type 'read' 'print');

decllist:     decl*  -> ^(DECLLIST decl*);

// Ausdrücke
expr:         multexpr (('+'^ | '-'^) multexpr)*;
multexpr:    simpleexpr (('*'^ | '/'^) simpleexpr)*;
simpleexpr:   '('! expr ')'! 
            | INTCONST | '-' INTCONST -> ^(UMINUS INTCONST)
            | FLOATCONST | '-' FLOATCONST -> ^(UMINUS FLOATCONST)
            | ID | STRINGCONST;

// Zuweisung
assignstat:   ID ':='^ expr;

// Bedingungen
cond:         expr ('<'^ |'>'^ |'='^ ) expr;

// Bedingte Zuweisung
condstat:     'if'^ cond 'then'! stat  (options {greedy=true;}: 'else'! stat)?;

// Schleifen
whilestat:    'while' '(' cond ')' stat -> ^('while' cond stat);
forstat:      'for'^ '('! assignstat ';'! cond ';'! assignstat ')'! stat;

// Anweisungen
stat:         assignstat | condstat | whilestat | forstat | statlist;

statlist:        'begin' (stat ';')* 'end'  -> ^(STATLIST stat*);

// Programme
program:      'program' ID ';' decllist statlist '.' EOF -> ^('program' ID decllist statlist);
