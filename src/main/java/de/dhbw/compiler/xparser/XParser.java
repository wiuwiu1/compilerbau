/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X Abstiegsparser
 * - Abstiegsparser
 * 
 * **********************************************
 */

package de.dhbw.compiler.xparser;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class XParser {

	private final TokenReader in;

	public XParser(TokenReader in) {
		this.in = in;
	}

	public Tree parseProgram() {
		int myPosition = in.getPosition();
		Tree program, id, semicolon, block, dot, eof;
		if (((program = parseToken(Token.PROGRAM)) != null)
				&& ((id = parseToken(Token.ID)) != null)
				&& ((semicolon = parseToken(Token.SEMICOLON)) != null
				&& ((block = parseBlock()) != null))
				&& ((dot = parseToken(Token.DOT)) != null)
				&& ((eof = parseToken(Token.EOF)) != null)){
				LinkedList<Tree> children = new LinkedList<>(Arrays.asList(program, id, semicolon, block, dot, eof));
				return new Tree(new Token(Token.APROGRAM), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseToken(int tokenType) {
		int myPosition = in.getPosition();
		Token token;
		if((token = in.nextToken()).getType() == tokenType){
			return new Tree(token);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseBlock() {
		int myPosition = in.getPosition();
		Tree begin, statList, end;
		if ((begin = parseToken(Token.BEGIN)) != null && (statList = parseStatList()) != null &&
				(end = parseToken(Token.END)) != null) {
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(begin, statList, end));
			return new Tree(new Token(Token.BLOCK), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseStatList(){
		Tree statList = new Tree(new Token(Token.STATLIST));
		Tree statSemicolon;
		while((statSemicolon = parseStatSemicolon()) != null){
			statList.addLastChild(statSemicolon);
		}
		return statList;
	}

	private Tree parseStatSemicolon() {
		int myPosition = in.getPosition();
		Tree stat, semicolon;
		if((stat = parseStat()) != null && (semicolon = parseToken(Token.SEMICOLON)) != null){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(stat, semicolon));
			return new Tree(new Token(Token.STATWITHSEMI), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseStat(){
		int myPosition = in.getPosition();
		Tree stat;
		if((stat = parseNumAssign()) != null || (stat = parseCondStat()) != null || (stat = parseBlock()) != null) {
			return new Tree(new Token(Token.STAT), stat);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseNumAssign(){
		int myPosition = in.getPosition();
		Tree id, assign, numExp;
		if((id = parseToken(Token.ID)) != null
				&& (assign = parseToken(Token.ASSIGN)) != null
				&& (numExp = parseNumExpr()) != null){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(id, assign, numExp));
			return new Tree(new Token(Token.ASSIGNSTAT), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseCondStat(){
		int myPosition = in.getPosition();
		Tree if_, cond, then, stat1, else_, stat2;
		Tree condState;
		if((if_ = parseToken(Token.IF)) != null
				&& (cond = parseCond()) != null
				&& (then = parseToken(Token.THEN)) != null && (stat1 = parseStat()) != null){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(if_, cond, then, stat1));
			condState = new Tree(new Token(Token.CONDSTAT), children);
		} else {
			in.setPosition(myPosition);
			return null;
		}
		myPosition = in.getPosition();
		if((else_ = parseToken(Token.ELSE)) != null && (stat2 = parseStat()) != null){
			condState.addLastChild(else_);
			condState.addLastChild(stat2);
		} else {
			in.setPosition(myPosition);
		}
		return condState;
	}

	private Tree parseCond() {
		int myPosition = in.getPosition();
		Tree numExpr1, operator, numExpr2;
		if((numExpr1 = parseNumExpr()) != null
				&& ((operator = parseToken(Token.EQUALS)) != null
				||(operator = parseToken(Token.LESS)) != null
				|| (operator = parseToken(Token.MORE)) != null)
				&& (numExpr2 = parseNumExpr()) != null) {
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(numExpr1, operator, numExpr2));
			return new Tree(new Token(Token.COND), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseNumExpr() {
		int myPosition = in.getPosition();
		Tree exp2, exp1, operator;

		if(((exp2 = parseNumExpr2()) != null) &&
				(((operator = parseToken(Token.PLUS)) != null) ||
						((operator = parseToken(Token.MINUS)) != null)) &&
				(exp1 = parseNumExpr()) != null){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(exp2, operator, exp1));
			return new Tree(new Token(Token.EXPR), children);
		}

		in.setPosition(myPosition);

		if (((exp2 = parseNumExpr2()) != null)	){
			return new Tree(new Token(Token.EXPR), exp2);
		}

		in.setPosition(myPosition);
		return null;
	}

	private Tree parseNumExpr2() {
		int myPosition = in.getPosition();
		Tree numExpr2, numExpr3, operator;
		if(((numExpr3 = parseNumExpr3()) != null)
				&& ((operator = parseToken(Token.MULT)) != null
					|| (operator = parseToken(Token.DIV)) != null)
				&& ((numExpr2 = parseNumExpr2())!=null)
		){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(numExpr3,operator,numExpr2));
			return new Tree(new Token(Token.EXPR2), children);
		}
		in.setPosition(myPosition);
		if((numExpr3 = parseNumExpr3()) != null){
			return new Tree(new Token(Token.EXPR2), numExpr3);
		}


		in.setPosition(myPosition);
		return null;
	}

	private Tree parseNumExpr3() {
		int myPosition = in.getPosition();
		Tree minus, lbr, numExpr1, rbr, id, intConst;
		Tree expr3 = new Tree(new Token(Token.EXPR3));

		if((minus = parseToken(Token.MINUS)) != null){
			expr3.addLastChild(minus);
		}

		if(((lbr = parseToken(Token.LBR)) != null && (numExpr1 = parseNumExpr()) != null && (rbr = parseToken(Token.RBR)) != null)) {
			expr3.addLastChild(lbr);
			expr3.addLastChild(numExpr1);
			expr3.addLastChild(rbr);
			return expr3;
		}
		if((id = parseToken(Token.ID)) != null){
			expr3.addLastChild(id);
			return expr3;
		}
		if((intConst = parseToken(Token.INTCONST)) != null){
			expr3.addLastChild(intConst);
			return expr3;
		}
		in.setPosition(myPosition);
		return null;
	}

}
