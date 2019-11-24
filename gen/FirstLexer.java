// Generated from C:/Users/kubw1/IdeaProjects/parsesJFK/src/main/antlr4/com\JFK.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FirstLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, REGISTERS=3, COMMAND=4, WHITESPACE=5, DIGITS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "REGISTERS", "COMMAND", "WHITESPACE", "DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'test'", "'push '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "REGISTERS", "COMMAND", "WHITESPACE", "DIGITS"
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


	public FirstLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JFK.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b<\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3\6\3\7\6\7"+
		"9\n\7\r\7\16\7:\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\4\4\2\13\13\"\"\3\2"+
		"\62;\2@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\3\17\3\2\2\2\5\24\3\2\2\2\7*\3\2\2\2\t\63\3\2\2\2\13\65\3\2"+
		"\2\2\r8\3\2\2\2\17\20\7v\2\2\20\21\7g\2\2\21\22\7u\2\2\22\23\7v\2\2\23"+
		"\4\3\2\2\2\24\25\7r\2\2\25\26\7w\2\2\26\27\7u\2\2\27\30\7j\2\2\30\31\7"+
		"\"\2\2\31\6\3\2\2\2\32\33\7\'\2\2\33\34\7g\2\2\34\35\7c\2\2\35+\7z\2\2"+
		"\36\37\7\'\2\2\37 \7g\2\2 !\7d\2\2!+\7z\2\2\"#\7\'\2\2#$\7g\2\2$%\7e\2"+
		"\2%+\7z\2\2&\'\7\'\2\2\'(\7g\2\2()\7f\2\2)+\7z\2\2*\32\3\2\2\2*\36\3\2"+
		"\2\2*\"\3\2\2\2*&\3\2\2\2+\b\3\2\2\2,-\7r\2\2-.\7w\2\2./\7u\2\2/\64\7"+
		"j\2\2\60\61\7o\2\2\61\62\7q\2\2\62\64\7x\2\2\63,\3\2\2\2\63\60\3\2\2\2"+
		"\64\n\3\2\2\2\65\66\t\2\2\2\66\f\3\2\2\2\679\t\3\2\28\67\3\2\2\29:\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;\16\3\2\2\2\6\2*\63:\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}