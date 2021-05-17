// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxparser\\X.g 2021-05-17 15:59:54
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "DECLLIST", "INVALID", 
		"STATLIST", "UMINUS", "WS", "'('", "')'", "':='", "';'", "'begin'", "'cond'", 
		"'else'", "'end'", "'for'", "'id'", "'if'", "'numExpr'", "'program'", 
		"'strExpr'", "'then'", "'while'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int DECL=4;
	public static final int DECLLIST=5;
	public static final int INVALID=6;
	public static final int STATLIST=7;
	public static final int UMINUS=8;
	public static final int WS=9;

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:33:1: program : 'program' EOF ;
	public final XParser.program_return program() throws RecognitionException {
		XParser.program_return retval = new XParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token EOF2=null;

		Object string_literal1_tree=null;
		Object EOF2_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:8: ( 'program' EOF )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:10: 'program' EOF
			{
			root_0 = (Object)adaptor.nil();


			string_literal1=(Token)match(input,22,FOLLOW_22_in_program89); 
			string_literal1_tree = (Object)adaptor.create(string_literal1);
			adaptor.addChild(root_0, string_literal1_tree);

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program91); 
			EOF2_tree = (Object)adaptor.create(EOF2);
			adaptor.addChild(root_0, EOF2_tree);

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:36:1: block : 'begin' ( stat ';' )+ 'end' ;
	public final XParser.block_return block() throws RecognitionException {
		XParser.block_return retval = new XParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token char_literal5=null;
		Token string_literal6=null;
		ParserRuleReturnScope stat4 =null;

		Object string_literal3_tree=null;
		Object char_literal5_tree=null;
		Object string_literal6_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:6: ( 'begin' ( stat ';' )+ 'end' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:8: 'begin' ( stat ';' )+ 'end'
			{
			root_0 = (Object)adaptor.nil();


			string_literal3=(Token)match(input,14,FOLLOW_14_in_block99); 
			string_literal3_tree = (Object)adaptor.create(string_literal3);
			adaptor.addChild(root_0, string_literal3_tree);

			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:17: ( stat ';' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==14||(LA1_0 >= 18 && LA1_0 <= 20)||LA1_0==25) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:36:19: stat ';'
					{
					pushFollow(FOLLOW_stat_in_block104);
					stat4=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat4.getTree());

					char_literal5=(Token)match(input,13,FOLLOW_13_in_block106); 
					char_literal5_tree = (Object)adaptor.create(char_literal5);
					adaptor.addChild(root_0, char_literal5_tree);

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			string_literal6=(Token)match(input,17,FOLLOW_17_in_block111); 
			string_literal6_tree = (Object)adaptor.create(string_literal6);
			adaptor.addChild(root_0, string_literal6_tree);

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

		ParserRuleReturnScope numAssign7 =null;
		ParserRuleReturnScope strAssign8 =null;
		ParserRuleReturnScope condStat9 =null;
		ParserRuleReturnScope whileStat10 =null;
		ParserRuleReturnScope forStat11 =null;
		ParserRuleReturnScope block12 =null;


		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:38:5: ( numAssign | strAssign | condStat | whileStat | forStat | block )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 19:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==12) ) {
					int LA2_6 = input.LA(3);
					if ( (LA2_6==21) ) {
						alt2=1;
					}
					else if ( (LA2_6==23) ) {
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
			case 20:
				{
				alt2=3;
				}
				break;
			case 25:
				{
				alt2=4;
				}
				break;
			case 18:
				{
				alt2=5;
				}
				break;
			case 14:
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


					pushFollow(FOLLOW_numAssign_in_stat118);
					numAssign7=numAssign();
					state._fsp--;

					adaptor.addChild(root_0, numAssign7.getTree());

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:19: strAssign
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_strAssign_in_stat122);
					strAssign8=strAssign();
					state._fsp--;

					adaptor.addChild(root_0, strAssign8.getTree());

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:31: condStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condStat_in_stat126);
					condStat9=condStat();
					state._fsp--;

					adaptor.addChild(root_0, condStat9.getTree());

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:42: whileStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileStat_in_stat130);
					whileStat10=whileStat();
					state._fsp--;

					adaptor.addChild(root_0, whileStat10.getTree());

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:54: forStat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forStat_in_stat134);
					forStat11=forStat();
					state._fsp--;

					adaptor.addChild(root_0, forStat11.getTree());

					}
					break;
				case 6 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:38:64: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_stat138);
					block12=block();
					state._fsp--;

					adaptor.addChild(root_0, block12.getTree());

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


	public static class numAssign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numAssign"
	// de\\dhbw\\compiler\\antlrxparser\\X.g:39:1: numAssign : 'id' ':=' 'numExpr' ;
	public final XParser.numAssign_return numAssign() throws RecognitionException {
		XParser.numAssign_return retval = new XParser.numAssign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;
		Token string_literal14=null;
		Token string_literal15=null;

		Object string_literal13_tree=null;
		Object string_literal14_tree=null;
		Object string_literal15_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:10: ( 'id' ':=' 'numExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:39:12: 'id' ':=' 'numExpr'
			{
			root_0 = (Object)adaptor.nil();


			string_literal13=(Token)match(input,19,FOLLOW_19_in_numAssign144); 
			string_literal13_tree = (Object)adaptor.create(string_literal13);
			adaptor.addChild(root_0, string_literal13_tree);

			string_literal14=(Token)match(input,12,FOLLOW_12_in_numAssign146); 
			string_literal14_tree = (Object)adaptor.create(string_literal14);
			adaptor.addChild(root_0, string_literal14_tree);

			string_literal15=(Token)match(input,21,FOLLOW_21_in_numAssign148); 
			string_literal15_tree = (Object)adaptor.create(string_literal15);
			adaptor.addChild(root_0, string_literal15_tree);

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:40:1: strAssign : 'id' ':=' 'strExpr' ;
	public final XParser.strAssign_return strAssign() throws RecognitionException {
		XParser.strAssign_return retval = new XParser.strAssign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token string_literal17=null;
		Token string_literal18=null;

		Object string_literal16_tree=null;
		Object string_literal17_tree=null;
		Object string_literal18_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:40:10: ( 'id' ':=' 'strExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:40:12: 'id' ':=' 'strExpr'
			{
			root_0 = (Object)adaptor.nil();


			string_literal16=(Token)match(input,19,FOLLOW_19_in_strAssign154); 
			string_literal16_tree = (Object)adaptor.create(string_literal16);
			adaptor.addChild(root_0, string_literal16_tree);

			string_literal17=(Token)match(input,12,FOLLOW_12_in_strAssign156); 
			string_literal17_tree = (Object)adaptor.create(string_literal17);
			adaptor.addChild(root_0, string_literal17_tree);

			string_literal18=(Token)match(input,23,FOLLOW_23_in_strAssign158); 
			string_literal18_tree = (Object)adaptor.create(string_literal18);
			adaptor.addChild(root_0, string_literal18_tree);

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:41:1: condStat : 'if' 'cond' 'then' stat ( 'else' stat )? ;
	public final XParser.condStat_return condStat() throws RecognitionException {
		XParser.condStat_return retval = new XParser.condStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal19=null;
		Token string_literal20=null;
		Token string_literal21=null;
		Token string_literal23=null;
		ParserRuleReturnScope stat22 =null;
		ParserRuleReturnScope stat24 =null;

		Object string_literal19_tree=null;
		Object string_literal20_tree=null;
		Object string_literal21_tree=null;
		Object string_literal23_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:41:9: ( 'if' 'cond' 'then' stat ( 'else' stat )? )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:41:11: 'if' 'cond' 'then' stat ( 'else' stat )?
			{
			root_0 = (Object)adaptor.nil();


			string_literal19=(Token)match(input,20,FOLLOW_20_in_condStat164); 
			string_literal19_tree = (Object)adaptor.create(string_literal19);
			adaptor.addChild(root_0, string_literal19_tree);

			string_literal20=(Token)match(input,15,FOLLOW_15_in_condStat166); 
			string_literal20_tree = (Object)adaptor.create(string_literal20);
			adaptor.addChild(root_0, string_literal20_tree);

			string_literal21=(Token)match(input,24,FOLLOW_24_in_condStat168); 
			string_literal21_tree = (Object)adaptor.create(string_literal21);
			adaptor.addChild(root_0, string_literal21_tree);

			pushFollow(FOLLOW_stat_in_condStat170);
			stat22=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat22.getTree());

			// de\\dhbw\\compiler\\antlrxparser\\X.g:41:35: ( 'else' stat )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==16) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:41:37: 'else' stat
					{
					string_literal23=(Token)match(input,16,FOLLOW_16_in_condStat174); 
					string_literal23_tree = (Object)adaptor.create(string_literal23);
					adaptor.addChild(root_0, string_literal23_tree);

					pushFollow(FOLLOW_stat_in_condStat176);
					stat24=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat24.getTree());

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:42:1: whileStat : 'while' '(' 'cond' ')' stat ;
	public final XParser.whileStat_return whileStat() throws RecognitionException {
		XParser.whileStat_return retval = new XParser.whileStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		Token char_literal26=null;
		Token string_literal27=null;
		Token char_literal28=null;
		ParserRuleReturnScope stat29 =null;

		Object string_literal25_tree=null;
		Object char_literal26_tree=null;
		Object string_literal27_tree=null;
		Object char_literal28_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:42:10: ( 'while' '(' 'cond' ')' stat )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:42:12: 'while' '(' 'cond' ')' stat
			{
			root_0 = (Object)adaptor.nil();


			string_literal25=(Token)match(input,25,FOLLOW_25_in_whileStat186); 
			string_literal25_tree = (Object)adaptor.create(string_literal25);
			adaptor.addChild(root_0, string_literal25_tree);

			char_literal26=(Token)match(input,10,FOLLOW_10_in_whileStat188); 
			char_literal26_tree = (Object)adaptor.create(char_literal26);
			adaptor.addChild(root_0, char_literal26_tree);

			string_literal27=(Token)match(input,15,FOLLOW_15_in_whileStat190); 
			string_literal27_tree = (Object)adaptor.create(string_literal27);
			adaptor.addChild(root_0, string_literal27_tree);

			char_literal28=(Token)match(input,11,FOLLOW_11_in_whileStat192); 
			char_literal28_tree = (Object)adaptor.create(char_literal28);
			adaptor.addChild(root_0, char_literal28_tree);

			pushFollow(FOLLOW_stat_in_whileStat194);
			stat29=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat29.getTree());

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
	// de\\dhbw\\compiler\\antlrxparser\\X.g:43:1: forStat : 'for' '(' numAssign ';' 'cond' ';' numAssign ')' stat ;
	public final XParser.forStat_return forStat() throws RecognitionException {
		XParser.forStat_return retval = new XParser.forStat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		Token string_literal34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		ParserRuleReturnScope numAssign32 =null;
		ParserRuleReturnScope numAssign36 =null;
		ParserRuleReturnScope stat38 =null;

		Object string_literal30_tree=null;
		Object char_literal31_tree=null;
		Object char_literal33_tree=null;
		Object string_literal34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;

		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:43:8: ( 'for' '(' numAssign ';' 'cond' ';' numAssign ')' stat )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:43:10: 'for' '(' numAssign ';' 'cond' ';' numAssign ')' stat
			{
			root_0 = (Object)adaptor.nil();


			string_literal30=(Token)match(input,18,FOLLOW_18_in_forStat200); 
			string_literal30_tree = (Object)adaptor.create(string_literal30);
			adaptor.addChild(root_0, string_literal30_tree);

			char_literal31=(Token)match(input,10,FOLLOW_10_in_forStat202); 
			char_literal31_tree = (Object)adaptor.create(char_literal31);
			adaptor.addChild(root_0, char_literal31_tree);

			pushFollow(FOLLOW_numAssign_in_forStat204);
			numAssign32=numAssign();
			state._fsp--;

			adaptor.addChild(root_0, numAssign32.getTree());

			char_literal33=(Token)match(input,13,FOLLOW_13_in_forStat206); 
			char_literal33_tree = (Object)adaptor.create(char_literal33);
			adaptor.addChild(root_0, char_literal33_tree);

			string_literal34=(Token)match(input,15,FOLLOW_15_in_forStat208); 
			string_literal34_tree = (Object)adaptor.create(string_literal34);
			adaptor.addChild(root_0, string_literal34_tree);

			char_literal35=(Token)match(input,13,FOLLOW_13_in_forStat210); 
			char_literal35_tree = (Object)adaptor.create(char_literal35);
			adaptor.addChild(root_0, char_literal35_tree);

			pushFollow(FOLLOW_numAssign_in_forStat212);
			numAssign36=numAssign();
			state._fsp--;

			adaptor.addChild(root_0, numAssign36.getTree());

			char_literal37=(Token)match(input,11,FOLLOW_11_in_forStat214); 
			char_literal37_tree = (Object)adaptor.create(char_literal37);
			adaptor.addChild(root_0, char_literal37_tree);

			pushFollow(FOLLOW_stat_in_forStat216);
			stat38=stat();
			state._fsp--;

			adaptor.addChild(root_0, stat38.getTree());

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

	// Delegated rules



	public static final BitSet FOLLOW_22_in_program89 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_block99 = new BitSet(new long[]{0x00000000021C4000L});
	public static final BitSet FOLLOW_stat_in_block104 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_block106 = new BitSet(new long[]{0x00000000021E4000L});
	public static final BitSet FOLLOW_17_in_block111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numAssign_in_stat118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_strAssign_in_stat122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStat_in_stat126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stat130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stat134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_stat138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_numAssign144 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_numAssign146 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_numAssign148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_strAssign154 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_strAssign156 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_strAssign158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_condStat164 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_condStat166 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_condStat168 = new BitSet(new long[]{0x00000000021C4000L});
	public static final BitSet FOLLOW_stat_in_condStat170 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_condStat174 = new BitSet(new long[]{0x00000000021C4000L});
	public static final BitSet FOLLOW_stat_in_condStat176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_whileStat186 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_whileStat188 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_whileStat190 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_whileStat192 = new BitSet(new long[]{0x00000000021C4000L});
	public static final BitSet FOLLOW_stat_in_whileStat194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_forStat200 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_forStat202 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_numAssign_in_forStat204 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_forStat206 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_forStat208 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_forStat210 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_numAssign_in_forStat212 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_forStat214 = new BitSet(new long[]{0x00000000021C4000L});
	public static final BitSet FOLLOW_stat_in_forStat216 = new BitSet(new long[]{0x0000000000000002L});
}
