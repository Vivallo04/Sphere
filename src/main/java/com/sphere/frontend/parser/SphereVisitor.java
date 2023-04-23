package com.sphere.frontend.parser;// Generated from .\Sphere.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SphereParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SphereVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SphereParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SphereParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SphereParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SphereParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SphereParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(SphereParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(SphereParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(SphereParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(SphereParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SphereParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#reAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(SphereParser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SphereParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#printExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(SphereParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SphereParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SphereParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SphereParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(SphereParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#notFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFunction(SphereParser.NotFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#isTrueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsTrueFunction(SphereParser.IsTrueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#moveFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveFunction(SphereParser.MoveFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#randomFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomFunction(SphereParser.RandomFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(SphereParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#setupBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetupBlock(SphereParser.SetupBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(SphereParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(SphereParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(SphereParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(SphereParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(SphereParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#moveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveOp(SphereParser.MoveOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExpression(SphereParser.AlterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SphereParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(SphereParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SphereParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SphereParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(SphereParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFunctionExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionExpression(SphereParser.MainFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SphereParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SphereParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isTrueExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsTrueExpression(SphereParser.IsTrueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(SphereParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(SphereParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SphereParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SphereParser.StartContext ctx);
}