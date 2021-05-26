// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\X.g 2021-05-26 15:58:24
package de.dhbw.compiler.antlrxcompiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class XLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxcompiler\\X.g"; }

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:9:7: ( '(' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:9:9: '('
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:10:7: ( ')' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:10:9: ')'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:11:7: ( '*' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:11:9: '*'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:12:7: ( '+' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:12:9: '+'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:13:7: ( '-' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:13:9: '-'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:14:7: ( '.' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:14:9: '.'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:15:7: ( '/' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:15:9: '/'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:16:7: ( ':' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:16:9: ':'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:17:7: ( ':=' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:17:9: ':='
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:18:7: ( ';' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:18:9: ';'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:19:7: ( '<' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:19:9: '<'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:20:7: ( '=' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:20:9: '='
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:21:7: ( '>' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:21:9: '>'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:22:7: ( 'begin' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:22:9: 'begin'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:23:7: ( 'else' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:23:9: 'else'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:24:7: ( 'end' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:24:9: 'end'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:25:7: ( 'float' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:25:9: 'float'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:26:7: ( 'for' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:26:9: 'for'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:27:7: ( 'if' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:27:9: 'if'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:28:7: ( 'int' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:28:9: 'int'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:29:7: ( 'print' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:29:9: 'print'
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:30:7: ( 'program' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:30:9: 'program'
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:31:7: ( 'read' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:31:9: 'read'
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:32:7: ( 'string' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:32:9: 'string'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:7: ( 'then' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:9: 'then'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:34:7: ( 'while' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:34:9: 'while'
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
	// $ANTLR end "T__45"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:32:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+ )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:32:9: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
			{
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:32:9: ( '\\t' | ' ' | '\\r' | '\\n' | '\\f' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:8: ( '/*' ( . )* '*/' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:10: '/*' ( . )* '*/'
			{
			match("/*"); if (state.failed) return;

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:15: ( . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='*') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='/') ) {
						alt2=2;
					}
					else if ( ((LA2_1 >= '\u0000' && LA2_1 <= '.')||(LA2_1 >= '0' && LA2_1 <= '\uFFFF')) ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ')')||(LA2_0 >= '+' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:33:15: .
					{
					matchAny(); if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			match("*/"); if (state.failed) return;

			if ( state.backtracking==0 ) { skip(); }
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:36:16: ( 'a' .. 'z' | 'A' .. 'Z' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "POSDIGIT"
	public final void mPOSDIGIT() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:37:18: ( '1' .. '9' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POSDIGIT"

	// $ANTLR start "ZERO"
	public final void mZERO() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:38:14: ( '0' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:38:20: '0'
			{
			match('0'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ZERO"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:39:15: ( '0' .. '9' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "OTHER"
	public final void mOTHER() throws RecognitionException {
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:40:15: ( ' ' | '.' | ':' | '\\\\\"' )
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
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:40:20: ' '
					{
					match(' '); if (state.failed) return;
					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:40:26: '.'
					{
					match('.'); if (state.failed) return;
					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:40:32: ':'
					{
					match(':'); if (state.failed) return;
					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:40:38: '\\\\\"'
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:9: ( ZERO | ( POSDIGIT ( DIGIT )* ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:11: ZERO
					{
					mZERO(); if (state.failed) return;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:18: ( POSDIGIT ( DIGIT )* )
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:18: ( POSDIGIT ( DIGIT )* )
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:19: POSDIGIT ( DIGIT )*
					{
					mPOSDIGIT(); if (state.failed) return;

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:43:28: ( DIGIT )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
							break loop4;
						}
					}

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
	// $ANTLR end "INTCONST"

	// $ANTLR start "FLOATCONST"
	public final void mFLOATCONST() throws RecognitionException {
		try {
			int _type = FLOATCONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:11: ( ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? )
			int alt11=2;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:16: ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
					{
					mINTCONST(); if (state.failed) return;

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:84: ( '.' ( DIGIT )* )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='.') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:85: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:89: ( DIGIT )*
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
									break loop6;
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
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:107: ( '+' | '-' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='+'||LA8_0=='-') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:46:16: INTCONST ( '.' ( DIGIT )* )?
					{
					mINTCONST(); if (state.failed) return;

					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:46:25: ( '.' ( DIGIT )* )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='.') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:46:26: '.' ( DIGIT )*
							{
							match('.'); if (state.failed) return;
							// de\\dhbw\\compiler\\antlrxcompiler\\X.g:46:30: ( DIGIT )*
							loop9:
							while (true) {
								int alt9=2;
								int LA9_0 = input.LA(1);
								if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
									alt9=1;
								}

								switch (alt9) {
								case 1 :
									// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
									break loop9;
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:12: ( '\\\"' ( LETTER | DIGIT | OTHER )* '\\\"' )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:16: '\\\"' ( LETTER | DIGIT | OTHER )* '\\\"'
			{
			match('\"'); if (state.failed) return;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:21: ( LETTER | DIGIT | OTHER )*
			loop12:
			while (true) {
				int alt12=4;
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
					alt12=1;
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
					alt12=2;
					}
					break;
				case ' ':
				case '.':
				case ':':
				case '\\':
					{
					alt12=3;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:22: LETTER
					{
					mLETTER(); if (state.failed) return;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:29: DIGIT
					{
					mDIGIT(); if (state.failed) return;

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:48:35: OTHER
					{
					mOTHER(); if (state.failed) return;

					}
					break;

				default :
					break loop12;
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
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:50:3: ( LETTER ( LETTER | DIGIT )* )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:50:11: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); if (state.failed) return;

			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:50:18: ( LETTER | DIGIT )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop13;
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

	// $ANTLR start "INVALID"
	public final void mINVALID() throws RecognitionException {
		try {
			int _type = INVALID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:52:8: ( . )
			// de\\dhbw\\compiler\\antlrxcompiler\\X.g:52:11: .
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
		// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | WS | COMMENT | INTCONST | FLOATCONST | STRINGCONST | ID | INVALID )
		int alt14=33;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:10: T__20
				{
				mT__20(); if (state.failed) return;

				}
				break;
			case 2 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:16: T__21
				{
				mT__21(); if (state.failed) return;

				}
				break;
			case 3 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:22: T__22
				{
				mT__22(); if (state.failed) return;

				}
				break;
			case 4 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:28: T__23
				{
				mT__23(); if (state.failed) return;

				}
				break;
			case 5 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:34: T__24
				{
				mT__24(); if (state.failed) return;

				}
				break;
			case 6 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:40: T__25
				{
				mT__25(); if (state.failed) return;

				}
				break;
			case 7 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:46: T__26
				{
				mT__26(); if (state.failed) return;

				}
				break;
			case 8 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:52: T__27
				{
				mT__27(); if (state.failed) return;

				}
				break;
			case 9 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:58: T__28
				{
				mT__28(); if (state.failed) return;

				}
				break;
			case 10 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:64: T__29
				{
				mT__29(); if (state.failed) return;

				}
				break;
			case 11 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:70: T__30
				{
				mT__30(); if (state.failed) return;

				}
				break;
			case 12 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:76: T__31
				{
				mT__31(); if (state.failed) return;

				}
				break;
			case 13 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:82: T__32
				{
				mT__32(); if (state.failed) return;

				}
				break;
			case 14 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:88: T__33
				{
				mT__33(); if (state.failed) return;

				}
				break;
			case 15 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:94: T__34
				{
				mT__34(); if (state.failed) return;

				}
				break;
			case 16 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:100: T__35
				{
				mT__35(); if (state.failed) return;

				}
				break;
			case 17 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:106: T__36
				{
				mT__36(); if (state.failed) return;

				}
				break;
			case 18 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:112: T__37
				{
				mT__37(); if (state.failed) return;

				}
				break;
			case 19 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:118: T__38
				{
				mT__38(); if (state.failed) return;

				}
				break;
			case 20 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:124: T__39
				{
				mT__39(); if (state.failed) return;

				}
				break;
			case 21 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:130: T__40
				{
				mT__40(); if (state.failed) return;

				}
				break;
			case 22 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:136: T__41
				{
				mT__41(); if (state.failed) return;

				}
				break;
			case 23 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:142: T__42
				{
				mT__42(); if (state.failed) return;

				}
				break;
			case 24 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:148: T__43
				{
				mT__43(); if (state.failed) return;

				}
				break;
			case 25 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:154: T__44
				{
				mT__44(); if (state.failed) return;

				}
				break;
			case 26 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:160: T__45
				{
				mT__45(); if (state.failed) return;

				}
				break;
			case 27 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:166: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 28 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:169: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;
			case 29 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:177: INTCONST
				{
				mINTCONST(); if (state.failed) return;

				}
				break;
			case 30 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:186: FLOATCONST
				{
				mFLOATCONST(); if (state.failed) return;

				}
				break;
			case 31 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:197: STRINGCONST
				{
				mSTRINGCONST(); if (state.failed) return;

				}
				break;
			case 32 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:209: ID
				{
				mID(); if (state.failed) return;

				}
				break;
			case 33 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:1:212: INVALID
				{
				mINVALID(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_X
	public final void synpred1_X_fragment() throws RecognitionException {
		// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:16: ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )
		// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:17: INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST
		{
		mINTCONST(); if (state.failed) return;

		// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:26: ( '.' ( DIGIT )* )?
		int alt16=2;
		int LA16_0 = input.LA(1);
		if ( (LA16_0=='.') ) {
			alt16=1;
		}
		switch (alt16) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:27: '.' ( DIGIT )*
				{
				match('.'); if (state.failed) return;
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:31: ( DIGIT )*
				loop15:
				while (true) {
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
						alt15=1;
					}

					switch (alt15) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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
						break loop15;
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
		// de\\dhbw\\compiler\\antlrxcompiler\\X.g:45:49: ( '+' | '-' )?
		int alt17=2;
		int LA17_0 = input.LA(1);
		if ( (LA17_0=='+'||LA17_0=='-') ) {
			alt17=1;
		}
		switch (alt17) {
			case 1 :
				// de\\dhbw\\compiler\\antlrxcompiler\\X.g:
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


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA11_eotS =
		"\1\uffff\2\3\1\uffff\1\3\1\uffff\2\3";
	static final String DFA11_eofS =
		"\10\uffff";
	static final String DFA11_minS =
		"\1\60\2\56\1\uffff\1\60\1\uffff\1\56\1\60";
	static final String DFA11_maxS =
		"\1\71\2\145\1\uffff\1\145\1\uffff\2\145";
	static final String DFA11_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\2\uffff";
	static final String DFA11_specialS =
		"\1\uffff\1\4\1\2\1\uffff\1\0\1\uffff\1\1\1\3}>";
	static final String[] DFA11_transitionS = {
			"\1\1\11\2",
			"\1\4\26\uffff\1\5\37\uffff\1\5",
			"\1\4\1\uffff\12\6\13\uffff\1\5\37\uffff\1\5",
			"",
			"\12\7\13\uffff\1\5\37\uffff\1\5",
			"",
			"\1\4\1\uffff\12\6\13\uffff\1\5\37\uffff\1\5",
			"\12\7\13\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "45:1: FLOATCONST : ( ( INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST )=> INTCONST ( '.' ( DIGIT )* )? ( 'e' | 'E' ) ( '+' | '-' )? INTCONST | INTCONST ( '.' ( DIGIT )* )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_4 = input.LA(1);
						 
						int index11_4 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA11_4 >= '0' && LA11_4 <= '9')) ) {s = 7;}
						else if ( (LA11_4=='E'||LA11_4=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index11_4);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA11_6 = input.LA(1);
						 
						int index11_6 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_6=='.') ) {s = 4;}
						else if ( (LA11_6=='E'||LA11_6=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA11_6 >= '0' && LA11_6 <= '9')) ) {s = 6;}
						else s = 3;
						 
						input.seek(index11_6);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA11_2 = input.LA(1);
						 
						int index11_2 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA11_2 >= '0' && LA11_2 <= '9')) ) {s = 6;}
						else if ( (LA11_2=='.') ) {s = 4;}
						else if ( (LA11_2=='E'||LA11_2=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index11_2);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA11_7 = input.LA(1);
						 
						int index11_7 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_7=='E'||LA11_7=='e') && (synpred1_X())) {s = 5;}
						else if ( ((LA11_7 >= '0' && LA11_7 <= '9')) ) {s = 7;}
						else s = 3;
						 
						input.seek(index11_7);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA11_1 = input.LA(1);
						 
						int index11_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA11_1=='.') ) {s = 4;}
						else if ( (LA11_1=='E'||LA11_1=='e') && (synpred1_X())) {s = 5;}
						else s = 3;
						 
						input.seek(index11_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA14_eotS =
		"\7\uffff\1\43\1\45\4\uffff\11\53\1\uffff\2\70\1\33\20\uffff\1\53\1\uffff"+
		"\4\53\1\101\6\53\3\uffff\1\70\1\uffff\2\53\1\113\1\53\1\115\1\uffff\1"+
		"\116\7\53\1\126\1\uffff\1\53\2\uffff\2\53\1\132\1\53\1\134\1\53\1\136"+
		"\1\uffff\1\137\1\140\1\53\1\uffff\1\53\1\uffff\1\143\3\uffff\1\53\1\145"+
		"\1\uffff\1\146\2\uffff";
	static final String DFA14_eofS =
		"\147\uffff";
	static final String DFA14_minS =
		"\1\0\6\uffff\1\52\1\75\4\uffff\1\145\2\154\1\146\1\162\1\145\1\164\2\150"+
		"\1\uffff\2\56\1\40\20\uffff\1\147\1\uffff\1\163\1\144\1\157\1\162\1\60"+
		"\1\164\1\151\1\141\1\162\1\145\1\151\3\uffff\1\56\1\uffff\1\151\1\145"+
		"\1\60\1\141\1\60\1\uffff\1\60\1\156\1\147\1\144\1\151\1\156\1\154\1\156"+
		"\1\60\1\uffff\1\164\2\uffff\1\164\1\162\1\60\1\156\1\60\1\145\1\60\1\uffff"+
		"\2\60\1\141\1\uffff\1\147\1\uffff\1\60\3\uffff\1\155\1\60\1\uffff\1\60"+
		"\2\uffff";
	static final String DFA14_maxS =
		"\1\uffff\6\uffff\1\52\1\75\4\uffff\1\145\1\156\1\157\1\156\1\162\1\145"+
		"\1\164\2\150\1\uffff\2\145\1\172\20\uffff\1\147\1\uffff\1\163\1\144\1"+
		"\157\1\162\1\172\1\164\1\157\1\141\1\162\1\145\1\151\3\uffff\1\145\1\uffff"+
		"\1\151\1\145\1\172\1\141\1\172\1\uffff\1\172\1\156\1\147\1\144\1\151\1"+
		"\156\1\154\1\156\1\172\1\uffff\1\164\2\uffff\1\164\1\162\1\172\1\156\1"+
		"\172\1\145\1\172\1\uffff\2\172\1\141\1\uffff\1\147\1\uffff\1\172\3\uffff"+
		"\1\155\1\172\1\uffff\1\172\2\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\12\1\13\1\14\1\15\11\uffff"+
		"\1\33\3\uffff\1\40\1\41\1\1\1\2\1\3\1\4\1\5\1\6\1\34\1\7\1\11\1\10\1\12"+
		"\1\13\1\14\1\15\1\uffff\1\40\13\uffff\1\33\1\35\1\36\1\uffff\1\37\5\uffff"+
		"\1\23\11\uffff\1\20\1\uffff\1\22\1\24\7\uffff\1\17\3\uffff\1\27\1\uffff"+
		"\1\31\1\uffff\1\16\1\21\1\25\2\uffff\1\32\1\uffff\1\30\1\26";
	static final String DFA14_specialS =
		"\1\0\146\uffff}>";
	static final String[] DFA14_transitionS = {
			"\11\33\2\26\1\33\2\26\22\33\1\26\1\33\1\31\5\33\1\1\1\2\1\3\1\4\1\33"+
			"\1\5\1\6\1\7\1\27\11\30\1\10\1\11\1\12\1\13\1\14\2\33\32\32\6\33\1\32"+
			"\1\15\2\32\1\16\1\17\2\32\1\20\6\32\1\21\1\32\1\22\1\23\1\24\2\32\1\25"+
			"\3\32\uff85\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42",
			"\1\44",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\54\1\uffff\1\55",
			"\1\56\2\uffff\1\57",
			"\1\60\7\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"\1\71\26\uffff\1\71\37\uffff\1\71",
			"\1\71\1\uffff\12\72\13\uffff\1\71\37\uffff\1\71",
			"\1\73\1\uffff\1\73\13\uffff\1\73\1\uffff\13\73\6\uffff\32\73\1\uffff"+
			"\1\73\4\uffff\32\73",
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
			"\1\74",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\102",
			"\1\103\5\uffff\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"",
			"",
			"\1\71\1\uffff\12\72\13\uffff\1\71\37\uffff\1\71",
			"",
			"\1\111",
			"\1\112",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\114",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\1\127",
			"",
			"",
			"\1\130",
			"\1\131",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\133",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\135",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"\1\141",
			"",
			"\1\142",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"",
			"",
			"\1\144",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			"\12\53\7\uffff\32\53\6\uffff\32\53",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | WS | COMMENT | INTCONST | FLOATCONST | STRINGCONST | ID | INVALID );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_0 = input.LA(1);
						s = -1;
						if ( (LA14_0=='(') ) {s = 1;}
						else if ( (LA14_0==')') ) {s = 2;}
						else if ( (LA14_0=='*') ) {s = 3;}
						else if ( (LA14_0=='+') ) {s = 4;}
						else if ( (LA14_0=='-') ) {s = 5;}
						else if ( (LA14_0=='.') ) {s = 6;}
						else if ( (LA14_0=='/') ) {s = 7;}
						else if ( (LA14_0==':') ) {s = 8;}
						else if ( (LA14_0==';') ) {s = 9;}
						else if ( (LA14_0=='<') ) {s = 10;}
						else if ( (LA14_0=='=') ) {s = 11;}
						else if ( (LA14_0=='>') ) {s = 12;}
						else if ( (LA14_0=='b') ) {s = 13;}
						else if ( (LA14_0=='e') ) {s = 14;}
						else if ( (LA14_0=='f') ) {s = 15;}
						else if ( (LA14_0=='i') ) {s = 16;}
						else if ( (LA14_0=='p') ) {s = 17;}
						else if ( (LA14_0=='r') ) {s = 18;}
						else if ( (LA14_0=='s') ) {s = 19;}
						else if ( (LA14_0=='t') ) {s = 20;}
						else if ( (LA14_0=='w') ) {s = 21;}
						else if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||(LA14_0 >= '\f' && LA14_0 <= '\r')||LA14_0==' ') ) {s = 22;}
						else if ( (LA14_0=='0') ) {s = 23;}
						else if ( ((LA14_0 >= '1' && LA14_0 <= '9')) ) {s = 24;}
						else if ( (LA14_0=='\"') ) {s = 25;}
						else if ( ((LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='a'||(LA14_0 >= 'c' && LA14_0 <= 'd')||(LA14_0 >= 'g' && LA14_0 <= 'h')||(LA14_0 >= 'j' && LA14_0 <= 'o')||LA14_0=='q'||(LA14_0 >= 'u' && LA14_0 <= 'v')||(LA14_0 >= 'x' && LA14_0 <= 'z')) ) {s = 26;}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\b')||LA14_0=='\u000B'||(LA14_0 >= '\u000E' && LA14_0 <= '\u001F')||LA14_0=='!'||(LA14_0 >= '#' && LA14_0 <= '\'')||LA14_0==','||(LA14_0 >= '?' && LA14_0 <= '@')||(LA14_0 >= '[' && LA14_0 <= '`')||(LA14_0 >= '{' && LA14_0 <= '\uFFFF')) ) {s = 27;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
