// Generated from C:/Users/Robin/IdeaProjects/SE-WS-1617-UE03_2\GameField.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameFieldParser}.
 */
public interface GameFieldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameFieldParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GameFieldParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameFieldParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GameFieldParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameFieldParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(GameFieldParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameFieldParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(GameFieldParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameFieldParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GameFieldParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameFieldParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GameFieldParser.ValueContext ctx);
}