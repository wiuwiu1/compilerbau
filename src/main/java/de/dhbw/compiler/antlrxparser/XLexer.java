// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxparser\\X.g 2021-05-17 15:59:54
package de.dhbw.compiler.antlrxparser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:9:7: ( '(' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:10:7: ( ')' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:11:7: ( ':=' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:11:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:12:7: ( ';' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:12:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:13:7: ( 'begin' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:13:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:14:7: ( 'cond' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:14:9: 'cond'
			{
			match("cond"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:15:7: ( 'else' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:15:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:16:7: ( 'end' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:16:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:17:7: ( 'for' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:17:9: 'for'
			{
			match("for"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:18:7: ( 'id' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:18:9: 'id'
			{
			match("id"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:19:7: ( 'if' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:19:9: 'if'
			{
			match("if"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:20:7: ( 'numExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:20:9: 'numExpr'
			{
			match("numExpr"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:21:7: ( 'program' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:21:9: 'program'
			{
			match("program"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:22:7: ( 'strExpr' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:22:9: 'strExpr'
			{
			match("strExpr"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:23:7: ( 'then' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:23:9: 'then'
			{
			match("then"); 

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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:24:7: ( 'while' )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:24:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// de\\dhbw\\compiler\\antlrxparser\\X.g:45:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxparser\\X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			 skip(); 
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
			// de\\dhbw\\compiler\\antlrxparser\\X.g:47:8: ( . )
			// de\\dhbw\\compiler\\antlrxparser\\X.g:47:11: .
			{
			matchAny(); 
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
		// de\\dhbw\\compiler\\antlrxparser\\X.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | WS | INVALID )
		int alt2=18;
		int LA2_0 = input.LA(1);
		if ( (LA2_0=='(') ) {
			alt2=1;
		}
		else if ( (LA2_0==')') ) {
			alt2=2;
		}
		else if ( (LA2_0==':') ) {
			int LA2_3 = input.LA(2);
			if ( (LA2_3=='=') ) {
				alt2=3;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0==';') ) {
			alt2=4;
		}
		else if ( (LA2_0=='b') ) {
			int LA2_5 = input.LA(2);
			if ( (LA2_5=='e') ) {
				alt2=5;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='c') ) {
			int LA2_6 = input.LA(2);
			if ( (LA2_6=='o') ) {
				alt2=6;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='e') ) {
			switch ( input.LA(2) ) {
			case 'l':
				{
				alt2=7;
				}
				break;
			case 'n':
				{
				alt2=8;
				}
				break;
			default:
				alt2=18;
			}
		}
		else if ( (LA2_0=='f') ) {
			int LA2_8 = input.LA(2);
			if ( (LA2_8=='o') ) {
				alt2=9;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='i') ) {
			switch ( input.LA(2) ) {
			case 'd':
				{
				alt2=10;
				}
				break;
			case 'f':
				{
				alt2=11;
				}
				break;
			default:
				alt2=18;
			}
		}
		else if ( (LA2_0=='n') ) {
			int LA2_10 = input.LA(2);
			if ( (LA2_10=='u') ) {
				alt2=12;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='p') ) {
			int LA2_11 = input.LA(2);
			if ( (LA2_11=='r') ) {
				alt2=13;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='s') ) {
			int LA2_12 = input.LA(2);
			if ( (LA2_12=='t') ) {
				alt2=14;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='t') ) {
			int LA2_13 = input.LA(2);
			if ( (LA2_13=='h') ) {
				alt2=15;
			}

			else {
				alt2=18;
			}

		}
		else if ( (LA2_0=='w') ) {
			int LA2_14 = input.LA(2);
			if ( (LA2_14=='h') ) {
				alt2=16;
			}

			else {
				alt2=18;
			}

		}
		else if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
			alt2=17;
		}
		else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\b')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\u001F')||(LA2_0 >= '!' && LA2_0 <= '\'')||(LA2_0 >= '*' && LA2_0 <= '9')||(LA2_0 >= '<' && LA2_0 <= 'a')||LA2_0=='d'||(LA2_0 >= 'g' && LA2_0 <= 'h')||(LA2_0 >= 'j' && LA2_0 <= 'm')||LA2_0=='o'||(LA2_0 >= 'q' && LA2_0 <= 'r')||(LA2_0 >= 'u' && LA2_0 <= 'v')||(LA2_0 >= 'x' && LA2_0 <= '\uFFFF')) ) {
			alt2=18;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}

		switch (alt2) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:106: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// de\\dhbw\\compiler\\antlrxparser\\X.g:1:109: INVALID
				{
				mINVALID(); 

				}
				break;

		}
	}



}
