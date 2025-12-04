// Generated from ProjectLang.g4 by ANTLR 4.13.2
package JavaKIP;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProjectLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(ProjectLangParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(ProjectLangParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ProjectLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ProjectLangParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(ProjectLangParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(ProjectLangParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(ProjectLangParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclStmt(ProjectLangParser.FunctionDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(ProjectLangParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ProjectLangParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmts}
	 * labeled alternative in {@link ProjectLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmts(ProjectLangParser.ExprStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ProjectLangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(ProjectLangParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ProjectLangParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ProjectLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(ProjectLangParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(ProjectLangParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(ProjectLangParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#breakStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(ProjectLangParser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#continueStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(ProjectLangParser.ContinueStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(ProjectLangParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ProjectLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ProjectLangParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ProjectLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ProjectLangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(ProjectLangParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(ProjectLangParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ProjectLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ProjectLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ProjectLangParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ProjectLangParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ProjectLangParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ProjectLangParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ProjectLangParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ProjectLangParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ProjectLangParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ProjectLangParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ProjectLangParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#primaryLValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryLValue(ProjectLangParser.PrimaryLValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ProjectLangParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ProjectLangParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ProjectLangParser.TypeContext ctx);
}