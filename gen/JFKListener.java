// Generated from C:/Users/kubw1/IdeaProjects/parsesJFK/src/main/antlr4/com/antlr4\JFK.g4 by ANTLR 4.7.2
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
}