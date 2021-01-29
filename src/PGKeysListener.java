// Generated from ./src/PGKeys.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PGKeysParser}.
 */
public interface PGKeysListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#pgkeys}.
	 * @param ctx the parse tree
	 */
	void enterPgkeys(PGKeysParser.PgkeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#pgkeys}.
	 * @param ctx the parse tree
	 */
	void exitPgkeys(PGKeysParser.PgkeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(PGKeysParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(PGKeysParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor(PGKeysParser.DescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor(PGKeysParser.DescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PGKeysParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PGKeysParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#dnode}.
	 * @param ctx the parse tree
	 */
	void enterDnode(PGKeysParser.DnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#dnode}.
	 * @param ctx the parse tree
	 */
	void exitDnode(PGKeysParser.DnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#stmtnode}.
	 * @param ctx the parse tree
	 */
	void enterStmtnode(PGKeysParser.StmtnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#stmtnode}.
	 * @param ctx the parse tree
	 */
	void exitStmtnode(PGKeysParser.StmtnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#stmtedge}.
	 * @param ctx the parse tree
	 */
	void enterStmtedge(PGKeysParser.StmtedgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#stmtedge}.
	 * @param ctx the parse tree
	 */
	void exitStmtedge(PGKeysParser.StmtedgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#varprop}.
	 * @param ctx the parse tree
	 */
	void enterVarprop(PGKeysParser.VarpropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#varprop}.
	 * @param ctx the parse tree
	 */
	void exitVarprop(PGKeysParser.VarpropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(PGKeysParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(PGKeysParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#varprops}.
	 * @param ctx the parse tree
	 */
	void enterVarprops(PGKeysParser.VarpropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#varprops}.
	 * @param ctx the parse tree
	 */
	void exitVarprops(PGKeysParser.VarpropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#varsplusvarprops}.
	 * @param ctx the parse tree
	 */
	void enterVarsplusvarprops(PGKeysParser.VarsplusvarpropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#varsplusvarprops}.
	 * @param ctx the parse tree
	 */
	void exitVarsplusvarprops(PGKeysParser.VarsplusvarpropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PGKeysParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PGKeysParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGKeysParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(PGKeysParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGKeysParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(PGKeysParser.OpContext ctx);
}