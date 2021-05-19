/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 *
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - LL1-Parser
 *
 * **********************************************
 */

package de.dhbw.compiler.LL1Parser;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class XParser {

    private final TokenBuffer in;

    public XParser(TokenBuffer in) {
        this.in = in;
    }

    public Tree parseProgram() {
        //TODO Parser
        Token nextToken = in.lookaheadToken();

        switch (nextToken.getType()) {
            case Token.PROGRAM:
                Tree program, id, decllist, block;
                if (((program = parseToken(Token.PROGRAM)) != null)
                        && ((id = parseToken(Token.ID)) != null)
                        && ((parseToken(Token.SEMICOLON)) != null
                        && ((decllist = parseDecList()) != null)
                        && ((block = parseBlock()) != null))
                        && ((parseToken(Token.DOT)) != null)
                        && (parseToken(Token.EOF) != null)) {
                    return new Tree(new Token(Token.PROGRAM), id, decllist, block);
                }
            default:
                System.out.println("expected PROGRAM Token");
                return null;
        }
    }

    //🚕💨
    // <( ￣^￣)(θ(θ☆( >_<
    // Patrick wenn Lucie in seinen methoden rumschreibt: <( ‵□′)───C＜─___-)||
    // Lucie wenn ihre Methode verschwindet: (╯‵□′)╯︵┻━┻
    //                                                     ☮
    // A burger a day keeps the parser away
    // 𝔬𝔥𝔫𝔢 𝔓𝔞𝔲𝔰𝔢 𝔨𝔢𝔦𝔫𝔢𝔫 𝔅𝔯𝔞𝔲𝔰𝔢 🍬🎂
    // 𝔡𝔦𝔢 𝔇𝔢𝔠𝔏𝔦𝔰𝔱 𝔟𝔢𝔨𝔬𝔪𝔪𝔱 𝔢𝔦𝔫𝔢𝔫 𝔞𝔲𝔣 𝔡𝔢𝔫 𝔡𝔢𝔠𝔩!
    private Tree parseDecList() {
        switch (in.lookaheadToken().getType()) {
            case Token.ID:
            case Token.IF:
            case Token.WHILE:
                Tree dec, decList;
                if ((dec = parseDec()) != null && (decList = parseDecList()) != null) {
                    decList.addFirstChild(dec);
                    return decList;
                }
                return null;
            case Token.BEGIN:
                return new Tree(new Token(Token.DECLLIST));
            default:
                System.out.println("expected READ, PRINT or BEGIN Token");
                return null;
        }
    }

    private Tree parseDec() {
        Tree dec = new Tree(new Token(Token.DECL));
        switch (in.lookaheadToken().getType()) {
            case Token.READ:
            case Token.PRINT:
                Tree modifier;
                if ((modifier = parseModifier()) != null) {
                    dec.addLastChild(modifier);
                } else {
                    return null;
                }
            case Token.ID:
                Tree id, type;
                if (
                        (id = parseToken(Token.ID)) != null &&
                                parseToken(Token.COLON) != null &&
                                (type = parseType()) != null &&
                                parseToken(Token.SEMICOLON) != null
                ) {
                    dec.addLastChild(id);
                    dec.addLastChild(type);
                }
                return dec;
            default:
                System.out.println("expected READ, PRINT or ID");
        }
        return null;
    }

    private Tree parseModifier() {
        Tree print;
        Tree modifier = new Tree(new Token(Token.MODIFIER));
        switch (in.lookaheadToken().getType()) {
            case Token.READ:
                Tree read;
                if ((read = parseToken(Token.READ)) != null) {
                    modifier.addLastChild(read);
                }
                if ((print = parseModifier2()) != null) {
                    modifier.addLastChild(print);
                }
                return modifier;
            case Token.PRINT:
                if ((print = parseToken(Token.PRINT)) != null) {
                    modifier.addLastChild(print);
                    return modifier;
                }
            default:
                return modifier;
        }
    }

    private Tree parseModifier2() {
        switch (in.lookaheadToken().getType()) {
            case Token.PRINT:
                return new Tree(new Token(Token.PRINT));
            case Token.ID:
                return null;
            default:
                System.out.println("expected PRINT or ID");
                return null;
        }
    }

    private Tree parseType() {
        Tree type;
        switch (in.lookaheadToken().getType()) {
            case Token.INT:
                if ((type = parseToken(Token.INT)) != null) {
                    return type;
                }
                break;
            case Token.FLOAT:
                if ((type = parseToken(Token.FLOAT)) != null) {
                    return type;
                }
                break;
            case Token.STRING:
                if ((type = parseToken(Token.STRING)) != null) {
                    return type;
                }
                break;
        }
        System.out.println("expected INT FLOAT or STRING");
        return null;
    }

    private Tree parseBlock() {
        Tree block;
        switch (in.lookaheadToken().getType()) {
            case Token.BEGIN:
                if (parseToken(Token.BEGIN) != null && (block = parseStatList()) != null && parseToken(Token.END) != null) {
                    return block;
                }
            default:
                System.out.println("expected Token BEGIN");
                return null;
        }
    }

    private Tree parseStatList() {
        switch (in.lookaheadToken().getType()) {
            case Token.ID:
            case Token.IF:
            case Token.WHILE:
            case Token.FOR:
            case Token.BEGIN:
                Tree statWithSemi, statList;
                if ((statWithSemi = parseStatWithSemi()) != null && (statList = parseStatList()) != null) {
                    return statList.addFirstChild(statWithSemi);
                }
                return null;
            case Token.END:
                return new Tree(new Token(Token.STATLIST));
            default:
                System.out.println("expected STATLIST");
                return null;
        }
    }

    private Tree parseStat() {
        Tree stat;
        switch (in.lookaheadToken().getType()) {
            case Token.ID:
                if ((stat = parseAssignStat()) != null) {
                    return stat;
                }
            case Token.IF:
                if ((stat = parseCondStat()) != null) {
                    return stat;
                }
            case Token.WHILE:
                if ((stat = parseWhileStat()) != null) {
                    return stat;
                }
            case Token.FOR:
                if ((stat = parseForStat()) != null) {
                    return stat;
                }
            case Token.BEGIN:
                if ((stat = parseBlock()) != null) {
                    return stat;
                }
        }
        System.out.println("expected STAT");
        return null;
    }

    private Tree parseStatWithSemi() {
        Tree stat;
        if ((stat = parseStat()) != null && parseToken(Token.SEMICOLON) != null) {
            return stat;
        }
        System.out.println("expected STAT with SEMICOLON");
        return null;
    }

    private Tree parseWhileStat() {
        Tree whileStat = new Tree(new Token(Token.STAT));
        Tree cond, stat;
        switch (in.lookaheadToken().getType()) {
            case Token.WHILE:
                if (parseToken(Token.LBR) != null
                        && (cond = parseCond()) != null
                        && parseToken(Token.RBR) != null
                        && (stat = parseStat()) != null) {
                    return whileStat.addLastChild(cond, stat);
                }
        }
        System.out.println("expected whileStat");
        return null;
    }

    private Tree parseAssignStat() {
        Tree id, expr, assign;
        switch (in.lookaheadToken().getType()) {
            case Token.ID:
                if ((id = parseToken(Token.ID)) != null && (assign = parseToken(Token.ASSIGN)) != null
                        && (expr = parseExpr()) != null) {
                    return assign.addLastChild(id, expr);
                }
                break;
        }
        System.out.println("expected assignstat");
        return null;
    }

    private Tree parseCondStat() {
        Tree condStat = new Tree(new Token(Token.STAT));
        Tree cond, stat, condStat2;
        //ifcondthenstatcondstat2
        switch (in.lookaheadToken().getType()) {
            case Token.IF:
                if ((cond = parseCond()) != null
                        && parseToken(Token.THEN) != null
                        && (stat = parseStat()) != null && (condStat2 = parseCondStat2()) != null) {
                    condStat.addLastChild(cond, stat);
                }
                if ((condStat2 = parseCondStat2()) != null) {
                    condStat.addLastChild(condStat2);
                }
                return condStat;
        }
        System.out.println("expected CONDSTAT");
        return null;
    }

    private Tree parseCondStat2() {
        switch (in.lookaheadToken().getType()) {
            case Token.ELSE:
                Tree elze, stat;
                if ((elze = parseToken(Token.ELSE)) != null && (stat = parseStat()) != null) {
                    return elze.addLastChild(stat);
                }
                System.out.println("expected SOMETHING");
                return null;
            default:
                return null;
        }
    }

    private Tree parseCond() {
        switch (in.lookaheadToken().getType()) {
            case Token.MINUS:
            case Token.INTCONST:
            case Token.FLOATCONST:
            case Token.STRINGCONST:
            case Token.ID:
            case Token.LBR:
                Tree expr, cond2;
                if ((expr = parseExpr()) != null && (cond2 = parseCond2()) != null) {
                    return cond2.addLastChild(expr);
                }
                break;
        }
        System.out.println("expected MINUS, INTCONST, FLOATCONST, STRINGCONST, ID or LBR");
        return null;
    }

    private Tree parseCond2() {
        Tree expr, operator;
        switch (in.lookaheadToken().getType()) {
            case Token.EQUALS:
                if ((operator = parseToken(Token.EQUALS)) != null && (expr = parseExpr()) != null) {
                    return operator.addLastChild(expr);

                }
                break;
            case Token.LESS:
                if ((operator = parseToken(Token.LESS)) != null && (expr = parseExpr()) != null) {
                    return operator.addLastChild(expr);
                }
                break;
            case Token.MORE:
                if ((operator = parseToken(Token.MORE)) != null && (expr = parseExpr()) != null) {
                    return operator.addLastChild(expr);
                }
                break;
        }
        System.out.println("expected EQUALS, LESS or MORE");
        return null;
    }

    private Tree parseToken(int tokenType) {
        if (in.lookaheadToken().getType() == tokenType) {
            return new Tree(nextToken());
        } else {
            System.out.println("expected different Token. expected: " + tokenType + ", actual: " + in.lookaheadToken().getType()); //TODO von int wieder Token Namen kriegen
            return null;
        }
    }

    public Token nextToken() {
        Token token = null;
        try {
            token = in.nextToken();
        } catch (IOException e) {
            System.out.println("uhh buuu huuu 🙄");
        }
        return token;
    }

    private Tree parseForStat() {
        switch (in.lookaheadToken().getType()) {
            case Token.FOR:
                Tree firstAssignStat, cond, secondAssignStat, stat;
                if (parseToken(Token.FOR) != null && parseToken(Token.LBR) != null &&
                        (firstAssignStat = parseAssignStat()) != null &&
                        parseToken(Token.SEMICOLON) != null &&
                        (cond = parseCond()) != null &&
                        parseToken(Token.SEMICOLON) != null &&
                        (secondAssignStat = parseAssignStat()) != null &&
                        parseToken(Token.RBR) != null &&
                        (stat = parseStat()) != null
                ) {
                    return new Tree(new Token(Token.FORSTAT)).addLastChild(firstAssignStat, cond, secondAssignStat, stat);
                }
            default:
                System.out.println("expected FOR");
                return null;
        }
    }

    private Tree parseExpr() {
        Tree expr = new Tree(new Token(Token.STAT));
        Tree expr2, expr1a;
        switch (in.lookaheadToken().getType()) {
            case Token.MINUS:
            case Token.INTCONST:
            case Token.FLOATCONST:
            case Token.STRINGCONST:
            case Token.ID:
            case Token.LBR:
                if ((expr2 = parseExpr2()) != null) {
                    expr.addLastChild(expr2);
                } else {
                    return null;
                }
                if ((expr1a = parseExpr1a()) != null) {
                    expr.addLastChild(expr1a);
                }
                return expr;
        }
        System.out.println("expected EXPRESSION");
        return null;
    }

    private Tree parseExpr1a() {
        Tree expr;
        switch (in.lookaheadToken().getType()) {
            case Token.PLUS:
                if ((parseToken(Token.PLUS) != null && (expr = parseExpr()) != null)) {
                    return expr.addLastChild(expr);
                }
            case Token.MINUS:
                if ((parseToken(Token.MINUS) != null && (expr = parseExpr2()) != null)) {
                    return expr.addLastChild(expr);
                }
        }
        return null;
    }

    private Tree parseExpr2() {
        Tree expr = new Tree(new Token(Token.EXPR));
        switch (in.lookaheadToken().getType()) {
            case Token.MINUS:
            case Token.INTCONST:
            case Token.FLOATCONST:
            case Token.STRINGCONST:
            case Token.ID:
            case Token.LBR:
                Tree expr3, expr2a;
                if ((expr3 = parseExpr3()) != null) {
                     expr.addLastChild(expr3);
                }else {
                    return null;
                }
                if((expr2a = parseExpr2a()) != null){
                     expr.addLastChild(expr2a);
                }
                return expr;
        }
        System.out.println("expected EXPR2");
        return null;
    }

    private Tree parseExpr2a() {
        Tree operator, expr2;
        switch (in.lookaheadToken().getType()) {
            case Token.MULT:
                if ((operator = parseToken(Token.MULT)) != null && (expr2 = parseExpr2()) != null) {
                    return operator.addLastChild(expr2);
                }
                break;
            case Token.DIV:
                if ((operator = parseToken(Token.DIV)) != null && (expr2 = parseExpr2()) != null) {
                    return operator.addLastChild(expr2);
                }
                break;
            default:
                return null;
        }
        return null;
    }

    private Tree parseExpr3() {
        Tree symbol;
        switch (in.lookaheadToken().getType()) {
            case Token.MINUS:
                Tree expr3a;
                if ((symbol = parseToken(Token.MINUS)) != null && (expr3a = parseExpr3a()) != null) {
                    //here
                    expr3a.addLastChild(symbol);
                    return expr3a;
                }
                break;
            case Token.INTCONST:
                if ((symbol = parseToken(Token.INTCONST)) != null) {
                    return symbol;
                }
                break;
            case Token.FLOATCONST:
                if ((symbol = parseToken(Token.FLOATCONST)) != null) {
                    return symbol;
                }
                break;
            case Token.STRINGCONST:
                if ((symbol = parseToken(Token.STRINGCONST)) != null) {
                    return symbol;
                }
                break;
            case Token.ID:
                if ((symbol = parseToken(Token.ID)) != null) {
                    return symbol;
                }
                break;
            case Token.LBR:
                if (parseToken(Token.LBR) != null && (symbol = parseExpr()) != null && parseToken(Token.RBR) != null) {
                    return symbol;
                }
                break;
        }
        System.out.println("expected EXPR3");
        return null;
    }

    private Tree parseExpr3a() {
        Tree numberConst;
        switch (in.lookaheadToken().getType()) {
            case Token.INTCONST:
                if ((numberConst = parseToken(Token.INTCONST)) != null) {
                    return numberConst;
                }
            case Token.FLOATCONST:
                if ((numberConst = parseToken(Token.FLOATCONST)) != null) {
                    return numberConst;
                }
        }
        System.out.println("expected EXPR3A");
        return null;
    }
}