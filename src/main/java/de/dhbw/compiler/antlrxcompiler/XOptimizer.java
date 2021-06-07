// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g 2021-06-07 15:15:07

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class XOptimizer extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DECL", "DECLLIST", 
		"DIGIT", "FLOATCONST", "ID", "INTCONST", "INVALID", "LETTER", "OTHER", 
		"POSDIGIT", "STATLIST", "STRINGCONST", "UMINUS", "WS", "ZERO", "'('", 
		"')'", "'*'", "'+'", "'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", 
		"'='", "'>'", "'begin'", "'else'", "'end'", "'float'", "'for'", "'if'", 
		"'int'", "'print'", "'program'", "'read'", "'string'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int COMMENT=4;
	public static final int DECL=5;
	public static final int DECLLIST=6;
	public static final int DIGIT=7;
	public static final int FLOATCONST=8;
	public static final int ID=9;
	public static final int INTCONST=10;
	public static final int INVALID=11;
	public static final int LETTER=12;
	public static final int OTHER=13;
	public static final int POSDIGIT=14;
	public static final int STATLIST=15;
	public static final int STRINGCONST=16;
	public static final int UMINUS=17;
	public static final int WS=18;
	public static final int ZERO=19;
	public static final int PLUS=23;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public XOptimizer(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XOptimizer(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XOptimizer.tokenNames; }
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g"; }


	    private String addString(String first, String last) {
	      return first.substring(0, first.length()-1)+last.substring(1);
	    }
	    
	    private String opInt(String first, String last, char op) {
	      int firstValue = 0;
	      int lastValue = 0;
	      try {
	        firstValue = Integer.parseInt(first);
	        lastValue = Integer.parseInt(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Integer.toString(firstValue+lastValue);
	        case '-': return Integer.toString(firstValue-lastValue);
	        case '*': return Integer.toString(firstValue*lastValue);
	        case '/': return Integer.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }
	      
	    private String opFloat(String first, String last, char op) {
	      double firstValue = 0.0;
	      double lastValue = 0.0;
	      try {
		      firstValue = Double.parseDouble(first);
		      lastValue = Double.parseDouble(last);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      switch (op) {
	        case '+': return Double.toString(firstValue+lastValue);
	        case '-': return Double.toString(firstValue-lastValue);
	        case '*': return Double.toString(firstValue*lastValue);
	        case '/': return Double.toString(firstValue/lastValue);
	        default: return "";
	      }
	     }

	    private boolean isZero(String x) {
	     	double value = Double.NaN;
	      	try {
	        	value = Double.parseDouble(x);
	      	} catch (Exception e) {
	        	e.printStackTrace();
	      	}
	      	return value==0.0;
	     }
	      
	     private boolean isOne(String x) {
	     	double value = Double.NaN;
	      	try {
	        	value = Double.parseDouble(x);
	      	} catch (Exception e) {
	        	e.printStackTrace();
	      	}
	      	return value==1.0;
	     }
	  
	 

	public static class bottomup_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:1: bottomup : ( uminus | foldConstAddInt | foldConstMinusInt | foldConstMultInt | foldConstDivInt | foldConstAddFloat | foldConstMinusFloat | foldConstMultFloat | foldConstDivFloat | foldConstAddFloatInt | foldConstMinusFloatInt | foldConstMultFloatInt | foldConstDivFloatInt );
	@Override
	public final XOptimizer.bottomup_return bottomup() throws RecognitionException {
		XOptimizer.bottomup_return retval = new XOptimizer.bottomup_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope uminus1 =null;
		TreeRuleReturnScope foldConstAddInt2 =null;
		TreeRuleReturnScope foldConstMinusInt3 =null;
		TreeRuleReturnScope foldConstMultInt4 =null;
		TreeRuleReturnScope foldConstDivInt5 =null;
		TreeRuleReturnScope foldConstAddFloat6 =null;
		TreeRuleReturnScope foldConstMinusFloat7 =null;
		TreeRuleReturnScope foldConstMultFloat8 =null;
		TreeRuleReturnScope foldConstDivFloat9 =null;
		TreeRuleReturnScope foldConstAddFloatInt10 =null;
		TreeRuleReturnScope foldConstMinusFloatInt11 =null;
		TreeRuleReturnScope foldConstMultFloatInt12 =null;
		TreeRuleReturnScope foldConstDivFloatInt13 =null;


		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:9: ( uminus | foldConstAddInt | foldConstMinusInt | foldConstMultInt | foldConstDivInt | foldConstAddFloat | foldConstMinusFloat | foldConstMultFloat | foldConstDivFloat | foldConstAddFloatInt | foldConstMinusFloatInt | foldConstMultFloatInt | foldConstDivFloatInt )
			int alt1=13;
			switch ( input.LA(1) ) {
			case UMINUS:
				{
				alt1=1;
				}
				break;
			case 23:
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2==DOWN) ) {
					int LA1_6 = input.LA(3);
					if ( (LA1_6==INTCONST) ) {
						alt1=2;
					}
					else if ( (LA1_6==FLOATCONST) ) {
						int LA1_11 = input.LA(4);
						if ( (LA1_11==FLOATCONST) ) {
							alt1=6;
						}
						else if ( (LA1_11==INTCONST) ) {
							alt1=10;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 24:
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3==DOWN) ) {
					int LA1_7 = input.LA(3);
					if ( (LA1_7==INTCONST) ) {
						alt1=3;
					}
					else if ( (LA1_7==FLOATCONST) ) {
						int LA1_13 = input.LA(4);
						if ( (LA1_13==FLOATCONST) ) {
							alt1=7;
						}
						else if ( (LA1_13==INTCONST) ) {
							alt1=11;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 22:
				{
				int LA1_4 = input.LA(2);
				if ( (LA1_4==DOWN) ) {
					int LA1_8 = input.LA(3);
					if ( (LA1_8==INTCONST) ) {
						alt1=4;
					}
					else if ( (LA1_8==FLOATCONST) ) {
						int LA1_15 = input.LA(4);
						if ( (LA1_15==FLOATCONST) ) {
							alt1=8;
						}
						else if ( (LA1_15==INTCONST) ) {
							alt1=12;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 26:
				{
				int LA1_5 = input.LA(2);
				if ( (LA1_5==DOWN) ) {
					int LA1_9 = input.LA(3);
					if ( (LA1_9==INTCONST) ) {
						alt1=5;
					}
					else if ( (LA1_9==FLOATCONST) ) {
						int LA1_17 = input.LA(4);
						if ( (LA1_17==FLOATCONST) ) {
							alt1=9;
						}
						else if ( (LA1_17==INTCONST) ) {
							alt1=13;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:11: uminus
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_uminus_in_bottomup74);
					uminus1=uminus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)uminus1.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:20: foldConstAddInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstAddInt_in_bottomup78);
					foldConstAddInt2=foldConstAddInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstAddInt2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:38: foldConstMinusInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMinusInt_in_bottomup82);
					foldConstMinusInt3=foldConstMinusInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMinusInt3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:58: foldConstMultInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMultInt_in_bottomup86);
					foldConstMultInt4=foldConstMultInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMultInt4.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:77: foldConstDivInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstDivInt_in_bottomup90);
					foldConstDivInt5=foldConstDivInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstDivInt5.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:95: foldConstAddFloat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstAddFloat_in_bottomup94);
					foldConstAddFloat6=foldConstAddFloat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstAddFloat6.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 7 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:82:3: foldConstMinusFloat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMinusFloat_in_bottomup98);
					foldConstMinusFloat7=foldConstMinusFloat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMinusFloat7.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 8 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:82:25: foldConstMultFloat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMultFloat_in_bottomup102);
					foldConstMultFloat8=foldConstMultFloat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMultFloat8.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 9 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:82:46: foldConstDivFloat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstDivFloat_in_bottomup106);
					foldConstDivFloat9=foldConstDivFloat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstDivFloat9.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 10 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:82:66: foldConstAddFloatInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstAddFloatInt_in_bottomup110);
					foldConstAddFloatInt10=foldConstAddFloatInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstAddFloatInt10.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 11 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:82:89: foldConstMinusFloatInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMinusFloatInt_in_bottomup114);
					foldConstMinusFloatInt11=foldConstMinusFloatInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMinusFloatInt11.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 12 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:83:3: foldConstMultFloatInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstMultFloatInt_in_bottomup118);
					foldConstMultFloatInt12=foldConstMultFloatInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstMultFloatInt12.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 13 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:83:27: foldConstDivFloatInt
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_foldConstDivFloatInt_in_bottomup122);
					foldConstDivFloatInt13=foldConstDivFloatInt();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (XTree)foldConstDivFloatInt13.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (XTree)adaptor.getParent(retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bottomup"


	public static class uminus_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "uminus"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:86:1: uminus : ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] );
	public final XOptimizer.uminus_return uminus() throws RecognitionException {
		XOptimizer.uminus_return retval = new XOptimizer.uminus_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree UMINUS14=null;
		XTree UMINUS15=null;

		XTree x_tree=null;
		XTree UMINUS14_tree=null;
		XTree UMINUS15_tree=null;
		RewriteRuleNodeStream stream_UMINUS=new RewriteRuleNodeStream(adaptor,"token UMINUS");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:86:7: ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==UMINUS) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==INTCONST) ) {
						alt2=1;
					}
					else if ( (LA2_2==FLOATCONST) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:87:5: ^( UMINUS x= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS14=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus138); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS14);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_uminus142); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 87:26: -> INTCONST[ \"-\"+$x.text ]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:88:5: ^( UMINUS x= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS15=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus155); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS15);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_uminus159); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FLOATCONST.add(x);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 88:28: -> FLOATCONST[\"-\"+$x.text ]
					{
						adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, "-"+(x!=null?x.getText():null)));
					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uminus"


	public static class multZeroOne_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "multZeroOne"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:90:1: multZeroOne : ( ^( '*' x= INTCONST {...}? ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) | ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) );
	public final XOptimizer.multZeroOne_return multZeroOne() throws RecognitionException {
		XOptimizer.multZeroOne_return retval = new XOptimizer.multZeroOne_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree op=null;
		XTree char_literal16=null;
		XTree char_literal17=null;
		XTree y=null;

		XTree x_tree=null;
		XTree op_tree=null;
		XTree char_literal16_tree=null;
		XTree char_literal17_tree=null;
		XTree y_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:90:12: ( ^( '*' x= INTCONST {...}? ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) ) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) | ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?) -> {$x.text.equals(\"0\") }? $x -> ^( $op ( $y)* ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==22) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==INTCONST) ) {
						alt7=1;
					}
					else if ( (LA7_2==ID||(LA7_2 >= 22 && LA7_2 <= 24)||LA7_2==26) ) {
						alt7=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:3: ^( '*' x= INTCONST {...}? ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal16=(XTree)match(input,22,FOLLOW_22_in_multZeroOne173); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal16);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal16;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_multZeroOne177); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0")||(x!=null?x.getText():null).equals("1") )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multZeroOne", "$x.text.equals(\"0\")||$x.text.equals(\"1\") ");
					}
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:69: ( '+' | '-' | '*' | '/' | ID )
					int alt3=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt3=1;
						}
						break;
					case 24:
						{
						alt3=2;
						}
						break;
					case 22:
						{
						alt3=3;
						}
						break;
					case 26:
						{
						alt3=4;
						}
						break;
					case ID:
						{
						alt3=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:70: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_multZeroOne186); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:76: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_multZeroOne190); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:82: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_multZeroOne194); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:88: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_multZeroOne198); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:94: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_multZeroOne202); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:99: (y= . )*
						loop4:
						while (true) {
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( ((LA4_0 >= COMMENT && LA4_0 <= 45)) ) {
								alt4=1;
							}

							switch (alt4) {
							case 1 :
								// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:91:99: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop4;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: x, y, op
					// token labels: op, x
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleNodeStream stream_x=new RewriteRuleNodeStream(adaptor,"token x",x);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 92:5: -> {$x.text.equals(\"0\") }? $x
					if ((x!=null?x.getText():null).equals("0") ) {
						adaptor.addChild(root_0, stream_x.nextNode());
					}

					else // 93:5: -> ^( $op ( $y)* )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:93:8: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:93:14: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:3: ^( '*' ^(op= ( '+' | '-' | '*' | '/' | ID ) (y= . )* ) x= INTCONST {...}?)
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					char_literal17=(XTree)match(input,22,FOLLOW_22_in_multZeroOne241); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_22.add(char_literal17);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal17;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_2 = _last;
					XTree _first_2 = null;
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:14: ( '+' | '-' | '*' | '/' | ID )
					int alt5=5;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt5=1;
						}
						break;
					case 24:
						{
						alt5=2;
						}
						break;
					case 22:
						{
						alt5=3;
						}
						break;
					case 26:
						{
						alt5=4;
						}
						break;
					case ID:
						{
						alt5=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:15: '+'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,23,FOLLOW_23_in_multZeroOne247); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_23.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:21: '-'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,24,FOLLOW_24_in_multZeroOne251); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_24.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:27: '*'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,22,FOLLOW_22_in_multZeroOne255); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_22.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 4 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:33: '/'
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,26,FOLLOW_26_in_multZeroOne259); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_26.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;
						case 5 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:39: ID
							{
							_last = (XTree)input.LT(1);
							op=(XTree)match(input,ID,FOLLOW_ID_in_multZeroOne263); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(op);

							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (XTree)adaptor.getParent(retval.tree);
							}

							}
							break;

					}

					if ( state.backtracking==1 )
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:44: (y= . )*
						loop6:
						while (true) {
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( ((LA6_0 >= COMMENT && LA6_0 <= 45)) ) {
								alt6=1;
							}

							switch (alt6) {
							case 1 :
								// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:94:44: y= .
								{
								_last = (XTree)input.LT(1);
								y=(XTree)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								 
								if ( state.backtracking==1 )
								if ( _first_2==null ) _first_2 = y;

								if ( state.backtracking==1 ) {
								retval.tree = _first_0;
								if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
									retval.tree = (XTree)adaptor.getParent(retval.tree);
								}

								}
								break;

							default :
								break loop6;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					_last = _save_last_2;
					}


					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_multZeroOne274); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INTCONST.add(x);

					if ( !(((x!=null?x.getText():null).equals("0")||(x!=null?x.getText():null).equals("0"))) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multZeroOne", "$x.text.equals(\"0\")||$x.text.equals(\"0\")");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: x, y, op
					// token labels: op, x
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_op=new RewriteRuleNodeStream(adaptor,"token op",op);
					RewriteRuleNodeStream stream_x=new RewriteRuleNodeStream(adaptor,"token x",x);
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 95:5: -> {$x.text.equals(\"0\") }? $x
					if ((x!=null?x.getText():null).equals("0") ) {
						adaptor.addChild(root_0, stream_x.nextNode());
					}

					else // 96:5: -> ^( $op ( $y)* )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:96:8: ^( $op ( $y)* )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:96:14: ( $y)*
						while ( stream_y.hasNext() ) {
							adaptor.addChild(root_1, stream_y.nextTree());
						}
						stream_y.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multZeroOne"


	public static class foldConstAddInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstAddInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:99:1: foldConstAddInt : ^( '+' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '+')] ;
	public final XOptimizer.foldConstAddInt_return foldConstAddInt() throws RecognitionException {
		XOptimizer.foldConstAddInt_return retval = new XOptimizer.foldConstAddInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal18=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal18_tree=null;
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:99:16: ( ^( '+' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '+')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:100:5: ^( '+' l= INTCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal18=(XTree)match(input,23,FOLLOW_23_in_foldConstAddInt315); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_23.add(char_literal18);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal18;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstAddInt319); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstAddInt323); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: INTCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 100:34: -> INTCONST[opInt($l.text, $r.text, '+')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((l!=null?l.getText():null), (r!=null?r.getText():null), '+')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstAddInt"


	public static class foldConstMinusInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMinusInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:102:1: foldConstMinusInt : ^( '-' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '-')] ;
	public final XOptimizer.foldConstMinusInt_return foldConstMinusInt() throws RecognitionException {
		XOptimizer.foldConstMinusInt_return retval = new XOptimizer.foldConstMinusInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal19=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal19_tree=null;
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:102:18: ( ^( '-' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '-')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:103:5: ^( '-' l= INTCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal19=(XTree)match(input,24,FOLLOW_24_in_foldConstMinusInt341); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_24.add(char_literal19);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal19;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMinusInt345); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMinusInt349); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: INTCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 103:34: -> INTCONST[opInt($l.text, $r.text, '-')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((l!=null?l.getText():null), (r!=null?r.getText():null), '-')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMinusInt"


	public static class foldConstMultInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMultInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:105:1: foldConstMultInt : ^( '*' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '*')] ;
	public final XOptimizer.foldConstMultInt_return foldConstMultInt() throws RecognitionException {
		XOptimizer.foldConstMultInt_return retval = new XOptimizer.foldConstMultInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal20=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal20_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:105:17: ( ^( '*' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '*')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:106:5: ^( '*' l= INTCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal20=(XTree)match(input,22,FOLLOW_22_in_foldConstMultInt367); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_22.add(char_literal20);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal20;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMultInt371); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMultInt375); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: INTCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 106:34: -> INTCONST[opInt($l.text, $r.text, '*')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((l!=null?l.getText():null), (r!=null?r.getText():null), '*')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMultInt"


	public static class foldConstDivInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstDivInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:108:1: foldConstDivInt : ^( '/' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '/')] ;
	public final XOptimizer.foldConstDivInt_return foldConstDivInt() throws RecognitionException {
		XOptimizer.foldConstDivInt_return retval = new XOptimizer.foldConstDivInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal21=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal21_tree=null;
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:108:16: ( ^( '/' l= INTCONST r= INTCONST ) -> INTCONST[opInt($l.text, $r.text, '/')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:109:5: ^( '/' l= INTCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal21=(XTree)match(input,26,FOLLOW_26_in_foldConstDivInt393); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_26.add(char_literal21);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal21;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstDivInt397); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstDivInt401); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: INTCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 109:34: -> INTCONST[opInt($l.text, $r.text, '/')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(INTCONST, opInt((l!=null?l.getText():null), (r!=null?r.getText():null), '/')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstDivInt"


	public static class foldConstAddFloat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstAddFloat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:111:1: foldConstAddFloat : ^( '+' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '+')] ;
	public final XOptimizer.foldConstAddFloat_return foldConstAddFloat() throws RecognitionException {
		XOptimizer.foldConstAddFloat_return retval = new XOptimizer.foldConstAddFloat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal22=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal22_tree=null;
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:111:18: ( ^( '+' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '+')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:112:5: ^( '+' l= FLOATCONST r= FLOATCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal22=(XTree)match(input,23,FOLLOW_23_in_foldConstAddFloat419); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_23.add(char_literal22);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal22;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstAddFloat423); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstAddFloat427); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 112:38: -> FLOATCONST[opFloat($l.text, $r.text, '+')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '+')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstAddFloat"


	public static class foldConstMinusFloat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMinusFloat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:114:1: foldConstMinusFloat : ^( '-' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '-')] ;
	public final XOptimizer.foldConstMinusFloat_return foldConstMinusFloat() throws RecognitionException {
		XOptimizer.foldConstMinusFloat_return retval = new XOptimizer.foldConstMinusFloat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal23=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal23_tree=null;
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:114:20: ( ^( '-' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '-')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:115:5: ^( '-' l= FLOATCONST r= FLOATCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal23=(XTree)match(input,24,FOLLOW_24_in_foldConstMinusFloat445); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_24.add(char_literal23);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal23;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMinusFloat449); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMinusFloat453); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 115:38: -> FLOATCONST[opFloat($l.text, $r.text, '-')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '-')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMinusFloat"


	public static class foldConstMultFloat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMultFloat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:117:1: foldConstMultFloat : ^( '*' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '*')] ;
	public final XOptimizer.foldConstMultFloat_return foldConstMultFloat() throws RecognitionException {
		XOptimizer.foldConstMultFloat_return retval = new XOptimizer.foldConstMultFloat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal24=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal24_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:117:19: ( ^( '*' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '*')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:118:5: ^( '*' l= FLOATCONST r= FLOATCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal24=(XTree)match(input,22,FOLLOW_22_in_foldConstMultFloat471); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_22.add(char_literal24);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal24;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMultFloat475); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMultFloat479); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 118:38: -> FLOATCONST[opFloat($l.text, $r.text, '*')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '*')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMultFloat"


	public static class foldConstDivFloat_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstDivFloat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:120:1: foldConstDivFloat : ^( '/' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '/')] ;
	public final XOptimizer.foldConstDivFloat_return foldConstDivFloat() throws RecognitionException {
		XOptimizer.foldConstDivFloat_return retval = new XOptimizer.foldConstDivFloat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal25=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal25_tree=null;
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:120:18: ( ^( '/' l= FLOATCONST r= FLOATCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '/')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:121:5: ^( '/' l= FLOATCONST r= FLOATCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal25=(XTree)match(input,26,FOLLOW_26_in_foldConstDivFloat497); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_26.add(char_literal25);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal25;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstDivFloat501); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstDivFloat505); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 121:38: -> FLOATCONST[opFloat($l.text, $r.text, '/')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '/')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstDivFloat"


	public static class foldConstAddFloatInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstAddFloatInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:123:1: foldConstAddFloatInt : ^( '+' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '+')] ;
	public final XOptimizer.foldConstAddFloatInt_return foldConstAddFloatInt() throws RecognitionException {
		XOptimizer.foldConstAddFloatInt_return retval = new XOptimizer.foldConstAddFloatInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal26=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal26_tree=null;
		RewriteRuleNodeStream stream_23=new RewriteRuleNodeStream(adaptor,"token 23");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:123:21: ( ^( '+' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '+')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:124:5: ^( '+' l= FLOATCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal26=(XTree)match(input,23,FOLLOW_23_in_foldConstAddFloatInt523); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_23.add(char_literal26);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal26;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstAddFloatInt527); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstAddFloatInt531); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 124:36: -> FLOATCONST[opFloat($l.text, $r.text, '+')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '+')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstAddFloatInt"


	public static class foldConstMinusFloatInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMinusFloatInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:126:1: foldConstMinusFloatInt : ^( '-' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '-')] ;
	public final XOptimizer.foldConstMinusFloatInt_return foldConstMinusFloatInt() throws RecognitionException {
		XOptimizer.foldConstMinusFloatInt_return retval = new XOptimizer.foldConstMinusFloatInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal27=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal27_tree=null;
		RewriteRuleNodeStream stream_24=new RewriteRuleNodeStream(adaptor,"token 24");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:126:23: ( ^( '-' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '-')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:127:5: ^( '-' l= FLOATCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal27=(XTree)match(input,24,FOLLOW_24_in_foldConstMinusFloatInt549); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_24.add(char_literal27);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal27;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMinusFloatInt553); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMinusFloatInt557); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 127:36: -> FLOATCONST[opFloat($l.text, $r.text, '-')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '-')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMinusFloatInt"


	public static class foldConstMultFloatInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstMultFloatInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:129:1: foldConstMultFloatInt : ^( '*' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '*')] ;
	public final XOptimizer.foldConstMultFloatInt_return foldConstMultFloatInt() throws RecognitionException {
		XOptimizer.foldConstMultFloatInt_return retval = new XOptimizer.foldConstMultFloatInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal28=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal28_tree=null;
		RewriteRuleNodeStream stream_22=new RewriteRuleNodeStream(adaptor,"token 22");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:129:22: ( ^( '*' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '*')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:130:5: ^( '*' l= FLOATCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal28=(XTree)match(input,22,FOLLOW_22_in_foldConstMultFloatInt575); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_22.add(char_literal28);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal28;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstMultFloatInt579); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstMultFloatInt583); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 130:36: -> FLOATCONST[opFloat($l.text, $r.text, '*')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '*')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstMultFloatInt"


	public static class foldConstDivFloatInt_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "foldConstDivFloatInt"
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:132:1: foldConstDivFloatInt : ^( '/' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '/')] ;
	public final XOptimizer.foldConstDivFloatInt_return foldConstDivFloatInt() throws RecognitionException {
		XOptimizer.foldConstDivFloatInt_return retval = new XOptimizer.foldConstDivFloatInt_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree l=null;
		XTree r=null;
		XTree char_literal29=null;

		XTree l_tree=null;
		XTree r_tree=null;
		XTree char_literal29_tree=null;
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_26=new RewriteRuleNodeStream(adaptor,"token 26");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:132:21: ( ^( '/' l= FLOATCONST r= INTCONST ) -> FLOATCONST[opFloat($l.text, $r.text, '/')] )
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:133:5: ^( '/' l= FLOATCONST r= INTCONST )
			{
			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			_last = (XTree)input.LT(1);
			char_literal29=(XTree)match(input,26,FOLLOW_26_in_foldConstDivFloatInt601); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_26.add(char_literal29);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal29;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (XTree)input.LT(1);
			l=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_foldConstDivFloatInt605); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_FLOATCONST.add(l);

			_last = (XTree)input.LT(1);
			r=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_foldConstDivFloatInt609); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INTCONST.add(r);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: FLOATCONST
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 133:36: -> FLOATCONST[opFloat($l.text, $r.text, '/')]
			{
				adaptor.addChild(root_0, (XTree)adaptor.create(FLOATCONST, opFloat((l!=null?l.getText():null), (r!=null?r.getText():null), '/')));
			}


			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foldConstDivFloatInt"

	// Delegated rules



	public static final BitSet FOLLOW_uminus_in_bottomup74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstAddInt_in_bottomup78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMinusInt_in_bottomup82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMultInt_in_bottomup86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstDivInt_in_bottomup90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstAddFloat_in_bottomup94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMinusFloat_in_bottomup98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMultFloat_in_bottomup102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstDivFloat_in_bottomup106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstAddFloatInt_in_bottomup110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMinusFloatInt_in_bottomup114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstMultFloatInt_in_bottomup118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foldConstDivFloatInt_in_bottomup122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_uminus138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_uminus142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_uminus155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_uminus159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_multZeroOne173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_multZeroOne177 = new BitSet(new long[]{0x0000000005C00200L});
	public static final BitSet FOLLOW_23_in_multZeroOne186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_multZeroOne190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_multZeroOne198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_multZeroOne202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_23_in_multZeroOne247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_multZeroOne251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_multZeroOne255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_multZeroOne259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_multZeroOne263 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_multZeroOne274 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_foldConstAddInt315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstAddInt319 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstAddInt323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_foldConstMinusInt341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMinusInt345 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMinusInt349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_foldConstMultInt367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMultInt371 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMultInt375 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_foldConstDivInt393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstDivInt397 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstDivInt401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_foldConstAddFloat419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstAddFloat423 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstAddFloat427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_foldConstMinusFloat445 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMinusFloat449 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMinusFloat453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_foldConstMultFloat471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMultFloat475 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMultFloat479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_foldConstDivFloat497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstDivFloat501 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstDivFloat505 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_foldConstAddFloatInt523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstAddFloatInt527 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstAddFloatInt531 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_24_in_foldConstMinusFloatInt549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMinusFloatInt553 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMinusFloatInt557 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_foldConstMultFloatInt575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstMultFloatInt579 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstMultFloatInt583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_foldConstDivFloatInt601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_foldConstDivFloatInt605 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_foldConstDivFloatInt609 = new BitSet(new long[]{0x0000000000000008L});
}
