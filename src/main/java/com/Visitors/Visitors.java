package com.Visitors;

import com.antlr4.JFKParser;
import com.antlr4.JFKVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitors implements JFKVisitor {
    @Override
    public String visitEntry(JFKParser.EntryContext ctx) {
        System.out.println("Tutaj entry");
        visitChildren(ctx.command());
        return "123";
    }

    @Override
    public Object visitCommand(JFKParser.CommandContext ctx) {
        System.out.println("Command here");
        return null;
    }

    @Override
    public Object visitMov(JFKParser.MovContext ctx) {
        System.out.println("hej");
        return null;
    }

    @Override
    public Object visitPush(JFKParser.PushContext ctx) {
        System.out.println("to jest pushek");
        return null;
    }

    @Override
    public Object visit(ParseTree tree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
