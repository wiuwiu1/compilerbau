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
     
}

program:      'todo' -> template() "Hello World!";

