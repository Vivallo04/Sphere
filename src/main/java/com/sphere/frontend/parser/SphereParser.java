package com.sphere.frontend.parser;// Generated from .\Sphere.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SphereParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, BOOL=28, INTEGER=29, STRING=30, NOT=31, 
		SEMI=32, Def=33, Proc=34, Call=35, While=36, Alter=37, Not=38, IsTrue=39, 
		Move=40, Random=41, Repeat=42, Until=43, Void=44, Setup=45, Loop=46, Break=47, 
		Principal=48, ID=49, COMMENT=50, WS=51;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_block = 3, RULE_while = 4, 
		RULE_repeat = 5, RULE_until = 6, RULE_proc = 7, RULE_assignment = 8, RULE_reAssignment = 9, 
		RULE_functionCall = 10, RULE_printExpr = 11, RULE_variable = 12, RULE_type = 13, 
		RULE_constant = 14, RULE_alterFunction = 15, RULE_notFunction = 16, RULE_isTrueFunction = 17, 
		RULE_moveFunction = 18, RULE_randomFunction = 19, RULE_mainFunction = 20, 
		RULE_setupBlock = 21, RULE_loopBlock = 22, RULE_print = 23, RULE_multOp = 24, 
		RULE_addOp = 25, RULE_relOp = 26, RULE_moveOp = 27, RULE_expression = 28, 
		RULE_start = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "statement", "block", "while", "repeat", "until", 
			"proc", "assignment", "reAssignment", "functionCall", "printExpr", "variable", 
			"type", "constant", "alterFunction", "notFunction", "isTrueFunction", 
			"moveFunction", "randomFunction", "mainFunction", "setupBlock", "loopBlock", 
			"print", "multOp", "addOp", "relOp", "moveOp", "expression", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'@'", "'integer'", "'boolean'", "'string'", 
			"'()'", "'=>'", "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'ATR'", "'ADL'", "'ADE'", "'AIZ'", "'IZQ'", "'DER'", 
			"'DDE'", "'DIZ'", null, null, null, "'NOT'", "';'", "'Def'", "'Proc'", 
			"'Call'", "'While'", "'Alter'", "'Not'", "'IsTrue'", "'Move'", "'Random'", 
			"'Repeat'", "'Until'", "'Void'", "'Setup'", "'Loop'", null, "'Principal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOL", "INTEGER", "STRING", "NOT", "SEMI", "Def", 
			"Proc", "Call", "While", "Alter", "Not", "IsTrue", "Move", "Random", 
			"Repeat", "Until", "Void", "Setup", "Loop", "Break", "Principal", "ID", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sphere.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SphereParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SphereParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123136712376848L) != 0)) {
				{
				{
				setState(60);
				line();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public AlterFunctionContext alterFunction() {
			return getRuleContext(AlterFunctionContext.class,0);
		}
		public MoveFunctionContext moveFunction() {
			return getRuleContext(MoveFunctionContext.class,0);
		}
		public RandomFunctionContext randomFunction() {
			return getRuleContext(RandomFunctionContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public SetupBlockContext setupBlock() {
			return getRuleContext(SetupBlockContext.class,0);
		}
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				mainFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				proc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				while_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				alterFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				moveFunction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				randomFunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				repeat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				until();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(78);
				setupBlock();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(79);
				loopBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ReAssignmentContext reAssignment() {
			return getRuleContext(ReAssignmentContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NotFunctionContext notFunction() {
			return getRuleContext(NotFunctionContext.class,0);
		}
		public IsTrueFunctionContext isTrueFunction() {
			return getRuleContext(IsTrueFunctionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SphereParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				assignment();
				}
				break;
			case 2:
				{
				setState(83);
				functionCall();
				}
				break;
			case 3:
				{
				setState(84);
				reAssignment();
				}
				break;
			case 4:
				{
				setState(85);
				variable();
				}
				break;
			case 5:
				{
				setState(86);
				notFunction();
				}
				break;
			case 6:
				{
				setState(87);
				isTrueFunction();
				}
				break;
			case 7:
				{
				setState(88);
				print();
				}
				break;
			}
			setState(91);
			match(SEMI);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(92);
				match(COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123136712376848L) != 0)) {
				{
				{
				setState(96);
				line();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SphereParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(While);
			setState(105);
			expression(0);
			setState(106);
			block();
			setState(107);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(SphereParser.Repeat, 0); }
		public TerminalNode Break() { return getToken(SphereParser.Break, 0); }
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Repeat);
			setState(110);
			match(T__0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 563959002300946L) != 0)) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(111);
					expression(0);
					}
					break;
				case 2:
					{
					setState(112);
					statement();
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(Break);
			setState(119);
			match(T__1);
			setState(120);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UntilContext extends ParserRuleContext {
		public TerminalNode Until() { return getToken(SphereParser.Until, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Until);
			setState(123);
			block();
			setState(124);
			expression(0);
			setState(125);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcContext extends ParserRuleContext {
		public TerminalNode Proc() { return getToken(SphereParser.Proc, 0); }
		public TerminalNode ID() { return getToken(SphereParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Proc);
			setState(128);
			match(ID);
			setState(129);
			block();
			setState(130);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Def() { return getToken(SphereParser.Def, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(Def);
			setState(133);
			match(T__0);
			{
			setState(134);
			variable();
			{
			setState(135);
			match(T__2);
			setState(136);
			type();
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(138);
				match(T__2);
				setState(139);
				constant();
				}
			}

			}
			setState(142);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SphereParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SphereParser.ID, i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SphereParser.NOT, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(SphereParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SphereParser.INTEGER, i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public ReAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterReAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitReAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReAssignmentContext reAssignment() throws RecognitionException {
		ReAssignmentContext _localctx = new ReAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__3);
			setState(145);
			match(ID);
			setState(146);
			match(T__0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(147);
				match(NOT);
				}
			}

			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(150);
				constant();
				}
				break;
			case 2:
				{
				setState(151);
				match(T__3);
				setState(152);
				match(ID);
				}
				break;
			case 3:
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(153);
					match(T__3);
					setState(154);
					match(ID);
					}
					break;
				case INTEGER:
					{
					setState(155);
					match(INTEGER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
					{
					setState(158);
					addOp();
					}
					break;
				case T__9:
				case T__10:
					{
					setState(159);
					multOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(162);
					match(T__3);
					setState(163);
					match(ID);
					}
					break;
				case INTEGER:
					{
					setState(164);
					match(INTEGER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(169);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Call() { return getToken(SphereParser.Call, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Call);
			setState(172);
			match(T__0);
			setState(173);
			expression(0);
			setState(174);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExprContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printExpr);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SphereParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__3);
			setState(182);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SphereParser.INTEGER, 0); }
		public TerminalNode BOOL() { return getToken(SphereParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(SphereParser.STRING, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlterFunctionContext extends ParserRuleContext {
		public TerminalNode Alter() { return getToken(SphereParser.Alter, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public TerminalNode INTEGER() { return getToken(SphereParser.INTEGER, 0); }
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AlterFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterFunctionContext alterFunction() throws RecognitionException {
		AlterFunctionContext _localctx = new AlterFunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Alter);
			setState(189);
			match(T__0);
			setState(190);
			variable();
			setState(191);
			match(T__2);
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(192);
				match(INTEGER);
				}
				break;
			case T__3:
				{
				setState(193);
				variable();
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
					{
					setState(194);
					multOp();
					}
					break;
				case T__11:
				case T__12:
					{
					setState(195);
					addOp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(T__1);
			setState(203);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotFunctionContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(SphereParser.Not, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NotFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterNotFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitNotFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitNotFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotFunctionContext notFunction() throws RecognitionException {
		NotFunctionContext _localctx = new NotFunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Not);
			setState(206);
			match(T__0);
			setState(207);
			variable();
			setState(208);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsTrueFunctionContext extends ParserRuleContext {
		public TerminalNode IsTrue() { return getToken(SphereParser.IsTrue, 0); }
		public TerminalNode ID() { return getToken(SphereParser.ID, 0); }
		public IsTrueFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isTrueFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterIsTrueFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitIsTrueFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitIsTrueFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTrueFunctionContext isTrueFunction() throws RecognitionException {
		IsTrueFunctionContext _localctx = new IsTrueFunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_isTrueFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IsTrue);
			setState(211);
			match(T__0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(212);
				match(T__3);
				}
			}

			setState(215);
			match(ID);
			setState(216);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveFunctionContext extends ParserRuleContext {
		public TerminalNode Move() { return getToken(SphereParser.Move, 0); }
		public MoveOpContext moveOp() {
			return getRuleContext(MoveOpContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public MoveFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMoveFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMoveFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMoveFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveFunctionContext moveFunction() throws RecognitionException {
		MoveFunctionContext _localctx = new MoveFunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_moveFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Move);
			setState(219);
			match(T__0);
			setState(220);
			moveOp();
			setState(221);
			match(T__1);
			setState(222);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RandomFunctionContext extends ParserRuleContext {
		public TerminalNode Random() { return getToken(SphereParser.Random, 0); }
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public RandomFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterRandomFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitRandomFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitRandomFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RandomFunctionContext randomFunction() throws RecognitionException {
		RandomFunctionContext _localctx = new RandomFunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_randomFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Random);
			setState(225);
			match(T__7);
			setState(226);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode Principal() { return getToken(SphereParser.Principal, 0); }
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__3);
			setState(229);
			match(Principal);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(230);
				block();
				}
			}

			setState(233);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetupBlockContext extends ParserRuleContext {
		public TerminalNode Setup() { return getToken(SphereParser.Setup, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public SetupBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setupBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterSetupBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitSetupBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitSetupBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupBlockContext setupBlock() throws RecognitionException {
		SetupBlockContext _localctx = new SetupBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setupBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Setup);
			setState(236);
			block();
			setState(237);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopBlockContext extends ParserRuleContext {
		public TerminalNode Loop() { return getToken(SphereParser.Loop, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(Loop);
			setState(240);
			block();
			setState(241);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SphereParser.SEMI, 0); }
		public List<PrintExprContext> printExpr() {
			return getRuleContexts(PrintExprContext.class);
		}
		public PrintExprContext printExpr(int i) {
			return getRuleContext(PrintExprContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__8);
			setState(244);
			match(T__0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 563641174720530L) != 0)) {
				{
				setState(245);
				printExpr();
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(246);
					match(T__2);
					setState(247);
					printExpr();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(255);
			match(T__1);
			setState(256);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelOpContext extends ParserRuleContext {
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveOpContext extends ParserRuleContext {
		public MoveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMoveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMoveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMoveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveOpContext moveOp() throws RecognitionException {
		MoveOpContext _localctx = new MoveOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_moveOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 267386880L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlterExpressionContext extends ExpressionContext {
		public AlterFunctionContext alterFunction() {
			return getRuleContext(AlterFunctionContext.class,0);
		}
		public AlterExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterAlterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitAlterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitAlterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(SphereParser.ID, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionExpressionContext extends ExpressionContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public MainFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMainFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMainFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMainFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(SphereParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsTrueExpressionContext extends ExpressionContext {
		public IsTrueFunctionContext isTrueFunction() {
			return getRuleContext(IsTrueFunctionContext.class,0);
		}
		public IsTrueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterIsTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitIsTrueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitIsTrueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerExpressionContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(SphereParser.INTEGER, 0); }
		public IntegerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(267);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				variable();
				}
				break;
			case 3:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(INTEGER);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(T__0);
				setState(272);
				expression(0);
				setState(273);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(NOT);
				setState(276);
				expression(8);
				}
				break;
			case 7:
				{
				_localctx = new IsTrueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				isTrueFunction();
				}
				break;
			case 8:
				{
				_localctx = new AlterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				alterFunction();
				}
				break;
			case 9:
				{
				_localctx = new RelationalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				variable();
				setState(280);
				relOp();
				setState(281);
				expression(3);
				}
				break;
			case 10:
				{
				_localctx = new MainFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				mainFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						multOp();
						setState(288);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(291);
						addOp();
						setState(292);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295);
						relOp();
						setState(296);
						variable();
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<MainFunctionContext> mainFunction() {
			return getRuleContexts(MainFunctionContext.class);
		}
		public MainFunctionContext mainFunction(int i) {
			return getRuleContext(MainFunctionContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SphereListener ) ((SphereListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SphereVisitor ) return ((SphereVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 867583394320L) != 0)) {
				{
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(303);
					mainFunction();
					}
					break;
				case 2:
					{
					setState(304);
					print();
					}
					break;
				case 3:
					{
					setState(305);
					statement();
					}
					break;
				case 4:
					{
					setState(306);
					assignment();
					}
					break;
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u0139\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Q\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Z\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002^\b\u0002\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003"+
		"\f\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u008d\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0095\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009d"+
		"\b\t\u0001\t\u0001\t\u0003\t\u00a1\b\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00a6\b\t\u0003\t\u00a8\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b4\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c5\b\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c9\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00e8\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00f9\b\u0017\n\u0017\f\u0017\u00fc\t\u0017\u0003\u0017\u00fe\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u011d\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u012b\b\u001c\n\u001c\f\u001c\u012e\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0134\b\u001d"+
		"\n\u001d\f\u001d\u0137\t\u001d\u0001\u001d\u0000\u00018\u001e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:\u0000\u0006\u0001\u0000\u0005\u0007\u0001\u0000\u001c"+
		"\u001e\u0001\u0000\n\u000b\u0001\u0000\f\r\u0001\u0000\u000e\u0013\u0001"+
		"\u0000\u0014\u001b\u014f\u0000?\u0001\u0000\u0000\u0000\u0002P\u0001\u0000"+
		"\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\bh\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fz\u0001\u0000"+
		"\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000"+
		"\u0000\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000"+
		"\u0000\u0000\u0016\u00b3\u0001\u0000\u0000\u0000\u0018\u00b5\u0001\u0000"+
		"\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000\u001c\u00ba\u0001\u0000"+
		"\u0000\u0000\u001e\u00bc\u0001\u0000\u0000\u0000 \u00cd\u0001\u0000\u0000"+
		"\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00da\u0001\u0000\u0000\u0000"+
		"&\u00e0\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000\u0000\u0000*\u00eb"+
		"\u0001\u0000\u0000\u0000,\u00ef\u0001\u0000\u0000\u0000.\u00f3\u0001\u0000"+
		"\u0000\u00000\u0102\u0001\u0000\u0000\u00002\u0104\u0001\u0000\u0000\u0000"+
		"4\u0106\u0001\u0000\u0000\u00006\u0108\u0001\u0000\u0000\u00008\u011c"+
		"\u0001\u0000\u0000\u0000:\u0135\u0001\u0000\u0000\u0000<>\u0003\u0002"+
		"\u0001\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BC\u0005\u0000\u0000\u0001C\u0001\u0001\u0000"+
		"\u0000\u0000DQ\u0003(\u0014\u0000EQ\u0003\u0004\u0002\u0000FQ\u0003\u000e"+
		"\u0007\u0000GQ\u0003.\u0017\u0000HQ\u0003\b\u0004\u0000IQ\u0003\u001e"+
		"\u000f\u0000JQ\u0003$\u0012\u0000KQ\u0003&\u0013\u0000LQ\u0003\n\u0005"+
		"\u0000MQ\u0003\f\u0006\u0000NQ\u0003*\u0015\u0000OQ\u0003,\u0016\u0000"+
		"PD\u0001\u0000\u0000\u0000PE\u0001\u0000\u0000\u0000PF\u0001\u0000\u0000"+
		"\u0000PG\u0001\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000PI\u0001\u0000"+
		"\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001"+
		"\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000Q\u0003\u0001\u0000\u0000\u0000RZ\u0003\u0010"+
		"\b\u0000SZ\u0003\u0014\n\u0000TZ\u0003\u0012\t\u0000UZ\u0003\u0018\f\u0000"+
		"VZ\u0003 \u0010\u0000WZ\u0003\"\u0011\u0000XZ\u0003.\u0017\u0000YR\u0001"+
		"\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000"+
		"YU\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0005 \u0000"+
		"\u0000\\^\u00052\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u0005\u0001\u0000\u0000\u0000_c\u0005\u0001\u0000\u0000"+
		"`b\u0003\u0002\u0001\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0002\u0000\u0000g\u0007"+
		"\u0001\u0000\u0000\u0000hi\u0005$\u0000\u0000ij\u00038\u001c\u0000jk\u0003"+
		"\u0006\u0003\u0000kl\u0005 \u0000\u0000l\t\u0001\u0000\u0000\u0000mn\u0005"+
		"*\u0000\u0000ns\u0005\u0001\u0000\u0000or\u00038\u001c\u0000pr\u0003\u0004"+
		"\u0002\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005/\u0000\u0000"+
		"wx\u0005\u0002\u0000\u0000xy\u0005 \u0000\u0000y\u000b\u0001\u0000\u0000"+
		"\u0000z{\u0005+\u0000\u0000{|\u0003\u0006\u0003\u0000|}\u00038\u001c\u0000"+
		"}~\u0005 \u0000\u0000~\r\u0001\u0000\u0000\u0000\u007f\u0080\u0005\"\u0000"+
		"\u0000\u0080\u0081\u00051\u0000\u0000\u0081\u0082\u0003\u0006\u0003\u0000"+
		"\u0082\u0083\u0005 \u0000\u0000\u0083\u000f\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005!\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000\u0086\u0087"+
		"\u0003\u0018\f\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003"+
		"\u001a\r\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0003"+
		"\u0000\u0000\u008b\u008d\u0003\u001c\u000e\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0011\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0092\u00051\u0000"+
		"\u0000\u0092\u0094\u0005\u0001\u0000\u0000\u0093\u0095\u0005\u001f\u0000"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u00a7\u0001\u0000\u0000\u0000\u0096\u00a8\u0003\u001c\u000e"+
		"\u0000\u0097\u0098\u0005\u0004\u0000\u0000\u0098\u00a8\u00051\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009d\u00051\u0000\u0000\u009b"+
		"\u009d\u0005\u001d\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u00032\u0019\u0000\u009f\u00a1\u00030\u0018\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0004\u0000\u0000\u00a3\u00a6\u0005"+
		"1\u0000\u0000\u00a4\u00a6\u0005\u001d\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a7\u0096\u0001\u0000\u0000\u0000\u00a7\u0097\u0001\u0000"+
		"\u0000\u0000\u00a7\u009c\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u0013\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005#\u0000\u0000\u00ac\u00ad\u0005\u0001\u0000"+
		"\u0000\u00ad\u00ae\u00038\u001c\u0000\u00ae\u00af\u0005\u0002\u0000\u0000"+
		"\u00af\u0015\u0001\u0000\u0000\u0000\u00b0\u00b4\u0003\u001c\u000e\u0000"+
		"\u00b1\u00b4\u0003\u0018\f\u0000\u00b2\u00b4\u00038\u001c\u0000\u00b3"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u0017\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7\u00051\u0000\u0000\u00b7\u0019"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0000\u0000\u0000\u00b9\u001b"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0001\u0000\u0000\u00bb\u001d"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005%\u0000\u0000\u00bd\u00be\u0005"+
		"\u0001\u0000\u0000\u00be\u00bf\u0003\u0018\f\u0000\u00bf\u00c8\u0005\u0003"+
		"\u0000\u0000\u00c0\u00c9\u0005\u001d\u0000\u0000\u00c1\u00c4\u0003\u0018"+
		"\f\u0000\u00c2\u00c5\u00030\u0018\u0000\u00c3\u00c5\u00032\u0019\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0018\f\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0002\u0000\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u001f"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005&\u0000\u0000\u00ce\u00cf\u0005"+
		"\u0001\u0000\u0000\u00cf\u00d0\u0003\u0018\f\u0000\u00d0\u00d1\u0005\u0002"+
		"\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\'\u0000"+
		"\u0000\u00d3\u00d5\u0005\u0001\u0000\u0000\u00d4\u00d6\u0005\u0004\u0000"+
		"\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u00051\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0002\u0000\u0000\u00d9#\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005(\u0000\u0000\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00dd"+
		"\u00036\u001b\u0000\u00dd\u00de\u0005\u0002\u0000\u0000\u00de\u00df\u0005"+
		" \u0000\u0000\u00df%\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005)\u0000"+
		"\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u00e3\u0005 \u0000\u0000"+
		"\u00e3\'\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5"+
		"\u00e7\u00050\u0000\u0000\u00e6\u00e8\u0003\u0006\u0003\u0000\u00e7\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005 \u0000\u0000\u00ea)\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0005-\u0000\u0000\u00ec\u00ed\u0003\u0006\u0003"+
		"\u0000\u00ed\u00ee\u0005 \u0000\u0000\u00ee+\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005.\u0000\u0000\u00f0\u00f1\u0003\u0006\u0003\u0000\u00f1\u00f2"+
		"\u0005 \u0000\u0000\u00f2-\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\t"+
		"\u0000\u0000\u00f4\u00fd\u0005\u0001\u0000\u0000\u00f5\u00fa\u0003\u0016"+
		"\u000b\u0000\u00f6\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f9\u0003\u0016"+
		"\u000b\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00f5\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0002"+
		"\u0000\u0000\u0100\u0101\u0005 \u0000\u0000\u0101/\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0007\u0002\u0000\u0000\u01031\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0007\u0003\u0000\u0000\u01053\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0007\u0004\u0000\u0000\u01075\u0001\u0000\u0000\u0000\u0108\u0109\u0007"+
		"\u0005\u0000\u0000\u01097\u0001\u0000\u0000\u0000\u010a\u010b\u0006\u001c"+
		"\uffff\uffff\u0000\u010b\u011d\u0003\u001c\u000e\u0000\u010c\u011d\u0003"+
		"\u0018\f\u0000\u010d\u011d\u00051\u0000\u0000\u010e\u011d\u0005\u001d"+
		"\u0000\u0000\u010f\u0110\u0005\u0001\u0000\u0000\u0110\u0111\u00038\u001c"+
		"\u0000\u0111\u0112\u0005\u0002\u0000\u0000\u0112\u011d\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\u001f\u0000\u0000\u0114\u011d\u00038\u001c\b"+
		"\u0115\u011d\u0003\"\u0011\u0000\u0116\u011d\u0003\u001e\u000f\u0000\u0117"+
		"\u0118\u0003\u0018\f\u0000\u0118\u0119\u00034\u001a\u0000\u0119\u011a"+
		"\u00038\u001c\u0003\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u011d\u0003"+
		"(\u0014\u0000\u011c\u010a\u0001\u0000\u0000\u0000\u011c\u010c\u0001\u0000"+
		"\u0000\u0000\u011c\u010d\u0001\u0000\u0000\u0000\u011c\u010e\u0001\u0000"+
		"\u0000\u0000\u011c\u010f\u0001\u0000\u0000\u0000\u011c\u0113\u0001\u0000"+
		"\u0000\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u012c\u0001\u0000\u0000\u0000\u011e\u011f\n\u0005\u0000"+
		"\u0000\u011f\u0120\u00030\u0018\u0000\u0120\u0121\u00038\u001c\u0006\u0121"+
		"\u012b\u0001\u0000\u0000\u0000\u0122\u0123\n\u0004\u0000\u0000\u0123\u0124"+
		"\u00032\u0019\u0000\u0124\u0125\u00038\u001c\u0005\u0125\u012b\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\n\u0002\u0000\u0000\u0127\u0128\u00034\u001a"+
		"\u0000\u0128\u0129\u0003\u0018\f\u0000\u0129\u012b\u0001\u0000\u0000\u0000"+
		"\u012a\u011e\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000"+
		"\u012a\u0126\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d9\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0134\u0003(\u0014\u0000\u0130\u0134\u0003.\u0017\u0000\u0131\u0134\u0003"+
		"\u0004\u0002\u0000\u0132\u0134\u0003\u0010\b\u0000\u0133\u012f\u0001\u0000"+
		"\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000"+
		"\u0000\u0000\u0136;\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0019?PY]cqs\u008c\u0094\u009c\u00a0\u00a5\u00a7\u00b3\u00c4\u00c8"+
		"\u00d5\u00e7\u00fa\u00fd\u011c\u012a\u012c\u0133\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}