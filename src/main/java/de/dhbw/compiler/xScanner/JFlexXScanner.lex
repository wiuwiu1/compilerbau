/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Scanner-Definition
 * 
 * **********************************************
 */


package de.dhbw.compiler.xScanner;

%%

%class JFlexXScanner
%type Token
%function nextToken


%unicode
%line
%column
%char

%public
%final


%xstate INTCONST
%xstate FLOATCONST
%xstate EXPO
%xstate STRINGCONST

%{
private int intValue = 0;
private int floatValue = 0;
private int intExpo = 0;
private String stringText = "";
private String stringValue = "";
private int column;
private boolean negativeExpo = false;
private int decimalPlace = 0;


private int getInt() {
   return intValue;
}

private double getFrac() {
    return getInt() + 1 / (Math.pow(10, decimalPlace)) * floatValue;
}

private double getExpo(){
    if(negativeExpo){
        intExpo = intExpo * -1;
    }
    return Math.pow(10, intExpo) * getFrac();
}

%}

SPECIALCHARACTER = [ \.\:\\]

%%


\(					        { return new Token(Token.LBR,  yytext(), yyline+1, yycolumn+1); }
\)				            { return new Token(Token.RBR,  yytext(), yyline+1, yycolumn+1); }
\*			                { return new Token(Token.MULT,  yytext(), yyline+1, yycolumn+1); }
\+		    	            { return new Token(Token.PLUS,  yytext(), yyline+1, yycolumn+1); }
\-			                { return new Token(Token.MINUS,  yytext(), yyline+1, yycolumn+1); }
\.			                { return new Token(Token.DOT,  yytext(), yyline+1, yycolumn+1); }
\/			                { return new Token(Token.DIV,  yytext(), yyline+1, yycolumn+1); }
\:			                { return new Token(Token.COLON,  yytext(), yyline+1, yycolumn+1); }
\;			                { return new Token(Token.SEMICOLON,  yytext(), yyline+1, yycolumn+1); }
\:\=                        { return new Token(Token.ASSIGN,  yytext(), yyline+1, yycolumn+1); }
\<			                { return new Token(Token.LESS,  yytext(), yyline+1, yycolumn+1); }
\>			                { return new Token(Token.MORE,  yytext(), yyline+1, yycolumn+1); }
\=			                { return new Token(Token.EQUALS,  yytext(), yyline+1, yycolumn+1); }
\s		                    { /* eat white space*/}

if                          { return new Token(Token.IF,  yytext(), yyline+1, yycolumn+1); }
begin		                { return new Token(Token.BEGIN,  yytext(), yyline+1, yycolumn+1); }
else	                    { return new Token(Token.ELSE,  yytext(), yyline+1, yycolumn+1); }
end		                    { return new Token(Token.END,  yytext(), yyline+1, yycolumn+1); }
program		                { return new Token(Token.PROGRAM,  yytext(), yyline+1, yycolumn+1); }
then		                { return new Token(Token.THEN,  yytext(), yyline+1, yycolumn+1); }
while		                { return new Token(Token.WHILE,  yytext(), yyline+1, yycolumn+1); }
for		                    { return new Token(Token.FOR,  yytext(), yyline+1, yycolumn+1); }

read		                { return new Token(Token.READ,  yytext(), yyline+1, yycolumn+1); }
print		                { return new Token(Token.PRINT,  yytext(), yyline+1, yycolumn+1); }

int		                    { return new Token(Token.INT,  yytext(), yyline+1, yycolumn+1); }
float		                { return new Token(Token.FLOAT,  yytext(), yyline+1, yycolumn+1); }
string		                { return new Token(Token.STRING,  yytext(), yyline+1, yycolumn+1); }

[a-zA-Z][[a-zA-Z]|[0-9]]*   { return new Token(Token.ID,  yytext(), yyline+1, yycolumn+1); }
[1-9]                       { yybegin(INTCONST); yypushback(1); column = yycolumn+1; stringText ="";}
0\.                         { yybegin(FLOATCONST); stringText += yytext(); column = yycolumn+1;}
0                           { return new IntConstToken(Token.INTCONST, yytext(), yyline+1, yycolumn+1, 0);}
\"                          { yybegin(STRINGCONST); column = yycolumn+1; stringText = "\"";}

<INTCONST>    [0-9]         { intValue = intValue * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext();}
<INTCONST>    \.            { yybegin(FLOATCONST); stringText += yytext();}
<INTCONST>   [eE]-/[1-9]    { yybegin(EXPO); stringText += yytext(); negativeExpo = true; }
<INTCONST>   [eE]/[1-9]     { yybegin(EXPO); stringText += yytext();}
<INTCONST>   [eE]/0         { yybegin(YYINITIAL); yypushback(-1); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());}
<INTCONST>   [eE]/-0        { yybegin(YYINITIAL); yypushback(-2); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());}
<INTCONST>    [^]           { yybegin(YYINITIAL); yypushback(1); return new IntConstToken(Token.INTCONST, stringText, yyline+1, column, getInt());}
<INTCONST>    <<EOF>>       { yybegin(YYINITIAL); return new IntConstToken(Token.INTCONST, stringText, yyline+1, column, getInt());}

<FLOATCONST>   [0-9]        { floatValue = floatValue * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext(); decimalPlace += 1; }
<FLOATCONST>   [eE]-/[1-9]  { yybegin(EXPO); stringText += yytext(); negativeExpo = true; }
<FLOATCONST>   [eE]/[1-9]   { yybegin(EXPO); stringText += yytext();}
<FLOATCONST>   [eE]/0       { yybegin(YYINITIAL); yypushback(-1); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());}
<FLOATCONST>   [eE]/-0      { yybegin(YYINITIAL); yypushback(-2); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());}
<FLOATCONST>   [^]          { yybegin(YYINITIAL); yypushback(1); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getFrac());}
<FLOATCONST>   <<EOF>>      { yybegin(YYINITIAL); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getFrac());}

<EXPO>         [0-9]        { intExpo = intExpo * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext();}
<EXPO>         [^]          { yybegin(YYINITIAL); yypushback(1); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column,  getExpo());}
<EXPO>         <<EOF>>      { yybegin(YYINITIAL); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column,  getExpo());}

<STRINGCONST>     (\\\")       {stringText+= yytext(); stringValue += "\"";}
<STRINGCONST>     [a-zA-Z0-9{SPECIALCHARACTER}]  { stringText+=yytext(); stringValue += yytext();}
<STRINGCONST>     \"           {yybegin(YYINITIAL); stringText += "\""; return new StringConstToken(Token.STRINGCONST, stringText, yyline+1, column, stringValue);}
<STRINGCONST>     [^]          {yybegin(YYINITIAL); stringText += yytext(); return new Token(Token.INVALID, stringText, yyline+1, column); }
<STRINGCONST>     <<EOF>>      {yybegin(YYINITIAL); return new Token(Token.INVALID, stringText, yyline+1, column); }

<<EOF>>                     { return new Token(Token.EOF,  yytext(), yyline+1, yycolumn+1); }
[^]					        { return new Token(Token.INVALID,  yytext(), yyline+1, yycolumn+1); }








