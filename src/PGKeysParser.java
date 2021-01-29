// Generated from ./src/PGKeys.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PGKeysParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		CHAR=25, WS=26;
	public static final int
		RULE_pgkeys = 0, RULE_scope = 1, RULE_descriptor = 2, RULE_var = 3, RULE_dnode = 4, 
		RULE_stmtnode = 5, RULE_stmtedge = 6, RULE_varprop = 7, RULE_vars = 8, 
		RULE_varprops = 9, RULE_varsplusvarprops = 10, RULE_statement = 11, RULE_op = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"pgkeys", "scope", "descriptor", "var", "dnode", "stmtnode", "stmtedge", 
			"varprop", "vars", "varprops", "varsplusvarprops", "statement", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'FOR'", "'EXCLUSIVE'", "'MANDATORY'", "'EXCLUSIVE MANDATORY'", 
			"'EXCLUSIVE SINGLETON'", "'MANDATORY SINGLETON'", "'IDENTIFIER'", "'WITHIN'", 
			"'WHERE'", "'('", "':'", "')'", "'.'", "','", "')-['", "']->('", "'>'", 
			"'<'", "'='", "'<>'", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRING", "CHAR", "WS"
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
	public String getGrammarFileName() { return "PGKeys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PGKeysParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PgkeysContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public DescriptorContext descriptor() {
			return getRuleContext(DescriptorContext.class,0);
		}
		public PgkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterPgkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitPgkeys(this);
		}
	}

	public final PgkeysContext pgkeys() throws RecognitionException {
		PgkeysContext _localctx = new PgkeysContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pgkeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			scope();
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(29);
			descriptor();
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

	public static class ScopeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DnodeContext dnode() {
			return getRuleContext(DnodeContext.class,0);
		}
		public List<VarpropContext> varprop() {
			return getRuleContexts(VarpropContext.class);
		}
		public VarpropContext varprop(int i) {
			return getRuleContext(VarpropContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PGKeysParser.STRING, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(31);
				var();
				}
				break;
			case 2:
				{
				setState(32);
				dnode();
				}
				break;
			case 3:
				{
				setState(33);
				varprop();
				}
				break;
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(36);
				match(T__7);
				setState(37);
				statement();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(38);
					match(T__8);
					setState(39);
					varprop();
					setState(40);
					op();
					setState(41);
					match(STRING);
					}
				}

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

	public static class DescriptorContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarpropsContext varprops() {
			return getRuleContext(VarpropsContext.class,0);
		}
		public VarsplusvarpropsContext varsplusvarprops() {
			return getRuleContext(VarsplusvarpropsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitDescriptor(this);
		}
	}

	public final DescriptorContext descriptor() throws RecognitionException {
		DescriptorContext _localctx = new DescriptorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descriptor);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				vars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				varprops();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				varsplusvarprops();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(50);
					match(T__7);
					setState(51);
					statement();
					}
				}

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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PGKeysParser.STRING, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(STRING);
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

	public static class DnodeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PGKeysParser.STRING, 0); }
		public DnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dnode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterDnode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitDnode(this);
		}
	}

	public final DnodeContext dnode() throws RecognitionException {
		DnodeContext _localctx = new DnodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dnode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__9);
			setState(59);
			var();
			setState(60);
			match(T__10);
			setState(61);
			match(STRING);
			setState(62);
			match(T__11);
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

	public static class StmtnodeContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(PGKeysParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PGKeysParser.STRING, i);
		}
		public StmtnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtnode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterStmtnode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitStmtnode(this);
		}
	}

	public final StmtnodeContext stmtnode() throws RecognitionException {
		StmtnodeContext _localctx = new StmtnodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtnode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==STRING) {
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					{
					setState(64);
					var();
					setState(65);
					match(T__10);
					setState(66);
					match(STRING);
					}
					}
					break;
				case 2:
					{
					{
					setState(68);
					match(T__10);
					setState(69);
					match(STRING);
					}
					}
					break;
				case 3:
					{
					setState(70);
					var();
					}
					break;
				}
				}
				setState(75);
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

	public static class StmtedgeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PGKeysParser.STRING, 0); }
		public StmtedgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtedge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterStmtedge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitStmtedge(this);
		}
	}

	public final StmtedgeContext stmtedge() throws RecognitionException {
		StmtedgeContext _localctx = new StmtedgeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmtedge);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				var();
				setState(77);
				match(T__10);
				setState(78);
				match(STRING);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(80);
				match(T__10);
				setState(81);
				match(STRING);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				var();
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

	public static class VarpropContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PGKeysParser.STRING, 0); }
		public VarpropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varprop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterVarprop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitVarprop(this);
		}
	}

	public final VarpropContext varprop() throws RecognitionException {
		VarpropContext _localctx = new VarpropContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varprop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			var();
			setState(86);
			match(T__12);
			setState(87);
			match(STRING);
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

	public static class VarsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			var();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__13);
					setState(91);
					var();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class VarpropsContext extends ParserRuleContext {
		public List<VarpropContext> varprop() {
			return getRuleContexts(VarpropContext.class);
		}
		public VarpropContext varprop(int i) {
			return getRuleContext(VarpropContext.class,i);
		}
		public VarpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterVarprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitVarprops(this);
		}
	}

	public final VarpropsContext varprops() throws RecognitionException {
		VarpropsContext _localctx = new VarpropsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varprops);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			varprop();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(T__13);
					setState(99);
					varprop();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class VarsplusvarpropsContext extends ParserRuleContext {
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<VarpropsContext> varprops() {
			return getRuleContexts(VarpropsContext.class);
		}
		public VarpropsContext varprops(int i) {
			return getRuleContext(VarpropsContext.class,i);
		}
		public VarpropContext varprop() {
			return getRuleContext(VarpropContext.class,0);
		}
		public VarsplusvarpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsplusvarprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterVarsplusvarprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitVarsplusvarprops(this);
		}
	}

	public final VarsplusvarpropsContext varsplusvarprops() throws RecognitionException {
		VarsplusvarpropsContext _localctx = new VarsplusvarpropsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varsplusvarprops);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				vars();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(106);
					match(T__13);
					setState(107);
					varprops();
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				varprop();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(114);
					match(T__13);
					setState(115);
					vars();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				vars();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(122);
					match(T__13);
					setState(123);
					varprops();
					setState(124);
					match(T__13);
					setState(125);
					vars();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public List<StmtnodeContext> stmtnode() {
			return getRuleContexts(StmtnodeContext.class);
		}
		public StmtnodeContext stmtnode(int i) {
			return getRuleContext(StmtnodeContext.class,i);
		}
		public StmtedgeContext stmtedge() {
			return getRuleContext(StmtedgeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
			setState(135);
			stmtnode();
			setState(136);
			match(T__14);
			setState(137);
			stmtedge();
			setState(138);
			match(T__15);
			setState(139);
			stmtnode();
			setState(140);
			match(T__11);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGKeysListener ) ((PGKeysListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3%\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\67\n\4\5\49\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV\n"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13\3\13\3\13"+
		"\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\7\fo\n\f\f\f\16\fr\13\f\3\f"+
		"\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0082\n\f"+
		"\f\f\16\f\u0085\13\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\4\t\3\2\23"+
		"\31\2\u0098\2\34\3\2\2\2\4$\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f"+
		"K\3\2\2\2\16U\3\2\2\2\20W\3\2\2\2\22[\3\2\2\2\24c\3\2\2\2\26\u0086\3\2"+
		"\2\2\30\u0088\3\2\2\2\32\u0090\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2\36"+
		"\37\t\2\2\2\37 \5\6\4\2 \3\3\2\2\2!%\5\b\5\2\"%\5\n\6\2#%\5\20\t\2$!\3"+
		"\2\2\2$\"\3\2\2\2$#\3\2\2\2%/\3\2\2\2&\'\7\n\2\2\'-\5\30\r\2()\7\13\2"+
		"\2)*\5\20\t\2*+\5\32\16\2+,\7\32\2\2,.\3\2\2\2-(\3\2\2\2-.\3\2\2\2.\60"+
		"\3\2\2\2/&\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\619\5\22\n\2\629\5\24\13\2"+
		"\63\66\5\26\f\2\64\65\7\n\2\2\65\67\5\30\r\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\679\3\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\29\7\3\2\2\2:;\7\32\2"+
		"\2;\t\3\2\2\2<=\7\f\2\2=>\5\b\5\2>?\7\r\2\2?@\7\32\2\2@A\7\16\2\2A\13"+
		"\3\2\2\2BC\5\b\5\2CD\7\r\2\2DE\7\32\2\2EJ\3\2\2\2FG\7\r\2\2GJ\7\32\2\2"+
		"HJ\5\b\5\2IB\3\2\2\2IF\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"L\r\3\2\2\2MK\3\2\2\2NO\5\b\5\2OP\7\r\2\2PQ\7\32\2\2QV\3\2\2\2RS\7\r\2"+
		"\2SV\7\32\2\2TV\5\b\5\2UN\3\2\2\2UR\3\2\2\2UT\3\2\2\2V\17\3\2\2\2WX\5"+
		"\b\5\2XY\7\17\2\2YZ\7\32\2\2Z\21\3\2\2\2[`\5\b\5\2\\]\7\20\2\2]_\5\b\5"+
		"\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2ch\5"+
		"\20\t\2de\7\20\2\2eg\5\20\t\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"i\25\3\2\2\2jh\3\2\2\2kp\5\22\n\2lm\7\20\2\2mo\5\24\13\2nl\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\u0087\3\2\2\2rp\3\2\2\2sx\5\20\t\2tu\7\20"+
		"\2\2uw\5\22\n\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0087\3\2\2\2"+
		"zx\3\2\2\2{\u0083\5\22\n\2|}\7\20\2\2}~\5\24\13\2~\177\7\20\2\2\177\u0080"+
		"\5\22\n\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086k\3\2\2\2\u0086s\3\2\2\2\u0086{\3\2\2\2\u0087\27\3\2\2\2\u0088"+
		"\u0089\7\f\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7\21\2\2\u008b\u008c\5"+
		"\16\b\2\u008c\u008d\7\22\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\16\2\2"+
		"\u008f\31\3\2\2\2\u0090\u0091\t\3\2\2\u0091\33\3\2\2\2\20$-/\668IKU`h"+
		"px\u0083\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}