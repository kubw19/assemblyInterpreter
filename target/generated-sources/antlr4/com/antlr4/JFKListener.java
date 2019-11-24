// Generated from com\antlr4\JFK.g4 by ANTLR 4.7
package com.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JFKParser}.
 */
public interface JFKListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JFKParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(JFKParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(JFKParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(JFKParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(JFKParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(JFKParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(JFKParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(JFKParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(JFKParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#interrupt}.
	 * @param ctx the parse tree
	 */
	void enterInterrupt(JFKParser.InterruptContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#interrupt}.
	 * @param ctx the parse tree
	 */
	void exitInterrupt(JFKParser.InterruptContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JFKParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JFKParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JFKParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(JFKParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JFKParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(JFKParser.OperationContext ctx);
}