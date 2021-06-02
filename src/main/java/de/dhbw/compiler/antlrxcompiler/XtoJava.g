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

  public StringTemplate printCode() {
    return new StringTemplate();
  }

  public StringTemplate readCode() {
      return new StringTemplate();
  }

}

decl: ^(DECL ID 'int' 'read'? 'print'?) -> template(id={$ID.text}) "private static int <id>=0;";
decl: ^(DECL ID 'float' 'read'? 'print'?) -> template(id={$ID.text}) "private static float <id>=0;";
decl: ^(DECL ID 'string' 'read'? 'print'?) -> template(id={$ID.text}) "private static string <id>=0;";

stat: ^(STATLIST assignstat ;) -> template(assignstat={$assignstat.st});
<<
<assignstat; separator="\n">
>>;

decllist:      ^(DECLLIST decl*) -> template(decl={$decl.st});
<<
<decl; separator="\n">
>>;

statlist:      ^(STATLIST stat*) -> template(stat={$stat.st})
<<
<stat; seperator="\n">
>>;

assignstat: ^(STATLIST .*) -> template()
<<
assignstat
>>;

//condstat:
//whilestat:


program:      ^('program' ID decllist statlist) -> template(id={$ID.text}, decllist={$decllist.st}, statlist={$statlist.st}, read={readCode()}, print={printCode()})
<<
public class <id> {

// patricks yachthafen      [    ]
// lucies fahrradständer    [    ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35
// toms Ladeparkanlage      [    ]
// jonas tiefgarage         [    ]
// gäste parkplatz          [    ]
// beas privatanwesen       [    ]
// katjas hobbithöhle       [    ]

    <decllist>
    public static void main(String[] args) {
        <read>
        <statlist>
        <print>
    }
}
>>;





