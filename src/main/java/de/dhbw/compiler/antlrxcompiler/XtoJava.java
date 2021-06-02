// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g 2021-06-02 12:42:32

    package de.dhbw.compiler.antlrxcompiler;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class XtoJava extends TreeParser {
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


	public XtoJava(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public XtoJava(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("XtoJavaTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return XtoJava.tokenNames; }
	@Override public String getGrammarFileName() { return "de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g"; }



	  private SymbolTable  symbols = SymbolTable.getInstance();

	  public StringTemplate printCode() {
	    return new StringTemplate();
	  }

	  public StringTemplate readCode() {
	      return new StringTemplate();
	    }



	public static class decl_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:1: decl : ^( DECL ID 'int' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static int <id>=0;\";
	public final XtoJava.decl_return decl() throws RecognitionException {
		XtoJava.decl_return retval = new XtoJava.decl_return();
		retval.start = input.LT(1);

		XTree ID1=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:5: ( ^( DECL ID 'int' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static int <id>=0;\")
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:7: ^( DECL ID 'int' ( 'read' )? ( 'print' )? )
			{
			match(input,DECL,FOLLOW_DECL_in_decl65); 
			match(input, Token.DOWN, null); 
			ID1=(XTree)match(input,ID,FOLLOW_ID_in_decl67); 
			match(input,39,FOLLOW_39_in_decl69); 
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:23: ( 'read' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==42) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:23: 'read'
					{
					match(input,42,FOLLOW_42_in_decl71); 
					}
					break;

			}

			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:31: ( 'print' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==40) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:28:31: 'print'
					{
					match(input,40,FOLLOW_40_in_decl74); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 28:41: -> template(id=$ID.text) \"private static int <id>=0;\"
			{
				retval.st = new StringTemplate(templateLib, "private static int <id>=0;",new STAttrMap().put("id", (ID1!=null?ID1.getText():null)));
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
	// $ANTLR end "decl"


	public static class decllist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decllist"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:30:1: decllist : ^( DECLLIST ( decl )* ) -> template(decl=$decl.st) <<\r\n<decl; separator=\"\\n\">\r\n>>;
	public final XtoJava.decllist_return decllist() throws RecognitionException {
		XtoJava.decllist_return retval = new XtoJava.decllist_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope decl2 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:30:9: ( ^( DECLLIST ( decl )* ) -> template(decl=$decl.st) <<\r\n<decl; separator=\"\\n\">\r\n>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:30:16: ^( DECLLIST ( decl )* )
			{
			match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist100); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:30:27: ( decl )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==DECL) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:30:27: decl
						{
						pushFollow(FOLLOW_decl_in_decllist102);
						decl2=decl();
						state._fsp--;

						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 30:34: -> template(decl=$decl.st) <<\r\n<decl; separator=\"\\n\">\r\n>>
			{
				retval.st = new StringTemplate(templateLib, "\r\n<decl; separator=\"\\n\">\r\n",new STAttrMap().put("decl", (decl2!=null?((StringTemplate)decl2.getTemplate()):null)));
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
	// $ANTLR end "decllist"


	public static class statlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:35:1: statlist : ^( STATLIST ( . )* ) -> template( <<\r\nstatlist\r\n>>;
	public final XtoJava.statlist_return statlist() throws RecognitionException {
		XtoJava.statlist_return retval = new XtoJava.statlist_return();
		retval.start = input.LT(1);

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:35:9: ( ^( STATLIST ( . )* ) -> template( <<\r\nstatlist\r\n>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:35:16: ^( STATLIST ( . )* )
			{
			match(input,STATLIST,FOLLOW_STATLIST_in_statlist128); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:35:27: ( . )*
				loop4:
				while (true) {
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= COMMENT && LA4_0 <= 45)) ) {
						alt4=1;
					}
					else if ( (LA4_0==UP) ) {
						alt4=2;
					}

					switch (alt4) {
					case 1 :
						// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:35:27: .
						{
						matchAny(input); 
						}
						break;

					default :
						break loop4;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 35:31: -> template( <<\r\nstatlist\r\n>>
			{
				retval.st = new StringTemplate(templateLib, "\r\nstatlist\r\n");
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
	// $ANTLR end "statlist"


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:46:1: program : ^( 'program' ID decllist statlist ) -> template(id=$ID.textdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n <statlist>\r\n <print>\r\n }\r\n}\r\n>>;
	public final XtoJava.program_return program() throws RecognitionException {
		XtoJava.program_return retval = new XtoJava.program_return();
		retval.start = input.LT(1);

		XTree ID3=null;
		TreeRuleReturnScope decllist4 =null;
		TreeRuleReturnScope statlist5 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:46:8: ( ^( 'program' ID decllist statlist ) -> template(id=$ID.textdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n <statlist>\r\n <print>\r\n }\r\n}\r\n>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:46:15: ^( 'program' ID decllist statlist )
			{
			match(input,41,FOLLOW_41_in_program159); 
			match(input, Token.DOWN, null); 
			ID3=(XTree)match(input,ID,FOLLOW_ID_in_program161); 
			pushFollow(FOLLOW_decllist_in_program163);
			decllist4=decllist();
			state._fsp--;

			pushFollow(FOLLOW_statlist_in_program165);
			statlist5=statlist();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 46:49: -> template(id=$ID.textdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n <statlist>\r\n <print>\r\n }\r\n}\r\n>>
			{
				retval.st = new StringTemplate(templateLib, "\r\npublic class <id> {\r\n    <decllist>\r\n    public static void main(String[] args) {\r\n        <read>\r\n        <statlist>\r\n        <print>\r\n    }\r\n}\r\n",new STAttrMap().put("id", (ID3!=null?ID3.getText():null)).put("decllist", (decllist4!=null?((StringTemplate)decllist4.getTemplate()):null)).put("statlist", (statlist5!=null?((StringTemplate)statlist5.getTemplate()):null)).put("read", readCode()).put("print", printCode()));
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
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_DECL_in_decl65 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl67 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_decl69 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl71 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl74 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist102 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_STATLIST_in_statlist128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_41_in_program159 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program161 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program163 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program165 = new BitSet(new long[]{0x0000000000000008L});
}
