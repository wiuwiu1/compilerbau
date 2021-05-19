/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 *
 * Vorlesung Übersetzerbau
 * Praxis LL(1)-Parser für X
 * - Syntaxbaum
 *
 * **********************************************
 */
package de.dhbw.compiler.LL1Parser;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tree {

    private final Token token;
    private final LinkedList<Tree> children = new LinkedList<>();

    public Tree(Token token) {
        this.token = token;
    }

    public Tree(Token token, Tree... children) {
        this.token = token;
        this.children.addAll(Arrays.asList(children));
    }

    public Token getToken() {
        return token;
    }

    public Tree addLastChild(Tree child) {
        this.children.addLast(child);
        return this;
    }

    public Tree addLastChild(Tree... children) {
        this.children.addAll(Arrays.asList(children));
        return this;
    }

    public Tree addFirstChild(Tree child) {
        this.children.addFirst(child);
        return this;
    }

    public Tree removeChild(int n) {
        return this.children.remove(n);
    }

    public Tree getChild(int n) {
        return this.children.get(n);
    }

    public int getChildCount() {
        return this.children.size();
    }

    public List<Tree> getChildren() {
        return children;
    }

    public String toGraphvizDot() {
        StringBuffer dot = new StringBuffer();
        dot.append("digraph{ \n");
        this.appendNode(dot);
        this.appendEdges(dot);
        dot.append("}");
        return dot.toString();
    }

    private void appendNode(StringBuffer dot) {
        dot.append("n" + this.hashCode());
        dot.append(" [label=\"" + token.getText().replace("\\", "\\\\").replace("\"", "\\\"") + "\"]\n");
        for (Tree c : children) {
            c.appendNode(dot);
        }
    }

    private void appendEdges(StringBuffer dot) {
        for (Tree c : children) {
            dot.append("n" + this.hashCode() + " -> n" + c.hashCode() + "\n");
        }
        for (Tree c : children) {
            c.appendEdges(dot);
        }

    }

    public String toString() {
        StringBuffer res = new StringBuffer();
        if (children.isEmpty()) {
            res.append(token.getText());
        } else {
            res.append("(" + (this.token == null? "": this.token.getText()));
            for (Tree c : children) {
                res.append(" " + c.toString());
            }
            res.append(")");
        }
        return res.toString();

    }

}
