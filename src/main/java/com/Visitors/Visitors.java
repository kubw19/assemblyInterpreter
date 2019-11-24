package com.Visitors;

import com.Parser;
import com.Registers;
import com.Stack;
import com.antlr4.JFKBaseVisitor;
import com.antlr4.JFKParser;

public class Visitors extends JFKBaseVisitor {
    @Override
    public String visitEntry(JFKParser.EntryContext ctx) {
        visitChildren(ctx);
        return  null;
    }

    @Override
    public Object visitCommand(JFKParser.CommandContext ctx) {
        if(ctx.children != null){
            visitChildren(ctx);
        }
        else{
           // System.err.println("Please specify a command!");
        }
        return null;
    }

    @Override
    public Object visitMov(JFKParser.MovContext ctx) {
        Integer value = visitExpression(ctx.expression());
        String target = ctx.REGISTERS().toString();
        Registers.set(target, value);
        return null;
    }

    @Override
    public Object visitXor(JFKParser.XorContext ctx) {
        String target = ctx.REGISTERS().toString();
        Integer valueLeft = visitExpression(ctx.expression());
        Integer valueRight = Registers.get(target);
        //System.out.println(valueLeft);
        //System.out.println(valueRight);
        if((valueLeft == null && valueRight == null) || valueLeft.equals(valueRight)){
            Registers.set(target, 0);
        } else{
            Registers.set(target, valueLeft ^ valueRight);
        }

        return null;
    }

    @Override
    public Object visitPush(JFKParser.PushContext ctx) {
        if(ctx.expression() == null){
            //System.err.println("ERROR");
            return null;
        }
        Stack.push(visitExpression(ctx.expression()));
        return null;
    }

    @Override
    public Integer visitExpression(JFKParser.ExpressionContext ctx){
        if(ctx.REGISTERS() != null){
            return Registers.get(ctx.REGISTERS().toString());
        }
        if(ctx.NUMBER() != null){
            return Integer.valueOf(ctx.NUMBER().toString());
        }
        if(ctx.mult != null){
            return visitExpression(ctx.expression(0)) * visitExpression(ctx.expression(1));
        }
        else if(ctx.operation() != null){
            switch(ctx.operation().OP().toString()){
                case "+":
                    return visitExpression(ctx.expression(0)) + visitExpression(ctx.expression(1));
                case "-":
                    return visitExpression(ctx.expression(0)) - visitExpression(ctx.expression(1));
            }
        }

        if(ctx.expression() != null)
            return visitExpression(ctx.expression(0));
        return null;
    }

    @Override
    public Object visitInterrupt(JFKParser.InterruptContext ctx){
        if(ctx.NUMBER().toString().equals("80")){
            System.out.println(Stack.last());
        }
        return null;
    }
}
