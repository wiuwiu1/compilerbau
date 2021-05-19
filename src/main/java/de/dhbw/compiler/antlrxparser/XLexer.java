// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxparser\\X.g 2021-05-19 15:52:02
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public XLexer() {} 
	public XLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public XLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxparser\\X.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:9:7: ( '(' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:9:9: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:10:7: ( ')' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:10:9: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:11:7: ( '*' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:11:9: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:12:7: ( '+' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:12:9: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:13:7: ( '-' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:13:9: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:14:7: ( '.' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:14:9: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:15:7: ( '/' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:15:9: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:16:7: ( ':' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:16:9: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:17:7: ( ':=' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:17:9: ':='
			{
			match(":="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:18:7: ( ';' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:18:9: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:19:7: ( '<' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:19:9: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:20:7: ( '=' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:20:9: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:21:7: ( '>' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:21:9: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:22:7: ( 'begin' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:22:9: 'begin'
			{
			match("begin"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:23:7: ( 'else' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:23:9: 'else'
			{
			match("else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:24:7: ( 'end' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:24:9: 'end'
			{
			match("end"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:25:7: ( 'float' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:25:9: 'float'
			{
			match("float"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:26:7: ( 'for' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:26:9: 'for'
			{
			match("for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:27:7: ( 'id' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:27:9: 'id'
			{
			match("id"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:28:7: ( 'if' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:28:9: 'if'
			{
			match("if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:29:7: ( 'int' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:29:9: 'int'
			{
			match("int"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:30:7: ( 'numExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:30:9: 'numExpr'
			{
			match("numExpr"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:31:7: ( 'print' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:31:9: 'print'
			{
			match("print"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:32:7: ( 'program' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:32:9: 'program'
			{
			match("program"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:7: ( 'read' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:33:9: 'read'
			{
			match("read"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:34:7: ( 'strExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:34:9: 'strExpr'
			{
			match("strExpr"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:35:7: ( 'string' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:35:9: 'string'
			{
			match("string"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:7: ( 'then' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:36:9: 'then'
			{
			match("then"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:37:7: ( 'while' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:37:9: 'while'
			{
			match("while"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:51:16: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:51:18: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// de\\dhbw\\compiler\\antlrxparser\\X.g:51:18: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:52:15: ( ( '0' .. '9' )+ )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:52:17: ( '0' .. '9' )+
			{
			// de\\dhbw\\compiler\\antlrxparser\\X.g:52:17: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:53:15: ( ' ' | '.' | ':' | '\\\\\"' )
			int alt3=4;
			switch ( input.LA(1) ) {
			case ' ':
				{
				alt3=1;
				}
				break;
			case '.':
				{
				alt3=2;
				}
				break;
			case ':':
				{
				alt3=3;
				}
				break;
			case '\\':
				{
				alt3=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:53:17: ' '
					{
					match(' '); if (state.failed) return;
					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:53:23: '.'
					{
					match('.'); if (state.failed) return;
					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:53:29: ':'
					{
					match(':'); if (state.failed) return;
					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:53:35: '\\\\\"'
					{
					match("\\\""); if (state.failed) return;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OTHER"

	// $ANTLR start "INTCONST"
	public final void mINTCONST() throws RecognitionException {
		try {
			int _type = INTCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:54:9: ( NUMBER )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:54:11: NUMBER
			{
			mNUMBER(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTCONST"

	// $ANTLR start "FLOATCONST"
	public final void mFLOATCONST() throws RecognitionException {
		try {
			int _type = FLOATCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:55:11: ( ( NUMBER ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )? )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? )
			int alt9=2;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:55:13: ( NUMBER ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )? )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
					{
					mINTCONST(); if (state.failed) return;

					// de\\dhbw\\compiler\\antlrxparser\\X.g:55:86: ( '.' ( DIGIT )* )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='.') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxparser\\X.g:55:87: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// de\\dhbw\\compiler\\antlrxparser\\X.g:55:91: ( DIGIT )*
							loop4:
							while (true) {
								int alt4=2;
								int LA4_0 = input.LA(1);
								if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
									alt4=1;
								}

								switch (alt4) {
								case 1 :
									// de\\dhbw\\compiler\\antlrxparser\\X.g:55:91: DIGIT
									{
									mDIGIT(); if (state.failed) return;

									}
									break;

								default :
									break loop4;
								}
							}

							}
							break;

					}

					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// de\\dhbw\\compiler\\antlrxparser\\X.g:55:109: ( '+' | '-' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='+'||LA6_0=='-') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxparser\\X.g:
							{
							if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					mINTCONST(); if (state.failed) return;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:56:3: INTCONST ( '.' ( DIGIT )* )?
					{
					mINTCONST(); if (state.failed) return;

					// de\\dhbw\\compiler\\antlrxparser\\X.g:56:12: ( '.' ( DIGIT )* )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='.') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxparser\\X.g:56:13: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// de\\dhbw\\compiler\\antlrxparser\\X.g:56:17: ( DIGIT )*
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// de\\dhbw\\compiler\\antlrxparser\\X.g:56:17: DIGIT
									{
									mDIGIT(); if (state.failed) return;

									}
									break;

								default :
									break loop7;
								}
							}

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATCONST"

	// $ANTLR start "STRINGCONST"
	public final void mSTRINGCONST() throws RecognitionException {
		try {
			int _type = STRINGCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:57:12: ( '\\\"' ( LETTER | DIGIT | OTHER )* '\\\"' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:57:14: '\\\"' ( LETTER | DIGIT | OTHER )* '\\\"'
			{
			match('\"'); if (state.failed) return;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:57:19: ( LETTER | DIGIT | OTHER )*
			loop10:
			while (true) {
				int alt10=4;
				switch ( input.LA(1) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt10=1;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt10=2;
					}
					break;
				case ' ':
				case '.':
				case ':':
				case '\\':
					{
					alt10=3;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:57:20: LETTER
					{
					mLETTER(); if (state.failed) return;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:57:29: DIGIT
					{
					mDIGIT(); if (state.failed) return;

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:57:37: OTHER
					{
					mOTHER(); if (state.failed) return;

					}
					break;

				default :
					break loop10;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGCONST"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:58:3: ( LETTER ( LETTER | DIGIT )* )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:58:5: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); if (state.failed) return;

			// de\\dhbw\\compiler\\antlrxparser\\X.g:58:12: ( LETTER | DIGIT )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}
				else if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:58:14: LETTER
					{
					mLETTER(); if (state.failed) return;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:58:23: DIGIT
					{
					mDIGIT(); if (state.failed) return;

					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxparser\\X.g:59:16: ( '0' | ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( DIGIT )* ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='0') ) {
				alt13=1;
			}
			else if ( ((LA13_0 >= '1' && LA13_0 <= '9')) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:59:18: '0'
					{
					match('0'); if (state.failed) return;
					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:59:24: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( DIGIT )* )
					{
					// de\\dhbw\\compiler\\antlrxparser\\X.g:59:24: ( ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( DIGIT )* )
					// de\\dhbw\\compiler\\antlrxparser\\X.g:59:26: ( '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// de\\dhbw\\compiler\\antlrxparser\\X.g:59:65: ( DIGIT )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxparser\\X.g:59:66: DIGIT
							{
							mDIGIT(); if (state.failed) return;

							}
							break;

						default :
							break loop12;
						}
					}

					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:60:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:60:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// de\\dhbw\\compiler\\antlrxparser\\X.g:60:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			if ( state.backtracking==0 ) { skip(); }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "INVALID"
	public final void mINVALID() throws RecognitionException {
		try {
			int _type = INVALID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:62:8: ( . )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:62:11: .
			{
			matchAny(); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVALID"

	@Override
	public void mTokens() throws RecognitionException {
		// de\\dhbw\\compiler\\antlrxparser\\X.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | INTCONST | FLOATCONST | STRINGCONST | ID | WS | INVALID )
		int alt15=35;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:10: T__18
				{
				mT__18(); if (state.failed) return;

				}
				break;
			case 2 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:16: T__19
				{
				mT__19(); if (state.failed) return;

				}
				break;
			case 3 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:22: T__20
				{
				mT__20(); if (state.failed) return;

				}
				break;
			case 4 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:28: T__21
				{
				mT__21(); if (state.failed) return;

				}
				break;
			case 5 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:34: T__22
				{
				mT__22(); if (state.failed) return;

				}
				break;
			case 6 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:40: T__23
				{
				mT__23(); if (state.failed) return;

				}
				break;
			case 7 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:46: T__24
				{
				mT__24(); if (state.failed) return;

				}
				break;
			case 8 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:52: T__25
				{
				mT__25(); if (state.failed) return;

				}
				break;
			case 9 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:58: T__26
				{
				mT__26(); if (state.failed) return;

				}
				break;
			case 10 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:64: T__27
				{
				mT__27(); if (state.failed) return;

				}
				break;
			case 11 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:70: T__28
				{
				mT__28(); if (state.failed) return;

				}
				break;
			case 12 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:76: T__29
				{
				mT__29(); if (state.failed) return;

				}
				break;
			case 13 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:82: T__30
				{
				mT__30(); if (state.failed) return;

				}
				break;
			case 14 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:88: T__31
				{
				mT__31(); if (state.failed) return;

				}
				break;
			case 15 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:94: T__32
				{
				mT__32(); if (state.failed) return;

				}
				break;
			case 16 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:100: T__33
				{
				mT__33(); if (state.failed) return;

				}
				break;
			case 17 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:106: T__34
				{
				mT__34(); if (state.failed) return;

				}
				break;
			case 18 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:112: T__35
				{
				mT__35(); if (state.failed) return;

				}
				break;
			case 19 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:118: T__36
				{
				mT__36(); if (state.failed) return;

				}
				break;
			case 20 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:124: T__37
				{
				mT__37(); if (state.failed) return;

				}
				break;
			case 21 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:130: T__38
				{
				mT__38(); if (state.failed) return;

				}
				break;
			case 22 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:136: T__39
				{
				mT__39(); if (state.failed) return;

				}
				break;
			case 23 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:142: T__40
				{
				mT__40(); if (state.failed) return;

				}
				break;
			case 24 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:148: T__41
				{
				mT__41(); if (state.failed) return;

				}
				break;
			case 25 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:154: T__42
				{
				mT__42(); if (state.failed) return;

				}
				break;
			case 26 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:160: T__43
				{
				mT__43(); if (state.failed) return;

				}
				break;
			case 27 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:166: T__44
				{
				mT__44(); if (state.failed) return;

				}
				break;
			case 28 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:172: T__45
				{
				mT__45(); if (state.failed) return;

				}
				break;
			case 29 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:178: T__46
				{
				mT__46(); if (state.failed) return;

				}
				break;
			case 30 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:184: INTCONST
				{
				mINTCONST(); if (state.failed) return;

				}
				break;
			case 31 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:193: FLOATCONST
				{
				mFLOATCONST(); if (state.failed) return;

				}
				break;
			case 32 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:204: STRINGCONST
				{
				mSTRINGCONST(); if (state.failed) return;

				}
				break;
			case 33 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:216: ID
				{
				mID(); if (state.failed) return;

				}
				break;
			case 34 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:219: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 35 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:222: INVALID
				{
				mINVALID(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_X
	public final void synpred1_X_fragment() throws RecognitionException {
		// de\\dhbw\\compiler\\antlrxparser\\X.g:55:13: ( NUMBER ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )? )
		// de\\dhbw\\compiler\\antlrxparser\\X.g:55:14: NUMBER ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )?
		{
		mNUMBER(); if (state.failed) return;

		// de\\dhbw\\compiler\\antlrxparser\\X.g:55:21: ( '.' ( DIGIT )* )?
		int alt17=2;
		int LA17_0 = input.LA(1);
		if ( (LA17_0=='.') ) {
			alt17=1;
		}
		switch (alt17) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:55:23: '.' ( DIGIT )*
				{
				match('.'); if (state.failed) return;
				// de\\dhbw\\compiler\\antlrxparser\\X.g:55:27: ( DIGIT )*
				loop16:
				while (true) {
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
						alt16=1;
					}

					switch (alt16) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxparser\\X.g:55:29: DIGIT
						{
						mDIGIT(); if (state.failed) return;

						}
						break;

					default :
						break loop16;
					}
				}

				}
				break;

		}

		// de\\dhbw\\compiler\\antlrxparser\\X.g:55:42: ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )?
		int alt19=2;
		int LA19_0 = input.LA(1);
		if ( (LA19_0=='E'||LA19_0=='e') ) {
			alt19=1;
		}
		switch (alt19) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:55:43: ( 'e' | 'E' ) ( '+' | '-' )? NUMBER
				{
				if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				// de\\dhbw\\compiler\\antlrxparser\\X.g:55:53: ( '+' | '-' )?
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='+'||LA18_0=='-') ) {
					alt18=1;
				}
				switch (alt18) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxparser\\X.g:
						{
						if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
							input.consume();
							state.failed=false;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return;}
							MismatchedSetException mse = new MismatchedSetException(null,input);
							recover(mse);
							throw mse;
						}
						}
						break;

				}

				mNUMBER(); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred1_X

	public final boolean synpred1_X() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_X_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA9_eotS =
		"\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3";
	static final String DFA9_eofS =
		"\10\uffff";
	static final String DFA9_minS =
		"\1\60\2\56\1\uffff\1\60\1\uffff\1\56\1\60";
	static final String DFA9_maxS =
		"\1\71\2\145\1\uffff\1\145\1\uffff\2\145";
	static final String DFA9_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\2\uffff";
	static final String DFA9_specialS =
		"\1\uffff\1\3\1\1\1\uffff\1\2\1\uffff\1\4\1\0}>";
	static final String[] DFA9_transitionS = {
			"\1\1\11\2",
			"\1\4\26\uffff\1\5\37\uffff\1\5",
			"\1\4\1\uffff\12\6\13\uffff\1\5\37\uffff\1\5",
			"",
			"\12\7\13\uffff\1\5\37\uffff\1\5",
			"",
			"\1\4\1\uffff\12\6\13\uffff\1\5\37\uffff\1\5",
			"\12\7\13\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "55:1: FLOATCONST : ( ( NUMBER ( '.' ( DIGIT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? NUMBER )? )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_7 = input.LA(1);
						 
						int index9_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_7=='E'||LA9_7=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA9_7 >= '0' && LA9_7 <= '9')) ) {s = 7;}
						else s = 3;
						 
						input.seek(index9_7);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA9_2 = input.LA(1);
						 
						int index9_2 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_2 >= '0' && LA9_2 <= '9')) ) {s = 6;}
						else if ( (LA9_2=='.') ) {s = 4;}
						else if ( (LA9_2=='E'||LA9_2=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index9_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA9_4 = input.LA(1);
						 
						int index9_4 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA9_4 >= '0' && LA9_4 <= '9')) ) {s = 7;}
						else if ( (LA9_4=='E'||LA9_4=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index9_4);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA9_1 = input.LA(1);
						 
						int index9_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_1=='.') ) {s = 4;}
						else if ( (LA9_1=='E'||LA9_1=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index9_1);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA9_6 = input.LA(1);
						 
						int index9_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA9_6=='.') ) {s = 4;}
						else if ( (LA9_6=='E'||LA9_6=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA9_6 >= '0' && LA9_6 <= '9')) ) {s = 6;}
						else s = 3;
						 
						input.seek(index9_6);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA15_eotS =
		"\10\uffff\1\45\4\uffff\12\53\2\71\1\34\20\uffff\1\53\1\uffff\4\53\1\103"+
		"\1\104\7\53\2\uffff\1\71\2\uffff\2\53\1\117\1\53\1\121\2\uffff\1\122\10"+
		"\53\1\134\1\uffff\1\53\2\uffff\3\53\1\141\2\53\1\144\1\53\1\146\1\uffff"+
		"\1\147\1\53\1\151\1\53\1\uffff\2\53\1\uffff\1\155\2\uffff\1\53\1\uffff"+
		"\2\53\1\161\1\uffff\1\162\1\163\1\164\4\uffff";
	static final String DFA15_eofS =
		"\165\uffff";
	static final String DFA15_minS =
		"\1\0\7\uffff\1\75\4\uffff\1\145\2\154\1\144\1\165\1\162\1\145\1\164\2"+
		"\150\2\56\1\40\20\uffff\1\147\1\uffff\1\163\1\144\1\157\1\162\2\60\1\164"+
		"\1\155\1\151\1\141\1\162\1\145\1\151\2\uffff\1\56\2\uffff\1\151\1\145"+
		"\1\60\1\141\1\60\2\uffff\1\60\1\105\1\156\1\147\1\144\1\105\1\156\1\154"+
		"\1\156\1\60\1\uffff\1\164\2\uffff\1\170\1\164\1\162\1\60\1\170\1\156\1"+
		"\60\1\145\1\60\1\uffff\1\60\1\160\1\60\1\141\1\uffff\1\160\1\147\1\uffff"+
		"\1\60\2\uffff\1\162\1\uffff\1\155\1\162\1\60\1\uffff\3\60\4\uffff";
	static final String DFA15_maxS =
		"\1\uffff\7\uffff\1\75\4\uffff\1\145\1\156\1\157\1\156\1\165\1\162\1\145"+
		"\1\164\2\150\2\145\1\172\20\uffff\1\147\1\uffff\1\163\1\144\1\157\1\162"+
		"\2\172\1\164\1\155\1\157\1\141\1\162\1\145\1\151\2\uffff\1\145\2\uffff"+
		"\1\151\1\145\1\172\1\141\1\172\2\uffff\1\172\1\105\1\156\1\147\1\144\1"+
		"\151\1\156\1\154\1\156\1\172\1\uffff\1\164\2\uffff\1\170\1\164\1\162\1"+
		"\172\1\170\1\156\1\172\1\145\1\172\1\uffff\1\172\1\160\1\172\1\141\1\uffff"+
		"\1\160\1\147\1\uffff\1\172\2\uffff\1\162\1\uffff\1\155\1\162\1\172\1\uffff"+
		"\3\172\4\uffff";
	static final String DFA15_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15\15\uffff"+
		"\1\41\1\42\1\43\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\10\1\12\1\13\1\14\1"+
		"\15\1\uffff\1\41\15\uffff\1\36\1\37\1\uffff\1\40\1\42\5\uffff\1\23\1\24"+
		"\12\uffff\1\20\1\uffff\1\22\1\25\11\uffff\1\17\4\uffff\1\31\2\uffff\1"+
		"\34\1\uffff\1\16\1\21\1\uffff\1\27\3\uffff\1\35\3\uffff\1\33\1\26\1\30"+
		"\1\32";
	static final String DFA15_specialS =
		"\1\0\164\uffff}>";
	static final String[] DFA15_transitionS = {
			"\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\31\5\34\1\1\1\2\1\3\1\4\1\34"+
			"\1\5\1\6\1\7\1\27\11\30\1\10\1\11\1\12\1\13\1\14\2\34\32\32\6\34\1\32"+
			"\1\15\2\32\1\16\1\17\2\32\1\20\4\32\1\21\1\32\1\22\1\32\1\23\1\24\1\25"+
			"\2\32\1\26\3\32\uff85\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\54\1\uffff\1\55",
			"\1\56\2\uffff\1\57",
			"\1\60\1\uffff\1\61\7\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\72\26\uffff\1\72\37\uffff\1\72",
			"\1\72\1\uffff\12\73\13\uffff\1\72\37\uffff\1\72",
			"\1\74\1\uffff\1\74\13\uffff\1\74\1\uffff\13\74\6\uffff\32\74\1\uffff"+
			"\1\74\4\uffff\32\74",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\105",
			"\1\106",
			"\1\107\5\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"",
			"\1\72\1\uffff\12\73\13\uffff\1\72\37\uffff\1\72",
			"",
			"",
			"\1\115",
			"\1\116",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\120",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127\43\uffff\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\1\135",
			"",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\142",
			"\1\143",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\145",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\150",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\152",
			"",
			"\1\153",
			"\1\154",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | INTCONST | FLOATCONST | STRINGCONST | ID | WS | INVALID );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA15_0 = input.LA(1);
						s = -1;
						if ( (LA15_0=='(') ) {s = 1;}
						else if ( (LA15_0==')') ) {s = 2;}
						else if ( (LA15_0=='*') ) {s = 3;}
						else if ( (LA15_0=='+') ) {s = 4;}
						else if ( (LA15_0=='-') ) {s = 5;}
						else if ( (LA15_0=='.') ) {s = 6;}
						else if ( (LA15_0=='/') ) {s = 7;}
						else if ( (LA15_0==':') ) {s = 8;}
						else if ( (LA15_0==';') ) {s = 9;}
						else if ( (LA15_0=='<') ) {s = 10;}
						else if ( (LA15_0=='=') ) {s = 11;}
						else if ( (LA15_0=='>') ) {s = 12;}
						else if ( (LA15_0=='b') ) {s = 13;}
						else if ( (LA15_0=='e') ) {s = 14;}
						else if ( (LA15_0=='f') ) {s = 15;}
						else if ( (LA15_0=='i') ) {s = 16;}
						else if ( (LA15_0=='n') ) {s = 17;}
						else if ( (LA15_0=='p') ) {s = 18;}
						else if ( (LA15_0=='r') ) {s = 19;}
						else if ( (LA15_0=='s') ) {s = 20;}
						else if ( (LA15_0=='t') ) {s = 21;}
						else if ( (LA15_0=='w') ) {s = 22;}
						else if ( (LA15_0=='0') ) {s = 23;}
						else if ( ((LA15_0 >= '1' && LA15_0 <= '9')) ) {s = 24;}
						else if ( (LA15_0=='\"') ) {s = 25;}
						else if ( ((LA15_0 >= 'A' && LA15_0 <= 'Z')||LA15_0=='a'||(LA15_0 >= 'c' && LA15_0 <= 'd')||(LA15_0 >= 'g' && LA15_0 <= 'h')||(LA15_0 >= 'j' && LA15_0 <= 'm')||LA15_0=='o'||LA15_0=='q'||(LA15_0 >= 'u' && LA15_0 <= 'v')||(LA15_0 >= 'x' && LA15_0 <= 'z')) ) {s = 26;}
						else if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 27;}
						else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\b')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\u001F')||LA15_0=='!'||(LA15_0 >= '#' && LA15_0 <= '\'')||LA15_0==','||(LA15_0 >= '?' && LA15_0 <= '@')||(LA15_0 >= '[' && LA15_0 <= '`')||(LA15_0 >= '{' && LA15_0 <= '\uFFFF')) ) {s = 28;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 15, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
