// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g 2021-06-02 12:41:10

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
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:1: bottomup : uminus ;
	@Override
	public final XOptimizer.bottomup_return bottomup() throws RecognitionException {
		XOptimizer.bottomup_return retval = new XOptimizer.bottomup_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope uminus1 =null;


		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:81:9: ( uminus )
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
	// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:83:1: uminus : ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] );
	public final XOptimizer.uminus_return uminus() throws RecognitionException {
		XOptimizer.uminus_return retval = new XOptimizer.uminus_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree x=null;
		XTree UMINUS2=null;
		XTree UMINUS3=null;

		XTree x_tree=null;
		XTree UMINUS2_tree=null;
		XTree UMINUS3_tree=null;
		RewriteRuleNodeStream stream_UMINUS=new RewriteRuleNodeStream(adaptor,"token UMINUS");
		RewriteRuleNodeStream stream_FLOATCONST=new RewriteRuleNodeStream(adaptor,"token FLOATCONST");
		RewriteRuleNodeStream stream_INTCONST=new RewriteRuleNodeStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:83:7: ( ^( UMINUS x= INTCONST ) -> INTCONST[ \"-\"+$x.text ] | ^( UMINUS x= FLOATCONST ) -> FLOATCONST[\"-\"+$x.text ] )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==UMINUS) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==INTCONST) ) {
						alt1=1;
					}
					else if ( (LA1_2==FLOATCONST) ) {
						alt1=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
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
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:84:5: ^( UMINUS x= INTCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS2=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus89); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS2);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS2;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_uminus93); if (state.failed) return retval;
					 
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
					// 84:26: -> INTCONST[ \"-\"+$x.text ]
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
					// de\\dhbw\\compiler\\antlrxcompiler\\XOptimizer.g:85:5: ^( UMINUS x= FLOATCONST )
					{
					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					_last = (XTree)input.LT(1);
					UMINUS3=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_uminus106); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_UMINUS.add(UMINUS3);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = UMINUS3;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (XTree)input.LT(1);
					x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_uminus110); if (state.failed) return retval;
					 
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
					// 85:28: -> FLOATCONST[\"-\"+$x.text ]
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

	// Delegated rules



	public static final BitSet FOLLOW_uminus_in_bottomup74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_uminus89 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_uminus93 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_uminus106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FLOATCONST_in_uminus110 = new BitSet(new long[]{0x0000000000000008L});
}
