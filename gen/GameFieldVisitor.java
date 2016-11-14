// Generated from C:/Users/Robin/IdeaProjects/SE-WS-1617-UE03_2\GameField.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameFieldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameFieldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameFieldParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GameFieldParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameFieldParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(GameFieldParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameFieldParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GameFieldParser.ValueContext ctx);
}