// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g 2021-05-26 16:08:03

package de.dhbw.compiler.antlrxcompiler;
   
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class XTypeCheck extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public XTypeCheck(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XTypeCheck(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XTypeCheck.tokenNames; }
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g"; }



	   private SymbolTable  symbols = SymbolTable.getInstance();  
	   


	public static class decl_return extends TreeRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:1: decl : ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? ) ;
	public final XTypeCheck.decl_return decl() throws RecognitionException {
		XTypeCheck.decl_return retval = new XTypeCheck.decl_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree r=null;
		XTree p=null;
		XTree DECL1=null;
		XTree ID2=null;
		XTree set3=null;

		XTree r_tree=null;
		XTree p_tree=null;
		XTree DECL1_tree=null;
		XTree ID2_tree=null;
		XTree set3_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:5: ( ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:12: ^( DECL ID ( 'int' | 'float' | 'string' ) (r= 'read' )? (p= 'print' )? )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECL1=(XTree)match(input,DECL,FOLLOW_DECL_in_decl83); 
			DECL1_tree = (XTree)adaptor.dupNode(DECL1);


			root_1 = (XTree)adaptor.becomeRoot(DECL1_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl85); 
			ID2_tree = (XTree)adaptor.dupNode(ID2);


			adaptor.addChild(root_1, ID2_tree);

			_last = (XTree)input.LT(1);
			set3=(XTree)input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43 ) {
				input.consume();
				set3_tree = (XTree)adaptor.dupNode(set3);


				adaptor.addChild(root_1, set3_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:48: (r= 'read' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==42) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:48: r= 'read'
					{
					_last = (XTree)input.LT(1);
					r=(XTree)match(input,42,FOLLOW_42_in_decl97); 
					r_tree = (XTree)adaptor.dupNode(r);


					adaptor.addChild(root_1, r_tree);

					}
					break;

			}

			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:58: (p= 'print' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==40) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:27:58: p= 'print'
					{
					_last = (XTree)input.LT(1);
					p=(XTree)match(input,40,FOLLOW_40_in_decl102); 
					p_tree = (XTree)adaptor.dupNode(p);


					adaptor.addChild(root_1, p_tree);

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 symbols.put((ID2!=null?ID2.getText():null), new Symbol((ID2!=null?ID2.getText():null), XType.IntType, r!=null, p!=null)); 
			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:29:1: decllist : ^( DECLLIST ( decl )* ) ;
	public final XTypeCheck.decllist_return decllist() throws RecognitionException {
		XTypeCheck.decllist_return retval = new XTypeCheck.decllist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree DECLLIST4=null;
		TreeRuleReturnScope decl5 =null;

		XTree DECLLIST4_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:29:9: ( ^( DECLLIST ( decl )* ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:29:12: ^( DECLLIST ( decl )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			DECLLIST4=(XTree)match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist126); 
			DECLLIST4_tree = (XTree)adaptor.dupNode(DECLLIST4);


			root_1 = (XTree)adaptor.becomeRoot(DECLLIST4_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:29:23: ( decl )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==DECL) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:29:23: decl
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_decl_in_decllist128);
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

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:30:1: expr : ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | STRINGCONST | ID );
	public final XTypeCheck.expr_return expr() throws RecognitionException {
		XTypeCheck.expr_return retval = new XTypeCheck.expr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set6=null;
		XTree UMINUS9=null;
		XTree INTCONST10=null;
		XTree FLOATCONST11=null;
		XTree INTCONST12=null;
		XTree FLOATCONST13=null;
		XTree STRINGCONST14=null;
		XTree ID15=null;
		TreeRuleReturnScope expr7 =null;
		TreeRuleReturnScope expr8 =null;

		XTree set6_tree=null;
		XTree UMINUS9_tree=null;
		XTree INTCONST10_tree=null;
		XTree FLOATCONST11_tree=null;
		XTree INTCONST12_tree=null;
		XTree FLOATCONST13_tree=null;
		XTree STRINGCONST14_tree=null;
		XTree ID15_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:30:5: ( ^( ( '+' | '-' | '*' | '/' ) expr expr ) | ^( UMINUS ( INTCONST | FLOATCONST ) ) | INTCONST | FLOATCONST | STRINGCONST | ID )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt5=1;
				}
				break;
			case UMINUS:
				{
				alt5=2;
				}
				break;
			case INTCONST:
				{
				alt5=3;
				}
				break;
			case FLOATCONST:
				{
				alt5=4;
				}
				break;
			case STRINGCONST:
				{
				alt5=5;
				}
				break;
			case ID:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:30:12: ^( ( '+' | '-' | '*' | '/' ) expr expr )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					set6=(XTree)input.LT(1);
					if ( (input.LA(1) >= 22 && input.LA(1) <= 24)||input.LA(1)==26 ) {
						input.consume();
						set6_tree = (XTree)adaptor.dupNode(set6);


						root_1 = (XTree)adaptor.becomeRoot(set6_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr158);
					expr7=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr7.getTree());

					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr160);
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
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:31:15: ^( UMINUS ( INTCONST | FLOATCONST ) )
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					{
					XTree _save_last_1 = _last;
					XTree _first_1 = null;
					XTree root_1 = (XTree)adaptor.nil();
					_last = (XTree)input.LT(1);
					UMINUS9=(XTree)match(input,UMINUS,FOLLOW_UMINUS_in_expr187); 
					UMINUS9_tree = (XTree)adaptor.dupNode(UMINUS9);


					root_1 = (XTree)adaptor.becomeRoot(UMINUS9_tree, root_1);

					match(input, Token.DOWN, null); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:31:24: ( INTCONST | FLOATCONST )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==INTCONST) ) {
						alt4=1;
					}
					else if ( (LA4_0==FLOATCONST) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:31:25: INTCONST
							{
							_last = (XTree)input.LT(1);
							INTCONST10=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr190); 
							INTCONST10_tree = (XTree)adaptor.dupNode(INTCONST10);


							adaptor.addChild(root_1, INTCONST10_tree);

							INTCONST10_tree.exprType = XType.IntType;
							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:31:79: FLOATCONST
							{
							_last = (XTree)input.LT(1);
							FLOATCONST11=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr196); 
							FLOATCONST11_tree = (XTree)adaptor.dupNode(FLOATCONST11);


							adaptor.addChild(root_1, FLOATCONST11_tree);

							FLOATCONST11_tree.exprType = XType.FloatType;
							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:32:15: INTCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					INTCONST12=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr225); 
					INTCONST12_tree = (XTree)adaptor.dupNode(INTCONST12);


					adaptor.addChild(root_0, INTCONST12_tree);

					INTCONST12_tree.exprType = XType.IntType;
					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:33:15: FLOATCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					FLOATCONST13=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr243); 
					FLOATCONST13_tree = (XTree)adaptor.dupNode(FLOATCONST13);


					adaptor.addChild(root_0, FLOATCONST13_tree);

					FLOATCONST13_tree.exprType = XType.FloatType;
					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:34:15: STRINGCONST
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					STRINGCONST14=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr261); 
					STRINGCONST14_tree = (XTree)adaptor.dupNode(STRINGCONST14);


					adaptor.addChild(root_0, STRINGCONST14_tree);

					STRINGCONST14_tree.exprType = XType.StringType;
					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:35:15: ID
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					ID15=(XTree)match(input,ID,FOLLOW_ID_in_expr279); 
					ID15_tree = (XTree)adaptor.dupNode(ID15);


					adaptor.addChild(root_0, ID15_tree);

					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:37:1: cond : ^( ( '<' | '>' | '=' ) expr expr ) ;
	public final XTypeCheck.cond_return cond() throws RecognitionException {
		XTypeCheck.cond_return retval = new XTypeCheck.cond_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree set16=null;
		TreeRuleReturnScope expr17 =null;
		TreeRuleReturnScope expr18 =null;

		XTree set16_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:37:5: ( ^( ( '<' | '>' | '=' ) expr expr ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:37:7: ^( ( '<' | '>' | '=' ) expr expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			set16=(XTree)input.LT(1);
			if ( (input.LA(1) >= 30 && input.LA(1) <= 32) ) {
				input.consume();
				set16_tree = (XTree)adaptor.dupNode(set16);


				root_1 = (XTree)adaptor.becomeRoot(set16_tree, root_1);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond302);
			expr17=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr17.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_cond304);
			expr18=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr18.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:38:1: whilestat : ^( 'while' cond stat ) ;
	public final XTypeCheck.whilestat_return whilestat() throws RecognitionException {
		XTypeCheck.whilestat_return retval = new XTypeCheck.whilestat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal19=null;
		TreeRuleReturnScope cond20 =null;
		TreeRuleReturnScope stat21 =null;

		XTree string_literal19_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:38:10: ( ^( 'while' cond stat ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:38:12: ^( 'while' cond stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal19=(XTree)match(input,45,FOLLOW_45_in_whilestat312); 
			string_literal19_tree = (XTree)adaptor.dupNode(string_literal19);


			root_1 = (XTree)adaptor.becomeRoot(string_literal19_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_whilestat314);
			cond20=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond20.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_whilestat316);
			stat21=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat21.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:39:1: assignstat : ^( ':=' ID expr ) ;
	public final XTypeCheck.assignstat_return assignstat() throws RecognitionException {
		XTypeCheck.assignstat_return retval = new XTypeCheck.assignstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal22=null;
		XTree ID23=null;
		TreeRuleReturnScope expr24 =null;

		XTree string_literal22_tree=null;
		XTree ID23_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:39:11: ( ^( ':=' ID expr ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:39:14: ^( ':=' ID expr )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal22=(XTree)match(input,28,FOLLOW_28_in_assignstat325); 
			string_literal22_tree = (XTree)adaptor.dupNode(string_literal22);


			root_1 = (XTree)adaptor.becomeRoot(string_literal22_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID23=(XTree)match(input,ID,FOLLOW_ID_in_assignstat327); 
			ID23_tree = (XTree)adaptor.dupNode(ID23);


			adaptor.addChild(root_1, ID23_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_expr_in_assignstat329);
			expr24=expr();
			state._fsp--;

			adaptor.addChild(root_1, expr24.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:40:1: condstat : ^( 'if' cond stat ( stat )? ) ;
	public final XTypeCheck.condstat_return condstat() throws RecognitionException {
		XTypeCheck.condstat_return retval = new XTypeCheck.condstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal25=null;
		TreeRuleReturnScope cond26 =null;
		TreeRuleReturnScope stat27 =null;
		TreeRuleReturnScope stat28 =null;

		XTree string_literal25_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:40:9: ( ^( 'if' cond stat ( stat )? ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:40:12: ^( 'if' cond stat ( stat )? )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal25=(XTree)match(input,38,FOLLOW_38_in_condstat338); 
			string_literal25_tree = (XTree)adaptor.dupNode(string_literal25);


			root_1 = (XTree)adaptor.becomeRoot(string_literal25_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_condstat340);
			cond26=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond26.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_condstat342);
			stat27=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat27.getTree());

			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:40:29: ( stat )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==STATLIST||LA6_0==28||(LA6_0 >= 37 && LA6_0 <= 38)||LA6_0==45) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:40:29: stat
					{
					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_stat_in_condstat344);
					stat28=stat();
					state._fsp--;

					adaptor.addChild(root_1, stat28.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:41:1: forstat : ^( 'for' assignstat cond assignstat stat ) ;
	public final XTypeCheck.forstat_return forstat() throws RecognitionException {
		XTypeCheck.forstat_return retval = new XTypeCheck.forstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal29=null;
		TreeRuleReturnScope assignstat30 =null;
		TreeRuleReturnScope cond31 =null;
		TreeRuleReturnScope assignstat32 =null;
		TreeRuleReturnScope stat33 =null;

		XTree string_literal29_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:41:8: ( ^( 'for' assignstat cond assignstat stat ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:41:12: ^( 'for' assignstat cond assignstat stat )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal29=(XTree)match(input,37,FOLLOW_37_in_forstat355); 
			string_literal29_tree = (XTree)adaptor.dupNode(string_literal29);


			root_1 = (XTree)adaptor.becomeRoot(string_literal29_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat357);
			assignstat30=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat30.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_cond_in_forstat359);
			cond31=cond();
			state._fsp--;

			adaptor.addChild(root_1, cond31.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_assignstat_in_forstat361);
			assignstat32=assignstat();
			state._fsp--;

			adaptor.addChild(root_1, assignstat32.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_stat_in_forstat363);
			stat33=stat();
			state._fsp--;

			adaptor.addChild(root_1, stat33.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XTypeCheck.stat_return stat() throws RecognitionException {
		XTypeCheck.stat_return retval = new XTypeCheck.stat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		TreeRuleReturnScope assignstat34 =null;
		TreeRuleReturnScope condstat35 =null;
		TreeRuleReturnScope whilestat36 =null;
		TreeRuleReturnScope forstat37 =null;
		TreeRuleReturnScope statlist38 =null;


		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt7=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt7=1;
				}
				break;
			case 38:
				{
				alt7=2;
				}
				break;
			case 45:
				{
				alt7=3;
				}
				break;
			case 37:
				{
				alt7=4;
				}
				break;
			case STATLIST:
				{
				alt7=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:12: assignstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_assignstat_in_stat375);
					assignstat34=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat34.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:25: condstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_condstat_in_stat379);
					condstat35=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat35.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:36: whilestat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_whilestat_in_stat383);
					whilestat36=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat36.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:48: forstat
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_forstat_in_stat387);
					forstat37=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat37.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:42:58: statlist
					{
					root_0 = (XTree)adaptor.nil();


					_last = (XTree)input.LT(1);
					pushFollow(FOLLOW_statlist_in_stat391);
					statlist38=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist38.getTree());

					}
					break;

			}
			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:43:1: statlist : ^( STATLIST ( stat )* ) ;
	public final XTypeCheck.statlist_return statlist() throws RecognitionException {
		XTypeCheck.statlist_return retval = new XTypeCheck.statlist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree STATLIST39=null;
		TreeRuleReturnScope stat40 =null;

		XTree STATLIST39_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:43:9: ( ^( STATLIST ( stat )* ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:43:12: ^( STATLIST ( stat )* )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			STATLIST39=(XTree)match(input,STATLIST,FOLLOW_STATLIST_in_statlist399); 
			STATLIST39_tree = (XTree)adaptor.dupNode(STATLIST39);


			root_1 = (XTree)adaptor.becomeRoot(STATLIST39_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:43:23: ( stat )*
				loop8:
				while (true) {
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==STATLIST||LA8_0==28||(LA8_0 >= 37 && LA8_0 <= 38)||LA8_0==45) ) {
						alt8=1;
					}

					switch (alt8) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:43:23: stat
						{
						_last = (XTree)input.LT(1);
						pushFollow(FOLLOW_stat_in_statlist401);
						stat40=stat();
						state._fsp--;

						adaptor.addChild(root_1, stat40.getTree());

						}
						break;

					default :
						break loop8;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:45:1: program : ^( 'program' ID decllist statlist ) ;
	public final XTypeCheck.program_return program() throws RecognitionException {
		XTypeCheck.program_return retval = new XTypeCheck.program_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		XTree _first_0 = null;
		XTree _last = null;


		XTree string_literal41=null;
		XTree ID42=null;
		TreeRuleReturnScope decllist43 =null;
		TreeRuleReturnScope statlist44 =null;

		XTree string_literal41_tree=null;
		XTree ID42_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:45:8: ( ^( 'program' ID decllist statlist ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\XTypeCheck.g:45:12: ^( 'program' ID decllist statlist )
			{
			root_0 = (XTree)adaptor.nil();


			_last = (XTree)input.LT(1);
			{
			XTree _save_last_1 = _last;
			XTree _first_1 = null;
			XTree root_1 = (XTree)adaptor.nil();
			_last = (XTree)input.LT(1);
			string_literal41=(XTree)match(input,41,FOLLOW_41_in_program413); 
			string_literal41_tree = (XTree)adaptor.dupNode(string_literal41);


			root_1 = (XTree)adaptor.becomeRoot(string_literal41_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (XTree)input.LT(1);
			ID42=(XTree)match(input,ID,FOLLOW_ID_in_program415); 
			ID42_tree = (XTree)adaptor.dupNode(ID42);


			adaptor.addChild(root_1, ID42_tree);

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_decllist_in_program417);
			decllist43=decllist();
			state._fsp--;

			adaptor.addChild(root_1, decllist43.getTree());

			_last = (XTree)input.LT(1);
			pushFollow(FOLLOW_statlist_in_program419);
			statlist44=statlist();
			state._fsp--;

			adaptor.addChild(root_1, statlist44.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);

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



	public static final BitSet FOLLOW_DECL_in_decl83 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl85 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_set_in_decl87 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl97 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist128 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_set_in_expr142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr158 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr160 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UMINUS_in_expr187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTCONST_in_expr190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_cond290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond302 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_45_in_whilestat312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat314 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat316 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_assignstat325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat327 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat340 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat342 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_stat_in_condstat344 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat357 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat359 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat361 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignstat_in_stat375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist401 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_41_in_program413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program415 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program417 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program419 = new BitSet(new long[]{0x0000000000000008L});
}
