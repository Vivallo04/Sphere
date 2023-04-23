package com.sphere.frontend.parser;// Generated from .\Sphere.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SphereParser}.
 */
public interface SphereListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SphereParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SphereParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SphereParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SphereParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SphereParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SphereParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SphereParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SphereParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SphereParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SphereParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SphereParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(SphereParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(SphereParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(SphereParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(SphereParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(SphereParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(SphereParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SphereParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SphereParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#reAssignment}.
	 * @param ctx the parse tree
	 */
	void enterReAssignment(SphereParser.ReAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#reAssignment}.
	 * @param ctx the parse tree
	 */
	void exitReAssignment(SphereParser.ReAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SphereParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SphereParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(SphereParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(SphereParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SphereParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SphereParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SphereParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SphereParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SphereParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SphereParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(SphereParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(SphereParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#notFunction}.
	 * @param ctx the parse tree
	 */
	void enterNotFunction(SphereParser.NotFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#notFunction}.
	 * @param ctx the parse tree
	 */
	void exitNotFunction(SphereParser.NotFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#isTrueFunction}.
	 * @param ctx the parse tree
	 */
	void enterIsTrueFunction(SphereParser.IsTrueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#isTrueFunction}.
	 * @param ctx the parse tree
	 */
	void exitIsTrueFunction(SphereParser.IsTrueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void enterMoveFunction(SphereParser.MoveFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#moveFunction}.
	 * @param ctx the parse tree
	 */
	void exitMoveFunction(SphereParser.MoveFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#randomFunction}.
	 * @param ctx the parse tree
	 */
	void enterRandomFunction(SphereParser.RandomFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#randomFunction}.
	 * @param ctx the parse tree
	 */
	void exitRandomFunction(SphereParser.RandomFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(SphereParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(SphereParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#setupBlock}.
	 * @param ctx the parse tree
	 */
	void enterSetupBlock(SphereParser.SetupBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#setupBlock}.
	 * @param ctx the parse tree
	 */
	void exitSetupBlock(SphereParser.SetupBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(SphereParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(SphereParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SphereParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SphereParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(SphereParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(SphereParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(SphereParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(SphereParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(SphereParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(SphereParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#moveOp}.
	 * @param ctx the parse tree
	 */
	void enterMoveOp(SphereParser.MoveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#moveOp}.
	 * @param ctx the parse tree
	 */
	void exitMoveOp(SphereParser.MoveOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAlterExpression(SphereParser.AlterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAlterExpression(SphereParser.AlterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SphereParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SphereParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(SphereParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(SphereParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SphereParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SphereParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SphereParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SphereParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SphereParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SphereParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFunctionExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionExpression(SphereParser.MainFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunctionExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionExpression(SphereParser.MainFunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SphereParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SphereParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SphereParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SphereParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isTrueExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsTrueExpression(SphereParser.IsTrueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isTrueExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsTrueExpression(SphereParser.IsTrueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(SphereParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(SphereParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(SphereParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link SphereParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(SphereParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SphereParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SphereParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SphereParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SphereParser.StartContext ctx);
}