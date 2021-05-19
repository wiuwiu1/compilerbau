// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxparser\\X.g 2021-05-19 15:52:02
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "DECLLIST", "DIGIT", "FLOATCONST", 
		"ID", "INTCONST", "INVALID", "LETTER", "NUMBER", "OTHER", "STATLIST", 
		"STRINGCONST", "UMINUS", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'.'", 
		"'/'", "':'", "':='", "';'", "'<'", "'='", "'>'", "'begin'", "'else'", 
		"'end'", "'float'", "'for'", "'id'", "'if'", "'int'", "'numExpr'", "'print'", 
		"'program'", "'read'", "'strExpr'", "'string'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
	public static final int T__19=19;
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
	public static final int T__46=46;
	public static final int DECL=4;
	public static final int DECLLIST=5;
	public static final int DIGIT=6;
	public static final int FLOATCONST=7;
	public static final int ID=8;
	public static final int INTCONST=9;
	public static final int INVALID=10;
	public static final int LETTER=11;
	public static final int NUMBER=12;
	public static final int OTHER=13;
	public static final int STATLIST=14;
	public static final int STRINGCONST=15;
	public static final int UMINUS=16;
	public static final int WS=17;

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
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxparser\\X.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:33:1: program : 'program' ID ';' decl block '.' EOF -> ^( 'program' ID DECLLIST ( STATLIST )+ ) ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token char_literal6=null;
		Token EOF7=null;
		ParserRuleReturnScope decl4 =null;
		ParserRuleReturnScope block5 =null;

		Object string_literal1_tree=null;
		Object ID2_tree=null;
		Object char_literal3_tree=null;
		Object char_literal6_tree=null;
		Object EOF7_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:8: ( 'program' ID ';' decl block '.' EOF -> ^( 'program' ID DECLLIST ( STATLIST )+ ) )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:10: 'program' ID ';' decl block '.' EOF
			{
			string_literal1=(Token)match(input,41,FOLLOW_41_in_program89);  
			stream_41.add(string_literal1);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_program91);  
			stream_ID.add(ID2);

			char_literal3=(Token)match(input,27,FOLLOW_27_in_program93);  
			stream_27.add(char_literal3);

			pushFollow(FOLLOW_decl_in_program95);
			decl4=decl();
			state._fsp--;

			stream_decl.add(decl4.getTree());
			pushFollow(FOLLOW_block_in_program97);
			block5=block();
			state._fsp--;

			stream_block.add(block5.getTree());
			char_literal6=(Token)match(input,23,FOLLOW_23_in_program99);  
			stream_23.add(char_literal6);

			EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_program101);  
			stream_EOF.add(EOF7);

			// AST REWRITE
			// elements: 41, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 33:46: -> ^( 'program' ID DECLLIST ( STATLIST )+ )
			{
				// de\\dhbw\\compiler\\antlrxparser\\X.g:33:49: ^( 'program' ID DECLLIST ( STATLIST )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_41.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, (Object)adaptor.create(DECLLIST, "DECLLIST"));
				if ( !() ) {
					throw new RewriteEarlyExitException();
				}
				while (  ) {
					adaptor.addChild(root_1, (Object)adaptor.create(STATLIST, "STATLIST"));
				}

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


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:36:1: block : 'begin' ( stat ';' )+ 'end' -> ^( 'begin' stat 'end' ) ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token char_literal10=null;
		Token string_literal11=null;
		ParserRuleReturnScope stat9 =null;

		Object string_literal8_tree=null;
		Object char_literal10_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_stat=new RewriteRuleSubtreeStream(adaptor,"rule stat");

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:6: ( 'begin' ( stat ';' )+ 'end' -> ^( 'begin' stat 'end' ) )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:8: 'begin' ( stat ';' )+ 'end'
			{
			string_literal8=(Token)match(input,31,FOLLOW_31_in_block124);  
			stream_31.add(string_literal8);

			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:17: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==31||(LA1_0 >= 35 && LA1_0 <= 37)||LA1_0==46) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:36:19: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block129);
					stat9=stat();
					state._fsp--;

					stream_stat.add(stat9.getTree());
					char_literal10=(Token)match(input,27,FOLLOW_27_in_block131);  
					stream_27.add(char_literal10);

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			string_literal11=(Token)match(input,33,FOLLOW_33_in_block136);  
			stream_33.add(string_literal11);

			// AST REWRITE
			// elements: 33, 31, stat
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 36:37: -> ^( 'begin' stat 'end' )
			{
				// de\\dhbw\\compiler\\antlrxparser\\X.g:36:40: ^( 'begin' stat 'end' )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_31.nextNode(), root_1);
				adaptor.addChild(root_1, stream_stat.nextTree());
				adaptor.addChild(root_1, stream_33.nextNode());
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
	// $ANTLR end "block"


	public static class stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:38:1: stat : ( numAssign | strAssign | condStat | whileStat | forStat | block );
	public final XParser.stat_return stat() throws RecognitionException {
		XParser.stat_return retval = new XParser.stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope numAssign12 =null;
		ParserRuleReturnScope strAssign13 =null;
		ParserRuleReturnScope condStat14 =null;
		ParserRuleReturnScope whileStat15 =null;
		ParserRuleReturnScope forStat16 =null;
		ParserRuleReturnScope block17 =null;


		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:38:5: ( numAssign | strAssign | condStat | whileStat | forStat | block )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 36:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==26) ) {
					int LA2_6 = input.LA(3);
					if ( (LA2_6==39) ) {
						alt2=1;
					}
					else if ( (LA2_6==43) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
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
				break;
			case 37:
				{
				alt2=3;
				}
				break;
			case 46:
				{
				alt2=4;
				}
				break;
			case 35:
				{
				alt2=5;
				}
				break;
			case 31:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:7: numAssign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numAssign_in_stat153);
					numAssign12=numAssign();
					state._fsp--;

					adaptor.addChild(root_0, numAssign12.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:19: strAssign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_strAssign_in_stat157);
					strAssign13=strAssign();
					state._fsp--;

					adaptor.addChild(root_0, strAssign13.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:31: condStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condStat_in_stat161);
					condStat14=condStat();
					state._fsp--;

					adaptor.addChild(root_0, condStat14.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:42: whileStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStat_in_stat165);
					whileStat15=whileStat();
					state._fsp--;

					adaptor.addChild(root_0, whileStat15.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:54: forStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStat_in_stat169);
					forStat16=forStat();
					state._fsp--;

					adaptor.addChild(root_0, forStat16.getTree());

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:64: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat173);
					block17=block();
					state._fsp--;

					adaptor.addChild(root_0, block17.getTree());

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


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:39:1: decl : ( 'read' )? ( 'print' )? ID ':' ( 'int' | 'float' | 'string' ) ';' ;
	public final XParser.decl_return decl() throws RecognitionException {
		XParser.decl_return retval = new XParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		Token string_literal19=null;
		Token ID20=null;
		Token char_literal21=null;
		Token set22=null;
		Token char_literal23=null;

		Object string_literal18_tree=null;
		Object string_literal19_tree=null;
		Object ID20_tree=null;
		Object char_literal21_tree=null;
		Object set22_tree=null;
		Object char_literal23_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:5: ( ( 'read' )? ( 'print' )? ID ':' ( 'int' | 'float' | 'string' ) ';' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:7: ( 'read' )? ( 'print' )? ID ':' ( 'int' | 'float' | 'string' ) ';'
			{
			root_0 = (Object)adaptor.nil();


			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:7: ( 'read' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==42) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:39:8: 'read'
					{
					string_literal18=(Token)match(input,42,FOLLOW_42_in_decl180); 
					string_literal18_tree = (Object)adaptor.create(string_literal18);
					adaptor.addChild(root_0, string_literal18_tree);

					}
					break;

			}

			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:17: ( 'print' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==40) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:39:18: 'print'
					{
					string_literal19=(Token)match(input,40,FOLLOW_40_in_decl185); 
					string_literal19_tree = (Object)adaptor.create(string_literal19);
					adaptor.addChild(root_0, string_literal19_tree);

					}
					break;

			}

			ID20=(Token)match(input,ID,FOLLOW_ID_in_decl189); 
			ID20_tree = (Object)adaptor.create(ID20);
			adaptor.addChild(root_0, ID20_tree);

			char_literal21=(Token)match(input,25,FOLLOW_25_in_decl191); 
			char_literal21_tree = (Object)adaptor.create(char_literal21);
			adaptor.addChild(root_0, char_literal21_tree);

			set22=input.LT(1);
			if ( input.LA(1)==34||input.LA(1)==38||input.LA(1)==44 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set22));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			char_literal23=(Token)match(input,27,FOLLOW_27_in_decl207); 
			char_literal23_tree = (Object)adaptor.create(char_literal23);
			adaptor.addChild(root_0, char_literal23_tree);

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


	public static class numAssign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numAssign"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:40:1: numAssign : 'id' ':=' 'numExpr' ;
	public final XParser.numAssign_return numAssign() throws RecognitionException {
		XParser.numAssign_return retval = new XParser.numAssign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal24=null;
		Token string_literal25=null;
		Token string_literal26=null;

		Object string_literal24_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:40:10: ( 'id' ':=' 'numExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:40:12: 'id' ':=' 'numExpr'
			{
			root_0 = (Object)adaptor.nil();


			string_literal24=(Token)match(input,36,FOLLOW_36_in_numAssign214); 
			string_literal24_tree = (Object)adaptor.create(string_literal24);
			adaptor.addChild(root_0, string_literal24_tree);

			string_literal25=(Token)match(input,26,FOLLOW_26_in_numAssign216); 
			string_literal25_tree = (Object)adaptor.create(string_literal25);
			adaptor.addChild(root_0, string_literal25_tree);

			string_literal26=(Token)match(input,39,FOLLOW_39_in_numAssign218); 
			string_literal26_tree = (Object)adaptor.create(string_literal26);
			adaptor.addChild(root_0, string_literal26_tree);

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
	// $ANTLR end "numAssign"


	public static class strAssign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "strAssign"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:41:1: strAssign : 'id' ':=' 'strExpr' ;
	public final XParser.strAssign_return strAssign() throws RecognitionException {
		XParser.strAssign_return retval = new XParser.strAssign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;

		Object string_literal27_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:41:10: ( 'id' ':=' 'strExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:41:12: 'id' ':=' 'strExpr'
			{
			root_0 = (Object)adaptor.nil();


			string_literal27=(Token)match(input,36,FOLLOW_36_in_strAssign224); 
			string_literal27_tree = (Object)adaptor.create(string_literal27);
			adaptor.addChild(root_0, string_literal27_tree);

			string_literal28=(Token)match(input,26,FOLLOW_26_in_strAssign226); 
			string_literal28_tree = (Object)adaptor.create(string_literal28);
			adaptor.addChild(root_0, string_literal28_tree);

			string_literal29=(Token)match(input,43,FOLLOW_43_in_strAssign228); 
			string_literal29_tree = (Object)adaptor.create(string_literal29);
			adaptor.addChild(root_0, string_literal29_tree);

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
	// $ANTLR end "strAssign"


	public static class condStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condStat"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:42:1: condStat : 'if' cond 'then' stat ( options {greedy=true; } : 'else' stat )? ;
	public final XParser.condStat_return condStat() throws RecognitionException {
		XParser.condStat_return retval = new XParser.condStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal30=null;
		Token string_literal32=null;
		Token string_literal34=null;
		ParserRuleReturnScope cond31 =null;
		ParserRuleReturnScope stat33 =null;
		ParserRuleReturnScope stat35 =null;

		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		Object string_literal34_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:42:9: ( 'if' cond 'then' stat ( options {greedy=true; } : 'else' stat )? )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:42:11: 'if' cond 'then' stat ( options {greedy=true; } : 'else' stat )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal30=(Token)match(input,37,FOLLOW_37_in_condStat234); 
			string_literal30_tree = (Object)adaptor.create(string_literal30);
			adaptor.addChild(root_0, string_literal30_tree);

			pushFollow(FOLLOW_cond_in_condStat236);
			cond31=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond31.getTree());

			string_literal32=(Token)match(input,45,FOLLOW_45_in_condStat238); 
			string_literal32_tree = (Object)adaptor.create(string_literal32);
			adaptor.addChild(root_0, string_literal32_tree);

			pushFollow(FOLLOW_stat_in_condStat240);
			stat33=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat33.getTree());

			// de\\dhbw\\compiler\\antlrxparser\\X.g:42:33: ( options {greedy=true; } : 'else' stat )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==32) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:42:57: 'else' stat
					{
					string_literal34=(Token)match(input,32,FOLLOW_32_in_condStat251); 
					string_literal34_tree = (Object)adaptor.create(string_literal34);
					adaptor.addChild(root_0, string_literal34_tree);

					pushFollow(FOLLOW_stat_in_condStat253);
					stat35=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat35.getTree());

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
	// $ANTLR end "condStat"


	public static class whileStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileStat"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:43:1: whileStat : 'while' '(' cond ')' stat ;
	public final XParser.whileStat_return whileStat() throws RecognitionException {
		XParser.whileStat_return retval = new XParser.whileStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope cond38 =null;
		ParserRuleReturnScope stat40 =null;

		Object string_literal36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:43:10: ( 'while' '(' cond ')' stat )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:43:12: 'while' '(' cond ')' stat
			{
			root_0 = (Object)adaptor.nil();


			string_literal36=(Token)match(input,46,FOLLOW_46_in_whileStat263); 
			string_literal36_tree = (Object)adaptor.create(string_literal36);
			adaptor.addChild(root_0, string_literal36_tree);

			char_literal37=(Token)match(input,18,FOLLOW_18_in_whileStat265); 
			char_literal37_tree = (Object)adaptor.create(char_literal37);
			adaptor.addChild(root_0, char_literal37_tree);

			pushFollow(FOLLOW_cond_in_whileStat267);
			cond38=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond38.getTree());

			char_literal39=(Token)match(input,19,FOLLOW_19_in_whileStat269); 
			char_literal39_tree = (Object)adaptor.create(char_literal39);
			adaptor.addChild(root_0, char_literal39_tree);

			pushFollow(FOLLOW_stat_in_whileStat271);
			stat40=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat40.getTree());

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
	// $ANTLR end "whileStat"


	public static class forStat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forStat"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:44:1: forStat : 'for' '(' numAssign ';' cond ';' numAssign ')' stat ;
	public final XParser.forStat_return forStat() throws RecognitionException {
		XParser.forStat_return retval = new XParser.forStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		Token char_literal42=null;
		Token char_literal44=null;
		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope numAssign43 =null;
		ParserRuleReturnScope cond45 =null;
		ParserRuleReturnScope numAssign47 =null;
		ParserRuleReturnScope stat49 =null;

		Object string_literal41_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		Object char_literal48_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:44:8: ( 'for' '(' numAssign ';' cond ';' numAssign ')' stat )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:44:10: 'for' '(' numAssign ';' cond ';' numAssign ')' stat
			{
			root_0 = (Object)adaptor.nil();


			string_literal41=(Token)match(input,35,FOLLOW_35_in_forStat277); 
			string_literal41_tree = (Object)adaptor.create(string_literal41);
			adaptor.addChild(root_0, string_literal41_tree);

			char_literal42=(Token)match(input,18,FOLLOW_18_in_forStat279); 
			char_literal42_tree = (Object)adaptor.create(char_literal42);
			adaptor.addChild(root_0, char_literal42_tree);

			pushFollow(FOLLOW_numAssign_in_forStat281);
			numAssign43=numAssign();
			state._fsp--;

			adaptor.addChild(root_0, numAssign43.getTree());

			char_literal44=(Token)match(input,27,FOLLOW_27_in_forStat283); 
			char_literal44_tree = (Object)adaptor.create(char_literal44);
			adaptor.addChild(root_0, char_literal44_tree);

			pushFollow(FOLLOW_cond_in_forStat285);
			cond45=cond();
			state._fsp--;

			adaptor.addChild(root_0, cond45.getTree());

			char_literal46=(Token)match(input,27,FOLLOW_27_in_forStat287); 
			char_literal46_tree = (Object)adaptor.create(char_literal46);
			adaptor.addChild(root_0, char_literal46_tree);

			pushFollow(FOLLOW_numAssign_in_forStat289);
			numAssign47=numAssign();
			state._fsp--;

			adaptor.addChild(root_0, numAssign47.getTree());

			char_literal48=(Token)match(input,19,FOLLOW_19_in_forStat291); 
			char_literal48_tree = (Object)adaptor.create(char_literal48);
			adaptor.addChild(root_0, char_literal48_tree);

			pushFollow(FOLLOW_stat_in_forStat293);
			stat49=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat49.getTree());

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
	// $ANTLR end "forStat"


	public static class cond_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:45:1: cond : expr ( '<' expr | '>' expr | '=' expr ) ;
	public final XParser.cond_return cond() throws RecognitionException {
		XParser.cond_return retval = new XParser.cond_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		Token char_literal53=null;
		Token char_literal55=null;
		ParserRuleReturnScope expr50 =null;
		ParserRuleReturnScope expr52 =null;
		ParserRuleReturnScope expr54 =null;
		ParserRuleReturnScope expr56 =null;

		Object char_literal51_tree=null;
		Object char_literal53_tree=null;
		Object char_literal55_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:5: ( expr ( '<' expr | '>' expr | '=' expr ) )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:7: expr ( '<' expr | '>' expr | '=' expr )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_cond299);
			expr50=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr50.getTree());

			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:12: ( '<' expr | '>' expr | '=' expr )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt6=1;
				}
				break;
			case 30:
				{
				alt6=2;
				}
				break;
			case 29:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:45:13: '<' expr
					{
					char_literal51=(Token)match(input,28,FOLLOW_28_in_cond302); 
					char_literal51_tree = (Object)adaptor.create(char_literal51);
					adaptor.addChild(root_0, char_literal51_tree);

					pushFollow(FOLLOW_expr_in_cond304);
					expr52=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr52.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:45:24: '>' expr
					{
					char_literal53=(Token)match(input,30,FOLLOW_30_in_cond308); 
					char_literal53_tree = (Object)adaptor.create(char_literal53);
					adaptor.addChild(root_0, char_literal53_tree);

					pushFollow(FOLLOW_expr_in_cond310);
					expr54=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr54.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:45:35: '=' expr
					{
					char_literal55=(Token)match(input,29,FOLLOW_29_in_cond314); 
					char_literal55_tree = (Object)adaptor.create(char_literal55);
					adaptor.addChild(root_0, char_literal55_tree);

					pushFollow(FOLLOW_expr_in_cond316);
					expr56=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr56.getTree());

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
	// $ANTLR end "cond"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:47:1: expr : expr1 ( ( '+' expr ) | ( '-' expr ) )? ;
	public final XParser.expr_return expr() throws RecognitionException {
		XParser.expr_return retval = new XParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope expr157 =null;
		ParserRuleReturnScope expr59 =null;
		ParserRuleReturnScope expr61 =null;

		Object char_literal58_tree=null;
		Object char_literal60_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:47:5: ( expr1 ( ( '+' expr ) | ( '-' expr ) )? )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:47:7: expr1 ( ( '+' expr ) | ( '-' expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_expr324);
			expr157=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr157.getTree());

			// de\\dhbw\\compiler\\antlrxparser\\X.g:47:13: ( ( '+' expr ) | ( '-' expr ) )?
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==21) ) {
				alt7=1;
			}
			else if ( (LA7_0==22) ) {
				alt7=2;
			}
			switch (alt7) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:14: ( '+' expr )
					{
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:14: ( '+' expr )
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:15: '+' expr
					{
					char_literal58=(Token)match(input,21,FOLLOW_21_in_expr328); 
					char_literal58_tree = (Object)adaptor.create(char_literal58);
					adaptor.addChild(root_0, char_literal58_tree);

					pushFollow(FOLLOW_expr_in_expr330);
					expr59=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr59.getTree());

					}

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:27: ( '-' expr )
					{
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:27: ( '-' expr )
					// de\\dhbw\\compiler\\antlrxparser\\X.g:47:28: '-' expr
					{
					char_literal60=(Token)match(input,22,FOLLOW_22_in_expr336); 
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);

					pushFollow(FOLLOW_expr_in_expr338);
					expr61=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr61.getTree());

					}

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
	// $ANTLR end "expr"


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:48:1: expr1 : expr2 ( ( '*' expr1 ) | ( '/' expr1 ) )? ;
	public final XParser.expr1_return expr1() throws RecognitionException {
		XParser.expr1_return retval = new XParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope expr262 =null;
		ParserRuleReturnScope expr164 =null;
		ParserRuleReturnScope expr166 =null;

		Object char_literal63_tree=null;
		Object char_literal65_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:48:6: ( expr2 ( ( '*' expr1 ) | ( '/' expr1 ) )? )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:48:8: expr2 ( ( '*' expr1 ) | ( '/' expr1 ) )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr1347);
			expr262=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr262.getTree());

			// de\\dhbw\\compiler\\antlrxparser\\X.g:48:14: ( ( '*' expr1 ) | ( '/' expr1 ) )?
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==20) ) {
				alt8=1;
			}
			else if ( (LA8_0==24) ) {
				alt8=2;
			}
			switch (alt8) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:15: ( '*' expr1 )
					{
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:15: ( '*' expr1 )
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:16: '*' expr1
					{
					char_literal63=(Token)match(input,20,FOLLOW_20_in_expr1351); 
					char_literal63_tree = (Object)adaptor.create(char_literal63);
					adaptor.addChild(root_0, char_literal63_tree);

					pushFollow(FOLLOW_expr1_in_expr1353);
					expr164=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr164.getTree());

					}

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:29: ( '/' expr1 )
					{
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:29: ( '/' expr1 )
					// de\\dhbw\\compiler\\antlrxparser\\X.g:48:30: '/' expr1
					{
					char_literal65=(Token)match(input,24,FOLLOW_24_in_expr1359); 
					char_literal65_tree = (Object)adaptor.create(char_literal65);
					adaptor.addChild(root_0, char_literal65_tree);

					pushFollow(FOLLOW_expr1_in_expr1361);
					expr166=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr166.getTree());

					}

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
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:49:1: expr2 : ( '-' INTCONST | INTCONST | '-' FLOATCONST | FLOATCONST | STRINGCONST | ID | '(' expr ')' );
	public final XParser.expr2_return expr2() throws RecognitionException {
		XParser.expr2_return retval = new XParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal67=null;
		Token INTCONST68=null;
		Token INTCONST69=null;
		Token char_literal70=null;
		Token FLOATCONST71=null;
		Token FLOATCONST72=null;
		Token STRINGCONST73=null;
		Token ID74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope expr76 =null;

		Object char_literal67_tree=null;
		Object INTCONST68_tree=null;
		Object INTCONST69_tree=null;
		Object char_literal70_tree=null;
		Object FLOATCONST71_tree=null;
		Object FLOATCONST72_tree=null;
		Object STRINGCONST73_tree=null;
		Object ID74_tree=null;
		Object char_literal75_tree=null;
		Object char_literal77_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:49:6: ( '-' INTCONST | INTCONST | '-' FLOATCONST | FLOATCONST | STRINGCONST | ID | '(' expr ')' )
			int alt9=7;
			switch ( input.LA(1) ) {
			case 22:
				{
				int LA9_1 = input.LA(2);
				if ( (LA9_1==INTCONST) ) {
					alt9=1;
				}
				else if ( (LA9_1==FLOATCONST) ) {
					alt9=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTCONST:
				{
				alt9=2;
				}
				break;
			case FLOATCONST:
				{
				alt9=4;
				}
				break;
			case STRINGCONST:
				{
				alt9=5;
				}
				break;
			case ID:
				{
				alt9=6;
				}
				break;
			case 18:
				{
				alt9=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:8: '-' INTCONST
					{
					root_0 = (Object)adaptor.nil();


					char_literal67=(Token)match(input,22,FOLLOW_22_in_expr2370); 
					char_literal67_tree = (Object)adaptor.create(char_literal67);
					adaptor.addChild(root_0, char_literal67_tree);

					INTCONST68=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_expr2372); 
					INTCONST68_tree = (Object)adaptor.create(INTCONST68);
					adaptor.addChild(root_0, INTCONST68_tree);

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:23: INTCONST
					{
					root_0 = (Object)adaptor.nil();


					INTCONST69=(Token)match(input,INTCONST,FOLLOW_INTCONST_in_expr2376); 
					INTCONST69_tree = (Object)adaptor.create(INTCONST69);
					adaptor.addChild(root_0, INTCONST69_tree);

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:34: '-' FLOATCONST
					{
					root_0 = (Object)adaptor.nil();


					char_literal70=(Token)match(input,22,FOLLOW_22_in_expr2380); 
					char_literal70_tree = (Object)adaptor.create(char_literal70);
					adaptor.addChild(root_0, char_literal70_tree);

					FLOATCONST71=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr2382); 
					FLOATCONST71_tree = (Object)adaptor.create(FLOATCONST71);
					adaptor.addChild(root_0, FLOATCONST71_tree);

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:51: FLOATCONST
					{
					root_0 = (Object)adaptor.nil();


					FLOATCONST72=(Token)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr2386); 
					FLOATCONST72_tree = (Object)adaptor.create(FLOATCONST72);
					adaptor.addChild(root_0, FLOATCONST72_tree);

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:64: STRINGCONST
					{
					root_0 = (Object)adaptor.nil();


					STRINGCONST73=(Token)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr2390); 
					STRINGCONST73_tree = (Object)adaptor.create(STRINGCONST73);
					adaptor.addChild(root_0, STRINGCONST73_tree);

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:78: ID
					{
					root_0 = (Object)adaptor.nil();


					ID74=(Token)match(input,ID,FOLLOW_ID_in_expr2394); 
					ID74_tree = (Object)adaptor.create(ID74);
					adaptor.addChild(root_0, ID74_tree);

					}
					break;
				case 7 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:49:83: '(' expr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal75=(Token)match(input,18,FOLLOW_18_in_expr2398); 
					char_literal75_tree = (Object)adaptor.create(char_literal75);
					adaptor.addChild(root_0, char_literal75_tree);

					pushFollow(FOLLOW_expr_in_expr2400);
					expr76=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr76.getTree());

					char_literal77=(Token)match(input,19,FOLLOW_19_in_expr2402); 
					char_literal77_tree = (Object)adaptor.create(char_literal77);
					adaptor.addChild(root_0, char_literal77_tree);

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
	// $ANTLR end "expr2"

	// Delegated rules



	public static final BitSet FOLLOW_41_in_program89 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_program91 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_program93 = new BitSet(new long[]{0x0000050000000100L});
	public static final BitSet FOLLOW_decl_in_program95 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_program97 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_program99 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block124 = new BitSet(new long[]{0x0000403880000000L});
	public static final BitSet FOLLOW_stat_in_block129 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_block131 = new BitSet(new long[]{0x0000403A80000000L});
	public static final BitSet FOLLOW_33_in_block136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numAssign_in_stat153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strAssign_in_stat157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStat_in_stat161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stat165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stat169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_decl180 = new BitSet(new long[]{0x0000010000000100L});
	public static final BitSet FOLLOW_40_in_decl185 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl189 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_decl191 = new BitSet(new long[]{0x0000104400000000L});
	public static final BitSet FOLLOW_set_in_decl193 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_decl207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_numAssign214 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_numAssign216 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_numAssign218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_strAssign224 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_strAssign226 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_strAssign228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_condStat234 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_cond_in_condStat236 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_condStat238 = new BitSet(new long[]{0x0000403880000000L});
	public static final BitSet FOLLOW_stat_in_condStat240 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_condStat251 = new BitSet(new long[]{0x0000403880000000L});
	public static final BitSet FOLLOW_stat_in_condStat253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_whileStat263 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whileStat265 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_cond_in_whileStat267 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileStat269 = new BitSet(new long[]{0x0000403880000000L});
	public static final BitSet FOLLOW_stat_in_whileStat271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_forStat277 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_forStat279 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_numAssign_in_forStat281 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_forStat283 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_cond_in_forStat285 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_forStat287 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_numAssign_in_forStat289 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_forStat291 = new BitSet(new long[]{0x0000403880000000L});
	public static final BitSet FOLLOW_stat_in_forStat293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_cond299 = new BitSet(new long[]{0x0000000070000000L});
	public static final BitSet FOLLOW_28_in_cond302 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_cond304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_cond308 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_cond310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_cond314 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_cond316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_expr324 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_21_in_expr328 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_expr330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_expr336 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr1347 = new BitSet(new long[]{0x0000000001100002L});
	public static final BitSet FOLLOW_20_in_expr1351 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr1_in_expr1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_expr1359 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr1_in_expr1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_expr2370 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_INTCONST_in_expr2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTCONST_in_expr2376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_expr2380 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr2386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr2390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr2394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expr2398 = new BitSet(new long[]{0x0000000000448380L});
	public static final BitSet FOLLOW_expr_in_expr2400 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_expr2402 = new BitSet(new long[]{0x0000000000000002L});
}
