// Generated from ProjectLang.g4 by ANTLR 4.13.2
package JavaKIP;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProjectLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN_KW=1, FUNCTION_KW=2, RETURN_KW=3, IF=4, ELSE=5, WHILE=6, FOR=7, 
		BREAK_KW=8, CONTINUE_KW=9, PRINT_KW=10, STRUCT_KW=11, INT_KW=12, FLOAT_KW=13, 
		AND_KW=14, OR_KW=15, NOT_KW=16, FloatLiteral=17, IntLiteral=18, Identifier=19, 
		EQ=20, NEQ=21, LE=22, GE=23, LT=24, GT=25, PLUS=26, MINUS=27, STAR=28, 
		SLASH=29, PERCENT=30, ASSIGN=31, LPAREN=32, RPAREN=33, LBRACE=34, RBRACE=35, 
		LBRACK=36, RBRACK=37, COMMA=38, SEMI=39, DOT=40, LINE_COMMENT=41, BLOCK_COMMENT=42, 
		WS=43;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDecl = 2, RULE_lvalue = 3, 
		RULE_exprStmt = 4, RULE_assignment = 5, RULE_ifStat = 6, RULE_whileStat = 7, 
		RULE_forStat = 8, RULE_breakStat = 9, RULE_continueStat = 10, RULE_functionDecl = 11, 
		RULE_parameterList = 12, RULE_parameter = 13, RULE_functionCall = 14, 
		RULE_argumentList = 15, RULE_returnStat = 16, RULE_printStat = 17, RULE_block = 18, 
		RULE_expression = 19, RULE_logicalOrExpression = 20, RULE_logicalAndExpression = 21, 
		RULE_equalityExpression = 22, RULE_relationalExpression = 23, RULE_additiveExpression = 24, 
		RULE_multiplicativeExpression = 25, RULE_unaryExpression = 26, RULE_castExpression = 27, 
		RULE_primaryExpression = 28, RULE_primaryLValue = 29, RULE_arrayLiteral = 30, 
		RULE_literal = 31, RULE_type = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDecl", "lvalue", "exprStmt", "assignment", 
			"ifStat", "whileStat", "forStat", "breakStat", "continueStat", "functionDecl", 
			"parameterList", "parameter", "functionCall", "argumentList", "returnStat", 
			"printStat", "block", "expression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "castExpression", "primaryExpression", "primaryLValue", 
			"arrayLiteral", "literal", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'assign'", "'function'", "'return'", "'if'", "'else'", "'while'", 
			"'for'", "'break'", "'continue'", "'print'", "'struct'", "'int'", "'float'", 
			"'and'", "'or'", "'not'", null, null, null, "'=='", "'!='", "'<='", "'>='", 
			"'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN_KW", "FUNCTION_KW", "RETURN_KW", "IF", "ELSE", "WHILE", 
			"FOR", "BREAK_KW", "CONTINUE_KW", "PRINT_KW", "STRUCT_KW", "INT_KW", 
			"FLOAT_KW", "AND_KW", "OR_KW", "NOT_KW", "FloatLiteral", "IntLiteral", 
			"Identifier", "EQ", "NEQ", "LE", "GE", "LT", "GT", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMA", "SEMI", "DOT", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "ProjectLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProjectLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216755678L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public ContinueStatContext continueStat() {
			return getRuleContext(ContinueStatContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StatementContext {
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends StatementContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public VarDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitVarDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatContext breakStat() {
			return getRuleContext(BreakStatContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclStmtContext extends StatementContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionDeclStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitFunctionDeclStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StatementContext {
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtsContext extends StatementContext {
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ProjectLangParser.SEMI, 0); }
		public ExprStmtsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitExprStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				varDecl();
				setState(75);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				assignment();
				setState(78);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				ifStat();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				whileStat();
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				forStat();
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				breakStat();
				setState(84);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				continueStat();
				setState(87);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new FunctionDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				functionDecl();
				}
				break;
			case 9:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				returnStat();
				setState(91);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				printStat();
				setState(94);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ExprStmtsContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
				exprStmt();
				setState(97);
				match(SEMI);
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
	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ASSIGN_KW() { return getToken(ProjectLangParser.ASSIGN_KW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjectLangParser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(ProjectLangParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(ProjectLangParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(ProjectLangParser.ASSIGN, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ASSIGN_KW);
			setState(102);
			type();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(103);
				match(LBRACK);
				setState(104);
				expression();
				setState(105);
				match(RBRACK);
				}
			}

			setState(109);
			match(Identifier);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(110);
				match(ASSIGN);
				setState(111);
				expression();
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
	public static class LvalueContext extends ParserRuleContext {
		public PrimaryLValueContext primaryLValue() {
			return getRuleContext(PrimaryLValueContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			primaryLValue();
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
	public static class ExprStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			expression();
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
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ProjectLangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			lvalue();
			setState(119);
			match(ASSIGN);
			setState(120);
			expression();
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
	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ProjectLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ProjectLangParser.ELSE, 0); }
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			match(LPAREN);
			setState(124);
			expression();
			setState(125);
			match(RPAREN);
			setState(126);
			block();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(127);
				match(ELSE);
				setState(128);
				block();
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
	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ProjectLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			match(LPAREN);
			setState(133);
			expression();
			setState(134);
			match(RPAREN);
			setState(135);
			block();
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
	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ProjectLangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ProjectLangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ProjectLangParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FOR);
			setState(138);
			match(LPAREN);
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN_KW:
				{
				setState(139);
				varDecl();
				}
				break;
			case Identifier:
				{
				setState(140);
				assignment();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(143);
			match(SEMI);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216753664L) != 0)) {
				{
				setState(144);
				expression();
				}
			}

			setState(147);
			match(SEMI);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(148);
				assignment();
				}
				break;
			case ASSIGN_KW:
				{
				setState(149);
				varDecl();
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(152);
			match(RPAREN);
			setState(153);
			block();
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
	public static class BreakStatContext extends ParserRuleContext {
		public TerminalNode BREAK_KW() { return getToken(ProjectLangParser.BREAK_KW, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(BREAK_KW);
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
	public static class ContinueStatContext extends ParserRuleContext {
		public TerminalNode CONTINUE_KW() { return getToken(ProjectLangParser.CONTINUE_KW, 0); }
		public ContinueStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatContext continueStat() throws RecognitionException {
		ContinueStatContext _localctx = new ContinueStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CONTINUE_KW);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNCTION_KW() { return getToken(ProjectLangParser.FUNCTION_KW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjectLangParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(FUNCTION_KW);
			setState(160);
			type();
			setState(161);
			match(Identifier);
			setState(162);
			match(LPAREN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536576L) != 0)) {
				{
				setState(163);
				parameterList();
				}
			}

			setState(166);
			match(RPAREN);
			setState(167);
			block();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectLangParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			parameter();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170);
				match(COMMA);
				setState(171);
				parameter();
				}
				}
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ProjectLangParser.Identifier, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			type();
			setState(178);
			match(Identifier);
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
		public TerminalNode Identifier() { return getToken(ProjectLangParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Identifier);
			setState(181);
			match(LPAREN);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216753664L) != 0)) {
				{
				setState(182);
				argumentList();
				}
			}

			setState(185);
			match(RPAREN);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectLangParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			expression();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				expression();
				}
				}
				setState(194);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN_KW() { return getToken(ProjectLangParser.RETURN_KW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN_KW);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216753664L) != 0)) {
				{
				setState(196);
				expression();
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
	public static class PrintStatContext extends ParserRuleContext {
		public TerminalNode PRINT_KW() { return getToken(ProjectLangParser.PRINT_KW, 0); }
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(PRINT_KW);
			setState(200);
			match(LPAREN);
			setState(201);
			expression();
			setState(202);
			match(RPAREN);
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
		public TerminalNode LBRACE() { return getToken(ProjectLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ProjectLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LBRACE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216755678L) != 0)) {
				{
				{
				setState(205);
				statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RBRACE);
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR_KW() { return getTokens(ProjectLangParser.OR_KW); }
		public TerminalNode OR_KW(int i) {
			return getToken(ProjectLangParser.OR_KW, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			logicalAndExpression();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_KW) {
				{
				{
				setState(216);
				match(OR_KW);
				setState(217);
				logicalAndExpression();
				}
				}
				setState(222);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND_KW() { return getTokens(ProjectLangParser.AND_KW); }
		public TerminalNode AND_KW(int i) {
			return getToken(ProjectLangParser.AND_KW, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			equalityExpression();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_KW) {
				{
				{
				setState(224);
				match(AND_KW);
				setState(225);
				equalityExpression();
				}
				}
				setState(230);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(ProjectLangParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(ProjectLangParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(ProjectLangParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(ProjectLangParser.NEQ, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			relationalExpression();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				relationalExpression();
				}
				}
				setState(238);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ProjectLangParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ProjectLangParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(ProjectLangParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(ProjectLangParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(ProjectLangParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ProjectLangParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(ProjectLangParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(ProjectLangParser.GE, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			additiveExpression();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				additiveExpression();
				}
				}
				setState(246);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ProjectLangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ProjectLangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(ProjectLangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ProjectLangParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			multiplicativeExpression();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				multiplicativeExpression();
				}
				}
				setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(ProjectLangParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(ProjectLangParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(ProjectLangParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(ProjectLangParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ProjectLangParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(ProjectLangParser.PERCENT, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			unaryExpression();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				unaryExpression();
				}
				}
				setState(262);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NOT_KW() { return getToken(ProjectLangParser.NOT_KW, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ProjectLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ProjectLangParser.MINUS, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExpression);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(NOT_KW);
				setState(264);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(PLUS);
				setState(266);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(MINUS);
				setState(268);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				primaryExpression();
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
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAREN);
			setState(274);
			type();
			setState(275);
			match(RPAREN);
			setState(276);
			primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryLValueContext primaryLValue() {
			return getRuleContext(PrimaryLValueContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ProjectLangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ProjectLangParser.RPAREN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_primaryExpression);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				primaryLValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				arrayLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(LPAREN);
				setState(283);
				expression();
				setState(284);
				match(RPAREN);
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
	public static class PrimaryLValueContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ProjectLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ProjectLangParser.Identifier, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ProjectLangParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ProjectLangParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ProjectLangParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ProjectLangParser.RBRACK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ProjectLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ProjectLangParser.DOT, i);
		}
		public PrimaryLValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryLValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitPrimaryLValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryLValueContext primaryLValue() throws RecognitionException {
		PrimaryLValueContext _localctx = new PrimaryLValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primaryLValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(Identifier);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(289);
					match(LBRACK);
					setState(290);
					expression();
					setState(291);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(293);
					match(DOT);
					setState(294);
					match(Identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(299);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ProjectLangParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ProjectLangParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ProjectLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ProjectLangParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LBRACK);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73216753664L) != 0)) {
				{
				setState(301);
				expression();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302);
					match(COMMA);
					setState(303);
					expression();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311);
			match(RBRACK);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(ProjectLangParser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(ProjectLangParser.FloatLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==FloatLiteral || _la==IntLiteral) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_KW() { return getToken(ProjectLangParser.INT_KW, 0); }
		public TerminalNode FLOAT_KW() { return getToken(ProjectLangParser.FLOAT_KW, 0); }
		public TerminalNode Identifier() { return getToken(ProjectLangParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjectLangVisitor ) return ((ProjectLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 536576L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001+\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002q\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0082\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008e\b\b\u0001\b"+
		"\u0001\b\u0003\b\u0092\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a5\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00ad\b\f\n\f"+
		"\f\f\u00b0\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00bf\b\u000f\n\u000f\f\u000f\u00c2\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00c6\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00cf"+
		"\b\u0012\n\u0012\f\u0012\u00d2\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00db\b\u0014"+
		"\n\u0014\f\u0014\u00de\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00e3\b\u0015\n\u0015\f\u0015\u00e6\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00eb\b\u0016\n\u0016\f\u0016\u00ee\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00f3\b\u0017\n\u0017\f\u0017"+
		"\u00f6\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00fb\b"+
		"\u0018\n\u0018\f\u0018\u00fe\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u0103\b\u0019\n\u0019\f\u0019\u0106\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0110\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u011f\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0128\b\u001d\n\u001d\f\u001d\u012b\t\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0131\b\u001e\n\u001e"+
		"\f\u001e\u0134\t\u001e\u0003\u001e\u0136\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0000\u0000!\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@\u0000\u0006\u0001\u0000\u0014\u0015\u0001\u0000\u0016"+
		"\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001c\u001e\u0001\u0000\u0011"+
		"\u0012\u0002\u0000\f\r\u0013\u0013\u0147\u0000E\u0001\u0000\u0000\u0000"+
		"\u0002c\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006r"+
		"\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000"+
		"\u0000\fz\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000"+
		"\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000"+
		"\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000"+
		"\u0018\u00a9\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000"+
		"\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000"+
		" \u00c3\u0001\u0000\u0000\u0000\"\u00c7\u0001\u0000\u0000\u0000$\u00cc"+
		"\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00d7\u0001\u0000"+
		"\u0000\u0000*\u00df\u0001\u0000\u0000\u0000,\u00e7\u0001\u0000\u0000\u0000"+
		".\u00ef\u0001\u0000\u0000\u00000\u00f7\u0001\u0000\u0000\u00002\u00ff"+
		"\u0001\u0000\u0000\u00004\u010f\u0001\u0000\u0000\u00006\u0111\u0001\u0000"+
		"\u0000\u00008\u011e\u0001\u0000\u0000\u0000:\u0120\u0001\u0000\u0000\u0000"+
		"<\u012c\u0001\u0000\u0000\u0000>\u0139\u0001\u0000\u0000\u0000@\u013b"+
		"\u0001\u0000\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0000\u0000\u0001I\u0001\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002"+
		"\u0000KL\u0005\'\u0000\u0000Ld\u0001\u0000\u0000\u0000MN\u0003\n\u0005"+
		"\u0000NO\u0005\'\u0000\u0000Od\u0001\u0000\u0000\u0000Pd\u0003\f\u0006"+
		"\u0000Qd\u0003\u000e\u0007\u0000Rd\u0003\u0010\b\u0000ST\u0003\u0012\t"+
		"\u0000TU\u0005\'\u0000\u0000Ud\u0001\u0000\u0000\u0000VW\u0003\u0014\n"+
		"\u0000WX\u0005\'\u0000\u0000Xd\u0001\u0000\u0000\u0000Yd\u0003\u0016\u000b"+
		"\u0000Z[\u0003 \u0010\u0000[\\\u0005\'\u0000\u0000\\d\u0001\u0000\u0000"+
		"\u0000]^\u0003\"\u0011\u0000^_\u0005\'\u0000\u0000_d\u0001\u0000\u0000"+
		"\u0000`a\u0003\b\u0004\u0000ab\u0005\'\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000cJ\u0001\u0000\u0000\u0000cM\u0001\u0000\u0000\u0000cP\u0001\u0000"+
		"\u0000\u0000cQ\u0001\u0000\u0000\u0000cR\u0001\u0000\u0000\u0000cS\u0001"+
		"\u0000\u0000\u0000cV\u0001\u0000\u0000\u0000cY\u0001\u0000\u0000\u0000"+
		"cZ\u0001\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000"+
		"\u0000d\u0003\u0001\u0000\u0000\u0000ef\u0005\u0001\u0000\u0000fk\u0003"+
		"@ \u0000gh\u0005$\u0000\u0000hi\u0003&\u0013\u0000ij\u0005%\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mp\u0005\u0013\u0000\u0000no\u0005\u001f"+
		"\u0000\u0000oq\u0003&\u0013\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0003:\u001d\u0000s\u0007"+
		"\u0001\u0000\u0000\u0000tu\u0003&\u0013\u0000u\t\u0001\u0000\u0000\u0000"+
		"vw\u0003\u0006\u0003\u0000wx\u0005\u001f\u0000\u0000xy\u0003&\u0013\u0000"+
		"y\u000b\u0001\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0005 \u0000"+
		"\u0000|}\u0003&\u0013\u0000}~\u0005!\u0000\u0000~\u0081\u0003$\u0012\u0000"+
		"\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0082\u0003$\u0012\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\r\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085"+
		"\u0005 \u0000\u0000\u0085\u0086\u0003&\u0013\u0000\u0086\u0087\u0005!"+
		"\u0000\u0000\u0087\u0088\u0003$\u0012\u0000\u0088\u000f\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008d\u0005 \u0000\u0000"+
		"\u008b\u008e\u0003\u0004\u0002\u0000\u008c\u008e\u0003\n\u0005\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0005\'\u0000\u0000\u0090\u0092\u0003&\u0013\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0005\'\u0000\u0000\u0094\u0097\u0003"+
		"\n\u0005\u0000\u0095\u0097\u0003\u0004\u0002\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005!\u0000"+
		"\u0000\u0099\u009a\u0003$\u0012\u0000\u009a\u0011\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\b\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\t\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\u0002\u0000\u0000\u00a0\u00a1\u0003@ \u0000\u00a1\u00a2\u0005\u0013"+
		"\u0000\u0000\u00a2\u00a4\u0005 \u0000\u0000\u00a3\u00a5\u0003\u0018\f"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005!\u0000\u0000"+
		"\u00a7\u00a8\u0003$\u0012\u0000\u00a8\u0017\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ae\u0003\u001a\r\u0000\u00aa\u00ab\u0005&\u0000\u0000\u00ab\u00ad"+
		"\u0003\u001a\r\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0003@ \u0000\u00b2\u00b3\u0005\u0013\u0000"+
		"\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0013\u0000"+
		"\u0000\u00b5\u00b7\u0005 \u0000\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005!\u0000\u0000\u00ba"+
		"\u001d\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003&\u0013\u0000\u00bc\u00bd"+
		"\u0005&\u0000\u0000\u00bd\u00bf\u0003&\u0013\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u001f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u0003"+
		"\u0000\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6!\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9"+
		"\u00ca\u0003&\u0013\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb#\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d0\u0005\"\u0000\u0000\u00cd\u00cf\u0003\u0002"+
		"\u0001\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005#\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003(\u0014\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7"+
		"\u00dc\u0003*\u0015\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9\u00db"+
		"\u0003*\u0015\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e4\u0003,\u0016\u0000\u00e0\u00e1\u0005\u000e\u0000"+
		"\u0000\u00e1\u00e3\u0003,\u0016\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5+\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ec\u0003.\u0017\u0000\u00e8\u00e9"+
		"\u0007\u0000\u0000\u0000\u00e9\u00eb\u0003.\u0017\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed-\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f4\u00030\u0018"+
		"\u0000\u00f0\u00f1\u0007\u0001\u0000\u0000\u00f1\u00f3\u00030\u0018\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5/\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fc\u00032\u0019\u0000\u00f8\u00f9\u0007\u0002\u0000\u0000\u00f9\u00fb"+
		"\u00032\u0019\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd1\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0104\u00034\u001a\u0000\u0100\u0101\u0007\u0003\u0000"+
		"\u0000\u0101\u0103\u00034\u001a\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u01053\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u0010\u0000\u0000\u0108"+
		"\u0110\u00034\u001a\u0000\u0109\u010a\u0005\u001a\u0000\u0000\u010a\u0110"+
		"\u00034\u001a\u0000\u010b\u010c\u0005\u001b\u0000\u0000\u010c\u0110\u0003"+
		"4\u001a\u0000\u010d\u0110\u00036\u001b\u0000\u010e\u0110\u00038\u001c"+
		"\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000"+
		"\u0000\u010f\u010b\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u01105\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0005 \u0000\u0000\u0112\u0113\u0003@ \u0000\u0113\u0114"+
		"\u0005!\u0000\u0000\u0114\u0115\u00038\u001c\u0000\u01157\u0001\u0000"+
		"\u0000\u0000\u0116\u011f\u0003:\u001d\u0000\u0117\u011f\u0003>\u001f\u0000"+
		"\u0118\u011f\u0003<\u001e\u0000\u0119\u011f\u0003\u001c\u000e\u0000\u011a"+
		"\u011b\u0005 \u0000\u0000\u011b\u011c\u0003&\u0013\u0000\u011c\u011d\u0005"+
		"!\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0116\u0001\u0000"+
		"\u0000\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000"+
		"\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000"+
		"\u0000\u0000\u011f9\u0001\u0000\u0000\u0000\u0120\u0129\u0005\u0013\u0000"+
		"\u0000\u0121\u0122\u0005$\u0000\u0000\u0122\u0123\u0003&\u0013\u0000\u0123"+
		"\u0124\u0005%\u0000\u0000\u0124\u0128\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005(\u0000\u0000\u0126\u0128\u0005\u0013\u0000\u0000\u0127\u0121\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u012b\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a;\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u0135\u0005$\u0000\u0000\u012d\u0132\u0003&\u0013\u0000"+
		"\u012e\u012f\u0005&\u0000\u0000\u012f\u0131\u0003&\u0013\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u012d"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0005%\u0000\u0000\u0138=\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0007\u0004\u0000\u0000\u013a?\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0007\u0005\u0000\u0000\u013cA\u0001\u0000\u0000\u0000"+
		"\u001aEckp\u0081\u008d\u0091\u0096\u00a4\u00ae\u00b7\u00c0\u00c5\u00d0"+
		"\u00dc\u00e4\u00ec\u00f4\u00fc\u0104\u010f\u011e\u0127\u0129\u0132\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}