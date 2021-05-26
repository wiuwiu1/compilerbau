tree grammar AssignCount;

options {
  language = Java;
  output = AST;
  tokenVocab = X;
  ASTLabelType = CommonTree;
}

@header {package de.dhbw.compiler.antlrxtreegrammar;}

@members {

  private int count =0;
  
  public int getCount() { return count; }
  
}


program:      'todo';

