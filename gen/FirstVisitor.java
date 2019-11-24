// Generated from C:/Users/kubw1/IdeaProjects/parsesJFK/src/main/antlr4/com\JFK.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FirstParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FirstVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FirstParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(FirstParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(FirstParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(FirstParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link FirstParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FirstParser.PushContext ctx);
}