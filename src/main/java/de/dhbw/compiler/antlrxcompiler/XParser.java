// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\X.g 2021-06-07 15:31:50
package de.dhbw.compiler.antlrxcompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XParser.tokenNames; }
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxcompiler\\X.g"; }


	public static class decl_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:1: decl : ( ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type) | 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' ) | 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'print' ) | 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' 'print' ) );
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token type=null;
		Token ID1=null;
		Token char_literal2=null;
		Token char_literal3=null;
		Token string_literal4=null;
		Token ID5=null;
		Token char_literal6=null;
		Token char_literal7=null;
		Token string_literal8=null;
		Token ID9=null;
		Token char_literal10=null;
		Token char_literal11=null;
		Token string_literal12=null;
		Token string_literal13=null;
		Token ID14=null;
		Token char_literal15=null;
		Token char_literal16=null;

		XTree type_tree=null;
		XTree ID1_tree=null;
		XTree char_literal2_tree=null;
		XTree char_literal3_tree=null;
		XTree string_literal4_tree=null;
		XTree ID5_tree=null;
		XTree char_literal6_tree=null;
		XTree char_literal7_tree=null;
		XTree string_literal8_tree=null;
		XTree ID9_tree=null;
		XTree char_literal10_tree=null;
		XTree char_literal11_tree=null;
		XTree string_literal12_tree=null;
		XTree string_literal13_tree=null;
		XTree ID14_tree=null;
		XTree char_literal15_tree=null;
		XTree char_literal16_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:5: ( ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type) | 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' ) | 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'print' ) | 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' 'print' ) )
			int alt5=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt5=1;
				}
				break;
			case 42:
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2==ID) ) {
					alt5=2;
				}
				else if ( (LA5_2==40) ) {
					alt5=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 40:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:14: ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_decl396);  
					stream_ID.add(ID1);

					char_literal2=(Token)match(input,27,FOLLOW_27_in_decl398);  
					stream_27.add(char_literal2);

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:21: (type= 'int' |type= 'float' |type= 'string' )
					int alt1=3;
					switch ( input.LA(1) ) {
					case 39:
						{
						alt1=1;
						}
						break;
					case 36:
						{
						alt1=2;
						}
						break;
					case 43:
						{
						alt1=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}
					switch (alt1) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:22: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl403);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:35: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl409);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:50: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl415);  
							stream_43.add(type);

							}
							break;

					}

					char_literal3=(Token)match(input,29,FOLLOW_29_in_decl418);  
					stream_29.add(char_literal3);

					// AST REWRITE
					// elements: ID, type
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 55:69: -> ^( DECL ID $type)
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:55:72: ^( DECL ID $type)
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:14: 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal4=(Token)match(input,42,FOLLOW_42_in_decl444);  
					stream_42.add(string_literal4);

					ID5=(Token)match(input,ID,FOLLOW_ID_in_decl446);  
					stream_ID.add(ID5);

					char_literal6=(Token)match(input,27,FOLLOW_27_in_decl448);  
					stream_27.add(char_literal6);

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:28: (type= 'int' |type= 'float' |type= 'string' )
					int alt2=3;
					switch ( input.LA(1) ) {
					case 39:
						{
						alt2=1;
						}
						break;
					case 36:
						{
						alt2=2;
						}
						break;
					case 43:
						{
						alt2=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:29: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl453);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:42: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl459);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:57: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl465);  
							stream_43.add(type);

							}
							break;

					}

					char_literal7=(Token)match(input,29,FOLLOW_29_in_decl468);  
					stream_29.add(char_literal7);

					// AST REWRITE
					// elements: ID, 42, type
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 56:76: -> ^( DECL ID $type 'read' )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:56:79: ^( DECL ID $type 'read' )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextNode());
						adaptor.addChild(root_1, stream_42.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:14: 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal8=(Token)match(input,40,FOLLOW_40_in_decl496);  
					stream_40.add(string_literal8);

					ID9=(Token)match(input,ID,FOLLOW_ID_in_decl498);  
					stream_ID.add(ID9);

					char_literal10=(Token)match(input,27,FOLLOW_27_in_decl500);  
					stream_27.add(char_literal10);

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:29: (type= 'int' |type= 'float' |type= 'string' )
					int alt3=3;
					switch ( input.LA(1) ) {
					case 39:
						{
						alt3=1;
						}
						break;
					case 36:
						{
						alt3=2;
						}
						break;
					case 43:
						{
						alt3=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:30: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl505);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:43: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl511);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:58: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl517);  
							stream_43.add(type);

							}
							break;

					}

					char_literal11=(Token)match(input,29,FOLLOW_29_in_decl520);  
					stream_29.add(char_literal11);

					// AST REWRITE
					// elements: ID, 40, type
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 57:77: -> ^( DECL ID $type 'print' )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:57:80: ^( DECL ID $type 'print' )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextNode());
						adaptor.addChild(root_1, stream_40.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:14: 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal12=(Token)match(input,42,FOLLOW_42_in_decl548);  
					stream_42.add(string_literal12);

					string_literal13=(Token)match(input,40,FOLLOW_40_in_decl550);  
					stream_40.add(string_literal13);

					ID14=(Token)match(input,ID,FOLLOW_ID_in_decl552);  
					stream_ID.add(ID14);

					char_literal15=(Token)match(input,27,FOLLOW_27_in_decl554);  
					stream_27.add(char_literal15);

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:36: (type= 'int' |type= 'float' |type= 'string' )
					int alt4=3;
					switch ( input.LA(1) ) {
					case 39:
						{
						alt4=1;
						}
						break;
					case 36:
						{
						alt4=2;
						}
						break;
					case 43:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:37: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl559);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:50: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl565);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:65: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl571);  
							stream_43.add(type);

							}
							break;

					}

					char_literal16=(Token)match(input,29,FOLLOW_29_in_decl574);  
					stream_29.add(char_literal16);

					// AST REWRITE
					// elements: type, 42, 40, ID
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 58:84: -> ^( DECL ID $type 'read' 'print' )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:58:87: ^( DECL ID $type 'read' 'print' )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextNode());
						adaptor.addChild(root_1, stream_42.nextNode());
						adaptor.addChild(root_1, stream_40.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class decllist_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:1: decllist : ( decl )* -> ^( DECLLIST ( decl )* ) ;
	public final XParser.decllist_return decllist() throws RecognitionException {
		XParser.decllist_return retval = new XParser.decllist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		ParserRuleReturnScope decl17 =null;

		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:9: ( ( decl )* -> ^( DECLLIST ( decl )* ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:15: ( decl )*
			{
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:15: ( decl )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID||LA6_0==40||LA6_0==42) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:15: decl
					{
					pushFollow(FOLLOW_decl_in_decllist600);
					decl17=decl();
					state._fsp--;

					stream_decl.add(decl17.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 60:22: -> ^( DECLLIST ( decl )* )
			{
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:25: ^( DECLLIST ( decl )* )
				{
				XTree root_1 = (XTree)adaptor.nil();
				root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(DECLLIST, "DECLLIST"), root_1);
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:60:36: ( decl )*
				while ( stream_decl.hasNext() ) {
					adaptor.addChild(root_1, stream_decl.nextTree());
				}
				stream_decl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class expr_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:1: expr : multexpr ( ( '+' ^| '-' ^) multexpr )* ;
	public final XParser.expr_return expr() throws RecognitionException {
		XParser.expr_return retval = new XParser.expr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token char_literal19=null;
		Token char_literal20=null;
		ParserRuleReturnScope multexpr18 =null;
		ParserRuleReturnScope multexpr21 =null;

		XTree char_literal19_tree=null;
		XTree char_literal20_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:5: ( multexpr ( ( '+' ^| '-' ^) multexpr )* )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:15: multexpr ( ( '+' ^| '-' ^) multexpr )*
			{
			root_0 = (XTree)adaptor.nil();


			pushFollow(FOLLOW_multexpr_in_expr627);
			multexpr18=multexpr();
			state._fsp--;

			adaptor.addChild(root_0, multexpr18.getTree());

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:24: ( ( '+' ^| '-' ^) multexpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 23 && LA8_0 <= 24)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:25: ( '+' ^| '-' ^) multexpr
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:25: ( '+' ^| '-' ^)
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==23) ) {
						alt7=1;
					}
					else if ( (LA7_0==24) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:26: '+' ^
							{
							char_literal19=(Token)match(input,23,FOLLOW_23_in_expr631); 
							char_literal19_tree = (XTree)adaptor.create(char_literal19);
							root_0 = (XTree)adaptor.becomeRoot(char_literal19_tree, root_0);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:63:33: '-' ^
							{
							char_literal20=(Token)match(input,24,FOLLOW_24_in_expr636); 
							char_literal20_tree = (XTree)adaptor.create(char_literal20);
							root_0 = (XTree)adaptor.becomeRoot(char_literal20_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multexpr_in_expr640);
					multexpr21=multexpr();
					state._fsp--;

					adaptor.addChild(root_0, multexpr21.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multexpr_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "multexpr"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:1: multexpr : simpleexpr ( ( '*' ^| '/' ^) simpleexpr )* ;
	public final XParser.multexpr_return multexpr() throws RecognitionException {
		XParser.multexpr_return retval = new XParser.multexpr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token char_literal23=null;
		Token char_literal24=null;
		ParserRuleReturnScope simpleexpr22 =null;
		ParserRuleReturnScope simpleexpr25 =null;

		XTree char_literal23_tree=null;
		XTree char_literal24_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:9: ( simpleexpr ( ( '*' ^| '/' ^) simpleexpr )* )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:14: simpleexpr ( ( '*' ^| '/' ^) simpleexpr )*
			{
			root_0 = (XTree)adaptor.nil();


			pushFollow(FOLLOW_simpleexpr_in_multexpr651);
			simpleexpr22=simpleexpr();
			state._fsp--;

			adaptor.addChild(root_0, simpleexpr22.getTree());

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:25: ( ( '*' ^| '/' ^) simpleexpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==22||LA10_0==26) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:26: ( '*' ^| '/' ^) simpleexpr
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:26: ( '*' ^| '/' ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==22) ) {
						alt9=1;
					}
					else if ( (LA9_0==26) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:27: '*' ^
							{
							char_literal23=(Token)match(input,22,FOLLOW_22_in_multexpr655); 
							char_literal23_tree = (XTree)adaptor.create(char_literal23);
							root_0 = (XTree)adaptor.becomeRoot(char_literal23_tree, root_0);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:64:34: '/' ^
							{
							char_literal24=(Token)match(input,26,FOLLOW_26_in_multexpr660); 
							char_literal24_tree = (XTree)adaptor.create(char_literal24);
							root_0 = (XTree)adaptor.becomeRoot(char_literal24_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_simpleexpr_in_multexpr664);
					simpleexpr25=simpleexpr();
					state._fsp--;

					adaptor.addChild(root_0, simpleexpr25.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multexpr"


	public static class simpleexpr_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "simpleexpr"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:65:1: simpleexpr : ( '(' ! expr ')' !| INTCONST | '-' INTCONST -> ^( UMINUS INTCONST ) | FLOATCONST | '-' FLOATCONST -> ^( UMINUS FLOATCONST ) | ID | STRINGCONST );
	public final XParser.simpleexpr_return simpleexpr() throws RecognitionException {
		XParser.simpleexpr_return retval = new XParser.simpleexpr_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token char_literal26=null;
		Token char_literal28=null;
		Token INTCONST29=null;
		Token char_literal30=null;
		Token INTCONST31=null;
		Token FLOATCONST32=null;
		Token char_literal33=null;
		Token FLOATCONST34=null;
		Token ID35=null;
		Token STRINGCONST36=null;
		ParserRuleReturnScope expr27 =null;

		XTree char_literal26_tree=null;
		XTree char_literal28_tree=null;
		XTree INTCONST29_tree=null;
		XTree char_literal30_tree=null;
		XTree INTCONST31_tree=null;
		XTree FLOATCONST32_tree=null;
		XTree char_literal33_tree=null;
		XTree FLOATCONST34_tree=null;
		XTree ID35_tree=null;
		XTree STRINGCONST36_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_FLOATCONST=new RewriteRuleTokenStream(adaptor,"token FLOATCONST");
		RewriteRuleTokenStream stream_INTCONST=new RewriteRuleTokenStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:65:11: ( '(' ! expr ')' !| INTCONST | '-' INTCONST -> ^( UMINUS INTCONST ) | FLOATCONST | '-' FLOATCONST -> ^( UMINUS FLOATCONST ) | ID | STRINGCONST )
			int alt11=7;
			switch ( input.LA(1) ) {
			case 20:
				{
				alt11=1;
				}
				break;
			case INTCONST:
				{
				alt11=2;
				}
				break;
			case 24:
				{
				int LA11_3 = input.LA(2);
				if ( (LA11_3==INTCONST) ) {
					alt11=3;
				}
				else if ( (LA11_3==FLOATCONST) ) {
					alt11=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOATCONST:
				{
				alt11=4;
				}
				break;
			case ID:
				{
				alt11=6;
				}
				break;
			case STRINGCONST:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:65:15: '(' ! expr ')' !
					{
					root_0 = (XTree)adaptor.nil();


					char_literal26=(Token)match(input,20,FOLLOW_20_in_simpleexpr674); 
					pushFollow(FOLLOW_expr_in_simpleexpr677);
					expr27=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr27.getTree());

					char_literal28=(Token)match(input,21,FOLLOW_21_in_simpleexpr679); 
					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:66:15: INTCONST
					{
					root_0 = (XTree)adaptor.nil();


					INTCONST29=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr697); 
					INTCONST29_tree = (XTree)adaptor.create(INTCONST29);
					adaptor.addChild(root_0, INTCONST29_tree);

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:66:26: '-' INTCONST
					{
					char_literal30=(Token)match(input,24,FOLLOW_24_in_simpleexpr701);  
					stream_24.add(char_literal30);

					INTCONST31=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr703);  
					stream_INTCONST.add(INTCONST31);

					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 66:39: -> ^( UMINUS INTCONST )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:66:42: ^( UMINUS INTCONST )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(UMINUS, "UMINUS"), root_1);
						adaptor.addChild(root_1, stream_INTCONST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:67:15: FLOATCONST
					{
					root_0 = (XTree)adaptor.nil();


					FLOATCONST32=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr727); 
					FLOATCONST32_tree = (XTree)adaptor.create(FLOATCONST32);
					adaptor.addChild(root_0, FLOATCONST32_tree);

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:67:28: '-' FLOATCONST
					{
					char_literal33=(Token)match(input,24,FOLLOW_24_in_simpleexpr731);  
					stream_24.add(char_literal33);

					FLOATCONST34=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr733);  
					stream_FLOATCONST.add(FLOATCONST34);

					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (XTree)adaptor.nil();
					// 67:43: -> ^( UMINUS FLOATCONST )
					{
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:67:46: ^( UMINUS FLOATCONST )
						{
						XTree root_1 = (XTree)adaptor.nil();
						root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(UMINUS, "UMINUS"), root_1);
						adaptor.addChild(root_1, stream_FLOATCONST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:68:15: ID
					{
					root_0 = (XTree)adaptor.nil();


					ID35=(Token)match(input,ID,FOLLOW_ID_in_simpleexpr757); 
					ID35_tree = (XTree)adaptor.create(ID35);
					adaptor.addChild(root_0, ID35_tree);

					}
					break;
				case 7 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:68:20: STRINGCONST
					{
					root_0 = (XTree)adaptor.nil();


					STRINGCONST36=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_simpleexpr761); 
					STRINGCONST36_tree = (XTree)adaptor.create(STRINGCONST36);
					adaptor.addChild(root_0, STRINGCONST36_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleexpr"


	public static class assignstat_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:71:1: assignstat : ID ':=' ^ expr ;
	public final XParser.assignstat_return assignstat() throws RecognitionException {
		XParser.assignstat_return retval = new XParser.assignstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token ID37=null;
		Token string_literal38=null;
		ParserRuleReturnScope expr39 =null;

		XTree ID37_tree=null;
		XTree string_literal38_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:71:11: ( ID ':=' ^ expr )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:71:15: ID ':=' ^ expr
			{
			root_0 = (XTree)adaptor.nil();


			ID37=(Token)match(input,ID,FOLLOW_ID_in_assignstat771); 
			ID37_tree = (XTree)adaptor.create(ID37);
			adaptor.addChild(root_0, ID37_tree);

			string_literal38=(Token)match(input,28,FOLLOW_28_in_assignstat773); 
			string_literal38_tree = (XTree)adaptor.create(string_literal38);
			root_0 = (XTree)adaptor.becomeRoot(string_literal38_tree, root_0);

			pushFollow(FOLLOW_expr_in_assignstat776);
			expr39=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr39.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class cond_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:1: cond : expr ( '<' ^| '>' ^| '=' ^) expr ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token char_literal41=null;
		Token char_literal42=null;
		Token char_literal43=null;
		ParserRuleReturnScope expr40 =null;
		ParserRuleReturnScope expr44 =null;

		XTree char_literal41_tree=null;
		XTree char_literal42_tree=null;
		XTree char_literal43_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:5: ( expr ( '<' ^| '>' ^| '=' ^) expr )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:15: expr ( '<' ^| '>' ^| '=' ^) expr
			{
			root_0 = (XTree)adaptor.nil();


			pushFollow(FOLLOW_expr_in_cond792);
			expr40=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr40.getTree());

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:20: ( '<' ^| '>' ^| '=' ^)
			int alt12=3;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt12=1;
				}
				break;
			case 32:
				{
				alt12=2;
				}
				break;
			case 31:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:21: '<' ^
					{
					char_literal41=(Token)match(input,30,FOLLOW_30_in_cond795); 
					char_literal41_tree = (XTree)adaptor.create(char_literal41);
					root_0 = (XTree)adaptor.becomeRoot(char_literal41_tree, root_0);

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:27: '>' ^
					{
					char_literal42=(Token)match(input,32,FOLLOW_32_in_cond799); 
					char_literal42_tree = (XTree)adaptor.create(char_literal42);
					root_0 = (XTree)adaptor.becomeRoot(char_literal42_tree, root_0);

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:74:33: '=' ^
					{
					char_literal43=(Token)match(input,31,FOLLOW_31_in_cond803); 
					char_literal43_tree = (XTree)adaptor.create(char_literal43);
					root_0 = (XTree)adaptor.becomeRoot(char_literal43_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_expr_in_cond808);
			expr44=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr44.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class condstat_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:77:1: condstat : 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? ;
	public final XParser.condstat_return condstat() throws RecognitionException {
		XParser.condstat_return retval = new XParser.condstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		ParserRuleReturnScope cond46 =null;
		ParserRuleReturnScope stat48 =null;
		ParserRuleReturnScope stat50 =null;

		XTree string_literal45_tree=null;
		XTree string_literal47_tree=null;
		XTree string_literal49_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:77:9: ( 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:77:15: 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )?
			{
			root_0 = (XTree)adaptor.nil();


			string_literal45=(Token)match(input,38,FOLLOW_38_in_condstat820); 
			string_literal45_tree = (XTree)adaptor.create(string_literal45);
			root_0 = (XTree)adaptor.becomeRoot(string_literal45_tree, root_0);

			pushFollow(FOLLOW_cond_in_condstat823);
			cond46=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond46.getTree());

			string_literal47=(Token)match(input,44,FOLLOW_44_in_condstat825); 
			pushFollow(FOLLOW_stat_in_condstat828);
			stat48=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat48.getTree());

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:77:40: ( options {greedy=true; } : 'else' ! stat )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==34) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:77:65: 'else' ! stat
					{
					string_literal49=(Token)match(input,34,FOLLOW_34_in_condstat840); 
					pushFollow(FOLLOW_stat_in_condstat843);
					stat50=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat50.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class whilestat_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:80:1: whilestat : 'while' '(' cond ')' stat -> ^( 'while' cond stat ) ;
	public final XParser.whilestat_return whilestat() throws RecognitionException {
		XParser.whilestat_return retval = new XParser.whilestat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token string_literal51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope cond53 =null;
		ParserRuleReturnScope stat55 =null;

		XTree string_literal51_tree=null;
		XTree char_literal52_tree=null;
		XTree char_literal54_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:80:10: ( 'while' '(' cond ')' stat -> ^( 'while' cond stat ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:80:15: 'while' '(' cond ')' stat
			{
			string_literal51=(Token)match(input,45,FOLLOW_45_in_whilestat856);  
			stream_45.add(string_literal51);

			char_literal52=(Token)match(input,20,FOLLOW_20_in_whilestat858);  
			stream_20.add(char_literal52);

			pushFollow(FOLLOW_cond_in_whilestat860);
			cond53=cond();
			state._fsp--;

			stream_cond.add(cond53.getTree());
			char_literal54=(Token)match(input,21,FOLLOW_21_in_whilestat862);  
			stream_21.add(char_literal54);

			pushFollow(FOLLOW_stat_in_whilestat864);
			stat55=stat();
			state._fsp--;

			stream_stat.add(stat55.getTree());
			// AST REWRITE
			// elements: cond, 45, stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 80:41: -> ^( 'while' cond stat )
			{
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:80:44: ^( 'while' cond stat )
				{
				XTree root_1 = (XTree)adaptor.nil();
				root_1 = (XTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:81:1: forstat : 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat ;
	public final XParser.forstat_return forstat() throws RecognitionException {
		XParser.forstat_return retval = new XParser.forstat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token string_literal56=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal61=null;
		Token char_literal63=null;
		ParserRuleReturnScope assignstat58 =null;
		ParserRuleReturnScope cond60 =null;
		ParserRuleReturnScope assignstat62 =null;
		ParserRuleReturnScope stat64 =null;

		XTree string_literal56_tree=null;
		XTree char_literal57_tree=null;
		XTree char_literal59_tree=null;
		XTree char_literal61_tree=null;
		XTree char_literal63_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:81:8: ( 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:81:15: 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat
			{
			root_0 = (XTree)adaptor.nil();


			string_literal56=(Token)match(input,37,FOLLOW_37_in_forstat885); 
			string_literal56_tree = (XTree)adaptor.create(string_literal56);
			root_0 = (XTree)adaptor.becomeRoot(string_literal56_tree, root_0);

			char_literal57=(Token)match(input,20,FOLLOW_20_in_forstat888); 
			pushFollow(FOLLOW_assignstat_in_forstat891);
			assignstat58=assignstat();
			state._fsp--;

			adaptor.addChild(root_0, assignstat58.getTree());

			char_literal59=(Token)match(input,29,FOLLOW_29_in_forstat893); 
			pushFollow(FOLLOW_cond_in_forstat896);
			cond60=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond60.getTree());

			char_literal61=(Token)match(input,29,FOLLOW_29_in_forstat898); 
			pushFollow(FOLLOW_assignstat_in_forstat901);
			assignstat62=assignstat();
			state._fsp--;

			adaptor.addChild(root_0, assignstat62.getTree());

			char_literal63=(Token)match(input,21,FOLLOW_21_in_forstat903); 
			pushFollow(FOLLOW_stat_in_forstat906);
			stat64=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat64.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class stat_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XParser.stat_return stat() throws RecognitionException {
		XParser.stat_return retval = new XParser.stat_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		ParserRuleReturnScope assignstat65 =null;
		ParserRuleReturnScope condstat66 =null;
		ParserRuleReturnScope whilestat67 =null;
		ParserRuleReturnScope forstat68 =null;
		ParserRuleReturnScope statlist69 =null;


		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:5: ( assignstat | condstat | whilestat | forstat | statlist )
			int alt14=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt14=1;
				}
				break;
			case 38:
				{
				alt14=2;
				}
				break;
			case 45:
				{
				alt14=3;
				}
				break;
			case 37:
				{
				alt14=4;
				}
				break;
			case 33:
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:15: assignstat
					{
					root_0 = (XTree)adaptor.nil();


					pushFollow(FOLLOW_assignstat_in_stat922);
					assignstat65=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat65.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:28: condstat
					{
					root_0 = (XTree)adaptor.nil();


					pushFollow(FOLLOW_condstat_in_stat926);
					condstat66=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat66.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:39: whilestat
					{
					root_0 = (XTree)adaptor.nil();


					pushFollow(FOLLOW_whilestat_in_stat930);
					whilestat67=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat67.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:51: forstat
					{
					root_0 = (XTree)adaptor.nil();


					pushFollow(FOLLOW_forstat_in_stat934);
					forstat68=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat68.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:84:61: statlist
					{
					root_0 = (XTree)adaptor.nil();


					pushFollow(FOLLOW_statlist_in_stat938);
					statlist69=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist69.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class statlist_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:1: statlist : 'begin' ( stat ';' )* 'end' -> ^( STATLIST ( stat )* ) ;
	public final XParser.statlist_return statlist() throws RecognitionException {
		XParser.statlist_return retval = new XParser.statlist_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token string_literal70=null;
		Token char_literal72=null;
		Token string_literal73=null;
		ParserRuleReturnScope stat71 =null;

		XTree string_literal70_tree=null;
		XTree char_literal72_tree=null;
		XTree string_literal73_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:9: ( 'begin' ( stat ';' )* 'end' -> ^( STATLIST ( stat )* ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:18: 'begin' ( stat ';' )* 'end'
			{
			string_literal70=(Token)match(input,33,FOLLOW_33_in_statlist952);  
			stream_33.add(string_literal70);

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:26: ( stat ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==ID||LA15_0==33||(LA15_0 >= 37 && LA15_0 <= 38)||LA15_0==45) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:27: stat ';'
					{
					pushFollow(FOLLOW_stat_in_statlist955);
					stat71=stat();
					state._fsp--;

					stream_stat.add(stat71.getTree());
					char_literal72=(Token)match(input,29,FOLLOW_29_in_statlist957);  
					stream_29.add(char_literal72);

					}
					break;

				default :
					break loop15;
				}
			}

			string_literal73=(Token)match(input,35,FOLLOW_35_in_statlist961);  
			stream_35.add(string_literal73);

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 86:45: -> ^( STATLIST ( stat )* )
			{
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:48: ^( STATLIST ( stat )* )
				{
				XTree root_1 = (XTree)adaptor.nil();
				root_1 = (XTree)adaptor.becomeRoot((XTree)adaptor.create(STATLIST, "STATLIST"), root_1);
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:86:59: ( stat )*
				while ( stream_stat.hasNext() ) {
					adaptor.addChild(root_1, stream_stat.nextTree());
				}
				stream_stat.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class program_return extends ParserRuleReturnScope {
		XTree tree;
		@Override
		public XTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxcompiler\\X.g:89:1: program : 'program' ID ';' decllist statlist '.' EOF -> ^( 'program' ID decllist statlist ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		XTree root_0 = null;

		Token string_literal74=null;
		Token ID75=null;
		Token char_literal76=null;
		Token char_literal79=null;
		Token EOF80=null;
		ParserRuleReturnScope decllist77 =null;
		ParserRuleReturnScope statlist78 =null;

		XTree string_literal74_tree=null;
		XTree ID75_tree=null;
		XTree char_literal76_tree=null;
		XTree char_literal79_tree=null;
		XTree EOF80_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_decllist=new RewriteRuleSubtreeStream(adaptor,"rule decllist");
		RewriteRuleSubtreeStream stream_statlist=new RewriteRuleSubtreeStream(adaptor,"rule statlist");

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:89:8: ( 'program' ID ';' decllist statlist '.' EOF -> ^( 'program' ID decllist statlist ) )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:89:15: 'program' ID ';' decllist statlist '.' EOF
			{
			string_literal74=(Token)match(input,41,FOLLOW_41_in_program984);  
			stream_41.add(string_literal74);

			ID75=(Token)match(input,ID,FOLLOW_ID_in_program986);  
			stream_ID.add(ID75);

			char_literal76=(Token)match(input,29,FOLLOW_29_in_program988);  
			stream_29.add(char_literal76);

			pushFollow(FOLLOW_decllist_in_program990);
			decllist77=decllist();
			state._fsp--;

			stream_decllist.add(decllist77.getTree());
			pushFollow(FOLLOW_statlist_in_program992);
			statlist78=statlist();
			state._fsp--;

			stream_statlist.add(statlist78.getTree());
			char_literal79=(Token)match(input,25,FOLLOW_25_in_program994);  
			stream_25.add(char_literal79);

			EOF80=(Token)match(input,EOF,FOLLOW_EOF_in_program996);  
			stream_EOF.add(EOF80);

			// AST REWRITE
			// elements: 41, ID, decllist, statlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (XTree)adaptor.nil();
			// 89:58: -> ^( 'program' ID decllist statlist )
			{
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:89:61: ^( 'program' ID decllist statlist )
				{
				XTree root_1 = (XTree)adaptor.nil();
				root_1 = (XTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_decllist.nextTree());
				adaptor.addChild(root_1, stream_statlist.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (XTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (XTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_decl396 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl398 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl403 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl409 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl415 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_decl444 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl446 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl448 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl453 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl459 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl465 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_decl496 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl498 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl500 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl505 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl511 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl517 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_decl548 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl550 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl552 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl554 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl559 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl565 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl571 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decllist600 = new BitSet(new long[]{0x0000050000000202L});
	public static final BitSet FOLLOW_multexpr_in_expr627 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_23_in_expr631 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_24_in_expr636 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_multexpr_in_expr640 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_simpleexpr_in_multexpr651 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_22_in_multexpr655 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_26_in_multexpr660 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_simpleexpr_in_multexpr664 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_20_in_simpleexpr674 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_simpleexpr677 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_simpleexpr679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_simpleexpr701 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_simpleexpr731 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleexpr757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_simpleexpr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat771 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_assignstat773 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_assignstat776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_cond792 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_30_in_cond795 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_32_in_cond799 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_31_in_cond803 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_cond808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_condstat820 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_condstat823 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_condstat825 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_condstat828 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_condstat840 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_condstat843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_whilestat856 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whilestat858 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_whilestat860 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_whilestat862 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_whilestat864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_forstat885 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_forstat888 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat891 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat893 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_forstat896 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat898 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat901 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_forstat903 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_forstat906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_statlist952 = new BitSet(new long[]{0x0000206A00000200L});
	public static final BitSet FOLLOW_stat_in_statlist955 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_statlist957 = new BitSet(new long[]{0x0000206A00000200L});
	public static final BitSet FOLLOW_35_in_statlist961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_program984 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program986 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_program988 = new BitSet(new long[]{0x0000050200000200L});
	public static final BitSet FOLLOW_decllist_in_program990 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_statlist_in_program992 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program994 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program996 = new BitSet(new long[]{0x0000000000000002L});
}
