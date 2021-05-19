/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis ANTLR-Parser für X
 * - Testfall-Utility für Scanner
 * 
 * **********************************************
 */


package de.dhbw.compiler.antlrxparser.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import de.dhbw.compiler.antlrxparser.XLexer;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import de.dhbw.compiler.antlrxparser.XParser;

public abstract class TokenStreamTest {
	
	protected static final int IMPLICIT = -5;
	
	protected int getType(String name) {
		int res = -9;
		for(res=0 ; res<XParser.tokenNames.length && !XParser.tokenNames[res].equals(name.toUpperCase()); res++) {};
		if (res>=XParser.tokenNames.length) {
			name = "'"+name.toLowerCase()+"'";
			for(res=0 ;  res<XParser.tokenNames.length && !XParser.tokenNames[res].equals(name); res++);
			if (res>=XParser.tokenNames.length) {
				System.err.println("Unknown Token: "+name);
				res=-9;
			}
		}
		return res;
	}
	
	protected void testTokenList(String in, boolean convert, CommonToken... TokenList) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(in.getBytes())); 
		XLexer scanner = new XLexer(input);
		Token myToken;
		
		for (Token expected : TokenList) {
			myToken = scanner.nextToken();
			if (expected.getType()!=IMPLICIT) {
				assertEquals("Expect Token "+expected.toString()+". Error in type.", 
						expected.getType(), myToken.getType());
			}
			if  (myToken.getType()!=XLexer.EOF) {
				assertEquals("Expect Token "+expected.toString()+". Error in text.", 
						expected.getText(), myToken.getText());
				assertEquals("Expect Token "+expected.toString()+". Error in line.", 
						expected.getLine(), myToken.getLine());
				assertEquals("Expect Token "+expected.toString()+". Error in column.", 
						expected.getCharPositionInLine(), myToken.getCharPositionInLine());
			}
			if (convert) {
				// Type-Conversion-Test not implemented yet
				/*
				switch (myToken.getType()) {
					case Token.INTCONST:
						int intValue = Integer.parseInt(expected.getText());
						assertEquals("Expected Token value "+intValue,
								intValue,((IntConstToken)myToken).getValue());
						break;
					case Token.FLOATCONST:
						double doubleValue = Double.parseDouble(expected.getText().replace("^", "e"));
						assertEquals("Expected Token value "+doubleValue,
								doubleValue,((FloatConstToken)myToken).getValue(), doubleValue*0.0000001);
						break;
					case Token.STRINGCONST:
						String stringValue = expected.getText().substring(1, expected.getText().length()-1).replace("\\\"", "\"");
						assertEquals("Expected Token value "+stringValue,
								stringValue,((StringConstToken)myToken).getValue());
						break;
				}
				*/
			}
		}
		
		myToken = scanner.nextToken();
		assertEquals("Expected End of File (EOF), read " + myToken.toString() + ".", Token.EOF, myToken.getType());	
	}
	
}
