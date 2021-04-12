/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscannerWithJflex;

%% 

%class JFlexASScanner
%function nextToken
%type  Token 

%unicode
%line
%column
%public
%final
%char

%xstate NUM, FRAC, EXP, STR

%{
    String value;
    int startColumn;

    private int getIntValue() {
        return Integer.parseInt(value);
    }

    private double getDoubleValue() {
        return Double.parseDouble(value);
    }

    private Token getFracToken(){
         try{
            return new FracToken(Token.FRAC, value, yyline+1, startColumn, getDoubleValue());
         }catch(java.lang.NumberFormatException e) {
            return new Token(Token.FRAC, value, yyline+1, startColumn);
         }
    }
%}

%eofval{
    return new Token(Token.EOF, yytext(), yyline+1, yycolumn+1);
%eofval}

%%

\[                  { return new Token(Token.LSBR, yytext(), yyline+1, yycolumn+1); }
\]                  { return new Token(Token.RSBR, yytext(), yyline+1, yycolumn+1); }
\s                  {}
\,                  { return new Token(Token.COMMA, yytext(), yyline+1, yycolumn+1); }
null                { return new Token(Token.NULL, yytext(), yyline+1, yycolumn+1); }
[a-zA-Z]            { yybegin(STR); value = yytext(); startColumn = yycolumn+1; }
[0-9]               { yybegin(NUM); value = yytext(); startColumn = yycolumn+1; }
[^]			        { return new Token(Token.INVALID, yytext(), yyline+1, yycolumn+1); }

<NUM> [a-zA-Z]      { yybegin(STR); value += yytext(); }
<NUM> [0-9]         { value += yytext(); }
<NUM> \.            { yybegin(FRAC); value += yytext(); }
<NUM> [^]           { yybegin(YYINITIAL); yypushback(1); return new NumToken(Token.NUM, value, yyline+1, startColumn, getIntValue()); }
<NUM> <<EOF>>       { yybegin(YYINITIAL); return new NumToken(Token.NUM, value, yyline+1, startColumn, getIntValue()); }

<FRAC> [0-9]        { value += yytext(); }
<FRAC> \^[0-9]      { value += yytext(); }
<FRAC> [^]          { yybegin(YYINITIAL); yypushback(1); return getFracToken();}


<STR> [a-zA-Z]      { value += yytext(); }
<STR> [:digit:]     { value += yytext(); }
<STR> [^]           { yybegin(YYINITIAL); yypushback(1); return new StringToken(Token.ID, value, yyline+1, startColumn, value); }
<STR> <<EOF>>       { yybegin(YYINITIAL); return new StringToken(Token.ID, value, yyline+1, startColumn, value); }

