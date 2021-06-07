// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxparser-loesung\\X.g 2021-05-26 14:16:50
package de.dhbw.compiler.antlrxparser;

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
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxparser-loesung\\X.g"; }


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:1: decl : ( ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type) | 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' ) | 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'print' ) | 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' 'print' ) );
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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

		Object type_tree=null;
		Object ID1_tree=null;
		Object char_literal2_tree=null;
		Object char_literal3_tree=null;
		Object string_literal4_tree=null;
		Object ID5_tree=null;
		Object char_literal6_tree=null;
		Object char_literal7_tree=null;
		Object string_literal8_tree=null;
		Object ID9_tree=null;
		Object char_literal10_tree=null;
		Object char_literal11_tree=null;
		Object string_literal12_tree=null;
		Object string_literal13_tree=null;
		Object ID14_tree=null;
		Object char_literal15_tree=null;
		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:5: ( ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type) | 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' ) | 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'print' ) | 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';' -> ^( DECL ID $type 'read' 'print' ) )
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:14: ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					ID1=(Token)match(input,ID,FOLLOW_ID_in_decl394);  
					stream_ID.add(ID1);

					char_literal2=(Token)match(input,27,FOLLOW_27_in_decl396);  
					stream_27.add(char_literal2);

					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:21: (type= 'int' |type= 'float' |type= 'string' )
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:22: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl401);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:35: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl407);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:50: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl413);  
							stream_43.add(type);

							}
							break;

					}

					char_literal3=(Token)match(input,29,FOLLOW_29_in_decl416);  
					stream_29.add(char_literal3);

					// AST REWRITE
					// elements: type, ID
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 56:69: -> ^( DECL ID $type)
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:56:72: ^( DECL ID $type)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_type.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:14: 'read' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal4=(Token)match(input,42,FOLLOW_42_in_decl442);  
					stream_42.add(string_literal4);

					ID5=(Token)match(input,ID,FOLLOW_ID_in_decl444);  
					stream_ID.add(ID5);

					char_literal6=(Token)match(input,27,FOLLOW_27_in_decl446);  
					stream_27.add(char_literal6);

					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:28: (type= 'int' |type= 'float' |type= 'string' )
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:29: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl451);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:42: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl457);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:57: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl463);  
							stream_43.add(type);

							}
							break;

					}

					char_literal7=(Token)match(input,29,FOLLOW_29_in_decl466);  
					stream_29.add(char_literal7);

					// AST REWRITE
					// elements: type, 42, ID
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 57:76: -> ^( DECL ID $type 'read' )
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:57:79: ^( DECL ID $type 'read' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:14: 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal8=(Token)match(input,40,FOLLOW_40_in_decl494);  
					stream_40.add(string_literal8);

					ID9=(Token)match(input,ID,FOLLOW_ID_in_decl496);  
					stream_ID.add(ID9);

					char_literal10=(Token)match(input,27,FOLLOW_27_in_decl498);  
					stream_27.add(char_literal10);

					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:29: (type= 'int' |type= 'float' |type= 'string' )
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:30: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl503);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:43: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl509);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:58: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl515);  
							stream_43.add(type);

							}
							break;

					}

					char_literal11=(Token)match(input,29,FOLLOW_29_in_decl518);  
					stream_29.add(char_literal11);

					// AST REWRITE
					// elements: 40, type, ID
					// token labels: type
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_type=new RewriteRuleTokenStream(adaptor,"token type",type);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:77: -> ^( DECL ID $type 'print' )
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:58:80: ^( DECL ID $type 'print' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:14: 'read' 'print' ID ':' (type= 'int' |type= 'float' |type= 'string' ) ';'
					{
					string_literal12=(Token)match(input,42,FOLLOW_42_in_decl546);  
					stream_42.add(string_literal12);

					string_literal13=(Token)match(input,40,FOLLOW_40_in_decl548);  
					stream_40.add(string_literal13);

					ID14=(Token)match(input,ID,FOLLOW_ID_in_decl550);  
					stream_ID.add(ID14);

					char_literal15=(Token)match(input,27,FOLLOW_27_in_decl552);  
					stream_27.add(char_literal15);

					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:36: (type= 'int' |type= 'float' |type= 'string' )
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:37: type= 'int'
							{
							type=(Token)match(input,39,FOLLOW_39_in_decl557);  
							stream_39.add(type);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:50: type= 'float'
							{
							type=(Token)match(input,36,FOLLOW_36_in_decl563);  
							stream_36.add(type);

							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:65: type= 'string'
							{
							type=(Token)match(input,43,FOLLOW_43_in_decl569);  
							stream_43.add(type);

							}
							break;

					}

					char_literal16=(Token)match(input,29,FOLLOW_29_in_decl572);  
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

					root_0 = (Object)adaptor.nil();
					// 59:84: -> ^( DECL ID $type 'read' 'print' )
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:59:87: ^( DECL ID $type 'read' 'print' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class decllist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decllist"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:1: decllist : ( decl )* -> ^( DECLLIST ( decl )* ) ;
	public final XParser.decllist_return decllist() throws RecognitionException {
		XParser.decllist_return retval = new XParser.decllist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope decl17 =null;

		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:9: ( ( decl )* -> ^( DECLLIST ( decl )* ) )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:15: ( decl )*
			{
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:15: ( decl )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ID||LA6_0==40||LA6_0==42) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:15: decl
					{
					pushFollow(FOLLOW_decl_in_decllist598);
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

			root_0 = (Object)adaptor.nil();
			// 61:22: -> ^( DECLLIST ( decl )* )
			{
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:25: ^( DECLLIST ( decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLLIST, "DECLLIST"), root_1);
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:61:36: ( decl )*
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decllist"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:1: expr : multexpr ( ( '+' ^| '-' ^) multexpr )* ;
	public final XParser.expr_return expr() throws RecognitionException {
		XParser.expr_return retval = new XParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal19=null;
		Token char_literal20=null;
		ParserRuleReturnScope multexpr18 =null;
		ParserRuleReturnScope multexpr21 =null;

		Object char_literal19_tree=null;
		Object char_literal20_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:5: ( multexpr ( ( '+' ^| '-' ^) multexpr )* )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:15: multexpr ( ( '+' ^| '-' ^) multexpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multexpr_in_expr625);
			multexpr18=multexpr();
			state._fsp--;

			adaptor.addChild(root_0, multexpr18.getTree());

			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:24: ( ( '+' ^| '-' ^) multexpr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= 23 && LA8_0 <= 24)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:25: ( '+' ^| '-' ^) multexpr
					{
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:25: ( '+' ^| '-' ^)
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:26: '+' ^
							{
							char_literal19=(Token)match(input,23,FOLLOW_23_in_expr629); 
							char_literal19_tree = (Object)adaptor.create(char_literal19);
							root_0 = (Object)adaptor.becomeRoot(char_literal19_tree, root_0);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:64:33: '-' ^
							{
							char_literal20=(Token)match(input,24,FOLLOW_24_in_expr634); 
							char_literal20_tree = (Object)adaptor.create(char_literal20);
							root_0 = (Object)adaptor.becomeRoot(char_literal20_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multexpr_in_expr638);
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multexpr"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:1: multexpr : simpleexpr ( ( '*' ^| '/' ^) simpleexpr )* ;
	public final XParser.multexpr_return multexpr() throws RecognitionException {
		XParser.multexpr_return retval = new XParser.multexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal23=null;
		Token char_literal24=null;
		ParserRuleReturnScope simpleexpr22 =null;
		ParserRuleReturnScope simpleexpr25 =null;

		Object char_literal23_tree=null;
		Object char_literal24_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:9: ( simpleexpr ( ( '*' ^| '/' ^) simpleexpr )* )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:14: simpleexpr ( ( '*' ^| '/' ^) simpleexpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_simpleexpr_in_multexpr649);
			simpleexpr22=simpleexpr();
			state._fsp--;

			adaptor.addChild(root_0, simpleexpr22.getTree());

			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:25: ( ( '*' ^| '/' ^) simpleexpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==22||LA10_0==26) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:26: ( '*' ^| '/' ^) simpleexpr
					{
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:26: ( '*' ^| '/' ^)
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
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:27: '*' ^
							{
							char_literal23=(Token)match(input,22,FOLLOW_22_in_multexpr653); 
							char_literal23_tree = (Object)adaptor.create(char_literal23);
							root_0 = (Object)adaptor.becomeRoot(char_literal23_tree, root_0);

							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:65:34: '/' ^
							{
							char_literal24=(Token)match(input,26,FOLLOW_26_in_multexpr658); 
							char_literal24_tree = (Object)adaptor.create(char_literal24);
							root_0 = (Object)adaptor.becomeRoot(char_literal24_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_simpleexpr_in_multexpr662);
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multexpr"


	public static class simpleexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleexpr"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:66:1: simpleexpr : ( '(' ! expr ')' !| INTCONST |op= '-' INTCONST -> ^( UMINUS[op,\"UMINUS\"] INTCONST ) | FLOATCONST |op= '-' FLOATCONST -> ^( UMINUS[op,\"UMINUS\"] FLOATCONST ) | ID | STRINGCONST );
	public final XParser.simpleexpr_return simpleexpr() throws RecognitionException {
		XParser.simpleexpr_return retval = new XParser.simpleexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		Token char_literal26=null;
		Token char_literal28=null;
		Token INTCONST29=null;
		Token INTCONST30=null;
		Token FLOATCONST31=null;
		Token FLOATCONST32=null;
		Token ID33=null;
		Token STRINGCONST34=null;
		ParserRuleReturnScope expr27 =null;

		Object op_tree=null;
		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object INTCONST29_tree=null;
		Object INTCONST30_tree=null;
		Object FLOATCONST31_tree=null;
		Object FLOATCONST32_tree=null;
		Object ID33_tree=null;
		Object STRINGCONST34_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_FLOATCONST=new RewriteRuleTokenStream(adaptor,"token FLOATCONST");
		RewriteRuleTokenStream stream_INTCONST=new RewriteRuleTokenStream(adaptor,"token INTCONST");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:66:11: ( '(' ! expr ')' !| INTCONST |op= '-' INTCONST -> ^( UMINUS[op,\"UMINUS\"] INTCONST ) | FLOATCONST |op= '-' FLOATCONST -> ^( UMINUS[op,\"UMINUS\"] FLOATCONST ) | ID | STRINGCONST )
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:66:15: '(' ! expr ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal26=(Token)match(input,20,FOLLOW_20_in_simpleexpr672); 
					pushFollow(FOLLOW_expr_in_simpleexpr675);
					expr27=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr27.getTree());

					char_literal28=(Token)match(input,21,FOLLOW_21_in_simpleexpr677); 
					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:67:15: INTCONST
					{
					root_0 = (Object)adaptor.nil();


					INTCONST29=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr695); 
					INTCONST29_tree = (Object)adaptor.create(INTCONST29);
					adaptor.addChild(root_0, INTCONST29_tree);

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:67:26: op= '-' INTCONST
					{
					op=(Token)match(input,24,FOLLOW_24_in_simpleexpr701);  
					stream_24.add(op);

					INTCONST30=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_simpleexpr703);  
					stream_INTCONST.add(INTCONST30);

					// AST REWRITE
					// elements: INTCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:42: -> ^( UMINUS[op,\"UMINUS\"] INTCONST )
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:67:45: ^( UMINUS[op,\"UMINUS\"] INTCONST )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UMINUS, op, "UMINUS"), root_1);
						adaptor.addChild(root_1, stream_INTCONST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:68:15: FLOATCONST
					{
					root_0 = (Object)adaptor.nil();


					FLOATCONST31=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr728); 
					FLOATCONST31_tree = (Object)adaptor.create(FLOATCONST31);
					adaptor.addChild(root_0, FLOATCONST31_tree);

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:68:28: op= '-' FLOATCONST
					{
					op=(Token)match(input,24,FOLLOW_24_in_simpleexpr734);  
					stream_24.add(op);

					FLOATCONST32=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_simpleexpr736);  
					stream_FLOATCONST.add(FLOATCONST32);

					// AST REWRITE
					// elements: FLOATCONST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:46: -> ^( UMINUS[op,\"UMINUS\"] FLOATCONST )
					{
						// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:68:49: ^( UMINUS[op,\"UMINUS\"] FLOATCONST )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UMINUS, op, "UMINUS"), root_1);
						adaptor.addChild(root_1, stream_FLOATCONST.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:69:15: ID
					{
					root_0 = (Object)adaptor.nil();


					ID33=(Token)match(input,ID,FOLLOW_ID_in_simpleexpr761); 
					ID33_tree = (Object)adaptor.create(ID33);
					adaptor.addChild(root_0, ID33_tree);

					}
					break;
				case 7 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:69:20: STRINGCONST
					{
					root_0 = (Object)adaptor.nil();


					STRINGCONST34=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_simpleexpr765); 
					STRINGCONST34_tree = (Object)adaptor.create(STRINGCONST34);
					adaptor.addChild(root_0, STRINGCONST34_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleexpr"


	public static class assignstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignstat"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:72:1: assignstat : ID ':=' ^ expr ;
	public final XParser.assignstat_return assignstat() throws RecognitionException {
		XParser.assignstat_return retval = new XParser.assignstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID35=null;
		Token string_literal36=null;
		ParserRuleReturnScope expr37 =null;

		Object ID35_tree=null;
		Object string_literal36_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:72:11: ( ID ':=' ^ expr )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:72:15: ID ':=' ^ expr
			{
			root_0 = (Object)adaptor.nil();


			ID35=(Token)match(input,ID,FOLLOW_ID_in_assignstat775); 
			ID35_tree = (Object)adaptor.create(ID35);
			adaptor.addChild(root_0, ID35_tree);

			string_literal36=(Token)match(input,28,FOLLOW_28_in_assignstat777); 
			string_literal36_tree = (Object)adaptor.create(string_literal36);
			root_0 = (Object)adaptor.becomeRoot(string_literal36_tree, root_0);

			pushFollow(FOLLOW_expr_in_assignstat780);
			expr37=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr37.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignstat"


	public static class cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:1: cond : expr ( '<' ^| '>' ^| '=' ^) expr ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal39=null;
		Token char_literal40=null;
		Token char_literal41=null;
		ParserRuleReturnScope expr38 =null;
		ParserRuleReturnScope expr42 =null;

		Object char_literal39_tree=null;
		Object char_literal40_tree=null;
		Object char_literal41_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:5: ( expr ( '<' ^| '>' ^| '=' ^) expr )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:15: expr ( '<' ^| '>' ^| '=' ^) expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_cond796);
			expr38=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr38.getTree());

			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:20: ( '<' ^| '>' ^| '=' ^)
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:21: '<' ^
					{
					char_literal39=(Token)match(input,30,FOLLOW_30_in_cond799); 
					char_literal39_tree = (Object)adaptor.create(char_literal39);
					root_0 = (Object)adaptor.becomeRoot(char_literal39_tree, root_0);

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:27: '>' ^
					{
					char_literal40=(Token)match(input,32,FOLLOW_32_in_cond803); 
					char_literal40_tree = (Object)adaptor.create(char_literal40);
					root_0 = (Object)adaptor.becomeRoot(char_literal40_tree, root_0);

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:75:33: '=' ^
					{
					char_literal41=(Token)match(input,31,FOLLOW_31_in_cond807); 
					char_literal41_tree = (Object)adaptor.create(char_literal41);
					root_0 = (Object)adaptor.becomeRoot(char_literal41_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_expr_in_cond812);
			expr42=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr42.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cond"


	public static class condstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condstat"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:78:1: condstat : 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? ;
	public final XParser.condstat_return condstat() throws RecognitionException {
		XParser.condstat_return retval = new XParser.condstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal43=null;
		Token string_literal45=null;
		Token string_literal47=null;
		ParserRuleReturnScope cond44 =null;
		ParserRuleReturnScope stat46 =null;
		ParserRuleReturnScope stat48 =null;

		Object string_literal43_tree=null;
		Object string_literal45_tree=null;
		Object string_literal47_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:78:9: ( 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )? )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:78:15: 'if' ^ cond 'then' ! stat ( options {greedy=true; } : 'else' ! stat )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal43=(Token)match(input,38,FOLLOW_38_in_condstat824); 
			string_literal43_tree = (Object)adaptor.create(string_literal43);
			root_0 = (Object)adaptor.becomeRoot(string_literal43_tree, root_0);

			pushFollow(FOLLOW_cond_in_condstat827);
			cond44=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond44.getTree());

			string_literal45=(Token)match(input,44,FOLLOW_44_in_condstat829); 
			pushFollow(FOLLOW_stat_in_condstat832);
			stat46=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat46.getTree());

			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:78:40: ( options {greedy=true; } : 'else' ! stat )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==34) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:78:65: 'else' ! stat
					{
					string_literal47=(Token)match(input,34,FOLLOW_34_in_condstat844); 
					pushFollow(FOLLOW_stat_in_condstat847);
					stat48=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat48.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condstat"


	public static class whilestat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whilestat"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:81:1: whilestat : 'while' '(' cond ')' stat -> ^( 'while' cond stat ) ;
	public final XParser.whilestat_return whilestat() throws RecognitionException {
		XParser.whilestat_return retval = new XParser.whilestat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal49=null;
		Token char_literal50=null;
		Token char_literal52=null;
		ParserRuleReturnScope cond51 =null;
		ParserRuleReturnScope stat53 =null;

		Object string_literal49_tree=null;
		Object char_literal50_tree=null;
		Object char_literal52_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");
		RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:81:10: ( 'while' '(' cond ')' stat -> ^( 'while' cond stat ) )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:81:15: 'while' '(' cond ')' stat
			{
			string_literal49=(Token)match(input,45,FOLLOW_45_in_whilestat861);  
			stream_45.add(string_literal49);

			char_literal50=(Token)match(input,20,FOLLOW_20_in_whilestat863);  
			stream_20.add(char_literal50);

			pushFollow(FOLLOW_cond_in_whilestat865);
			cond51=cond();
			state._fsp--;

			stream_cond.add(cond51.getTree());
			char_literal52=(Token)match(input,21,FOLLOW_21_in_whilestat867);  
			stream_21.add(char_literal52);

			pushFollow(FOLLOW_stat_in_whilestat869);
			stat53=stat();
			state._fsp--;

			stream_stat.add(stat53.getTree());
			// AST REWRITE
			// elements: stat, 45, cond
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:41: -> ^( 'while' cond stat )
			{
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:81:44: ^( 'while' cond stat )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_45.nextNode(), root_1);
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestat"


	public static class forstat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forstat"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:82:1: forstat : 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat ;
	public final XParser.forstat_return forstat() throws RecognitionException {
		XParser.forstat_return retval = new XParser.forstat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		Token char_literal59=null;
		Token char_literal61=null;
		ParserRuleReturnScope assignstat56 =null;
		ParserRuleReturnScope cond58 =null;
		ParserRuleReturnScope assignstat60 =null;
		ParserRuleReturnScope stat62 =null;

		Object string_literal54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		Object char_literal59_tree=null;
		Object char_literal61_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:82:8: ( 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:82:15: 'for' ^ '(' ! assignstat ';' ! cond ';' ! assignstat ')' ! stat
			{
			root_0 = (Object)adaptor.nil();


			string_literal54=(Token)match(input,37,FOLLOW_37_in_forstat890); 
			string_literal54_tree = (Object)adaptor.create(string_literal54);
			root_0 = (Object)adaptor.becomeRoot(string_literal54_tree, root_0);

			char_literal55=(Token)match(input,20,FOLLOW_20_in_forstat893); 
			pushFollow(FOLLOW_assignstat_in_forstat896);
			assignstat56=assignstat();
			state._fsp--;

			adaptor.addChild(root_0, assignstat56.getTree());

			char_literal57=(Token)match(input,29,FOLLOW_29_in_forstat898); 
			pushFollow(FOLLOW_cond_in_forstat901);
			cond58=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond58.getTree());

			char_literal59=(Token)match(input,29,FOLLOW_29_in_forstat903); 
			pushFollow(FOLLOW_assignstat_in_forstat906);
			assignstat60=assignstat();
			state._fsp--;

			adaptor.addChild(root_0, assignstat60.getTree());

			char_literal61=(Token)match(input,21,FOLLOW_21_in_forstat908); 
			pushFollow(FOLLOW_stat_in_forstat911);
			stat62=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat62.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forstat"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:1: stat : ( assignstat | condstat | whilestat | forstat | statlist );
	public final XParser.stat_return stat() throws RecognitionException {
		XParser.stat_return retval = new XParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignstat63 =null;
		ParserRuleReturnScope condstat64 =null;
		ParserRuleReturnScope whilestat65 =null;
		ParserRuleReturnScope forstat66 =null;
		ParserRuleReturnScope statlist67 =null;


		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:5: ( assignstat | condstat | whilestat | forstat | statlist )
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
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:15: assignstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignstat_in_stat927);
					assignstat63=assignstat();
					state._fsp--;

					adaptor.addChild(root_0, assignstat63.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:28: condstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condstat_in_stat931);
					condstat64=condstat();
					state._fsp--;

					adaptor.addChild(root_0, condstat64.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:39: whilestat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whilestat_in_stat935);
					whilestat65=whilestat();
					state._fsp--;

					adaptor.addChild(root_0, whilestat65.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:51: forstat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forstat_in_stat939);
					forstat66=forstat();
					state._fsp--;

					adaptor.addChild(root_0, forstat66.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:85:61: statlist
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_statlist_in_stat943);
					statlist67=statlist();
					state._fsp--;

					adaptor.addChild(root_0, statlist67.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class statlist_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:1: statlist : 'begin' ( stat ';' )* 'end' -> ^( STATLIST ( stat )* ) ;
	public final XParser.statlist_return statlist() throws RecognitionException {
		XParser.statlist_return retval = new XParser.statlist_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal68=null;
		Token char_literal70=null;
		Token string_literal71=null;
		ParserRuleReturnScope stat69 =null;

		Object string_literal68_tree=null;
		Object char_literal70_tree=null;
		Object string_literal71_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:9: ( 'begin' ( stat ';' )* 'end' -> ^( STATLIST ( stat )* ) )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:18: 'begin' ( stat ';' )* 'end'
			{
			string_literal68=(Token)match(input,33,FOLLOW_33_in_statlist957);  
			stream_33.add(string_literal68);

			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:26: ( stat ';' )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==ID||LA15_0==33||(LA15_0 >= 37 && LA15_0 <= 38)||LA15_0==45) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:27: stat ';'
					{
					pushFollow(FOLLOW_stat_in_statlist960);
					stat69=stat();
					state._fsp--;

					stream_stat.add(stat69.getTree());
					char_literal70=(Token)match(input,29,FOLLOW_29_in_statlist962);  
					stream_29.add(char_literal70);

					}
					break;

				default :
					break loop15;
				}
			}

			string_literal71=(Token)match(input,35,FOLLOW_35_in_statlist966);  
			stream_35.add(string_literal71);

			// AST REWRITE
			// elements: stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:45: -> ^( STATLIST ( stat )* )
			{
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:48: ^( STATLIST ( stat )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATLIST, "STATLIST"), root_1);
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:87:59: ( stat )*
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

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statlist"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:90:1: program : 'program' ID ';' decllist statlist '.' EOF -> ^( 'program' ID decllist statlist ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal72=null;
		Token ID73=null;
		Token char_literal74=null;
		Token char_literal77=null;
		Token EOF78=null;
		ParserRuleReturnScope decllist75 =null;
		ParserRuleReturnScope statlist76 =null;

		Object string_literal72_tree=null;
		Object ID73_tree=null;
		Object char_literal74_tree=null;
		Object char_literal77_tree=null;
		Object EOF78_tree=null;
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_decllist=new RewriteRuleSubtreeStream(adaptor,"rule decllist");
		RewriteRuleSubtreeStream stream_statlist=new RewriteRuleSubtreeStream(adaptor,"rule statlist");

		try {
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:90:8: ( 'program' ID ';' decllist statlist '.' EOF -> ^( 'program' ID decllist statlist ) )
			// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:90:15: 'program' ID ';' decllist statlist '.' EOF
			{
			string_literal72=(Token)match(input,41,FOLLOW_41_in_program989);  
			stream_41.add(string_literal72);

			ID73=(Token)match(input,ID,FOLLOW_ID_in_program991);  
			stream_ID.add(ID73);

			char_literal74=(Token)match(input,29,FOLLOW_29_in_program993);  
			stream_29.add(char_literal74);

			pushFollow(FOLLOW_decllist_in_program995);
			decllist75=decllist();
			state._fsp--;

			stream_decllist.add(decllist75.getTree());
			pushFollow(FOLLOW_statlist_in_program997);
			statlist76=statlist();
			state._fsp--;

			stream_statlist.add(statlist76.getTree());
			char_literal77=(Token)match(input,25,FOLLOW_25_in_program999);  
			stream_25.add(char_literal77);

			EOF78=(Token)match(input,EOF,FOLLOW_EOF_in_program1001);  
			stream_EOF.add(EOF78);

			// AST REWRITE
			// elements: ID, 41, decllist, statlist
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:58: -> ^( 'program' ID decllist statlist )
			{
				// de\\dhbw\\compiler\\antlrxparser-loesung\\X.g:90:61: ^( 'program' ID decllist statlist )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_41.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_decllist.nextTree());
				adaptor.addChild(root_1, stream_statlist.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_decl394 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl396 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl401 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl407 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl413 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_decl442 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl444 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl446 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl451 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl457 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl463 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_decl494 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl496 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl498 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl503 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl509 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl515 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_decl546 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_decl548 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_decl550 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl552 = new BitSet(new long[]{0x0000089000000000L});
	public static final BitSet FOLLOW_39_in_decl557 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_36_in_decl563 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_43_in_decl569 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_decl572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_decllist598 = new BitSet(new long[]{0x0000050000000202L});
	public static final BitSet FOLLOW_multexpr_in_expr625 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_23_in_expr629 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_24_in_expr634 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_multexpr_in_expr638 = new BitSet(new long[]{0x0000000001800002L});
	public static final BitSet FOLLOW_simpleexpr_in_multexpr649 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_22_in_multexpr653 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_26_in_multexpr658 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_simpleexpr_in_multexpr662 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_20_in_simpleexpr672 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_simpleexpr675 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_simpleexpr677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_simpleexpr701 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTCONST_in_simpleexpr703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_simpleexpr734 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FLOATCONST_in_simpleexpr736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleexpr761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_simpleexpr765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat775 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_assignstat777 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_assignstat780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_cond796 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_30_in_cond799 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_32_in_cond803 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_31_in_cond807 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_expr_in_cond812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_condstat824 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_condstat827 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_condstat829 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_condstat832 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_condstat844 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_condstat847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_whilestat861 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whilestat863 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_whilestat865 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_whilestat867 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_whilestat869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_forstat890 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_forstat893 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat896 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat898 = new BitSet(new long[]{0x0000000001110700L});
	public static final BitSet FOLLOW_cond_in_forstat901 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_forstat903 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_assignstat_in_forstat906 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_forstat908 = new BitSet(new long[]{0x0000206200000200L});
	public static final BitSet FOLLOW_stat_in_forstat911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignstat_in_stat927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_statlist957 = new BitSet(new long[]{0x0000206A00000200L});
	public static final BitSet FOLLOW_stat_in_statlist960 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_statlist962 = new BitSet(new long[]{0x0000206A00000200L});
	public static final BitSet FOLLOW_35_in_statlist966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_program989 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_program991 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_program993 = new BitSet(new long[]{0x0000050200000200L});
	public static final BitSet FOLLOW_decllist_in_program995 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_statlist_in_program997 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program999 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program1001 = new BitSet(new long[]{0x0000000000000002L});
}
