// Generated from C:/Users/kubw1/IdeaProjects/parsesJFK/src/main/antlr4/com/antlr4\JFK.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JFKParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JFKVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JFKParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(JFKParser.EntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JFKParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(JFKParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link JFKParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(JFKParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link JFKParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(JFKParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link JFKParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JFKParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JFKParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(JFKParser.OperationContext ctx);
}