package maow.caffeine.parsing;// Generated from JavaParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, DATA=51, DECIMAL_LITERAL=52, HEX_LITERAL=53, OCT_LITERAL=54, 
		BINARY_LITERAL=55, FLOAT_LITERAL=56, HEX_FLOAT_LITERAL=57, BOOL_LITERAL=58, 
		CHAR_LITERAL=59, STRING_LITERAL=60, NULL_LITERAL=61, LPAREN=62, RPAREN=63, 
		LBRACE=64, RBRACE=65, LBRACK=66, RBRACK=67, SEMI=68, COMMA=69, DOT=70, 
		ASSIGN=71, GT=72, LT=73, BANG=74, TILDE=75, QUESTION=76, COLON=77, EQUAL=78, 
		LE=79, GE=80, NOTEQUAL=81, AND=82, OR=83, INC=84, DEC=85, ADD=86, SUB=87, 
		MUL=88, DIV=89, BITAND=90, BITOR=91, CARET=92, MOD=93, ADD_ASSIGN=94, 
		SUB_ASSIGN=95, MUL_ASSIGN=96, DIV_ASSIGN=97, AND_ASSIGN=98, OR_ASSIGN=99, 
		XOR_ASSIGN=100, MOD_ASSIGN=101, LSHIFT_ASSIGN=102, RSHIFT_ASSIGN=103, 
		URSHIFT_ASSIGN=104, ARROW=105, COLONCOLON=106, AT=107, ELLIPSIS=108, WS=109, 
		COMMENT=110, LINE_COMMENT=111, IDENTIFIER=112;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_methodDeclaration = 20, 
		RULE_methodBody = 21, RULE_typeTypeOrVoid = 22, RULE_genericMethodDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceMethodDeclaration = 31, 
		RULE_interfaceMethodModifier = 32, RULE_genericInterfaceMethodDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInitializer = 38, RULE_classOrInterfaceType = 39, 
		RULE_typeArgument = 40, RULE_qualifiedNameList = 41, RULE_formalParameters = 42, 
		RULE_formalParameterList = 43, RULE_formalParameter = 44, RULE_lastFormalParameter = 45, 
		RULE_qualifiedName = 46, RULE_literal = 47, RULE_integerLiteral = 48, 
		RULE_floatLiteral = 49, RULE_altAnnotationQualifiedName = 50, RULE_annotation = 51, 
		RULE_elementValuePairs = 52, RULE_elementValuePair = 53, RULE_elementValue = 54, 
		RULE_elementValueArrayInitializer = 55, RULE_annotationTypeDeclaration = 56, 
		RULE_annotationTypeBody = 57, RULE_annotationTypeElementDeclaration = 58, 
		RULE_annotationTypeElementRest = 59, RULE_annotationMethodOrConstantRest = 60, 
		RULE_annotationMethodRest = 61, RULE_annotationConstantRest = 62, RULE_defaultValue = 63, 
		RULE_block = 64, RULE_blockStatement = 65, RULE_localVariableDeclaration = 66, 
		RULE_localTypeDeclaration = 67, RULE_statement = 68, RULE_catchClause = 69, 
		RULE_catchType = 70, RULE_finallyBlock = 71, RULE_resourceSpecification = 72, 
		RULE_resources = 73, RULE_resource = 74, RULE_switchBlockStatementGroup = 75, 
		RULE_switchLabel = 76, RULE_forControl = 77, RULE_forInit = 78, RULE_enhancedForControl = 79, 
		RULE_parExpression = 80, RULE_expressionList = 81, RULE_methodCall = 82, 
		RULE_expression = 83, RULE_lambdaExpression = 84, RULE_lambdaParameters = 85, 
		RULE_lambdaBody = 86, RULE_primary = 87, RULE_classType = 88, RULE_creator = 89, 
		RULE_createdName = 90, RULE_innerCreator = 91, RULE_arrayCreatorRest = 92, 
		RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, RULE_typeArgumentsOrDiamond = 95, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 96, RULE_nonWildcardTypeArguments = 97, 
		RULE_typeList = 98, RULE_typeType = 99, RULE_primitiveType = 100, RULE_typeArguments = 101, 
		RULE_superSuffix = 102, RULE_explicitGenericInvocationSuffix = 103, RULE_arguments = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
			"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "methodDeclaration", 
			"methodBody", "typeTypeOrVoid", "genericMethodDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceMethodDeclaration", "interfaceMethodModifier", "genericInterfaceMethodDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "classOrInterfaceType", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
			"lastFormalParameter", "qualifiedName", "literal", "integerLiteral", 
			"floatLiteral", "altAnnotationQualifiedName", "annotation", "elementValuePairs", 
			"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
			"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
			"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
			"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "methodCall", "expression", "lambdaExpression", "lambdaParameters", 
			"lambdaBody", "primary", "classType", "creator", "createdName", "innerCreator", 
			"arrayCreatorRest", "classCreatorRest", "explicitGenericInvocation", 
			"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", 
			"typeList", "typeType", "primitiveType", "typeArguments", "superSuffix", 
			"explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", "'data'", 
			null, null, null, null, null, null, null, null, null, "'null'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
			"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
			"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
			"'<<='", "'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "DATA", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
	public String getGrammarFileName() { return "JavaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(210);
				packageDeclaration();
				}
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(213);
				importDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << DATA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SEMI - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(219);
				typeDeclaration();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(227);
				annotation();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(PACKAGE);
			setState(234);
			qualifiedName();
			setState(235);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JavaParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IMPORT);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(238);
				match(STATIC);
				}
			}

			setState(241);
			qualifiedName();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(242);
				match(DOT);
				setState(243);
				match(MUL);
				}
			}

			setState(246);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case DATA:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(254);
					classDeclaration();
					}
					break;
				case ENUM:
					{
					setState(255);
					enumDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(256);
					interfaceDeclaration();
					}
					break;
				case AT:
					{
					setState(257);
					annotationTypeDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case DATA:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(NATIVE);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(SYNCHRONIZED);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(VOLATILE);
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public TerminalNode DATA() { return getToken(JavaParser.DATA, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(STATIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(ABSTRACT);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(STRICTFP);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 9);
				{
				setState(278);
				match(DATA);
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

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(FINAL);
				}
				break;
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CLASS);
			setState(286);
			match(IDENTIFIER);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(287);
				typeParameters();
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(290);
				match(EXTENDS);
				setState(291);
				typeType();
				}
			}

			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(294);
				match(IMPLEMENTS);
				setState(295);
				typeList();
				}
			}

			setState(298);
			classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LT);
			setState(301);
			typeParameter();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(302);
				match(COMMA);
				setState(303);
				typeParameter();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					annotation();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(317);
			match(IDENTIFIER);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(318);
				match(EXTENDS);
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(319);
						annotation();
						}
						} 
					}
					setState(324);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(325);
				typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			typeType();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(329);
				match(BITAND);
				setState(330);
				typeType();
				}
				}
				setState(335);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ENUM);
			setState(337);
			match(IDENTIFIER);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(338);
				match(IMPLEMENTS);
				setState(339);
				typeList();
				}
			}

			setState(342);
			match(LBRACE);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT || _la==IDENTIFIER) {
				{
				setState(343);
				enumConstants();
				}
			}

			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(346);
				match(COMMA);
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(349);
				enumBodyDeclarations();
				}
			}

			setState(352);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			enumConstant();
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(355);
					match(COMMA);
					setState(356);
					enumConstant();
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					annotation();
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(368);
			match(IDENTIFIER);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(369);
				arguments();
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(372);
				classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(SEMI);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << DATA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(376);
				classBodyDeclaration();
				}
				}
				setState(381);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(INTERFACE);
			setState(383);
			match(IDENTIFIER);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(384);
				typeParameters();
				}
			}

			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(387);
				match(EXTENDS);
				setState(388);
				typeList();
				}
			}

			setState(391);
			interfaceBody();
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

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LBRACE);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << DATA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(394);
				classBodyDeclaration();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(LBRACE);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << DATA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SEMI - 68)) | (1L << (LT - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(403);
				interfaceBodyDeclaration();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(412);
					match(STATIC);
					}
				}

				setState(415);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(416);
						modifier();
						}
						} 
					}
					setState(421);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(422);
				memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			typeTypeOrVoid();
			setState(437);
			match(IDENTIFIER);
			setState(438);
			formalParameters();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(439);
				match(LBRACK);
				setState(440);
				match(RBRACK);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(446);
				match(THROWS);
				setState(447);
				qualifiedNameList();
				}
			}

			setState(450);
			methodBody();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodBody);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(SEMI);
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

	public static class TypeTypeOrVoidContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TypeTypeOrVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTypeOrVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeTypeOrVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeTypeOrVoid(this);
		}
	}

	public final TypeTypeOrVoidContext typeTypeOrVoid() throws RecognitionException {
		TypeTypeOrVoidContext _localctx = new TypeTypeOrVoidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeTypeOrVoid);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				typeType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(VOID);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			typeParameters();
			setState(461);
			methodDeclaration();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			typeParameters();
			setState(464);
			constructorDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(IDENTIFIER);
			setState(467);
			formalParameters();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(468);
				match(THROWS);
				setState(469);
				qualifiedNameList();
				}
			}

			setState(472);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			typeType();
			setState(475);
			variableDeclarators();
			setState(476);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DEFAULT:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case DATA:
			case LT:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(478);
						modifier();
						}
						} 
					}
					setState(483);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(484);
				interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(492);
				annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(493);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(494);
				enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			typeType();
			setState(498);
			constantDeclarator();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(499);
				match(COMMA);
				setState(500);
				constantDeclarator();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IDENTIFIER);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(509);
				match(LBRACK);
				setState(510);
				match(RBRACK);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(ASSIGN);
			setState(517);
			variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					interfaceMethodModifier();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case AT:
			case IDENTIFIER:
				{
				setState(525);
				typeTypeOrVoid();
				}
				break;
			case LT:
				{
				setState(526);
				typeParameters();
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(527);
						annotation();
						}
						} 
					}
					setState(532);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(533);
				typeTypeOrVoid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(537);
			match(IDENTIFIER);
			setState(538);
			formalParameters();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(539);
				match(LBRACK);
				setState(540);
				match(RBRACK);
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(546);
				match(THROWS);
				setState(547);
				qualifiedNameList();
				}
			}

			setState(550);
			methodBody();
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

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodModifier);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(556);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(557);
				match(STRICTFP);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			typeParameters();
			setState(561);
			interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			variableDeclarator();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				variableDeclarator();
				}
				}
				setState(570);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			variableDeclaratorId();
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(572);
				match(ASSIGN);
				setState(573);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(IDENTIFIER);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(577);
				match(LBRACK);
				setState(578);
				match(RBRACK);
				}
				}
				setState(583);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LBRACE);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(589);
				variableInitializer();
				setState(594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(590);
						match(COMMA);
						setState(591);
						variableInitializer();
						}
						} 
					}
					setState(596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(597);
					match(COMMA);
					}
				}

				}
			}

			setState(602);
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(IDENTIFIER);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(605);
				typeArguments();
				}
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(DOT);
					setState(609);
					match(IDENTIFIER);
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						setState(610);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				typeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==IDENTIFIER) {
					{
					{
					setState(619);
					annotation();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
				match(QUESTION);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(626);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(627);
					typeType();
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			qualifiedName();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				qualifiedName();
				}
				}
				setState(639);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(LPAREN);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
				{
				setState(641);
				formalParameterList();
				}
			}

			setState(644);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				formalParameter();
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(647);
						match(COMMA);
						setState(648);
						formalParameter();
						}
						} 
					}
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(654);
					match(COMMA);
					setState(655);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				lastFormalParameter();
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameter);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					variableModifier();
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(667);
			typeType();
			setState(668);
			variableDeclaratorId();
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

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					variableModifier();
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(676);
			typeType();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(677);
				annotation();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(683);
			match(ELLIPSIS);
			setState(684);
			variableDeclaratorId();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IDENTIFIER);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					match(DOT);
					setState(688);
					match(IDENTIFIER);
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(JavaParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JavaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(JavaParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(JavaParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(696);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(698);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(699);
				match(NULL_LITERAL);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(JavaParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JavaParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JavaParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(JavaParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(JavaParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(JavaParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
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

	public static class AltAnnotationQualifiedNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AltAnnotationQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAnnotationQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAltAnnotationQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAltAnnotationQualifiedName(this);
		}
	}

	public final AltAnnotationQualifiedNameContext altAnnotationQualifiedName() throws RecognitionException {
		AltAnnotationQualifiedNameContext _localctx = new AltAnnotationQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_altAnnotationQualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(706);
				match(IDENTIFIER);
				setState(707);
				match(DOT);
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(713);
			match(AT);
			setState(714);
			match(IDENTIFIER);
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AltAnnotationQualifiedNameContext altAnnotationQualifiedName() {
			return getRuleContext(AltAnnotationQualifiedNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(716);
				match(AT);
				setState(717);
				qualifiedName();
				}
				break;
			case 2:
				{
				setState(718);
				altAnnotationQualifiedName();
				}
				break;
			}
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(721);
				match(LPAREN);
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(722);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(723);
					elementValue();
					}
					break;
				}
				setState(726);
				match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePairs(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			elementValuePair();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(730);
				match(COMMA);
				setState(731);
				elementValuePair();
				}
				}
				setState(736);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(IDENTIFIER);
			setState(738);
			match(ASSIGN);
			setState(739);
			elementValue();
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

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementValue);
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(LBRACE);
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				setState(747);
				elementValue();
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(748);
						match(COMMA);
						setState(749);
						elementValue();
						}
						} 
					}
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
			}

			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(757);
				match(COMMA);
				}
			}

			setState(760);
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

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(AT);
			setState(763);
			match(INTERFACE);
			setState(764);
			match(IDENTIFIER);
			setState(765);
			annotationTypeBody();
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

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(LBRACE);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << DATA))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (SEMI - 68)) | (1L << (AT - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				{
				setState(768);
				annotationTypeElementDeclaration();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
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

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationTypeElementDeclaration);
		try {
			int _alt;
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case DATA:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(776);
						modifier();
						}
						} 
					}
					setState(781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(782);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				match(SEMI);
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

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationTypeElementRest(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_annotationTypeElementRest);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				typeType();
				setState(787);
				annotationMethodOrConstantRest();
				setState(788);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				classDeclaration();
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(791);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				interfaceDeclaration();
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(795);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				enumDeclaration();
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(799);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				annotationTypeDeclaration();
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(803);
					match(SEMI);
					}
					break;
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

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_annotationMethodOrConstantRest);
		try {
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				annotationConstantRest();
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

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationMethodRest(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(IDENTIFIER);
			setState(813);
			match(LPAREN);
			setState(814);
			match(RPAREN);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(815);
				defaultValue();
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

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitAnnotationConstantRest(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			variableDeclarators();
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

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(DEFAULT);
			setState(821);
			elementValue();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(LBRACE);
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DATA) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
				{
				{
				setState(824);
				blockStatement();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockStatement);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				localVariableDeclaration();
				setState(833);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				localTypeDeclaration();
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_localVariableDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(839);
					variableModifier();
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(845);
			typeType();
			setState(846);
			variableDeclarators();
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

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLocalTypeDeclaration(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case DATA:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << DATA))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					{
					setState(848);
					classOrInterfaceModifier();
					}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(854);
					classDeclaration();
					}
					break;
				case INTERFACE:
					{
					setState(855);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				match(SEMI);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				match(ASSERT);
				setState(863);
				expression(0);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(864);
					match(COLON);
					setState(865);
					expression(0);
					}
				}

				setState(868);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(IF);
				setState(871);
				parExpression();
				setState(872);
				statement();
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(873);
					match(ELSE);
					setState(874);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				match(FOR);
				setState(878);
				match(LPAREN);
				setState(879);
				forControl();
				setState(880);
				match(RPAREN);
				setState(881);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(883);
				match(WHILE);
				setState(884);
				parExpression();
				setState(885);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(887);
				match(DO);
				setState(888);
				statement();
				setState(889);
				match(WHILE);
				setState(890);
				parExpression();
				setState(891);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(893);
				match(TRY);
				setState(894);
				block();
				setState(904);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(896); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(895);
						catchClause();
						}
						}
						setState(898); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(900);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(903);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(906);
				match(TRY);
				setState(907);
				resourceSpecification();
				setState(908);
				block();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(909);
					catchClause();
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(915);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(918);
				match(SWITCH);
				setState(919);
				parExpression();
				setState(920);
				match(LBRACE);
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(921);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(926);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(927);
					switchLabel();
					}
					}
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(935);
				match(SYNCHRONIZED);
				setState(936);
				parExpression();
				setState(937);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(939);
				match(RETURN);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(940);
					expression(0);
					}
				}

				setState(943);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(944);
				match(THROW);
				setState(945);
				expression(0);
				setState(946);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(948);
				match(BREAK);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(949);
					match(IDENTIFIER);
					}
				}

				setState(952);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(953);
				match(CONTINUE);
				setState(955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(954);
					match(IDENTIFIER);
					}
				}

				setState(957);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(958);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(959);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(960);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(962);
				((StatementContext)_localctx).identifierLabel = match(IDENTIFIER);
				setState(963);
				match(COLON);
				setState(964);
				statement();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_catchClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(CATCH);
			setState(968);
			match(LPAREN);
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(969);
					variableModifier();
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			setState(975);
			catchType();
			setState(976);
			match(IDENTIFIER);
			setState(977);
			match(RPAREN);
			setState(978);
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

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			qualifiedName();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(981);
				match(BITOR);
				setState(982);
				qualifiedName();
				}
				}
				setState(987);
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

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(FINALLY);
			setState(989);
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

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			match(LPAREN);
			setState(992);
			resources();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(993);
				match(SEMI);
				}
			}

			setState(996);
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

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			resource();
			setState(1003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(999);
					match(SEMI);
					setState(1000);
					resource();
					}
					} 
				}
				setState(1005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_resource);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1006);
					variableModifier();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1012);
			classOrInterfaceType();
			setState(1013);
			variableDeclaratorId();
			setState(1014);
			match(ASSIGN);
			setState(1015);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1017);
				switchLabel();
				}
				}
				setState(1020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1023); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1022);
				blockStatement();
				}
				}
				setState(1025); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << DATA) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (AT - 64)) | (1L << (IDENTIFIER - 64)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_switchLabel);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				match(CASE);
				setState(1030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1028);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(1029);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(1032);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(DEFAULT);
				setState(1034);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forControl);
		int _la;
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1038);
					forInit();
					}
				}

				setState(1041);
				match(SEMI);
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1042);
					expression(0);
					}
				}

				setState(1045);
				match(SEMI);
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1046);
					((ForControlContext)_localctx).forUpdate = expressionList();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forInit);
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_enhancedForControl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1055);
					variableModifier();
					}
					} 
				}
				setState(1060);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(1061);
			typeType();
			setState(1062);
			variableDeclaratorId();
			setState(1063);
			match(COLON);
			setState(1064);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(LPAREN);
			setState(1067);
			expression(0);
			setState(1068);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			expression(0);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1071);
				match(COMMA);
				setState(1072);
				expression(0);
				}
				}
				setState(1077);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_methodCall);
		int _la;
		try {
			setState(1096);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				match(IDENTIFIER);
				setState(1079);
				match(LPAREN);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1080);
					expressionList();
					}
				}

				setState(1083);
				match(RPAREN);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(THIS);
				setState(1085);
				match(LPAREN);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1086);
					expressionList();
					}
				}

				setState(1089);
				match(RPAREN);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				match(SUPER);
				setState(1091);
				match(LPAREN);
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
					{
					setState(1092);
					expressionList();
					}
				}

				setState(1095);
				match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(JavaParser.COLONCOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JavaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JavaParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(JavaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(JavaParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(JavaParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(JavaParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExpression(this);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1099);
				primary();
				}
				break;
			case 2:
				{
				setState(1100);
				methodCall();
				}
				break;
			case 3:
				{
				setState(1101);
				match(NEW);
				setState(1102);
				creator();
				}
				break;
			case 4:
				{
				setState(1103);
				match(LPAREN);
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1104);
						annotation();
						}
						} 
					}
					setState(1109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1110);
				typeType();
				setState(1111);
				match(RPAREN);
				setState(1112);
				expression(21);
				}
				break;
			case 5:
				{
				setState(1114);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (INC - 84)) | (1L << (DEC - 84)) | (1L << (ADD - 84)) | (1L << (SUB - 84)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1115);
				expression(19);
				}
				break;
			case 6:
				{
				setState(1116);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1117);
				expression(18);
				}
				break;
			case 7:
				{
				setState(1118);
				lambdaExpression();
				}
				break;
			case 8:
				{
				setState(1119);
				typeType();
				setState(1120);
				match(COLONCOLON);
				setState(1126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
				case IDENTIFIER:
					{
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1121);
						typeArguments();
						}
					}

					setState(1124);
					match(IDENTIFIER);
					}
					break;
				case NEW:
					{
					setState(1125);
					match(NEW);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1128);
				classType();
				setState(1129);
				match(COLONCOLON);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1130);
					typeArguments();
					}
				}

				setState(1133);
				match(NEW);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1137);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1138);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (MUL - 88)) | (1L << (DIV - 88)) | (1L << (MOD - 88)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1139);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1140);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1141);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1142);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1143);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1151);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
						case 1:
							{
							setState(1144);
							match(LT);
							setState(1145);
							match(LT);
							}
							break;
						case 2:
							{
							setState(1146);
							match(GT);
							setState(1147);
							match(GT);
							setState(1148);
							match(GT);
							}
							break;
						case 3:
							{
							setState(1149);
							match(GT);
							setState(1150);
							match(GT);
							}
							break;
						}
						setState(1153);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1154);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1155);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (GT - 72)) | (1L << (LT - 72)) | (1L << (LE - 72)) | (1L << (GE - 72)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1156);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1158);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1159);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1161);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(1162);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1163);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1164);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(1165);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1166);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1167);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(1168);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1170);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(1171);
						expression(9);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1173);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(1174);
						expression(8);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1176);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(1177);
						expression(0);
						setState(1178);
						match(COLON);
						setState(1179);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1182);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ASSIGN - 71)) | (1L << (ADD_ASSIGN - 71)) | (1L << (SUB_ASSIGN - 71)) | (1L << (MUL_ASSIGN - 71)) | (1L << (DIV_ASSIGN - 71)) | (1L << (AND_ASSIGN - 71)) | (1L << (OR_ASSIGN - 71)) | (1L << (XOR_ASSIGN - 71)) | (1L << (MOD_ASSIGN - 71)) | (1L << (LSHIFT_ASSIGN - 71)) | (1L << (RSHIFT_ASSIGN - 71)) | (1L << (URSHIFT_ASSIGN - 71)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1183);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1184);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1185);
						((ExpressionContext)_localctx).bop = match(DOT);
						setState(1197);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
						case 1:
							{
							setState(1186);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1187);
							methodCall();
							}
							break;
						case 3:
							{
							setState(1188);
							match(THIS);
							}
							break;
						case 4:
							{
							setState(1189);
							match(NEW);
							setState(1191);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==LT) {
								{
								setState(1190);
								nonWildcardTypeArguments();
								}
							}

							setState(1193);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(1194);
							match(SUPER);
							setState(1195);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(1196);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1200);
						match(LBRACK);
						setState(1201);
						expression(0);
						setState(1202);
						match(RBRACK);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1205);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1206);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1207);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(1208);
						typeType();
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1210);
						match(COLONCOLON);
						setState(1212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1211);
							typeArguments();
							}
						}

						setState(1214);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(1219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JavaParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			lambdaParameters();
			setState(1221);
			match(ARROW);
			setState(1222);
			lambdaBody();
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lambdaParameters);
		int _la;
		try {
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(LPAREN);
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==AT || _la==IDENTIFIER) {
					{
					setState(1226);
					formalParameterList();
					}
				}

				setState(1229);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230);
				match(LPAREN);
				setState(1231);
				match(IDENTIFIER);
				setState(1236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1232);
					match(COMMA);
					setState(1233);
					match(IDENTIFIER);
					}
					}
					setState(1238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1239);
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

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lambdaBody);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				block();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public TypeTypeOrVoidContext typeTypeOrVoid() {
			return getRuleContext(TypeTypeOrVoidContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_primary);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(LPAREN);
				setState(1247);
				expression(0);
				setState(1248);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1250);
				match(THIS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				match(SUPER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1252);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1253);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1254);
				typeTypeOrVoid();
				setState(1255);
				match(DOT);
				setState(1256);
				match(CLASS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1258);
				nonWildcardTypeArguments();
				setState(1262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case IDENTIFIER:
					{
					setState(1259);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1260);
					match(THIS);
					setState(1261);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_classType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1266);
				classOrInterfaceType();
				setState(1267);
				match(DOT);
				}
				break;
			}
			setState(1274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1271);
					annotation();
					}
					} 
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(1277);
			match(IDENTIFIER);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1278);
				typeArguments();
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

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creator);
		try {
			setState(1290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				nonWildcardTypeArguments();
				setState(1282);
				createdName();
				setState(1283);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				createdName();
				setState(1288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1286);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1287);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JavaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JavaParser.IDENTIFIER, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_createdName);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				match(IDENTIFIER);
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1293);
					typeArgumentsOrDiamond();
					}
				}

				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1296);
					match(DOT);
					setState(1297);
					match(IDENTIFIER);
					setState(1299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1298);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				primitiveType();
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

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(IDENTIFIER);
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1310);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1313);
			classCreatorRest();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(LBRACK);
			setState(1343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1316);
				match(RBRACK);
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1317);
					match(LBRACK);
					setState(1318);
					match(RBRACK);
					}
					}
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1324);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case AT:
			case IDENTIFIER:
				{
				setState(1325);
				expression(0);
				setState(1326);
				match(RBRACK);
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1327);
						match(LBRACK);
						setState(1328);
						expression(0);
						setState(1329);
						match(RBRACK);
						}
						} 
					}
					setState(1335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1336);
						match(LBRACK);
						setState(1337);
						match(RBRACK);
						}
						} 
					}
					setState(1342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			arguments();
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1346);
				classBody();
				}
				break;
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

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			nonWildcardTypeArguments();
			setState(1350);
			explicitGenericInvocationSuffix();
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

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_typeArgumentsOrDiamond);
		try {
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				match(LT);
				setState(1353);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				typeArguments();
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

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(LT);
				setState(1358);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				nonWildcardTypeArguments();
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

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			match(LT);
			setState(1363);
			typeList();
			setState(1364);
			match(GT);
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

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			typeType();
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1367);
				match(COMMA);
				setState(1368);
				typeType();
				}
				}
				setState(1373);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_typeType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1374);
					annotation();
					}
					} 
				}
				setState(1379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1380);
				classOrInterfaceType();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				setState(1381);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT || _la==IDENTIFIER) {
						{
						{
						setState(1384);
						annotation();
						}
						}
						setState(1389);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1390);
					match(LBRACK);
					setState(1391);
					match(RBRACK);
					}
					} 
				}
				setState(1396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(LT);
			setState(1400);
			typeArgument();
			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1401);
				match(COMMA);
				setState(1402);
				typeArgument();
				}
				}
				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1408);
			match(GT);
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

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_superSuffix);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				match(DOT);
				setState(1412);
				match(IDENTIFIER);
				setState(1414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1413);
					arguments();
					}
					break;
				}
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

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JavaParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				match(SUPER);
				setState(1419);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				match(IDENTIFIER);
				setState(1421);
				arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaParserListener ) ((JavaParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(LPAREN);
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LT - 73)) | (1L << (BANG - 73)) | (1L << (TILDE - 73)) | (1L << (INC - 73)) | (1L << (DEC - 73)) | (1L << (ADD - 73)) | (1L << (SUB - 73)) | (1L << (AT - 73)) | (1L << (IDENTIFIER - 73)))) != 0)) {
				{
				setState(1425);
				expressionList();
				}
			}

			setState(1428);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 83:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 13);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3r\u0599\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\5"+
		"\2\u00d6\n\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2\3\2\7\2\u00df\n\2\f"+
		"\2\16\2\u00e2\13\2\3\2\3\2\3\3\7\3\u00e7\n\3\f\3\16\3\u00ea\13\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\4\u00f2\n\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\5"+
		"\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5\3\5\3\5\3\5\5\5\u0105\n\5\3\5\5"+
		"\5\u0108\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u010f\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u011a\n\7\3\b\3\b\5\b\u011e\n\b\3\t\3\t\3\t\5\t\u0123"+
		"\n\t\3\t\3\t\5\t\u0127\n\t\3\t\3\t\5\t\u012b\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\n\u0133\n\n\f\n\16\n\u0136\13\n\3\n\3\n\3\13\7\13\u013b\n\13\f\13"+
		"\16\13\u013e\13\13\3\13\3\13\3\13\7\13\u0143\n\13\f\13\16\13\u0146\13"+
		"\13\3\13\5\13\u0149\n\13\3\f\3\f\3\f\7\f\u014e\n\f\f\f\16\f\u0151\13\f"+
		"\3\r\3\r\3\r\3\r\5\r\u0157\n\r\3\r\3\r\5\r\u015b\n\r\3\r\5\r\u015e\n\r"+
		"\3\r\5\r\u0161\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0168\n\16\f\16\16\16\u016b"+
		"\13\16\3\17\7\17\u016e\n\17\f\17\16\17\u0171\13\17\3\17\3\17\5\17\u0175"+
		"\n\17\3\17\5\17\u0178\n\17\3\20\3\20\7\20\u017c\n\20\f\20\16\20\u017f"+
		"\13\20\3\21\3\21\3\21\5\21\u0184\n\21\3\21\3\21\5\21\u0188\n\21\3\21\3"+
		"\21\3\22\3\22\7\22\u018e\n\22\f\22\16\22\u0191\13\22\3\22\3\22\3\23\3"+
		"\23\7\23\u0197\n\23\f\23\16\23\u019a\13\23\3\23\3\23\3\24\3\24\5\24\u01a0"+
		"\n\24\3\24\3\24\7\24\u01a4\n\24\f\24\16\24\u01a7\13\24\3\24\5\24\u01aa"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01b5\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u01bc\n\26\f\26\16\26\u01bf\13\26\3\26\3\26"+
		"\5\26\u01c3\n\26\3\26\3\26\3\27\3\27\5\27\u01c9\n\27\3\30\3\30\5\30\u01cd"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01d9\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\7\35\u01e2\n\35\f\35\16\35\u01e5\13"+
		"\35\3\35\3\35\5\35\u01e9\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01f2\n\36\3\37\3\37\3\37\3\37\7\37\u01f8\n\37\f\37\16\37\u01fb\13\37"+
		"\3\37\3\37\3 \3 \3 \7 \u0202\n \f \16 \u0205\13 \3 \3 \3 \3!\7!\u020b"+
		"\n!\f!\16!\u020e\13!\3!\3!\3!\7!\u0213\n!\f!\16!\u0216\13!\3!\3!\5!\u021a"+
		"\n!\3!\3!\3!\3!\7!\u0220\n!\f!\16!\u0223\13!\3!\3!\5!\u0227\n!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\5\"\u0231\n\"\3#\3#\3#\3$\3$\3$\7$\u0239\n$\f$"+
		"\16$\u023c\13$\3%\3%\3%\5%\u0241\n%\3&\3&\3&\7&\u0246\n&\f&\16&\u0249"+
		"\13&\3\'\3\'\5\'\u024d\n\'\3(\3(\3(\3(\7(\u0253\n(\f(\16(\u0256\13(\3"+
		"(\5(\u0259\n(\5(\u025b\n(\3(\3(\3)\3)\5)\u0261\n)\3)\3)\3)\5)\u0266\n"+
		")\7)\u0268\n)\f)\16)\u026b\13)\3*\3*\7*\u026f\n*\f*\16*\u0272\13*\3*\3"+
		"*\3*\5*\u0277\n*\5*\u0279\n*\3+\3+\3+\7+\u027e\n+\f+\16+\u0281\13+\3,"+
		"\3,\5,\u0285\n,\3,\3,\3-\3-\3-\7-\u028c\n-\f-\16-\u028f\13-\3-\3-\5-\u0293"+
		"\n-\3-\5-\u0296\n-\3.\7.\u0299\n.\f.\16.\u029c\13.\3.\3.\3.\3/\7/\u02a2"+
		"\n/\f/\16/\u02a5\13/\3/\3/\7/\u02a9\n/\f/\16/\u02ac\13/\3/\3/\3/\3\60"+
		"\3\60\3\60\7\60\u02b4\n\60\f\60\16\60\u02b7\13\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02bf\n\61\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u02c7\n"+
		"\64\f\64\16\64\u02ca\13\64\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u02d2\n"+
		"\65\3\65\3\65\3\65\5\65\u02d7\n\65\3\65\5\65\u02da\n\65\3\66\3\66\3\66"+
		"\7\66\u02df\n\66\f\66\16\66\u02e2\13\66\3\67\3\67\3\67\3\67\38\38\38\5"+
		"8\u02eb\n8\39\39\39\39\79\u02f1\n9\f9\169\u02f4\139\59\u02f6\n9\39\59"+
		"\u02f9\n9\39\39\3:\3:\3:\3:\3:\3;\3;\7;\u0304\n;\f;\16;\u0307\13;\3;\3"+
		";\3<\7<\u030c\n<\f<\16<\u030f\13<\3<\3<\5<\u0313\n<\3=\3=\3=\3=\3=\3="+
		"\5=\u031b\n=\3=\3=\5=\u031f\n=\3=\3=\5=\u0323\n=\3=\3=\5=\u0327\n=\5="+
		"\u0329\n=\3>\3>\5>\u032d\n>\3?\3?\3?\3?\5?\u0333\n?\3@\3@\3A\3A\3A\3B"+
		"\3B\7B\u033c\nB\fB\16B\u033f\13B\3B\3B\3C\3C\3C\3C\3C\5C\u0348\nC\3D\7"+
		"D\u034b\nD\fD\16D\u034e\13D\3D\3D\3D\3E\7E\u0354\nE\fE\16E\u0357\13E\3"+
		"E\3E\5E\u035b\nE\3E\5E\u035e\nE\3F\3F\3F\3F\3F\5F\u0365\nF\3F\3F\3F\3"+
		"F\3F\3F\3F\5F\u036e\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\6F\u0383\nF\rF\16F\u0384\3F\5F\u0388\nF\3F\5F\u038b\nF\3F\3"+
		"F\3F\3F\7F\u0391\nF\fF\16F\u0394\13F\3F\5F\u0397\nF\3F\3F\3F\3F\7F\u039d"+
		"\nF\fF\16F\u03a0\13F\3F\7F\u03a3\nF\fF\16F\u03a6\13F\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\5F\u03b0\nF\3F\3F\3F\3F\3F\3F\3F\5F\u03b9\nF\3F\3F\3F\5F\u03be"+
		"\nF\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03c8\nF\3G\3G\3G\7G\u03cd\nG\fG\16G\u03d0"+
		"\13G\3G\3G\3G\3G\3G\3H\3H\3H\7H\u03da\nH\fH\16H\u03dd\13H\3I\3I\3I\3J"+
		"\3J\3J\5J\u03e5\nJ\3J\3J\3K\3K\3K\7K\u03ec\nK\fK\16K\u03ef\13K\3L\7L\u03f2"+
		"\nL\fL\16L\u03f5\13L\3L\3L\3L\3L\3L\3M\6M\u03fd\nM\rM\16M\u03fe\3M\6M"+
		"\u0402\nM\rM\16M\u0403\3N\3N\3N\5N\u0409\nN\3N\3N\3N\5N\u040e\nN\3O\3"+
		"O\5O\u0412\nO\3O\3O\5O\u0416\nO\3O\3O\5O\u041a\nO\5O\u041c\nO\3P\3P\5"+
		"P\u0420\nP\3Q\7Q\u0423\nQ\fQ\16Q\u0426\13Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R"+
		"\3S\3S\3S\7S\u0434\nS\fS\16S\u0437\13S\3T\3T\3T\5T\u043c\nT\3T\3T\3T\3"+
		"T\5T\u0442\nT\3T\3T\3T\3T\5T\u0448\nT\3T\5T\u044b\nT\3U\3U\3U\3U\3U\3"+
		"U\3U\7U\u0454\nU\fU\16U\u0457\13U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\5U\u0465\nU\3U\3U\5U\u0469\nU\3U\3U\3U\5U\u046e\nU\3U\3U\5U\u0472\nU"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0482\nU\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04aa\nU\3U\3U\3U\3U\5U\u04b0\nU\3U"+
		"\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u04bf\nU\3U\7U\u04c2\nU\fU\16"+
		"U\u04c5\13U\3V\3V\3V\3V\3W\3W\3W\5W\u04ce\nW\3W\3W\3W\3W\3W\7W\u04d5\n"+
		"W\fW\16W\u04d8\13W\3W\5W\u04db\nW\3X\3X\5X\u04df\nX\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u04f1\nY\5Y\u04f3\nY\3Z\3Z\3Z\5Z\u04f8"+
		"\nZ\3Z\7Z\u04fb\nZ\fZ\16Z\u04fe\13Z\3Z\3Z\5Z\u0502\nZ\3[\3[\3[\3[\3[\3"+
		"[\3[\5[\u050b\n[\5[\u050d\n[\3\\\3\\\5\\\u0511\n\\\3\\\3\\\3\\\5\\\u0516"+
		"\n\\\7\\\u0518\n\\\f\\\16\\\u051b\13\\\3\\\5\\\u051e\n\\\3]\3]\5]\u0522"+
		"\n]\3]\3]\3^\3^\3^\3^\7^\u052a\n^\f^\16^\u052d\13^\3^\3^\3^\3^\3^\3^\3"+
		"^\7^\u0536\n^\f^\16^\u0539\13^\3^\3^\7^\u053d\n^\f^\16^\u0540\13^\5^\u0542"+
		"\n^\3_\3_\5_\u0546\n_\3`\3`\3`\3a\3a\3a\5a\u054e\na\3b\3b\3b\5b\u0553"+
		"\nb\3c\3c\3c\3c\3d\3d\3d\7d\u055c\nd\fd\16d\u055f\13d\3e\7e\u0562\ne\f"+
		"e\16e\u0565\13e\3e\3e\5e\u0569\ne\3e\7e\u056c\ne\fe\16e\u056f\13e\3e\3"+
		"e\7e\u0573\ne\fe\16e\u0576\13e\3f\3f\3g\3g\3g\3g\7g\u057e\ng\fg\16g\u0581"+
		"\13g\3g\3g\3h\3h\3h\3h\5h\u0589\nh\5h\u058b\nh\3i\3i\3i\3i\5i\u0591\n"+
		"i\3j\3j\5j\u0595\nj\3j\3j\3j\2\3\u00a8k\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\2\16\4\2\23\23**\3\2\669\3\2:;\3\2VY\3"+
		"\2LM\4\2Z[__\3\2XY\4\2JKQR\4\2PPSS\4\2II`j\3\2VW\n\2\5\5\7\7\n\n\20\20"+
		"\26\26\35\35\37\37\'\'\2\u0639\2\u00d5\3\2\2\2\4\u00e8\3\2\2\2\6\u00ef"+
		"\3\2\2\2\b\u0107\3\2\2\2\n\u010e\3\2\2\2\f\u0119\3\2\2\2\16\u011d\3\2"+
		"\2\2\20\u011f\3\2\2\2\22\u012e\3\2\2\2\24\u013c\3\2\2\2\26\u014a\3\2\2"+
		"\2\30\u0152\3\2\2\2\32\u0164\3\2\2\2\34\u016f\3\2\2\2\36\u0179\3\2\2\2"+
		" \u0180\3\2\2\2\"\u018b\3\2\2\2$\u0194\3\2\2\2&\u01a9\3\2\2\2(\u01b4\3"+
		"\2\2\2*\u01b6\3\2\2\2,\u01c8\3\2\2\2.\u01cc\3\2\2\2\60\u01ce\3\2\2\2\62"+
		"\u01d1\3\2\2\2\64\u01d4\3\2\2\2\66\u01dc\3\2\2\28\u01e8\3\2\2\2:\u01f1"+
		"\3\2\2\2<\u01f3\3\2\2\2>\u01fe\3\2\2\2@\u020c\3\2\2\2B\u0230\3\2\2\2D"+
		"\u0232\3\2\2\2F\u0235\3\2\2\2H\u023d\3\2\2\2J\u0242\3\2\2\2L\u024c\3\2"+
		"\2\2N\u024e\3\2\2\2P\u025e\3\2\2\2R\u0278\3\2\2\2T\u027a\3\2\2\2V\u0282"+
		"\3\2\2\2X\u0295\3\2\2\2Z\u029a\3\2\2\2\\\u02a3\3\2\2\2^\u02b0\3\2\2\2"+
		"`\u02be\3\2\2\2b\u02c0\3\2\2\2d\u02c2\3\2\2\2f\u02c8\3\2\2\2h\u02d1\3"+
		"\2\2\2j\u02db\3\2\2\2l\u02e3\3\2\2\2n\u02ea\3\2\2\2p\u02ec\3\2\2\2r\u02fc"+
		"\3\2\2\2t\u0301\3\2\2\2v\u0312\3\2\2\2x\u0328\3\2\2\2z\u032c\3\2\2\2|"+
		"\u032e\3\2\2\2~\u0334\3\2\2\2\u0080\u0336\3\2\2\2\u0082\u0339\3\2\2\2"+
		"\u0084\u0347\3\2\2\2\u0086\u034c\3\2\2\2\u0088\u035d\3\2\2\2\u008a\u03c7"+
		"\3\2\2\2\u008c\u03c9\3\2\2\2\u008e\u03d6\3\2\2\2\u0090\u03de\3\2\2\2\u0092"+
		"\u03e1\3\2\2\2\u0094\u03e8\3\2\2\2\u0096\u03f3\3\2\2\2\u0098\u03fc\3\2"+
		"\2\2\u009a\u040d\3\2\2\2\u009c\u041b\3\2\2\2\u009e\u041f\3\2\2\2\u00a0"+
		"\u0424\3\2\2\2\u00a2\u042c\3\2\2\2\u00a4\u0430\3\2\2\2\u00a6\u044a\3\2"+
		"\2\2\u00a8\u0471\3\2\2\2\u00aa\u04c6\3\2\2\2\u00ac\u04da\3\2\2\2\u00ae"+
		"\u04de\3\2\2\2\u00b0\u04f2\3\2\2\2\u00b2\u04f7\3\2\2\2\u00b4\u050c\3\2"+
		"\2\2\u00b6\u051d\3\2\2\2\u00b8\u051f\3\2\2\2\u00ba\u0525\3\2\2\2\u00bc"+
		"\u0543\3\2\2\2\u00be\u0547\3\2\2\2\u00c0\u054d\3\2\2\2\u00c2\u0552\3\2"+
		"\2\2\u00c4\u0554\3\2\2\2\u00c6\u0558\3\2\2\2\u00c8\u0563\3\2\2\2\u00ca"+
		"\u0577\3\2\2\2\u00cc\u0579\3\2\2\2\u00ce\u058a\3\2\2\2\u00d0\u0590\3\2"+
		"\2\2\u00d2\u0592\3\2\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\b\5\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\2\2\3\u00e4\3\3\2\2\2"+
		"\u00e5\u00e7\5h\65\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7\"\2\2\u00ec\u00ed\5^\60\2\u00ed\u00ee\7F\2\2\u00ee\5\3\2\2\2"+
		"\u00ef\u00f1\7\33\2\2\u00f0\u00f2\7(\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\5^\60\2\u00f4\u00f5\7H\2\2\u00f5"+
		"\u00f7\7Z\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\7F\2\2\u00f9\7\3\2\2\2\u00fa\u00fc\5\f\7\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0104\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5\20\t\2\u0101\u0105\5"+
		"\30\r\2\u0102\u0105\5 \21\2\u0103\u0105\5r:\2\u0104\u0100\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0108\7F\2\2\u0107\u00fd\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\t\3\2\2\2\u0109\u010f\5\f\7\2\u010a\u010f\7 \2\2\u010b\u010f\7,\2\2\u010c"+
		"\u010f\7\60\2\2\u010d\u010f\7\63\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3"+
		"\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\13\3\2\2\2\u0110\u011a\5h\65\2\u0111\u011a\7%\2\2\u0112\u011a\7$\2\2"+
		"\u0113\u011a\7#\2\2\u0114\u011a\7(\2\2\u0115\u011a\7\3\2\2\u0116\u011a"+
		"\7\24\2\2\u0117\u011a\7)\2\2\u0118\u011a\7\65\2\2\u0119\u0110\3\2\2\2"+
		"\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114"+
		"\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\r\3\2\2\2\u011b\u011e\7\24\2\2\u011c\u011e\5h\65"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\17\3\2\2\2\u011f\u0120"+
		"\7\13\2\2\u0120\u0122\7r\2\2\u0121\u0123\5\22\n\2\u0122\u0121\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\7\23\2\2\u0125\u0127"+
		"\5\u00c8e\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012a\3\2\2"+
		"\2\u0128\u0129\7\32\2\2\u0129\u012b\5\u00c6d\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\5\"\22\2\u012d\21\3\2\2"+
		"\2\u012e\u012f\7K\2\2\u012f\u0134\5\24\13\2\u0130\u0131\7G\2\2\u0131\u0133"+
		"\5\24\13\2\u0132\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138"+
		"\7J\2\2\u0138\23\3\2\2\2\u0139\u013b\5h\65\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013f\u0148\7r\2\2\u0140\u0144\7\23\2\2\u0141"+
		"\u0143\5h\65\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0149\5\26\f\2\u0148\u0140\3\2\2\2\u0148\u0149\3\2\2\2\u0149\25\3\2\2"+
		"\2\u014a\u014f\5\u00c8e\2\u014b\u014c\7\\\2\2\u014c\u014e\5\u00c8e\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\27\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\22\2\2\u0153\u0156"+
		"\7r\2\2\u0154\u0155\7\32\2\2\u0155\u0157\5\u00c6d\2\u0156\u0154\3\2\2"+
		"\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\7B\2\2\u0159\u015b"+
		"\5\32\16\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2"+
		"\u015c\u015e\7G\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0161\5\36\20\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\u0163\7C\2\2\u0163\31\3\2\2\2\u0164\u0169\5"+
		"\34\17\2\u0165\u0166\7G\2\2\u0166\u0168\5\34\17\2\u0167\u0165\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\33"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\5h\65\2\u016d\u016c\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7r\2\2\u0173\u0175\5\u00d2j\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\5\""+
		"\22\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\35\3\2\2\2\u0179\u017d"+
		"\7F\2\2\u017a\u017c\5&\24\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\37\3\2\2\2\u017f\u017d\3\2\2"+
		"\2\u0180\u0181\7\36\2\2\u0181\u0183\7r\2\2\u0182\u0184\5\22\n\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\7\23"+
		"\2\2\u0186\u0188\5\u00c6d\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\5$\23\2\u018a!\3\2\2\2\u018b\u018f\7B\2\2\u018c"+
		"\u018e\5&\24\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0193\7C\2\2\u0193#\3\2\2\2\u0194\u0198\7B\2\2\u0195\u0197\58\35\2\u0196"+
		"\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7C\2\2\u019c"+
		"%\3\2\2\2\u019d\u01aa\7F\2\2\u019e\u01a0\7(\2\2\u019f\u019e\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01aa\5\u0082B\2\u01a2\u01a4"+
		"\5\n\6\2\u01a3\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\5("+
		"\25\2\u01a9\u019d\3\2\2\2\u01a9\u019f\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa"+
		"\'\3\2\2\2\u01ab\u01b5\5*\26\2\u01ac\u01b5\5\60\31\2\u01ad\u01b5\5\66"+
		"\34\2\u01ae\u01b5\5\64\33\2\u01af\u01b5\5\62\32\2\u01b0\u01b5\5 \21\2"+
		"\u01b1\u01b5\5r:\2\u01b2\u01b5\5\20\t\2\u01b3\u01b5\5\30\r\2\u01b4\u01ab"+
		"\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4"+
		"\u01af\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5)\3\2\2\2\u01b6\u01b7\5.\30\2\u01b7\u01b8"+
		"\7r\2\2\u01b8\u01bd\5V,\2\u01b9\u01ba\7D\2\2\u01ba\u01bc\7E\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c2\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7/\2\2\u01c1"+
		"\u01c3\5T+\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u01c5\5,\27\2\u01c5+\3\2\2\2\u01c6\u01c9\5\u0082B\2\u01c7\u01c9"+
		"\7F\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9-\3\2\2\2\u01ca\u01cd"+
		"\5\u00c8e\2\u01cb\u01cd\7\62\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2"+
		"\2\u01cd/\3\2\2\2\u01ce\u01cf\5\22\n\2\u01cf\u01d0\5*\26\2\u01d0\61\3"+
		"\2\2\2\u01d1\u01d2\5\22\n\2\u01d2\u01d3\5\64\33\2\u01d3\63\3\2\2\2\u01d4"+
		"\u01d5\7r\2\2\u01d5\u01d8\5V,\2\u01d6\u01d7\7/\2\2\u01d7\u01d9\5T+\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5\u0082"+
		"B\2\u01db\65\3\2\2\2\u01dc\u01dd\5\u00c8e\2\u01dd\u01de\5F$\2\u01de\u01df"+
		"\7F\2\2\u01df\67\3\2\2\2\u01e0\u01e2\5\n\6\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\5:\36\2\u01e7\u01e9\7F\2\2\u01e8"+
		"\u01e3\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e99\3\2\2\2\u01ea\u01f2\5<\37\2"+
		"\u01eb\u01f2\5@!\2\u01ec\u01f2\5D#\2\u01ed\u01f2\5 \21\2\u01ee\u01f2\5"+
		"r:\2\u01ef\u01f2\5\20\t\2\u01f0\u01f2\5\30\r\2\u01f1\u01ea\3\2\2\2\u01f1"+
		"\u01eb\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f1\u01ed\3\2\2\2\u01f1\u01ee\3\2"+
		"\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2;\3\2\2\2\u01f3\u01f4"+
		"\5\u00c8e\2\u01f4\u01f9\5> \2\u01f5\u01f6\7G\2\2\u01f6\u01f8\5> \2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7F\2\2\u01fd"+
		"=\3\2\2\2\u01fe\u0203\7r\2\2\u01ff\u0200\7D\2\2\u0200\u0202\7E\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7I\2\2\u0207"+
		"\u0208\5L\'\2\u0208?\3\2\2\2\u0209\u020b\5B\"\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0219\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020f\u021a\5.\30\2\u0210\u0214\5\22\n\2\u0211"+
		"\u0213\5h\65\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\5.\30\2\u0218\u021a\3\2\2\2\u0219\u020f\3\2\2\2\u0219\u0210\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7r\2\2\u021c\u0221\5V,\2\u021d\u021e"+
		"\7D\2\2\u021e\u0220\7E\2\2\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0226\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0224\u0225\7/\2\2\u0225\u0227\5T+\2\u0226\u0224\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\5,\27\2\u0229A\3\2\2\2\u022a"+
		"\u0231\5h\65\2\u022b\u0231\7%\2\2\u022c\u0231\7\3\2\2\u022d\u0231\7\16"+
		"\2\2\u022e\u0231\7(\2\2\u022f\u0231\7)\2\2\u0230\u022a\3\2\2\2\u0230\u022b"+
		"\3\2\2\2\u0230\u022c\3\2\2\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0230"+
		"\u022f\3\2\2\2\u0231C\3\2\2\2\u0232\u0233\5\22\n\2\u0233\u0234\5@!\2\u0234"+
		"E\3\2\2\2\u0235\u023a\5H%\2\u0236\u0237\7G\2\2\u0237\u0239\5H%\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023bG\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0240\5J&\2\u023e\u023f"+
		"\7I\2\2\u023f\u0241\5L\'\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"I\3\2\2\2\u0242\u0247\7r\2\2\u0243\u0244\7D\2\2\u0244\u0246\7E\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248K\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024d\5N(\2\u024b\u024d"+
		"\5\u00a8U\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024dM\3\2\2\2\u024e"+
		"\u025a\7B\2\2\u024f\u0254\5L\'\2\u0250\u0251\7G\2\2\u0251\u0253\5L\'\2"+
		"\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0259\7G\2\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u024f\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7C\2\2\u025d"+
		"O\3\2\2\2\u025e\u0260\7r\2\2\u025f\u0261\5\u00ccg\2\u0260\u025f\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0269\3\2\2\2\u0262\u0263\7H\2\2\u0263\u0265"+
		"\7r\2\2\u0264\u0266\5\u00ccg\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0266\u0268\3\2\2\2\u0267\u0262\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026aQ\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u0279\5\u00c8e\2\u026d\u026f\5h\65\2\u026e\u026d\3\2\2\2\u026f\u0272"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0276\7N\2\2\u0274\u0275\t\2\2\2\u0275\u0277\5\u00c8"+
		"e\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u026c\3\2\2\2\u0278\u0270\3\2\2\2\u0279S\3\2\2\2\u027a\u027f\5^\60\2"+
		"\u027b\u027c\7G\2\2\u027c\u027e\5^\60\2\u027d\u027b\3\2\2\2\u027e\u0281"+
		"\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280U\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0284\7@\2\2\u0283\u0285\5X-\2\u0284\u0283\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7A\2\2\u0287W\3"+
		"\2\2\2\u0288\u028d\5Z.\2\u0289\u028a\7G\2\2\u028a\u028c\5Z.\2\u028b\u0289"+
		"\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0292\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7G\2\2\u0291\u0293\5\\"+
		"/\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294"+
		"\u0296\5\\/\2\u0295\u0288\3\2\2\2\u0295\u0294\3\2\2\2\u0296Y\3\2\2\2\u0297"+
		"\u0299\5\16\b\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3"+
		"\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d"+
		"\u029e\5\u00c8e\2\u029e\u029f\5J&\2\u029f[\3\2\2\2\u02a0\u02a2\5\16\b"+
		"\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02aa\5\u00c8e"+
		"\2\u02a7\u02a9\5h\65\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02ae\7n\2\2\u02ae\u02af\5J&\2\u02af]\3\2\2\2\u02b0\u02b5\7r\2\2\u02b1"+
		"\u02b2\7H\2\2\u02b2\u02b4\7r\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2"+
		"\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6_\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02bf\5b\62\2\u02b9\u02bf\5d\63\2\u02ba\u02bf\7=\2\2\u02bb"+
		"\u02bf\7>\2\2\u02bc\u02bf\7<\2\2\u02bd\u02bf\7?\2\2\u02be\u02b8\3\2\2"+
		"\2\u02be\u02b9\3\2\2\2\u02be\u02ba\3\2\2\2\u02be\u02bb\3\2\2\2\u02be\u02bc"+
		"\3\2\2\2\u02be\u02bd\3\2\2\2\u02bfa\3\2\2\2\u02c0\u02c1\t\3\2\2\u02c1"+
		"c\3\2\2\2\u02c2\u02c3\t\4\2\2\u02c3e\3\2\2\2\u02c4\u02c5\7r\2\2\u02c5"+
		"\u02c7\7H\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02cc\7m\2\2\u02cc\u02cd\7r\2\2\u02cdg\3\2\2\2\u02ce\u02cf\7m\2\2\u02cf"+
		"\u02d2\5^\60\2\u02d0\u02d2\5f\64\2\u02d1\u02ce\3\2\2\2\u02d1\u02d0\3\2"+
		"\2\2\u02d2\u02d9\3\2\2\2\u02d3\u02d6\7@\2\2\u02d4\u02d7\5j\66\2\u02d5"+
		"\u02d7\5n8\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2"+
		"\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\7A\2\2\u02d9\u02d3\3\2\2\2\u02d9\u02da"+
		"\3\2\2\2\u02dai\3\2\2\2\u02db\u02e0\5l\67\2\u02dc\u02dd\7G\2\2\u02dd\u02df"+
		"\5l\67\2\u02de\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1k\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7r\2\2\u02e4"+
		"\u02e5\7I\2\2\u02e5\u02e6\5n8\2\u02e6m\3\2\2\2\u02e7\u02eb\5\u00a8U\2"+
		"\u02e8\u02eb\5h\65\2\u02e9\u02eb\5p9\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8"+
		"\3\2\2\2\u02ea\u02e9\3\2\2\2\u02ebo\3\2\2\2\u02ec\u02f5\7B\2\2\u02ed\u02f2"+
		"\5n8\2\u02ee\u02ef\7G\2\2\u02ef\u02f1\5n8\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2"+
		"\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02ed\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f8\3\2\2\2\u02f7\u02f9\7G\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\7C\2\2\u02fbq\3\2\2\2\u02fc\u02fd"+
		"\7m\2\2\u02fd\u02fe\7\36\2\2\u02fe\u02ff\7r\2\2\u02ff\u0300\5t;\2\u0300"+
		"s\3\2\2\2\u0301\u0305\7B\2\2\u0302\u0304\5v<\2\u0303\u0302\3\2\2\2\u0304"+
		"\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2"+
		"\2\2\u0307\u0305\3\2\2\2\u0308\u0309\7C\2\2\u0309u\3\2\2\2\u030a\u030c"+
		"\5\n\6\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0313\5x"+
		"=\2\u0311\u0313\7F\2\2\u0312\u030d\3\2\2\2\u0312\u0311\3\2\2\2\u0313w"+
		"\3\2\2\2\u0314\u0315\5\u00c8e\2\u0315\u0316\5z>\2\u0316\u0317\7F\2\2\u0317"+
		"\u0329\3\2\2\2\u0318\u031a\5\20\t\2\u0319\u031b\7F\2\2\u031a\u0319\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u0329\3\2\2\2\u031c\u031e\5 \21\2\u031d"+
		"\u031f\7F\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0329\3\2"+
		"\2\2\u0320\u0322\5\30\r\2\u0321\u0323\7F\2\2\u0322\u0321\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0329\3\2\2\2\u0324\u0326\5r:\2\u0325\u0327\7F\2"+
		"\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u0314"+
		"\3\2\2\2\u0328\u0318\3\2\2\2\u0328\u031c\3\2\2\2\u0328\u0320\3\2\2\2\u0328"+
		"\u0324\3\2\2\2\u0329y\3\2\2\2\u032a\u032d\5|?\2\u032b\u032d\5~@\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032b\3\2\2\2\u032d{\3\2\2\2\u032e\u032f\7r\2\2\u032f"+
		"\u0330\7@\2\2\u0330\u0332\7A\2\2\u0331\u0333\5\u0080A\2\u0332\u0331\3"+
		"\2\2\2\u0332\u0333\3\2\2\2\u0333}\3\2\2\2\u0334\u0335\5F$\2\u0335\177"+
		"\3\2\2\2\u0336\u0337\7\16\2\2\u0337\u0338\5n8\2\u0338\u0081\3\2\2\2\u0339"+
		"\u033d\7B\2\2\u033a\u033c\5\u0084C\2\u033b\u033a\3\2\2\2\u033c\u033f\3"+
		"\2\2\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f"+
		"\u033d\3\2\2\2\u0340\u0341\7C\2\2\u0341\u0083\3\2\2\2\u0342\u0343\5\u0086"+
		"D\2\u0343\u0344\7F\2\2\u0344\u0348\3\2\2\2\u0345\u0348\5\u008aF\2\u0346"+
		"\u0348\5\u0088E\2\u0347\u0342\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0346"+
		"\3\2\2\2\u0348\u0085\3\2\2\2\u0349\u034b\5\16\b\2\u034a\u0349\3\2\2\2"+
		"\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f"+
		"\3\2\2\2\u034e\u034c\3\2\2\2\u034f\u0350\5\u00c8e\2\u0350\u0351\5F$\2"+
		"\u0351\u0087\3\2\2\2\u0352\u0354\5\f\7\2\u0353\u0352\3\2\2\2\u0354\u0357"+
		"\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035a\3\2\2\2\u0357"+
		"\u0355\3\2\2\2\u0358\u035b\5\20\t\2\u0359\u035b\5 \21\2\u035a\u0358\3"+
		"\2\2\2\u035a\u0359\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035e\7F\2\2\u035d"+
		"\u0355\3\2\2\2\u035d\u035c\3\2\2\2\u035e\u0089\3\2\2\2\u035f\u03c8\5\u0082"+
		"B\2\u0360\u0361\7\4\2\2\u0361\u0364\5\u00a8U\2\u0362\u0363\7O\2\2\u0363"+
		"\u0365\5\u00a8U\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0367\7F\2\2\u0367\u03c8\3\2\2\2\u0368\u0369\7\30\2\2\u0369"+
		"\u036a\5\u00a2R\2\u036a\u036d\5\u008aF\2\u036b\u036c\7\21\2\2\u036c\u036e"+
		"\5\u008aF\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u03c8\3\2\2"+
		"\2\u036f\u0370\7\27\2\2\u0370\u0371\7@\2\2\u0371\u0372\5\u009cO\2\u0372"+
		"\u0373\7A\2\2\u0373\u0374\5\u008aF\2\u0374\u03c8\3\2\2\2\u0375\u0376\7"+
		"\64\2\2\u0376\u0377\5\u00a2R\2\u0377\u0378\5\u008aF\2\u0378\u03c8\3\2"+
		"\2\2\u0379\u037a\7\17\2\2\u037a\u037b\5\u008aF\2\u037b\u037c\7\64\2\2"+
		"\u037c\u037d\5\u00a2R\2\u037d\u037e\7F\2\2\u037e\u03c8\3\2\2\2\u037f\u0380"+
		"\7\61\2\2\u0380\u038a\5\u0082B\2\u0381\u0383\5\u008cG\2\u0382\u0381\3"+
		"\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0387\3\2\2\2\u0386\u0388\5\u0090I\2\u0387\u0386\3\2\2\2\u0387\u0388"+
		"\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u038b\5\u0090I\2\u038a\u0382\3\2\2"+
		"\2\u038a\u0389\3\2\2\2\u038b\u03c8\3\2\2\2\u038c\u038d\7\61\2\2\u038d"+
		"\u038e\5\u0092J\2\u038e\u0392\5\u0082B\2\u038f\u0391\5\u008cG\2\u0390"+
		"\u038f\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0397\5\u0090I\2\u0396"+
		"\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u03c8\3\2\2\2\u0398\u0399\7+"+
		"\2\2\u0399\u039a\5\u00a2R\2\u039a\u039e\7B\2\2\u039b\u039d\5\u0098M\2"+
		"\u039c\u039b\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a4\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a3\5\u009aN"+
		"\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a8\7C\2\2\u03a8"+
		"\u03c8\3\2\2\2\u03a9\u03aa\7,\2\2\u03aa\u03ab\5\u00a2R\2\u03ab\u03ac\5"+
		"\u0082B\2\u03ac\u03c8\3\2\2\2\u03ad\u03af\7&\2\2\u03ae\u03b0\5\u00a8U"+
		"\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03c8"+
		"\7F\2\2\u03b2\u03b3\7.\2\2\u03b3\u03b4\5\u00a8U\2\u03b4\u03b5\7F\2\2\u03b5"+
		"\u03c8\3\2\2\2\u03b6\u03b8\7\6\2\2\u03b7\u03b9\7r\2\2\u03b8\u03b7\3\2"+
		"\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c8\7F\2\2\u03bb"+
		"\u03bd\7\r\2\2\u03bc\u03be\7r\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c8\7F\2\2\u03c0\u03c8\7F\2\2\u03c1\u03c2"+
		"\5\u00a8U\2\u03c2\u03c3\7F\2\2\u03c3\u03c8\3\2\2\2\u03c4\u03c5\7r\2\2"+
		"\u03c5\u03c6\7O\2\2\u03c6\u03c8\5\u008aF\2\u03c7\u035f\3\2\2\2\u03c7\u0360"+
		"\3\2\2\2\u03c7\u0368\3\2\2\2\u03c7\u036f\3\2\2\2\u03c7\u0375\3\2\2\2\u03c7"+
		"\u0379\3\2\2\2\u03c7\u037f\3\2\2\2\u03c7\u038c\3\2\2\2\u03c7\u0398\3\2"+
		"\2\2\u03c7\u03a9\3\2\2\2\u03c7\u03ad\3\2\2\2\u03c7\u03b2\3\2\2\2\u03c7"+
		"\u03b6\3\2\2\2\u03c7\u03bb\3\2\2\2\u03c7\u03c0\3\2\2\2\u03c7\u03c1\3\2"+
		"\2\2\u03c7\u03c4\3\2\2\2\u03c8\u008b\3\2\2\2\u03c9\u03ca\7\t\2\2\u03ca"+
		"\u03ce\7@\2\2\u03cb\u03cd\5\16\b\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2"+
		"\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d1\u03d2\5\u008eH\2\u03d2\u03d3\7r\2\2\u03d3\u03d4\7"+
		"A\2\2\u03d4\u03d5\5\u0082B\2\u03d5\u008d\3\2\2\2\u03d6\u03db\5^\60\2\u03d7"+
		"\u03d8\7]\2\2\u03d8\u03da\5^\60\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2"+
		"\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u008f\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u03df\7\25\2\2\u03df\u03e0\5\u0082B\2\u03e0\u0091"+
		"\3\2\2\2\u03e1\u03e2\7@\2\2\u03e2\u03e4\5\u0094K\2\u03e3\u03e5\7F\2\2"+
		"\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7"+
		"\7A\2\2\u03e7\u0093\3\2\2\2\u03e8\u03ed\5\u0096L\2\u03e9\u03ea\7F\2\2"+
		"\u03ea\u03ec\5\u0096L\2\u03eb\u03e9\3\2\2\2\u03ec\u03ef\3\2\2\2\u03ed"+
		"\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u0095\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03f0\u03f2\5\16\b\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f6\u03f7\5P)\2\u03f7\u03f8\5J&\2\u03f8\u03f9\7I\2\2\u03f9\u03fa"+
		"\5\u00a8U\2\u03fa\u0097\3\2\2\2\u03fb\u03fd\5\u009aN\2\u03fc\u03fb\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff"+
		"\u0401\3\2\2\2\u0400\u0402\5\u0084C\2\u0401\u0400\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0099\3\2\2\2\u0405"+
		"\u0408\7\b\2\2\u0406\u0409\5\u00a8U\2\u0407\u0409\7r\2\2\u0408\u0406\3"+
		"\2\2\2\u0408\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040e\7O\2\2\u040b"+
		"\u040c\7\16\2\2\u040c\u040e\7O\2\2\u040d\u0405\3\2\2\2\u040d\u040b\3\2"+
		"\2\2\u040e\u009b\3\2\2\2\u040f\u041c\5\u00a0Q\2\u0410\u0412\5\u009eP\2"+
		"\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415"+
		"\7F\2\2\u0414\u0416\5\u00a8U\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2"+
		"\u0416\u0417\3\2\2\2\u0417\u0419\7F\2\2\u0418\u041a\5\u00a4S\2\u0419\u0418"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u040f\3\2\2\2\u041b"+
		"\u0411\3\2\2\2\u041c\u009d\3\2\2\2\u041d\u0420\5\u0086D\2\u041e\u0420"+
		"\5\u00a4S\2\u041f\u041d\3\2\2\2\u041f\u041e\3\2\2\2\u0420\u009f\3\2\2"+
		"\2\u0421\u0423\5\16\b\2\u0422\u0421\3\2\2\2\u0423\u0426\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0427\3\2\2\2\u0426\u0424\3\2"+
		"\2\2\u0427\u0428\5\u00c8e\2\u0428\u0429\5J&\2\u0429\u042a\7O\2\2\u042a"+
		"\u042b\5\u00a8U\2\u042b\u00a1\3\2\2\2\u042c\u042d\7@\2\2\u042d\u042e\5"+
		"\u00a8U\2\u042e\u042f\7A\2\2\u042f\u00a3\3\2\2\2\u0430\u0435\5\u00a8U"+
		"\2\u0431\u0432\7G\2\2\u0432\u0434\5\u00a8U\2\u0433\u0431\3\2\2\2\u0434"+
		"\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u00a5\3\2"+
		"\2\2\u0437\u0435\3\2\2\2\u0438\u0439\7r\2\2\u0439\u043b\7@\2\2\u043a\u043c"+
		"\5\u00a4S\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2"+
		"\2\u043d\u044b\7A\2\2\u043e\u043f\7-\2\2\u043f\u0441\7@\2\2\u0440\u0442"+
		"\5\u00a4S\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2"+
		"\2\u0443\u044b\7A\2\2\u0444\u0445\7*\2\2\u0445\u0447\7@\2\2\u0446\u0448"+
		"\5\u00a4S\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2"+
		"\2\u0449\u044b\7A\2\2\u044a\u0438\3\2\2\2\u044a\u043e\3\2\2\2\u044a\u0444"+
		"\3\2\2\2\u044b\u00a7\3\2\2\2\u044c\u044d\bU\1\2\u044d\u0472\5\u00b0Y\2"+
		"\u044e\u0472\5\u00a6T\2\u044f\u0450\7!\2\2\u0450\u0472\5\u00b4[\2\u0451"+
		"\u0455\7@\2\2\u0452\u0454\5h\65\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2"+
		"\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0458\u0459\5\u00c8e\2\u0459\u045a\7A\2\2\u045a\u045b\5"+
		"\u00a8U\27\u045b\u0472\3\2\2\2\u045c\u045d\t\5\2\2\u045d\u0472\5\u00a8"+
		"U\25\u045e\u045f\t\6\2\2\u045f\u0472\5\u00a8U\24\u0460\u0472\5\u00aaV"+
		"\2\u0461\u0462\5\u00c8e\2\u0462\u0468\7l\2\2\u0463\u0465\5\u00ccg\2\u0464"+
		"\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469\7r"+
		"\2\2\u0467\u0469\7!\2\2\u0468\u0464\3\2\2\2\u0468\u0467\3\2\2\2\u0469"+
		"\u0472\3\2\2\2\u046a\u046b\5\u00b2Z\2\u046b\u046d\7l\2\2\u046c\u046e\5"+
		"\u00ccg\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2"+
		"\u046f\u0470\7!\2\2\u0470\u0472\3\2\2\2\u0471\u044c\3\2\2\2\u0471\u044e"+
		"\3\2\2\2\u0471\u044f\3\2\2\2\u0471\u0451\3\2\2\2\u0471\u045c\3\2\2\2\u0471"+
		"\u045e\3\2\2\2\u0471\u0460\3\2\2\2\u0471\u0461\3\2\2\2\u0471\u046a\3\2"+
		"\2\2\u0472\u04c3\3\2\2\2\u0473\u0474\f\23\2\2\u0474\u0475\t\7\2\2\u0475"+
		"\u04c2\5\u00a8U\24\u0476\u0477\f\22\2\2\u0477\u0478\t\b\2\2\u0478\u04c2"+
		"\5\u00a8U\23\u0479\u0481\f\21\2\2\u047a\u047b\7K\2\2\u047b\u0482\7K\2"+
		"\2\u047c\u047d\7J\2\2\u047d\u047e\7J\2\2\u047e\u0482\7J\2\2\u047f\u0480"+
		"\7J\2\2\u0480\u0482\7J\2\2\u0481\u047a\3\2\2\2\u0481\u047c\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u04c2\5\u00a8U\22\u0484\u0485"+
		"\f\20\2\2\u0485\u0486\t\t\2\2\u0486\u04c2\5\u00a8U\21\u0487\u0488\f\16"+
		"\2\2\u0488\u0489\t\n\2\2\u0489\u04c2\5\u00a8U\17\u048a\u048b\f\r\2\2\u048b"+
		"\u048c\7\\\2\2\u048c\u04c2\5\u00a8U\16\u048d\u048e\f\f\2\2\u048e\u048f"+
		"\7^\2\2\u048f\u04c2\5\u00a8U\r\u0490\u0491\f\13\2\2\u0491\u0492\7]\2\2"+
		"\u0492\u04c2\5\u00a8U\f\u0493\u0494\f\n\2\2\u0494\u0495\7T\2\2\u0495\u04c2"+
		"\5\u00a8U\13\u0496\u0497\f\t\2\2\u0497\u0498\7U\2\2\u0498\u04c2\5\u00a8"+
		"U\n\u0499\u049a\f\b\2\2\u049a\u049b\7N\2\2\u049b\u049c\5\u00a8U\2\u049c"+
		"\u049d\7O\2\2\u049d\u049e\5\u00a8U\b\u049e\u04c2\3\2\2\2\u049f\u04a0\f"+
		"\7\2\2\u04a0\u04a1\t\13\2\2\u04a1\u04c2\5\u00a8U\7\u04a2\u04a3\f\33\2"+
		"\2\u04a3\u04af\7H\2\2\u04a4\u04b0\7r\2\2\u04a5\u04b0\5\u00a6T\2\u04a6"+
		"\u04b0\7-\2\2\u04a7\u04a9\7!\2\2\u04a8\u04aa\5\u00c4c\2\u04a9\u04a8\3"+
		"\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04b0\5\u00b8]\2"+
		"\u04ac\u04ad\7*\2\2\u04ad\u04b0\5\u00ceh\2\u04ae\u04b0\5\u00be`\2\u04af"+
		"\u04a4\3\2\2\2\u04af\u04a5\3\2\2\2\u04af\u04a6\3\2\2\2\u04af\u04a7\3\2"+
		"\2\2\u04af\u04ac\3\2\2\2\u04af\u04ae\3\2\2\2\u04b0\u04c2\3\2\2\2\u04b1"+
		"\u04b2\f\32\2\2\u04b2\u04b3\7D\2\2\u04b3\u04b4\5\u00a8U\2\u04b4\u04b5"+
		"\7E\2\2\u04b5\u04c2\3\2\2\2\u04b6\u04b7\f\26\2\2\u04b7\u04c2\t\f\2\2\u04b8"+
		"\u04b9\f\17\2\2\u04b9\u04ba\7\34\2\2\u04ba\u04c2\5\u00c8e\2\u04bb\u04bc"+
		"\f\5\2\2\u04bc\u04be\7l\2\2\u04bd\u04bf\5\u00ccg\2\u04be\u04bd\3\2\2\2"+
		"\u04be\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c2\7r\2\2\u04c1\u0473"+
		"\3\2\2\2\u04c1\u0476\3\2\2\2\u04c1\u0479\3\2\2\2\u04c1\u0484\3\2\2\2\u04c1"+
		"\u0487\3\2\2\2\u04c1\u048a\3\2\2\2\u04c1\u048d\3\2\2\2\u04c1\u0490\3\2"+
		"\2\2\u04c1\u0493\3\2\2\2\u04c1\u0496\3\2\2\2\u04c1\u0499\3\2\2\2\u04c1"+
		"\u049f\3\2\2\2\u04c1\u04a2\3\2\2\2\u04c1\u04b1\3\2\2\2\u04c1\u04b6\3\2"+
		"\2\2\u04c1\u04b8\3\2\2\2\u04c1\u04bb\3\2\2\2\u04c2\u04c5\3\2\2\2\u04c3"+
		"\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u00a9\3\2\2\2\u04c5\u04c3\3\2"+
		"\2\2\u04c6\u04c7\5\u00acW\2\u04c7\u04c8\7k\2\2\u04c8\u04c9\5\u00aeX\2"+
		"\u04c9\u00ab\3\2\2\2\u04ca\u04db\7r\2\2\u04cb\u04cd\7@\2\2\u04cc\u04ce"+
		"\5X-\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf"+
		"\u04db\7A\2\2\u04d0\u04d1\7@\2\2\u04d1\u04d6\7r\2\2\u04d2\u04d3\7G\2\2"+
		"\u04d3\u04d5\7r\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d8\3\2\2\2\u04d6\u04d4"+
		"\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d9"+
		"\u04db\7A\2\2\u04da\u04ca\3\2\2\2\u04da\u04cb\3\2\2\2\u04da\u04d0\3\2"+
		"\2\2\u04db\u00ad\3\2\2\2\u04dc\u04df\5\u00a8U\2\u04dd\u04df\5\u0082B\2"+
		"\u04de\u04dc\3\2\2\2\u04de\u04dd\3\2\2\2\u04df\u00af\3\2\2\2\u04e0\u04e1"+
		"\7@\2\2\u04e1\u04e2\5\u00a8U\2\u04e2\u04e3\7A\2\2\u04e3\u04f3\3\2\2\2"+
		"\u04e4\u04f3\7-\2\2\u04e5\u04f3\7*\2\2\u04e6\u04f3\5`\61\2\u04e7\u04f3"+
		"\7r\2\2\u04e8\u04e9\5.\30\2\u04e9\u04ea\7H\2\2\u04ea\u04eb\7\13\2\2\u04eb"+
		"\u04f3\3\2\2\2\u04ec\u04f0\5\u00c4c\2\u04ed\u04f1\5\u00d0i\2\u04ee\u04ef"+
		"\7-\2\2\u04ef\u04f1\5\u00d2j\2\u04f0\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2"+
		"\u04f1\u04f3\3\2\2\2\u04f2\u04e0\3\2\2\2\u04f2\u04e4\3\2\2\2\u04f2\u04e5"+
		"\3\2\2\2\u04f2\u04e6\3\2\2\2\u04f2\u04e7\3\2\2\2\u04f2\u04e8\3\2\2\2\u04f2"+
		"\u04ec\3\2\2\2\u04f3\u00b1\3\2\2\2\u04f4\u04f5\5P)\2\u04f5\u04f6\7H\2"+
		"\2\u04f6\u04f8\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fc"+
		"\3\2\2\2\u04f9\u04fb\5h\65\2\u04fa\u04f9\3\2\2\2\u04fb\u04fe\3\2\2\2\u04fc"+
		"\u04fa\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04fc\3\2"+
		"\2\2\u04ff\u0501\7r\2\2\u0500\u0502\5\u00ccg\2\u0501\u0500\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u00b3\3\2\2\2\u0503\u0504\5\u00c4c\2\u0504\u0505"+
		"\5\u00b6\\\2\u0505\u0506\5\u00bc_\2\u0506\u050d\3\2\2\2\u0507\u050a\5"+
		"\u00b6\\\2\u0508\u050b\5\u00ba^\2\u0509\u050b\5\u00bc_\2\u050a\u0508\3"+
		"\2\2\2\u050a\u0509\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u0503\3\2\2\2\u050c"+
		"\u0507\3\2\2\2\u050d\u00b5\3\2\2\2\u050e\u0510\7r\2\2\u050f\u0511\5\u00c0"+
		"a\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0519\3\2\2\2\u0512"+
		"\u0513\7H\2\2\u0513\u0515\7r\2\2\u0514\u0516\5\u00c0a\2\u0515\u0514\3"+
		"\2\2\2\u0515\u0516\3\2\2\2\u0516\u0518\3\2\2\2\u0517\u0512\3\2\2\2\u0518"+
		"\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051e\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051c\u051e\5\u00caf\2\u051d\u050e\3\2\2\2\u051d"+
		"\u051c\3\2\2\2\u051e\u00b7\3\2\2\2\u051f\u0521\7r\2\2\u0520\u0522\5\u00c2"+
		"b\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523"+
		"\u0524\5\u00bc_\2\u0524\u00b9\3\2\2\2\u0525\u0541\7D\2\2\u0526\u052b\7"+
		"E\2\2\u0527\u0528\7D\2\2\u0528\u052a\7E\2\2\u0529\u0527\3\2\2\2\u052a"+
		"\u052d\3\2\2\2\u052b\u0529\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2"+
		"\2\2\u052d\u052b\3\2\2\2\u052e\u0542\5N(\2\u052f\u0530\5\u00a8U\2\u0530"+
		"\u0537\7E\2\2\u0531\u0532\7D\2\2\u0532\u0533\5\u00a8U\2\u0533\u0534\7"+
		"E\2\2\u0534\u0536\3\2\2\2\u0535\u0531\3\2\2\2\u0536\u0539\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053e\3\2\2\2\u0539\u0537\3\2"+
		"\2\2\u053a\u053b\7D\2\2\u053b\u053d\7E\2\2\u053c\u053a\3\2\2\2\u053d\u0540"+
		"\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0542\3\2\2\2\u0540"+
		"\u053e\3\2\2\2\u0541\u0526\3\2\2\2\u0541\u052f\3\2\2\2\u0542\u00bb\3\2"+
		"\2\2\u0543\u0545\5\u00d2j\2\u0544\u0546\5\"\22\2\u0545\u0544\3\2\2\2\u0545"+
		"\u0546\3\2\2\2\u0546\u00bd\3\2\2\2\u0547\u0548\5\u00c4c\2\u0548\u0549"+
		"\5\u00d0i\2\u0549\u00bf\3\2\2\2\u054a\u054b\7K\2\2\u054b\u054e\7J\2\2"+
		"\u054c\u054e\5\u00ccg\2\u054d\u054a\3\2\2\2\u054d\u054c\3\2\2\2\u054e"+
		"\u00c1\3\2\2\2\u054f\u0550\7K\2\2\u0550\u0553\7J\2\2\u0551\u0553\5\u00c4"+
		"c\2\u0552\u054f\3\2\2\2\u0552\u0551\3\2\2\2\u0553\u00c3\3\2\2\2\u0554"+
		"\u0555\7K\2\2\u0555\u0556\5\u00c6d\2\u0556\u0557\7J\2\2\u0557\u00c5\3"+
		"\2\2\2\u0558\u055d\5\u00c8e\2\u0559\u055a\7G\2\2\u055a\u055c\5\u00c8e"+
		"\2\u055b\u0559\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e"+
		"\3\2\2\2\u055e\u00c7\3\2\2\2\u055f\u055d\3\2\2\2\u0560\u0562\5h\65\2\u0561"+
		"\u0560\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2"+
		"\2\2\u0564\u0568\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u0569\5P)\2\u0567\u0569"+
		"\5\u00caf\2\u0568\u0566\3\2\2\2\u0568\u0567\3\2\2\2\u0569\u0574\3\2\2"+
		"\2\u056a\u056c\5h\65\2\u056b\u056a\3\2\2\2\u056c\u056f\3\2\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f\u056d\3\2\2\2\u0570"+
		"\u0571\7D\2\2\u0571\u0573\7E\2\2\u0572\u056d\3\2\2\2\u0573\u0576\3\2\2"+
		"\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u00c9\3\2\2\2\u0576\u0574"+
		"\3\2\2\2\u0577\u0578\t\r\2\2\u0578\u00cb\3\2\2\2\u0579\u057a\7K\2\2\u057a"+
		"\u057f\5R*\2\u057b\u057c\7G\2\2\u057c\u057e\5R*\2\u057d\u057b\3\2\2\2"+
		"\u057e\u0581\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582"+
		"\3\2\2\2\u0581\u057f\3\2\2\2\u0582\u0583\7J\2\2\u0583\u00cd\3\2\2\2\u0584"+
		"\u058b\5\u00d2j\2\u0585\u0586\7H\2\2\u0586\u0588\7r\2\2\u0587\u0589\5"+
		"\u00d2j\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2"+
		"\u058a\u0584\3\2\2\2\u058a\u0585\3\2\2\2\u058b\u00cf\3\2\2\2\u058c\u058d"+
		"\7*\2\2\u058d\u0591\5\u00ceh\2\u058e\u058f\7r\2\2\u058f\u0591\5\u00d2"+
		"j\2\u0590\u058c\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u00d1\3\2\2\2\u0592"+
		"\u0594\7@\2\2\u0593\u0595\5\u00a4S\2\u0594\u0593\3\2\2\2\u0594\u0595\3"+
		"\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7A\2\2\u0597\u00d3\3\2\2\2\u00b4"+
		"\u00d5\u00da\u00e0\u00e8\u00f1\u00f6\u00fd\u0104\u0107\u010e\u0119\u011d"+
		"\u0122\u0126\u012a\u0134\u013c\u0144\u0148\u014f\u0156\u015a\u015d\u0160"+
		"\u0169\u016f\u0174\u0177\u017d\u0183\u0187\u018f\u0198\u019f\u01a5\u01a9"+
		"\u01b4\u01bd\u01c2\u01c8\u01cc\u01d8\u01e3\u01e8\u01f1\u01f9\u0203\u020c"+
		"\u0214\u0219\u0221\u0226\u0230\u023a\u0240\u0247\u024c\u0254\u0258\u025a"+
		"\u0260\u0265\u0269\u0270\u0276\u0278\u027f\u0284\u028d\u0292\u0295\u029a"+
		"\u02a3\u02aa\u02b5\u02be\u02c8\u02d1\u02d6\u02d9\u02e0\u02ea\u02f2\u02f5"+
		"\u02f8\u0305\u030d\u0312\u031a\u031e\u0322\u0326\u0328\u032c\u0332\u033d"+
		"\u0347\u034c\u0355\u035a\u035d\u0364\u036d\u0384\u0387\u038a\u0392\u0396"+
		"\u039e\u03a4\u03af\u03b8\u03bd\u03c7\u03ce\u03db\u03e4\u03ed\u03f3\u03fe"+
		"\u0403\u0408\u040d\u0411\u0415\u0419\u041b\u041f\u0424\u0435\u043b\u0441"+
		"\u0447\u044a\u0455\u0464\u0468\u046d\u0471\u0481\u04a9\u04af\u04be\u04c1"+
		"\u04c3\u04cd\u04d6\u04da\u04de\u04f0\u04f2\u04f7\u04fc\u0501\u050a\u050c"+
		"\u0510\u0515\u0519\u051d\u0521\u052b\u0537\u053e\u0541\u0545\u054d\u0552"+
		"\u055d\u0563\u0568\u056d\u0574\u057f\u0588\u058a\u0590\u0594";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}