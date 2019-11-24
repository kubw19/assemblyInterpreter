// Generated from C:/Users/kubw1/IdeaProjects/parsesJFK/src/main/antlr4/com\JFK.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FirstParser}.
 */
public interface FirstListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FirstParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(FirstParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(FirstParser.EntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(FirstParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(FirstParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(FirstParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(FirstParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FirstParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FirstParser.PushContext ctx);
}