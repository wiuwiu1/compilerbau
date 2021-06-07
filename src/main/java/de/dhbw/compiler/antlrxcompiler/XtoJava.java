// $ANTLR 3.5.2 de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g 2021-06-07 16:42:58

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
	   
	  private StringTemplate printCode() {
	    StringBuffer res = new StringBuffer();
	    for(Symbol s : symbols.values()) {
	      if (s.print) { 
	          res.append("  System.out.println(\""+s.name+": \"+"+s.name+");\n");
	      }
	    }
	    return new StringTemplate(res.toString());
	  }
	  
	  private StringTemplate readCode() {
	    StringBuffer res = new StringBuffer();
	    res.append("Scanner _Scanner = new Scanner(System.in);\n");
	    for(Symbol var : symbols.values()) {
	      if (var.read) {
	        res.append("System.out.print(\""+var.name+": \");\n");
	        switch(var.type) {
	          case IntType: res.append(var.name+" = _Scanner.nextInt();\n"); break;
	          case FloatType: res.append(var.name+" = _Scanner.nextDouble();\n"); break;
	          case StringType: res.append(var.name+" = _Scanner.next;\n"); break;
	        }
	      }  
	    }
	    res.append("_Scanner.close();");
	    return new StringTemplate( res.toString());
	  }
	    


	public static class decl_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "decl"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:1: decl : ( ^( DECL ID 'int' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static int <id>=0;\"| ^( DECL ID 'float' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static double <id>=0.0;\"| ^( DECL ID 'string' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static String <id>=\"\";\");
	public final XtoJava.decl_return decl() throws RecognitionException {
		XtoJava.decl_return retval = new XtoJava.decl_return();
		retval.start = input.LT(1);

		XTree ID1=null;
		XTree ID2=null;
		XTree ID3=null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:5: ( ^( DECL ID 'int' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static int <id>=0;\"| ^( DECL ID 'float' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static double <id>=0.0;\"| ^( DECL ID 'string' ( 'read' )? ( 'print' )? ) -> template(id=$ID.text) \"private static String <id>=\"\";\")
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==DECL) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==ID) ) {
						switch ( input.LA(4) ) {
						case 39:
							{
							alt7=1;
							}
							break;
						case 36:
							{
							alt7=2;
							}
							break;
						case 43:
							{
							alt7=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
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
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:7: ^( DECL ID 'int' ( 'read' )? ( 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl68); 
					match(input, Token.DOWN, null); 
					ID1=(XTree)match(input,ID,FOLLOW_ID_in_decl70); 
					match(input,39,FOLLOW_39_in_decl72); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:23: ( 'read' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==42) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:23: 'read'
							{
							match(input,42,FOLLOW_42_in_decl74); 
							}
							break;

					}

					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:31: ( 'print' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==40) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:58:31: 'print'
							{
							match(input,40,FOLLOW_40_in_decl77); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 59:7: -> template(id=$ID.text) \"private static int <id>=0;\"
					{
						retval.st = new StringTemplate(templateLib, "private static int <id>=0;",new STAttrMap().put("id", (ID1!=null?ID1.getText():null)));
					}



					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:60:7: ^( DECL ID 'float' ( 'read' )? ( 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl106); 
					match(input, Token.DOWN, null); 
					ID2=(XTree)match(input,ID,FOLLOW_ID_in_decl108); 
					match(input,36,FOLLOW_36_in_decl110); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:60:25: ( 'read' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==42) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:60:25: 'read'
							{
							match(input,42,FOLLOW_42_in_decl112); 
							}
							break;

					}

					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:60:33: ( 'print' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==40) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:60:33: 'print'
							{
							match(input,40,FOLLOW_40_in_decl115); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 61:7: -> template(id=$ID.text) \"private static double <id>=0.0;\"
					{
						retval.st = new StringTemplate(templateLib, "private static double <id>=0.0;",new STAttrMap().put("id", (ID2!=null?ID2.getText():null)));
					}



					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:62:7: ^( DECL ID 'string' ( 'read' )? ( 'print' )? )
					{
					match(input,DECL,FOLLOW_DECL_in_decl145); 
					match(input, Token.DOWN, null); 
					ID3=(XTree)match(input,ID,FOLLOW_ID_in_decl147); 
					match(input,43,FOLLOW_43_in_decl149); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:62:26: ( 'read' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==42) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:62:26: 'read'
							{
							match(input,42,FOLLOW_42_in_decl151); 
							}
							break;

					}

					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:62:34: ( 'print' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==40) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:62:34: 'print'
							{
							match(input,40,FOLLOW_40_in_decl154); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:7: -> template(id=$ID.text) \"private static String <id>=\"\";\"
					{
						retval.st = new StringTemplate(templateLib, "private static String <id>=\"\";",new STAttrMap().put("id", (ID3!=null?ID3.getText():null)));
					}



					}
					break;

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
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:65:1: decllist : ( ^( DECLLIST (d+= decl )+ ) -> template(decl=$d) << \r\n<decl; separator=\"\\n\">\r\n>>| DECLLIST -> template( \"\");
	public final XtoJava.decllist_return decllist() throws RecognitionException {
		XtoJava.decllist_return retval = new XtoJava.decllist_return();
		retval.start = input.LT(1);

		List<Object> list_d=null;
		RuleReturnScope d = null;
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:65:9: ( ^( DECLLIST (d+= decl )+ ) -> template(decl=$d) << \r\n<decl; separator=\"\\n\">\r\n>>| DECLLIST -> template( \"\")
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DECLLIST) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					alt9=1;
				}
				else if ( (LA9_1==STATLIST) ) {
					alt9=2;
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:65:13: ^( DECLLIST (d+= decl )+ )
					{
					match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist185); 
					match(input, Token.DOWN, null); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:65:24: (d+= decl )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==DECL) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:65:25: d+= decl
							{
							pushFollow(FOLLOW_decl_in_decllist190);
							d=decl();
							state._fsp--;

							if (list_d==null) list_d=new ArrayList<Object>();
							list_d.add(d.getTemplate());
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:37: -> template(decl=$d) << \r\n<decl; separator=\"\\n\">\r\n>>
					{
						retval.st = new StringTemplate(templateLib, " \r\n<decl; separator=\"\\n\">\r\n",new STAttrMap().put("decl", list_d));
					}



					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:69:13: DECLLIST
					{
					match(input,DECLLIST,FOLLOW_DECLLIST_in_decllist219); 
					// TEMPLATE REWRITE
					// 69:22: -> template( \"\"
					{
						retval.st = new StringTemplate(templateLib, "");
					}



					}
					break;

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


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:72:1: expr : ( ^( UMINUS e= expr ) -> template(e=$e.st) \"-(<e>)\"| ^( (op= '+' |op= '-' |op= '/' |op= '*' ) e1= expr e2= expr ) -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"| (x= INTCONST |x= FLOATCONST |x= STRINGCONST |x= ID ) -> template(x=$x.text) \"<x>\");
	public final XtoJava.expr_return expr() throws RecognitionException {
		XtoJava.expr_return retval = new XtoJava.expr_return();
		retval.start = input.LT(1);

		XTree op=null;
		XTree x=null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:72:5: ( ^( UMINUS e= expr ) -> template(e=$e.st) \"-(<e>)\"| ^( (op= '+' |op= '-' |op= '/' |op= '*' ) e1= expr e2= expr ) -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"| (x= INTCONST |x= FLOATCONST |x= STRINGCONST |x= ID ) -> template(x=$x.text) \"<x>\")
			int alt12=3;
			switch ( input.LA(1) ) {
			case UMINUS:
				{
				alt12=1;
				}
				break;
			case 22:
			case 23:
			case 24:
			case 26:
				{
				alt12=2;
				}
				break;
			case FLOATCONST:
			case ID:
			case INTCONST:
			case STRINGCONST:
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
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:72:13: ^( UMINUS e= expr )
					{
					match(input,UMINUS,FOLLOW_UMINUS_in_expr242); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr246);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 72:31: -> template(e=$e.st) \"-(<e>)\"
					{
						retval.st = new StringTemplate(templateLib, "-(<e>)",new STAttrMap().put("e", (e!=null?((StringTemplate)e.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:13: ^( (op= '+' |op= '-' |op= '/' |op= '*' ) e1= expr e2= expr )
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:15: (op= '+' |op= '-' |op= '/' |op= '*' )
					int alt10=4;
					switch ( input.LA(1) ) {
					case 23:
						{
						alt10=1;
						}
						break;
					case 24:
						{
						alt10=2;
						}
						break;
					case 26:
						{
						alt10=3;
						}
						break;
					case 22:
						{
						alt10=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:16: op= '+'
							{
							op=(XTree)match(input,23,FOLLOW_23_in_expr277); 
							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:25: op= '-'
							{
							op=(XTree)match(input,24,FOLLOW_24_in_expr283); 
							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:34: op= '/'
							{
							op=(XTree)match(input,26,FOLLOW_26_in_expr289); 
							}
							break;
						case 4 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:73:43: op= '*'
							{
							op=(XTree)match(input,22,FOLLOW_22_in_expr295); 
							}
							break;

					}

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr300);
					e1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr304);
					e2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 74:17: -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"
					{
						retval.st = new StringTemplate(templateLib, "(<e1><op><e2>)",new STAttrMap().put("op", (op!=null?op.getText():null)).put("e1", (e1!=null?((StringTemplate)e1.getTemplate()):null)).put("e2", (e2!=null?((StringTemplate)e2.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:13: (x= INTCONST |x= FLOATCONST |x= STRINGCONST |x= ID )
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:13: (x= INTCONST |x= FLOATCONST |x= STRINGCONST |x= ID )
					int alt11=4;
					switch ( input.LA(1) ) {
					case INTCONST:
						{
						alt11=1;
						}
						break;
					case FLOATCONST:
						{
						alt11=2;
						}
						break;
					case STRINGCONST:
						{
						alt11=3;
						}
						break;
					case ID:
						{
						alt11=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:14: x= INTCONST
							{
							x=(XTree)match(input,INTCONST,FOLLOW_INTCONST_in_expr361); 
							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:27: x= FLOATCONST
							{
							x=(XTree)match(input,FLOATCONST,FOLLOW_FLOATCONST_in_expr367); 
							}
							break;
						case 3 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:42: x= STRINGCONST
							{
							x=(XTree)match(input,STRINGCONST,FOLLOW_STRINGCONST_in_expr373); 
							}
							break;
						case 4 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:75:58: x= ID
							{
							x=(XTree)match(input,ID,FOLLOW_ID_in_expr379); 
							}
							break;

					}

					// TEMPLATE REWRITE
					// 75:64: -> template(x=$x.text) \"<x>\"
					{
						retval.st = new StringTemplate(templateLib, "<x>",new STAttrMap().put("x", (x!=null?x.getText():null)));
					}



					}
					break;

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
	// $ANTLR end "expr"


	public static class assignstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:79:1: assignstat : ^( ':=' ID expr ) -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>\";
	public final XtoJava.assignstat_return assignstat() throws RecognitionException {
		XtoJava.assignstat_return retval = new XtoJava.assignstat_return();
		retval.start = input.LT(1);

		XTree ID4=null;
		TreeRuleReturnScope expr5 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:79:11: ( ^( ':=' ID expr ) -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>\")
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:79:14: ^( ':=' ID expr )
			{
			match(input,28,FOLLOW_28_in_assignstat412); 
			match(input, Token.DOWN, null); 
			ID4=(XTree)match(input,ID,FOLLOW_ID_in_assignstat414); 
			pushFollow(FOLLOW_expr_in_assignstat416);
			expr5=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 79:30: -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>\"
			{
				retval.st = new StringTemplate(templateLib, "<id> = <expr>",new STAttrMap().put("id", (ID4!=null?ID4.getText():null)).put("expr", (expr5!=null?((StringTemplate)expr5.getTemplate()):null)));
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
	// $ANTLR end "assignstat"


	public static class assignwithsemi_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignwithsemi"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:80:1: assignwithsemi : ^( ':=' ID expr ) -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>;\";
	public final XtoJava.assignwithsemi_return assignwithsemi() throws RecognitionException {
		XtoJava.assignwithsemi_return retval = new XtoJava.assignwithsemi_return();
		retval.start = input.LT(1);

		XTree ID6=null;
		TreeRuleReturnScope expr7 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:80:15: ( ^( ':=' ID expr ) -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>;\")
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:80:18: ^( ':=' ID expr )
			{
			match(input,28,FOLLOW_28_in_assignwithsemi441); 
			match(input, Token.DOWN, null); 
			ID6=(XTree)match(input,ID,FOLLOW_ID_in_assignwithsemi443); 
			pushFollow(FOLLOW_expr_in_assignwithsemi445);
			expr7=expr();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 80:34: -> template(id=$ID.textexpr=$expr.st) \"<id> = <expr>;\"
			{
				retval.st = new StringTemplate(templateLib, "<id> = <expr>;",new STAttrMap().put("id", (ID6!=null?ID6.getText():null)).put("expr", (expr7!=null?((StringTemplate)expr7.getTemplate()):null)));
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
	// $ANTLR end "assignwithsemi"


	public static class cond_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "cond"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:1: cond : ( ^( (op= '<' |op= '>' ) e1= expr e2= expr ) -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"| ^( '=' e1= expr e2= expr ) -> template(e1=$e1.ste2=$e2.st) \"(<e1>==<e2>)\");
	public final XtoJava.cond_return cond() throws RecognitionException {
		XtoJava.cond_return retval = new XtoJava.cond_return();
		retval.start = input.LT(1);

		XTree op=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:5: ( ^( (op= '<' |op= '>' ) e1= expr e2= expr ) -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"| ^( '=' e1= expr e2= expr ) -> template(e1=$e1.ste2=$e2.st) \"(<e1>==<e2>)\")
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==30||LA14_0==32) ) {
				alt14=1;
			}
			else if ( (LA14_0==31) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:13: ^( (op= '<' |op= '>' ) e1= expr e2= expr )
					{
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:15: (op= '<' |op= '>' )
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==30) ) {
						alt13=1;
					}
					else if ( (LA13_0==32) ) {
						alt13=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}

					switch (alt13) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:17: op= '<'
							{
							op=(XTree)match(input,30,FOLLOW_30_in_cond482); 
							}
							break;
						case 2 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:84:25: op= '>'
							{
							op=(XTree)match(input,32,FOLLOW_32_in_cond487); 
							}
							break;

					}

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_cond492);
					e1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_cond496);
					e2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 85:13: -> template(op=$op.texte1=$e1.ste2=$e2.st) \"(<e1><op><e2>)\"
					{
						retval.st = new StringTemplate(templateLib, "(<e1><op><e2>)",new STAttrMap().put("op", (op!=null?op.getText():null)).put("e1", (e1!=null?((StringTemplate)e1.getTemplate()):null)).put("e2", (e2!=null?((StringTemplate)e2.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:86:13: ^( '=' e1= expr e2= expr )
					{
					match(input,31,FOLLOW_31_in_cond546); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_cond550);
					e1=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_cond554);
					e2=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 87:14: -> template(e1=$e1.ste2=$e2.st) \"(<e1>==<e2>)\"
					{
						retval.st = new StringTemplate(templateLib, "(<e1>==<e2>)",new STAttrMap().put("e1", (e1!=null?((StringTemplate)e1.getTemplate()):null)).put("e2", (e2!=null?((StringTemplate)e2.getTemplate()):null)));
					}



					}
					break;

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
	// $ANTLR end "cond"


	public static class condstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "condstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:97:1: condstat : ^( 'if' cond s1= stat ( elsepart )? ) -> template(c=$cond.sts1=$s1.stelsepart=$elsepart.st) <<if <c> {\r\n <s1>\r\n<elsepart>}>>;
	public final XtoJava.condstat_return condstat() throws RecognitionException {
		XtoJava.condstat_return retval = new XtoJava.condstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope cond8 =null;
		TreeRuleReturnScope elsepart9 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:97:9: ( ^( 'if' cond s1= stat ( elsepart )? ) -> template(c=$cond.sts1=$s1.stelsepart=$elsepart.st) <<if <c> {\r\n <s1>\r\n<elsepart>}>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:97:12: ^( 'if' cond s1= stat ( elsepart )? )
			{
			match(input,38,FOLLOW_38_in_condstat603); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_condstat605);
			cond8=cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_condstat610);
			s1=stat();
			state._fsp--;

			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:97:33: ( elsepart )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==STATLIST||LA15_0==28||(LA15_0 >= 37 && LA15_0 <= 38)||LA15_0==45) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:97:33: elsepart
					{
					pushFollow(FOLLOW_elsepart_in_condstat612);
					elsepart9=elsepart();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 97:44: -> template(c=$cond.sts1=$s1.stelsepart=$elsepart.st) <<if <c> {\r\n <s1>\r\n<elsepart>}>>
			{
				retval.st = new StringTemplate(templateLib, "if <c> {\r\n <s1>\r\n<elsepart>}",new STAttrMap().put("c", (cond8!=null?((StringTemplate)cond8.getTemplate()):null)).put("s1", (s1!=null?((StringTemplate)s1.getTemplate()):null)).put("elsepart", (elsepart9!=null?((StringTemplate)elsepart9.getTemplate()):null)));
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
	// $ANTLR end "condstat"


	public static class elsepart_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "elsepart"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:102:1: elsepart : stat -> template(stat=$stat.st) <<} else {\r\n <stat>\r\n>>;
	public final XtoJava.elsepart_return elsepart() throws RecognitionException {
		XtoJava.elsepart_return retval = new XtoJava.elsepart_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope stat10 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:102:9: ( stat -> template(stat=$stat.st) <<} else {\r\n <stat>\r\n>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:102:11: stat
			{
			pushFollow(FOLLOW_stat_in_elsepart642);
			stat10=stat();
			state._fsp--;

			// TEMPLATE REWRITE
			// 102:16: -> template(stat=$stat.st) <<} else {\r\n <stat>\r\n>>
			{
				retval.st = new StringTemplate(templateLib, "} else {\r\n  <stat>\r\n",new STAttrMap().put("stat", (stat10!=null?((StringTemplate)stat10.getTemplate()):null)));
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
	// $ANTLR end "elsepart"


	public static class whilestat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whilestat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:108:1: whilestat : ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while <c> {\r\n <s>\r\n}>>;
	public final XtoJava.whilestat_return whilestat() throws RecognitionException {
		XtoJava.whilestat_return retval = new XtoJava.whilestat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope cond11 =null;
		TreeRuleReturnScope stat12 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:108:10: ( ^( 'while' cond stat ) -> template(c=$cond.sts=$stat.st) <<while <c> {\r\n <s>\r\n}>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:108:15: ^( 'while' cond stat )
			{
			match(input,45,FOLLOW_45_in_whilestat667); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_cond_in_whilestat669);
			cond11=cond();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_whilestat671);
			stat12=stat();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 108:36: -> template(c=$cond.sts=$stat.st) <<while <c> {\r\n <s>\r\n}>>
			{
				retval.st = new StringTemplate(templateLib, "while <c> {\r\n  <s>\r\n}",new STAttrMap().put("c", (cond11!=null?((StringTemplate)cond11.getTemplate()):null)).put("s", (stat12!=null?((StringTemplate)stat12.getTemplate()):null)));
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
	// $ANTLR end "whilestat"


	public static class forstat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forstat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:113:1: forstat : ^( 'for' i= assignstat c= cond p= assignstat s= stat ) -> template(i=$i.stc=$c.stp=$p.sts=$s.st) <<for (<i>; <c>; <p>) {\r\n <s>\r\n}>>;
	public final XtoJava.forstat_return forstat() throws RecognitionException {
		XtoJava.forstat_return retval = new XtoJava.forstat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope i =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope s =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:113:8: ( ^( 'for' i= assignstat c= cond p= assignstat s= stat ) -> template(i=$i.stc=$c.stp=$p.sts=$s.st) <<for (<i>; <c>; <p>) {\r\n <s>\r\n}>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:113:15: ^( 'for' i= assignstat c= cond p= assignstat s= stat )
			{
			match(input,37,FOLLOW_37_in_forstat702); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assignstat_in_forstat706);
			i=assignstat();
			state._fsp--;

			pushFollow(FOLLOW_cond_in_forstat710);
			c=cond();
			state._fsp--;

			pushFollow(FOLLOW_assignstat_in_forstat714);
			p=assignstat();
			state._fsp--;

			pushFollow(FOLLOW_stat_in_forstat718);
			s=stat();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 113:64: -> template(i=$i.stc=$c.stp=$p.sts=$s.st) <<for (<i>; <c>; <p>) {\r\n <s>\r\n}>>
			{
				retval.st = new StringTemplate(templateLib, "for (<i>; <c>; <p>) {\r\n  <s>\r\n}",new STAttrMap().put("i", (i!=null?((StringTemplate)i.getTemplate()):null)).put("c", (c!=null?((StringTemplate)c.getTemplate()):null)).put("p", (p!=null?((StringTemplate)p.getTemplate()):null)).put("s", (s!=null?((StringTemplate)s.getTemplate()):null)));
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
	// $ANTLR end "forstat"


	public static class stat_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "stat"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:1: stat : (s= assignwithsemi |s= condstat |s= whilestat |s= forstat |s= statlist ) -> template(stat=$s.st) \"<stat>\";
	public final XtoJava.stat_return stat() throws RecognitionException {
		XtoJava.stat_return retval = new XtoJava.stat_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:5: ( (s= assignwithsemi |s= condstat |s= whilestat |s= forstat |s= statlist ) -> template(stat=$s.st) \"<stat>\")
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:15: (s= assignwithsemi |s= condstat |s= whilestat |s= forstat |s= statlist )
			{
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:15: (s= assignwithsemi |s= condstat |s= whilestat |s= forstat |s= statlist )
			int alt16=5;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt16=1;
				}
				break;
			case 38:
				{
				alt16=2;
				}
				break;
			case 45:
				{
				alt16=3;
				}
				break;
			case 37:
				{
				alt16=4;
				}
				break;
			case STATLIST:
				{
				alt16=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:16: s= assignwithsemi
					{
					pushFollow(FOLLOW_assignwithsemi_in_stat764);
					s=assignwithsemi();
					state._fsp--;

					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:35: s= condstat
					{
					pushFollow(FOLLOW_condstat_in_stat770);
					s=condstat();
					state._fsp--;

					}
					break;
				case 3 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:48: s= whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat776);
					s=whilestat();
					state._fsp--;

					}
					break;
				case 4 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:62: s= forstat
					{
					pushFollow(FOLLOW_forstat_in_stat782);
					s=forstat();
					state._fsp--;

					}
					break;
				case 5 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:119:74: s= statlist
					{
					pushFollow(FOLLOW_statlist_in_stat788);
					s=statlist();
					state._fsp--;

					}
					break;

			}

			// TEMPLATE REWRITE
			// 119:86: -> template(stat=$s.st) \"<stat>\"
			{
				retval.st = new StringTemplate(templateLib, "<stat>",new STAttrMap().put("stat", (s!=null?((StringTemplate)s.getTemplate()):null)));
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
	// $ANTLR end "stat"


	public static class statlist_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statlist"
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:122:1: statlist : ( ^( STATLIST (s+= stat )+ ) -> template(stat=$s) << <stat; separator=\"\\n\"> >>| STATLIST -> template( \"\");
	public final XtoJava.statlist_return statlist() throws RecognitionException {
		XtoJava.statlist_return retval = new XtoJava.statlist_return();
		retval.start = input.LT(1);

		List<Object> list_s=null;
		RuleReturnScope s = null;
		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:122:9: ( ^( STATLIST (s+= stat )+ ) -> template(stat=$s) << <stat; separator=\"\\n\"> >>| STATLIST -> template( \"\")
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==STATLIST) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					alt18=1;
				}
				else if ( (LA18_1==UP||LA18_1==STATLIST||LA18_1==28||(LA18_1 >= 37 && LA18_1 <= 38)||LA18_1==45) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:122:13: ^( STATLIST (s+= stat )+ )
					{
					match(input,STATLIST,FOLLOW_STATLIST_in_statlist811); 
					match(input, Token.DOWN, null); 
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:122:24: (s+= stat )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==STATLIST||LA17_0==28||(LA17_0 >= 37 && LA17_0 <= 38)||LA17_0==45) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:122:25: s+= stat
							{
							pushFollow(FOLLOW_stat_in_statlist816);
							s=stat();
							state._fsp--;

							if (list_s==null) list_s=new ArrayList<Object>();
							list_s.add(s.getTemplate());
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 122:36: -> template(stat=$s) << <stat; separator=\"\\n\"> >>
					{
						retval.st = new StringTemplate(templateLib, " <stat; separator=\"\\n\"> ",new STAttrMap().put("stat", list_s));
					}



					}
					break;
				case 2 :
					// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:124:13: STATLIST
					{
					match(input,STATLIST,FOLLOW_STATLIST_in_statlist845); 
					// TEMPLATE REWRITE
					// 124:22: -> template( \"\"
					{
						retval.st = new StringTemplate(templateLib, "");
					}



					}
					break;

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
	// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:127:1: program : ^( 'program' ID decllist statlist ) -> template(id=$IDdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<import java.util.Scanner;\r\n\r\n// patricks yachthafen [ ]\r\n// lucies fahrradständer [ ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35\r\n// toms Ladeparkanlage [ ]\r\n// jonas tiefgarage [ ]\r\n// gäste parkplatz [ ]\r\n// beas privatanwesen [ ]\r\n// katjas hobbithöhle [ ]\r\n\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n \r\n <statlist>\r\n \r\n <print>\r\n }\r\n} \r\n>>;
	public final XtoJava.program_return program() throws RecognitionException {
		XtoJava.program_return retval = new XtoJava.program_return();
		retval.start = input.LT(1);

		XTree ID13=null;
		TreeRuleReturnScope decllist14 =null;
		TreeRuleReturnScope statlist15 =null;

		try {
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:127:8: ( ^( 'program' ID decllist statlist ) -> template(id=$IDdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<import java.util.Scanner;\r\n\r\n// patricks yachthafen [ ]\r\n// lucies fahrradständer [ ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35\r\n// toms Ladeparkanlage [ ]\r\n// jonas tiefgarage [ ]\r\n// gäste parkplatz [ ]\r\n// beas privatanwesen [ ]\r\n// katjas hobbithöhle [ ]\r\n\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n \r\n <statlist>\r\n \r\n <print>\r\n }\r\n} \r\n>>)
			// de\\dhbw\\compiler\\antlrxcompiler\\XtoJava.g:127:15: ^( 'program' ID decllist statlist )
			{
			match(input,41,FOLLOW_41_in_program867); 
			match(input, Token.DOWN, null); 
			ID13=(XTree)match(input,ID,FOLLOW_ID_in_program869); 
			pushFollow(FOLLOW_decllist_in_program871);
			decllist14=decllist();
			state._fsp--;

			pushFollow(FOLLOW_statlist_in_program873);
			statlist15=statlist();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 128:15: -> template(id=$IDdecllist=$decllist.ststatlist=$statlist.stread=readCode()print=printCode()) <<import java.util.Scanner;\r\n\r\n// patricks yachthafen [ ]\r\n// lucies fahrradständer [ ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35\r\n// toms Ladeparkanlage [ ]\r\n// jonas tiefgarage [ ]\r\n// gäste parkplatz [ ]\r\n// beas privatanwesen [ ]\r\n// katjas hobbithöhle [ ]\r\n\r\npublic class <id> {\r\n <decllist>\r\n public static void main(String[] args) {\r\n <read>\r\n \r\n <statlist>\r\n \r\n <print>\r\n }\r\n} \r\n>>
			{
				retval.st = new StringTemplate(templateLib, "import java.util.Scanner;\r\n\r\n// patricks yachthafen      [    ]\r\n// lucies fahrradständer    [    ] maximale PARKDAUER ÜBERSCHRITTEN! 13:35\r\n// toms Ladeparkanlage      [    ]\r\n// jonas tiefgarage         [    ]\r\n// gäste parkplatz          [    ]\r\n// beas privatanwesen       [    ]\r\n// katjas hobbithöhle       [    ]\r\n\r\npublic class <id> {\r\n  <decllist>\r\n  public static void main(String[] args) {\r\n    <read>\r\n    \r\n    <statlist>\r\n  \r\n    <print>\r\n  }\r\n} \r\n",new STAttrMap().put("id", ID13).put("decllist", (decllist14!=null?((StringTemplate)decllist14.getTemplate()):null)).put("statlist", (statlist15!=null?((StringTemplate)statlist15.getTemplate()):null)).put("read", readCode()).put("print", printCode()));
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



	public static final BitSet FOLLOW_DECL_in_decl68 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl70 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_decl72 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl74 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl77 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl108 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_decl110 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl112 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECL_in_decl145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl147 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_decl149 = new BitSet(new long[]{0x0000050000000008L});
	public static final BitSet FOLLOW_42_in_decl151 = new BitSet(new long[]{0x0000010000000008L});
	public static final BitSet FOLLOW_40_in_decl154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_decl_in_decllist190 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_DECLLIST_in_decllist219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UMINUS_in_expr242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_23_in_expr277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_24_in_expr283 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_26_in_expr289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_22_in_expr295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTCONST_in_expr361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONST_in_expr367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONST_in_expr373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_assignstat412 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignstat414 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignstat416 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_assignwithsemi441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignwithsemi443 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_assignwithsemi445 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_cond482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_32_in_cond487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond492 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_31_in_cond546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_cond550 = new BitSet(new long[]{0x0000000005C30700L});
	public static final BitSet FOLLOW_expr_in_cond554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_38_in_condstat603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_condstat605 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_condstat610 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_elsepart_in_condstat612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stat_in_elsepart642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_whilestat667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cond_in_whilestat669 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_whilestat671 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_37_in_forstat702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignstat_in_forstat706 = new BitSet(new long[]{0x00000001C0000000L});
	public static final BitSet FOLLOW_cond_in_forstat710 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_assignstat_in_forstat714 = new BitSet(new long[]{0x0000206010008000L});
	public static final BitSet FOLLOW_stat_in_forstat718 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignwithsemi_in_stat764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condstat_in_stat770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statlist_in_stat788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATLIST_in_statlist811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stat_in_statlist816 = new BitSet(new long[]{0x0000206010008008L});
	public static final BitSet FOLLOW_STATLIST_in_statlist845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_program867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_program869 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_decllist_in_program871 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_statlist_in_program873 = new BitSet(new long[]{0x0000000000000008L});
}
