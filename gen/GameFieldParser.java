// Generated from C:/Users/Robin/IdeaProjects/SE-WS-1617-UE03_2\GameField.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameFieldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Separator=1, LineBreak=2, SimpleValue=3;
	public static final int
		RULE_file = 0, RULE_row = 1, RULE_value = 2;
	public static final String[] ruleNames = {
		"file", "row", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Separator", "LineBreak", "SimpleValue"
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
	public String getGrammarFileName() { return "GameField.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameFieldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GameFieldParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameFieldVisitor ) return ((GameFieldVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SimpleValue) {
				{
				{
				setState(6);
				row();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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

	public static class RowContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LineBreak() { return getToken(GameFieldParser.LineBreak, 0); }
		public TerminalNode EOF() { return getToken(GameFieldParser.EOF, 0); }
		public List<TerminalNode> Separator() { return getTokens(GameFieldParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(GameFieldParser.Separator, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameFieldVisitor ) return ((GameFieldVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			value();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(15);
				match(Separator);
				setState(16);
				value();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==LineBreak) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode SimpleValue() { return getToken(GameFieldParser.SimpleValue, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameFieldListener ) ((GameFieldListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameFieldVisitor ) return ((GameFieldVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(SimpleValue);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\3\7\3\24"+
		"\n\3\f\3\16\3\27\13\3\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\3\3\3\4\4\33\2"+
		"\13\3\2\2\2\4\20\3\2\2\2\6\32\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2"+
		"\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16\17\7\2\2\3"+
		"\17\3\3\2\2\2\20\25\5\6\4\2\21\22\7\3\2\2\22\24\5\6\4\2\23\21\3\2\2\2"+
		"\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2"+
		"\30\31\t\2\2\2\31\5\3\2\2\2\32\33\7\5\2\2\33\7\3\2\2\2\4\13\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}