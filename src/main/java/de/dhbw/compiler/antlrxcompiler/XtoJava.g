/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Übersetzer für X
 * - Transformation nach Java
 * 
 * **********************************************
 */

tree grammar XtoJava;

options {
  language = Java;
  output = template;
  tokenVocab = XOptimizer;
  ASTLabelType = XTree;
}

@header {
    package de.dhbw.compiler.antlrxcompiler;
}

@members {

  private SymbolTable  symbols = SymbolTable.getInstance();  
   
  private StringTemplate printCode() {
    StringBuffer res = new StringBuffer();
    for(Symbol s : symbols.values()) {
      if (s.print) { 
          res.append("  System.out.println(\""+s.name+": \"+"+s.name+");\n");
      }
    }
    return new StringTemplate(res.toString());
  }
  
  private StringTemplate readCode() {
    StringBuffer res = new StringBuffer();
    res.append("Scanner _Scanner = new Scanner(System.in);\n");
    for(Symbol var : symbols.values()) {
      if (var.read) {
        res.append("System.out.print(\""+var.name+": \");\n");
        switch(var.type) {
          case IntType: res.append(var.name+" = _Scanner.nextInt();\n"); break;
          case FloatType: res.append(var.name+" = _Scanner.nextDouble();\n"); break;
          case StringType: res.append(var.name+" = _Scanner.next;\n"); break;
        }
      }  
    }
    res.append("_Scanner.close();");
    return new StringTemplate( res.toString());
  }
    
}
// Deklarationen
decl: ^(DECL ID 'int' 'read'? 'print'?) 
      -> template(id={$ID.text}) "private static int <id>=0;"
    | ^(DECL ID 'float' 'read'? 'print'?)  
      -> template(id={$ID.text}) "private static double <id>=0.0;"
    | ^(DECL ID 'string' 'read'? 'print'?)  
      -> template(id={$ID.text}) "private static String <id>=\"\";";

decllist:   ^(DECLLIST (d+=decl)+)  -> template(decl={$d})
<< 
<decl; separator="\n">
>>
          | DECLLIST -> template() "";

// Expr
expr:       ^(UMINUS e=expr)  -> template(e={$e.st}) "-(<e>)"
          | ^((op='+' | op='-' | op='/' | op='*') e1=expr e2=expr) 
                -> template(op={$op.text}, e1={$e1.st}, e2={$e2.st}) "(<e1><op><e2>)" 
          | (x=INTCONST | x=FLOATCONST | x=STRINGCONST | x=ID) -> template(x={$x.text}) "<x>";
          

// assignstat:  ^(':=' ID  expr);
assignstat:  ^(':=' ID expr) -> template(id={$ID.text}, expr={$expr.st}) "<id> = <expr>";
assignwithsemi:  ^(':=' ID expr) -> template(id={$ID.text}, expr={$expr.st}) "<id> = <expr>;";


// Bedingungen
cond:       ^(( op='<' |op='>') e1=expr e2=expr)
            -> template(op={$op.text}, e1={$e1.st}, e2={$e2.st})  "(<e1><op><e2>)"
          | ^('=' e1=expr e2=expr) 
             -> template(e1={$e1.st}, e2={$e2.st})  "(<e1>==<e2>)";

// Bedingte Zuweisung
// condstat:  ^('if' cond  s1=stat s2=stat?) -> template(c={$cond.st}, s1={$s1.st}, s2={$s2.st})
// <<if <c> {
//  <s1>
// } else {
//  <s2>
// }>>;

condstat:  ^('if' cond  s1=stat elsepart?) -> template(c={$cond.st}, s1={$s1.st}, elsepart={$elsepart.st})
<<if <c> {
 <s1>
<elsepart>}>>;

elsepart: stat -> template (stat={$stat.st}) 
<<} else {
  <stat>
>>;

// Schleifen
whilestat:    ^('while' cond stat) -> template(c={$cond.st}, s={$stat.st}) 
<<while <c> {
  <s>
}>>;

forstat:      ^('for' i=assignstat c=cond p=assignstat s=stat) -> template(i={$i.st}, c={$c.st}, p={$p.st}, s={$s.st})
<<for (<i>; <c>; <p>) {
  <s>
}>>;

// Anweisungen
stat:         (s=assignwithsemi | s=condstat | s=whilestat | s=forstat | s=statlist) -> template(stat={$s.st}) "<stat>";

// Blöcke
statlist:   ^(STATLIST (s+=stat)+) -> template(stat={$s}) 
<< <stat; separator="\n"> >>
          | STATLIST -> template() "";

// Programme
program:      ^('program' ID decllist statlist)
              -> template(id={$ID}, decllist={$decllist.st}, statlist={$statlist.st}, read={readCode()}, print={printCode()})
<<import java.util.Scanner;

// patricks yachthafen      [    ]
// lucies fahrradständer    [    ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35
// toms Ladeparkanlage      [    ]
// jonas tiefgarage         [    ]
// gäste parkplatz          [    ]
// beas privatanwesen       [    ]
// katjas hobbithöhle       [    ]

public class <id> {
  <decllist>
  public static void main(String[] args) {
    <read>
    
    <statlist>
  
    <print>
  }
} 
>>;

