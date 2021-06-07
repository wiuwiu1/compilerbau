// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g 2021-06-07 15:31:51
package de.dhbw.compiler.antlrxtreegrammar;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class XTreeGrammar extends TreeParser {
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

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XTreeGrammar(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XTreeGrammar.tokenNames; }
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g"; }


	public static class decl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:1: decl : ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? ) ;
	public final XTreeGrammar.decl_return decl() throws RecognitionException {
		XTreeGrammar.decl_return retval = new XTreeGrammar.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree r=null;
		CommonTree p=null;
		CommonTree DECL1=null;
		CommonTree ID2=null;
		CommonTree set3=null;

		CommonTree r_tree=null;
		CommonTree p_tree=null;
		CommonTree DECL1_tree=null;
		CommonTree ID2_tree=null;
		CommonTree set3_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:5: ( ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:12: ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECL1=(CommonTree)match(input,DECL,FOLLOW_DECL_in_decl67); 
			DECL1_tree = (CommonTree)adaptor.dupNode(DECL1);


			root_1 = (CommonTree)adaptor.becomeRoot(DECL1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_decl69); 
			ID2_tree = (CommonTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			_last = (CommonTree)input.LT(1);
			set3=(CommonTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				set3_tree = (CommonTree)adaptor.dupNode(set3);


				adaptor.addChild(root_1, set3_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:48: (r= 'read' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==42) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:48: r= 'read'
					{
					_last = (CommonTree)input.LT(1);
					r=(CommonTree)match(input,42,FOLLOW_42_in_decl81); 
					r_tree = (CommonTree)adaptor.dupNode(r);


					adaptor.addChild(root_1, r_tree);

					}
					break;

			}

			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:58: (p= 'print' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==40) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:23:58: p= 'print'
					{
					_last = (CommonTree)input.LT(1);
					p=(CommonTree)match(input,40,FOLLOW_40_in_decl86); 
					p_tree = (CommonTree)adaptor.dupNode(p);


					adaptor.addChild(root_1, p_tree);

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "decl"


	public static class decllist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTreeGrammar.decllist_return decllist() throws RecognitionException {
		XTreeGrammar.decllist_return retval = new XTreeGrammar.decllist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DECLLIST4=null;
		TreeRuleReturnScope decl5 =null;

		CommonTree DECLLIST4_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:9: ( ^( DECLLIST ( decl )* ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:12: ^( DECLLIST ( decl )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DECLLIST4=(CommonTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist96); 
			DECLLIST4_tree = (CommonTree)adaptor.dupNode(DECLLIST4);


			root_1 = (CommonTree)adaptor.becomeRoot(DECLLIST4_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:23: ( decl )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==DECL) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:24:23: decl
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist98);
						decl5=decl();
						state._fsp--;

						adaptor.addChild(root_1, decl5.getTree());

						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "decllist"


	public static class expr_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:25:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | STRINGCONST | ID );
	public final XTreeGrammar.expr_return expr() throws RecognitionException {
		XTreeGrammar.expr_return retval = new XTreeGrammar.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set6=null;
		CommonTree UMINUS9=null;
		CommonTree set10=null;
		CommonTree INTCONST11=null;
		CommonTree FLOATCONST12=null;
		CommonTree STRINGCONST13=null;
		CommonTree ID14=null;
		TreeRuleReturnScope expr7 =null;
		TreeRuleReturnScope expr8 =null;

		CommonTree set6_tree=null;
		CommonTree UMINUS9_tree=null;
		CommonTree set10_tree=null;
		CommonTree INTCONST11_tree=null;
		CommonTree FLOATCONST12_tree=null;
		CommonTree STRINGCONST13_tree=null;
		CommonTree ID14_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:25:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | STRINGCONST | ID )
			int alt4=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt4=1;
				}
				break;
			case UMINUS:
				{
				alt4=2;
				}
				break;
			case INTCONST:
				{
				alt4=3;
				}
				break;
			case FLOATCONST:
				{
				alt4=4;
				}
				break;
			case STRINGCONST:
				{
				alt4=5;
				}
				break;
			case ID:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:25:12: ^( ( '+' | '-' | '*' | '/' ) expr expr )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set6=(CommonTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						set6_tree = (CommonTree)adaptor.dupNode(set6);


						root_1 = (CommonTree)adaptor.becomeRoot(set6_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr128);
					expr7=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr7.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr130);
					expr8=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr8.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:26:15: ^( UMINUS ( INTCONST | FLOATCONST ) )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					UMINUS9=(CommonTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr148); 
					UMINUS9_tree = (CommonTree)adaptor.dupNode(UMINUS9);


					root_1 = (CommonTree)adaptor.becomeRoot(UMINUS9_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					set10=(CommonTree)input.LT(1);
					if ( input.LA(1)==FLOATCONST||input.LA(1)==INTCONST ) {
						input.consume();
						set10_tree = (CommonTree)adaptor.dupNode(set10);


						adaptor.addChild(root_1, set10_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:27:15: INTCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INTCONST11=(CommonTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr173); 
					INTCONST11_tree = (CommonTree)adaptor.dupNode(INTCONST11);


					adaptor.addChild(root_0, INTCONST11_tree);

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:27:26: FLOATCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					FLOATCONST12=(CommonTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr177); 
					FLOATCONST12_tree = (CommonTree)adaptor.dupNode(FLOATCONST12);


					adaptor.addChild(root_0, FLOATCONST12_tree);

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:27:39: STRINGCONST
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					STRINGCONST13=(CommonTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr181); 
					STRINGCONST13_tree = (CommonTree)adaptor.dupNode(STRINGCONST13);


					adaptor.addChild(root_0, STRINGCONST13_tree);

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:27:53: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_expr185); 
					ID14_tree = (CommonTree)adaptor.dupNode(ID14);


					adaptor.addChild(root_0, ID14_tree);

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "expr"


	public static class cond_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:29:1: cond : ^( ( '<' | '>' | '=' ) expr expr ) ;
	public final XTreeGrammar.cond_return cond() throws RecognitionException {
		XTreeGrammar.cond_return retval = new XTreeGrammar.cond_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set15=null;
		TreeRuleReturnScope expr16 =null;
		TreeRuleReturnScope expr17 =null;

		CommonTree set15_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:29:5: ( ^( ( '<' | '>' | '=' ) expr expr ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:29:7: ^( ( '<' | '>' | '=' ) expr expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			set15=(CommonTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set15_tree = (CommonTree)adaptor.dupNode(set15);


				root_1 = (CommonTree)adaptor.becomeRoot(set15_tree, root_1);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond205);
			expr16=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr16.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond207);
			expr17=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr17.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "cond"


	public static class whilestat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:30:1: whilestat : ^( 'while' cond stat ) ;
	public final XTreeGrammar.whilestat_return whilestat() throws RecognitionException {
		XTreeGrammar.whilestat_return retval = new XTreeGrammar.whilestat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal18=null;
		TreeRuleReturnScope cond19 =null;
		TreeRuleReturnScope stat20 =null;

		CommonTree string_literal18_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:30:10: ( ^( 'while' cond stat ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:30:12: ^( 'while' cond stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal18=(CommonTree)match(input,45,FOLLOW_45_in_whilestat215); 
			string_literal18_tree = (CommonTree)adaptor.dupNode(string_literal18);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal18_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat217);
			cond19=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond19.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat219);
			stat20=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat20.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "whilestat"


	public static class assignstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:1: assignstat : ^( ':=' ID expr ) ;
	public final XTreeGrammar.assignstat_return assignstat() throws RecognitionException {
		XTreeGrammar.assignstat_return retval = new XTreeGrammar.assignstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal21=null;
		CommonTree ID22=null;
		TreeRuleReturnScope expr23 =null;

		CommonTree string_literal21_tree=null;
		CommonTree ID22_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:11: ( ^( ':=' ID expr ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:31:14: ^( ':=' ID expr )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal21=(CommonTree)match(input,28,FOLLOW_28_in_assignstat228); 
			string_literal21_tree = (CommonTree)adaptor.dupNode(string_literal21);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal21_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_assignstat230); 
			ID22_tree = (CommonTree)adaptor.dupNode(ID22);


			adaptor.addChild(root_1, ID22_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat232);
			expr23=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr23.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "assignstat"


	public static class condstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:32:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTreeGrammar.condstat_return condstat() throws RecognitionException {
		XTreeGrammar.condstat_return retval = new XTreeGrammar.condstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal24=null;
		TreeRuleReturnScope cond25 =null;
		TreeRuleReturnScope stat26 =null;
		TreeRuleReturnScope stat27 =null;

		CommonTree string_literal24_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:32:9: ( ^( 'if' cond stat ( stat )? ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:32:12: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal24=(CommonTree)match(input,38,FOLLOW_38_in_condstat241); 
			string_literal24_tree = (CommonTree)adaptor.dupNode(string_literal24);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal24_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat243);
			cond25=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond25.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat245);
			stat26=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat26.getTree());

			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:32:29: ( stat )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STATLIST||LA5_0==28||(LA5_0 >= 37 && LA5_0 <= 38)||LA5_0==45) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:32:29: stat
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat247);
					stat27=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat27.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "condstat"


	public static class forstat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:33:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTreeGrammar.forstat_return forstat() throws RecognitionException {
		XTreeGrammar.forstat_return retval = new XTreeGrammar.forstat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal28=null;
		TreeRuleReturnScope assignstat29 =null;
		TreeRuleReturnScope cond30 =null;
		TreeRuleReturnScope assignstat31 =null;
		TreeRuleReturnScope stat32 =null;

		CommonTree string_literal28_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:33:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:33:12: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal28=(CommonTree)match(input,37,FOLLOW_37_in_forstat258); 
			string_literal28_tree = (CommonTree)adaptor.dupNode(string_literal28);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat260);
			assignstat29=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat29.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat262);
			cond30=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond30.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat264);
			assignstat31=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat31.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat266);
			stat32=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat32.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "forstat"


	public static class stat_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTreeGrammar.stat_return stat() throws RecognitionException {
		XTreeGrammar.stat_return retval = new XTreeGrammar.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignstat33 =null;
		TreeRuleReturnScope condstat34 =null;
		TreeRuleReturnScope whilestat35 =null;
		TreeRuleReturnScope forstat36 =null;
		TreeRuleReturnScope statlist37 =null;


		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt6=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt6=1;
				}
				break;
			case 38:
				{
				alt6=2;
				}
				break;
			case 45:
				{
				alt6=3;
				}
				break;
			case 37:
				{
				alt6=4;
				}
				break;
			case STATLIST:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:12: assignstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat278);
					assignstat33=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat33.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:25: condstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat282);
					condstat34=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat34.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:36: whilestat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat286);
					whilestat35=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat35.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:48: forstat
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat290);
					forstat36=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat36.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:34:58: statlist
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat294);
					statlist37=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist37.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "stat"


	public static class statlist_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTreeGrammar.statlist_return statlist() throws RecognitionException {
		XTreeGrammar.statlist_return retval = new XTreeGrammar.statlist_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STATLIST38=null;
		TreeRuleReturnScope stat39 =null;

		CommonTree STATLIST38_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:9: ( ^( STATLIST ( stat )* ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:12: ^( STATLIST ( stat )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STATLIST38=(CommonTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist302); 
			STATLIST38_tree = (CommonTree)adaptor.dupNode(STATLIST38);


			root_1 = (CommonTree)adaptor.becomeRoot(STATLIST38_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:23: ( stat )*
				loop7:
				while (true) {
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==STATLIST||LA7_0==28||(LA7_0 >= 37 && LA7_0 <= 38)||LA7_0==45) ) {
						alt7=1;
					}

					switch (alt7) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:35:23: stat
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist304);
						stat39=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat39.getTree());

						}
						break;

					default :
						break loop7;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "statlist"


	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:37:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTreeGrammar.program_return program() throws RecognitionException {
		XTreeGrammar.program_return retval = new XTreeGrammar.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal40=null;
		CommonTree ID41=null;
		TreeRuleReturnScope decllist42 =null;
		TreeRuleReturnScope statlist43 =null;

		CommonTree string_literal40_tree=null;
		CommonTree ID41_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:37:8: ( ^( 'program' ID decllist statlist ) )
			// de\\dhbw\\compiler\\antlrxtreegrammar\\XTreeGrammar.g:37:12: ^( 'program' ID decllist statlist )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal40=(CommonTree)match(input,41,FOLLOW_41_in_program316); 
			string_literal40_tree = (CommonTree)adaptor.dupNode(string_literal40);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal40_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID41=(CommonTree)match(input,ID,FOLLOW_ID_in_program318); 
			ID41_tree = (CommonTree)adaptor.dupNode(ID41);


			adaptor.addChild(root_1, ID41_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program320);
			decllist42=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist42.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program322);
			statlist43=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist43.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

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
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_DECL_in_decl67 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl69 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_set_in_decl71 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl81 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl86 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist98 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr128 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr148 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_expr150 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_cond193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond205 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat215 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat217 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_assignstat228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat230 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat243 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat245 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat260 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat262 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat264 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist304 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program318 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program320 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program322 = new BitSet(new long[]{0x0000000000000008L});
}
