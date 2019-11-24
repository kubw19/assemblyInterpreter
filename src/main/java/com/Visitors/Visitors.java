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
        switch(target){
            case "%eax":
                Registers.set(Registers.Reg.EAX, value);
                break;
            case "%ebx":
                Registers.set(Registers.Reg.EBX, value);
                break;
            case "%ecx":
                Registers.set(Registers.Reg.ECX, value);
                break;
            case "%edx":
                Registers.set(Registers.Reg.EDX, value);
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
            switch(ctx.REGISTERS().toString()){
                case "%eax":
                    return Registers.get(Registers.Reg.EAX);
                case "%ebx":
                    return Registers.get(Registers.Reg.EBX);
                case "%ecx":
                    return Registers.get(Registers.Reg.ECX);
                case "%edx":
                    return Registers.get(Registers.Reg.EDX);
            }
        }
        if(ctx.NUMBER() != null){
            return Integer.valueOf(ctx.NUMBER().toString());
        }
        if(ctx.operation() != null){
            switch(ctx.operation().OP().toString()){
                case "+":
                    return visitExpression(ctx.expression(0)) + visitExpression(ctx.expression(1));
                case "-":
                    return visitExpression(ctx.expression(0)) - visitExpression(ctx.expression(1));
                case "*":
                    return visitExpression(ctx.expression(0)) * visitExpression(ctx.expression(1));
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
