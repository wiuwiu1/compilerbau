/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.jflexasscanner;

%% 

%class JFlexASScanner
%function nextToken
%type  Token 

%unicode
%line
%column
%public
%final

%xstate NUM, FRAC, EXP, STR

%{
%}

%eofval{ 
%eofval}

%%

[^]			{ return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }


