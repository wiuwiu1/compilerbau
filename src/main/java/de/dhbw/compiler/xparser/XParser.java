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

public class XParser {

	private final TokenReader in;

	public XParser(TokenReader in) {
		this.in = in;
	}

	public Tree parseProgram() {
		int myPosition = in.getPosition();
		Tree program, id, semicolon, block, dot, eof;
		if (((program = parseToken(Token.PROGRAM)) != null) && ((id = parseToken(Token.ID)) != null) && ((semicolon = parseToken(Token.SEMICOLON)) != null
				&& ((block = parseBlock()) != null)) && ((dot = parseToken(Token.DOT)) != null) && ((eof = parseToken(Token.EOF)) != null)){
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
		if((id = parseToken(Token.ID)) != null && (assign = parseToken(Token.ASSIGN)) != null && (numExp = parseNumExpr()) != null){
			LinkedList<Tree> children = new LinkedList<>(Arrays.asList(id, assign, numExp));
			return new Tree(new Token(Token.ASSIGNSTAT), children);
		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseCondStat(){
		int myPosition = in.getPosition();
		Tree if_, cond, then, stat1, else_, stat2;
		if((if_ = parseToken(Token.IF) != null && (cond = parseCond(Token.COND)) != null && (then = parseToken(Token.THEN)) != null && (stat1 = parseStat()) != null)){

		} else {

		}

		if()){

		}
		in.setPosition(myPosition);
		return null;
	}

	private Tree parseCond(int cond) {
	}

	private Tree parseNumExpr() {
	}

}
