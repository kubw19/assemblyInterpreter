// Generated from com\antlr4\JFK.g4 by ANTLR 4.7
package com.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JFKParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, REGISTERS=8, OP=9, 
		WHITESPACE=10, NUMBER=11;
	public static final int
		RULE_entry = 0, RULE_command = 1, RULE_mov = 2, RULE_push = 3, RULE_interrupt = 4, 
		RULE_expression = 5, RULE_operation = 6;
	public static final String[] ruleNames = {
		"entry", "command", "mov", "push", "interrupt", "expression", "operation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','", "'push'", "'int'", "'0x'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "REGISTERS", "OP", "WHITESPACE", 
		"NUMBER"
	};
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
	public String getGrammarFileName() { return "JFK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JFKParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntryContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JFKParser.EOF, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(JFKParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(JFKParser.WHITESPACE, i);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			command();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(15);
				match(WHITESPACE);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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

	public static class CommandContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public InterruptContext interrupt() {
			return getRuleContext(InterruptContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				push();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				mov();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				interrupt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MovContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode REGISTERS() { return getToken(JFKParser.REGISTERS, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(JFKParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(JFKParser.WHITESPACE, i);
		}
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mov);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				match(WHITESPACE);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(34);
			expression(0);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(35);
				match(WHITESPACE);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(T__1);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(46);
				match(WHITESPACE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(REGISTERS);
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

	public static class PushContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(JFKParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(JFKParser.WHITESPACE, i);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_push);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(WHITESPACE);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(60);
			expression(0);
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

	public static class InterruptContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JFKParser.NUMBER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(JFKParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(JFKParser.WHITESPACE, i);
		}
		public InterruptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrupt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterInterrupt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitInterrupt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitInterrupt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterruptContext interrupt() throws RecognitionException {
		InterruptContext _localctx = new InterruptContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interrupt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(WHITESPACE);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACE );
			setState(68);
			match(T__4);
			setState(69);
			match(NUMBER);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JFKParser.NUMBER, 0); }
		public TerminalNode REGISTERS() { return getToken(JFKParser.REGISTERS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(JFKParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(JFKParser.WHITESPACE, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(72);
				match(NUMBER);
				}
				break;
			case REGISTERS:
				{
				setState(73);
				match(REGISTERS);
				}
				break;
			case T__5:
				{
				setState(74);
				match(T__5);
				setState(75);
				expression(0);
				setState(76);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(80);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITESPACE) {
						{
						{
						setState(81);
						match(WHITESPACE);
						}
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(87);
					operation();
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITESPACE) {
						{
						{
						setState(88);
						match(WHITESPACE);
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(94);
					expression(3);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(JFKParser.OP, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JFKListener ) ((JFKListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JFKVisitor ) return ((JFKVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OP);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rj\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\6\4!\n\4\r\4\16\4\"\3"+
		"\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\6\4-\n\4\r\4\16\4.\3\4\7\4\62\n\4"+
		"\f\4\16\4\65\13\4\3\4\3\4\3\5\3\5\6\5;\n\5\r\5\16\5<\3\5\3\5\3\6\3\6\6"+
		"\6C\n\6\r\6\16\6D\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\7"+
		"\3\7\7\7U\n\7\f\7\16\7X\13\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7"+
		"\7\7c\n\7\f\7\16\7f\13\7\3\b\3\b\3\b\2\3\f\t\2\4\6\b\n\f\16\2\2\2p\2\20"+
		"\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b8\3\2\2\2\n@\3\2\2\2\fP\3\2\2\2\16"+
		"g\3\2\2\2\20\24\5\4\3\2\21\23\7\f\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7\2\2\3\30\3"+
		"\3\2\2\2\31\35\5\b\5\2\32\35\5\6\4\2\33\35\5\n\6\2\34\31\3\2\2\2\34\32"+
		"\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36 \7\3\2\2\37!\7\f\2\2 \37\3\2\2"+
		"\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$(\5\f\7\2%\'\7\f\2\2&%\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+-\7\4\2\2,+"+
		"\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60\62\7\f\2\2\61\60"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66\67\7\n\2\2\67\7\3\2\2\28:\7\5\2\29;\7\f\2\2:9\3\2\2\2;<\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\5\f\7\2?\t\3\2\2\2@B\7\6\2\2AC"+
		"\7\f\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\7\2\2G"+
		"H\7\r\2\2H\13\3\2\2\2IJ\b\7\1\2JQ\7\r\2\2KQ\7\n\2\2LM\7\b\2\2MN\5\f\7"+
		"\2NO\7\t\2\2OQ\3\2\2\2PI\3\2\2\2PK\3\2\2\2PL\3\2\2\2Qd\3\2\2\2RV\f\4\2"+
		"\2SU\7\f\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2"+
		"\2Y]\5\16\b\2Z\\\7\f\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3"+
		"\2\2\2_]\3\2\2\2`a\5\f\7\5ac\3\2\2\2bR\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2e\r\3\2\2\2fd\3\2\2\2gh\7\13\2\2h\17\3\2\2\2\16\24\34\"(.\63<DP"+
		"V]d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}