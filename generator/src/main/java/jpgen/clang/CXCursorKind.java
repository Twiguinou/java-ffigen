package jpgen.clang;

public final class CXCursorKind
{private CXCursorKind() {}

	public static final int CXCursor_UnexposedDecl = 1;
	public static final int CXCursor_StructDecl = 2;
	public static final int CXCursor_UnionDecl = 3;
	public static final int CXCursor_ClassDecl = 4;
	public static final int CXCursor_EnumDecl = 5;
	public static final int CXCursor_FieldDecl = 6;
	public static final int CXCursor_EnumConstantDecl = 7;
	public static final int CXCursor_FunctionDecl = 8;
	public static final int CXCursor_VarDecl = 9;
	public static final int CXCursor_ParmDecl = 10;
	public static final int CXCursor_ObjCInterfaceDecl = 11;
	public static final int CXCursor_ObjCCategoryDecl = 12;
	public static final int CXCursor_ObjCProtocolDecl = 13;
	public static final int CXCursor_ObjCPropertyDecl = 14;
	public static final int CXCursor_ObjCIvarDecl = 15;
	public static final int CXCursor_ObjCInstanceMethodDecl = 16;
	public static final int CXCursor_ObjCClassMethodDecl = 17;
	public static final int CXCursor_ObjCImplementationDecl = 18;
	public static final int CXCursor_ObjCCategoryImplDecl = 19;
	public static final int CXCursor_TypedefDecl = 20;
	public static final int CXCursor_CXXMethod = 21;
	public static final int CXCursor_Namespace = 22;
	public static final int CXCursor_LinkageSpec = 23;
	public static final int CXCursor_Constructor = 24;
	public static final int CXCursor_Destructor = 25;
	public static final int CXCursor_ConversionFunction = 26;
	public static final int CXCursor_TemplateTypeParameter = 27;
	public static final int CXCursor_NonTypeTemplateParameter = 28;
	public static final int CXCursor_TemplateTemplateParameter = 29;
	public static final int CXCursor_FunctionTemplate = 30;
	public static final int CXCursor_ClassTemplate = 31;
	public static final int CXCursor_ClassTemplatePartialSpecialization = 32;
	public static final int CXCursor_NamespaceAlias = 33;
	public static final int CXCursor_UsingDirective = 34;
	public static final int CXCursor_UsingDeclaration = 35;
	public static final int CXCursor_TypeAliasDecl = 36;
	public static final int CXCursor_ObjCSynthesizeDecl = 37;
	public static final int CXCursor_ObjCDynamicDecl = 38;
	public static final int CXCursor_CXXAccessSpecifier = 39;
	public static final int CXCursor_FirstDecl = 1;
	public static final int CXCursor_LastDecl = 39;
	public static final int CXCursor_FirstRef = 40;
	public static final int CXCursor_ObjCSuperClassRef = 40;
	public static final int CXCursor_ObjCProtocolRef = 41;
	public static final int CXCursor_ObjCClassRef = 42;
	public static final int CXCursor_TypeRef = 43;
	public static final int CXCursor_CXXBaseSpecifier = 44;
	public static final int CXCursor_TemplateRef = 45;
	public static final int CXCursor_NamespaceRef = 46;
	public static final int CXCursor_MemberRef = 47;
	public static final int CXCursor_LabelRef = 48;
	public static final int CXCursor_OverloadedDeclRef = 49;
	public static final int CXCursor_VariableRef = 50;
	public static final int CXCursor_LastRef = 50;
	public static final int CXCursor_FirstInvalid = 70;
	public static final int CXCursor_InvalidFile = 70;
	public static final int CXCursor_NoDeclFound = 71;
	public static final int CXCursor_NotImplemented = 72;
	public static final int CXCursor_InvalidCode = 73;
	public static final int CXCursor_LastInvalid = 73;
	public static final int CXCursor_FirstExpr = 100;
	public static final int CXCursor_UnexposedExpr = 100;
	public static final int CXCursor_DeclRefExpr = 101;
	public static final int CXCursor_MemberRefExpr = 102;
	public static final int CXCursor_CallExpr = 103;
	public static final int CXCursor_ObjCMessageExpr = 104;
	public static final int CXCursor_BlockExpr = 105;
	public static final int CXCursor_IntegerLiteral = 106;
	public static final int CXCursor_FloatingLiteral = 107;
	public static final int CXCursor_ImaginaryLiteral = 108;
	public static final int CXCursor_StringLiteral = 109;
	public static final int CXCursor_CharacterLiteral = 110;
	public static final int CXCursor_ParenExpr = 111;
	public static final int CXCursor_UnaryOperator = 112;
	public static final int CXCursor_ArraySubscriptExpr = 113;
	public static final int CXCursor_BinaryOperator = 114;
	public static final int CXCursor_CompoundAssignOperator = 115;
	public static final int CXCursor_ConditionalOperator = 116;
	public static final int CXCursor_CStyleCastExpr = 117;
	public static final int CXCursor_CompoundLiteralExpr = 118;
	public static final int CXCursor_InitListExpr = 119;
	public static final int CXCursor_AddrLabelExpr = 120;
	public static final int CXCursor_StmtExpr = 121;
	public static final int CXCursor_GenericSelectionExpr = 122;
	public static final int CXCursor_GNUNullExpr = 123;
	public static final int CXCursor_CXXStaticCastExpr = 124;
	public static final int CXCursor_CXXDynamicCastExpr = 125;
	public static final int CXCursor_CXXReinterpretCastExpr = 126;
	public static final int CXCursor_CXXConstCastExpr = 127;
	public static final int CXCursor_CXXFunctionalCastExpr = 128;
	public static final int CXCursor_CXXTypeidExpr = 129;
	public static final int CXCursor_CXXBoolLiteralExpr = 130;
	public static final int CXCursor_CXXNullPtrLiteralExpr = 131;
	public static final int CXCursor_CXXThisExpr = 132;
	public static final int CXCursor_CXXThrowExpr = 133;
	public static final int CXCursor_CXXNewExpr = 134;
	public static final int CXCursor_CXXDeleteExpr = 135;
	public static final int CXCursor_UnaryExpr = 136;
	public static final int CXCursor_ObjCStringLiteral = 137;
	public static final int CXCursor_ObjCEncodeExpr = 138;
	public static final int CXCursor_ObjCSelectorExpr = 139;
	public static final int CXCursor_ObjCProtocolExpr = 140;
	public static final int CXCursor_ObjCBridgedCastExpr = 141;
	public static final int CXCursor_PackExpansionExpr = 142;
	public static final int CXCursor_SizeOfPackExpr = 143;
	public static final int CXCursor_LambdaExpr = 144;
	public static final int CXCursor_ObjCBoolLiteralExpr = 145;
	public static final int CXCursor_ObjCSelfExpr = 146;
	public static final int CXCursor_OMPArraySectionExpr = 147;
	public static final int CXCursor_ObjCAvailabilityCheckExpr = 148;
	public static final int CXCursor_FixedPointLiteral = 149;
	public static final int CXCursor_OMPArrayShapingExpr = 150;
	public static final int CXCursor_OMPIteratorExpr = 151;
	public static final int CXCursor_CXXAddrspaceCastExpr = 152;
	public static final int CXCursor_ConceptSpecializationExpr = 153;
	public static final int CXCursor_RequiresExpr = 154;
	public static final int CXCursor_CXXParenListInitExpr = 155;
	public static final int CXCursor_LastExpr = 155;
	public static final int CXCursor_FirstStmt = 200;
	public static final int CXCursor_UnexposedStmt = 200;
	public static final int CXCursor_LabelStmt = 201;
	public static final int CXCursor_CompoundStmt = 202;
	public static final int CXCursor_CaseStmt = 203;
	public static final int CXCursor_DefaultStmt = 204;
	public static final int CXCursor_IfStmt = 205;
	public static final int CXCursor_SwitchStmt = 206;
	public static final int CXCursor_WhileStmt = 207;
	public static final int CXCursor_DoStmt = 208;
	public static final int CXCursor_ForStmt = 209;
	public static final int CXCursor_GotoStmt = 210;
	public static final int CXCursor_IndirectGotoStmt = 211;
	public static final int CXCursor_ContinueStmt = 212;
	public static final int CXCursor_BreakStmt = 213;
	public static final int CXCursor_ReturnStmt = 214;
	public static final int CXCursor_GCCAsmStmt = 215;
	public static final int CXCursor_AsmStmt = 215;
	public static final int CXCursor_ObjCAtTryStmt = 216;
	public static final int CXCursor_ObjCAtCatchStmt = 217;
	public static final int CXCursor_ObjCAtFinallyStmt = 218;
	public static final int CXCursor_ObjCAtThrowStmt = 219;
	public static final int CXCursor_ObjCAtSynchronizedStmt = 220;
	public static final int CXCursor_ObjCAutoreleasePoolStmt = 221;
	public static final int CXCursor_ObjCForCollectionStmt = 222;
	public static final int CXCursor_CXXCatchStmt = 223;
	public static final int CXCursor_CXXTryStmt = 224;
	public static final int CXCursor_CXXForRangeStmt = 225;
	public static final int CXCursor_SEHTryStmt = 226;
	public static final int CXCursor_SEHExceptStmt = 227;
	public static final int CXCursor_SEHFinallyStmt = 228;
	public static final int CXCursor_MSAsmStmt = 229;
	public static final int CXCursor_NullStmt = 230;
	public static final int CXCursor_DeclStmt = 231;
	public static final int CXCursor_OMPParallelDirective = 232;
	public static final int CXCursor_OMPSimdDirective = 233;
	public static final int CXCursor_OMPForDirective = 234;
	public static final int CXCursor_OMPSectionsDirective = 235;
	public static final int CXCursor_OMPSectionDirective = 236;
	public static final int CXCursor_OMPSingleDirective = 237;
	public static final int CXCursor_OMPParallelForDirective = 238;
	public static final int CXCursor_OMPParallelSectionsDirective = 239;
	public static final int CXCursor_OMPTaskDirective = 240;
	public static final int CXCursor_OMPMasterDirective = 241;
	public static final int CXCursor_OMPCriticalDirective = 242;
	public static final int CXCursor_OMPTaskyieldDirective = 243;
	public static final int CXCursor_OMPBarrierDirective = 244;
	public static final int CXCursor_OMPTaskwaitDirective = 245;
	public static final int CXCursor_OMPFlushDirective = 246;
	public static final int CXCursor_SEHLeaveStmt = 247;
	public static final int CXCursor_OMPOrderedDirective = 248;
	public static final int CXCursor_OMPAtomicDirective = 249;
	public static final int CXCursor_OMPForSimdDirective = 250;
	public static final int CXCursor_OMPParallelForSimdDirective = 251;
	public static final int CXCursor_OMPTargetDirective = 252;
	public static final int CXCursor_OMPTeamsDirective = 253;
	public static final int CXCursor_OMPTaskgroupDirective = 254;
	public static final int CXCursor_OMPCancellationPointDirective = 255;
	public static final int CXCursor_OMPCancelDirective = 256;
	public static final int CXCursor_OMPTargetDataDirective = 257;
	public static final int CXCursor_OMPTaskLoopDirective = 258;
	public static final int CXCursor_OMPTaskLoopSimdDirective = 259;
	public static final int CXCursor_OMPDistributeDirective = 260;
	public static final int CXCursor_OMPTargetEnterDataDirective = 261;
	public static final int CXCursor_OMPTargetExitDataDirective = 262;
	public static final int CXCursor_OMPTargetParallelDirective = 263;
	public static final int CXCursor_OMPTargetParallelForDirective = 264;
	public static final int CXCursor_OMPTargetUpdateDirective = 265;
	public static final int CXCursor_OMPDistributeParallelForDirective = 266;
	public static final int CXCursor_OMPDistributeParallelForSimdDirective = 267;
	public static final int CXCursor_OMPDistributeSimdDirective = 268;
	public static final int CXCursor_OMPTargetParallelForSimdDirective = 269;
	public static final int CXCursor_OMPTargetSimdDirective = 270;
	public static final int CXCursor_OMPTeamsDistributeDirective = 271;
	public static final int CXCursor_OMPTeamsDistributeSimdDirective = 272;
	public static final int CXCursor_OMPTeamsDistributeParallelForSimdDirective = 273;
	public static final int CXCursor_OMPTeamsDistributeParallelForDirective = 274;
	public static final int CXCursor_OMPTargetTeamsDirective = 275;
	public static final int CXCursor_OMPTargetTeamsDistributeDirective = 276;
	public static final int CXCursor_OMPTargetTeamsDistributeParallelForDirective = 277;
	public static final int CXCursor_OMPTargetTeamsDistributeParallelForSimdDirective = 278;
	public static final int CXCursor_OMPTargetTeamsDistributeSimdDirective = 279;
	public static final int CXCursor_BuiltinBitCastExpr = 280;
	public static final int CXCursor_OMPMasterTaskLoopDirective = 281;
	public static final int CXCursor_OMPParallelMasterTaskLoopDirective = 282;
	public static final int CXCursor_OMPMasterTaskLoopSimdDirective = 283;
	public static final int CXCursor_OMPParallelMasterTaskLoopSimdDirective = 284;
	public static final int CXCursor_OMPParallelMasterDirective = 285;
	public static final int CXCursor_OMPDepobjDirective = 286;
	public static final int CXCursor_OMPScanDirective = 287;
	public static final int CXCursor_OMPTileDirective = 288;
	public static final int CXCursor_OMPCanonicalLoop = 289;
	public static final int CXCursor_OMPInteropDirective = 290;
	public static final int CXCursor_OMPDispatchDirective = 291;
	public static final int CXCursor_OMPMaskedDirective = 292;
	public static final int CXCursor_OMPUnrollDirective = 293;
	public static final int CXCursor_OMPMetaDirective = 294;
	public static final int CXCursor_OMPGenericLoopDirective = 295;
	public static final int CXCursor_OMPTeamsGenericLoopDirective = 296;
	public static final int CXCursor_OMPTargetTeamsGenericLoopDirective = 297;
	public static final int CXCursor_OMPParallelGenericLoopDirective = 298;
	public static final int CXCursor_OMPTargetParallelGenericLoopDirective = 299;
	public static final int CXCursor_OMPParallelMaskedDirective = 300;
	public static final int CXCursor_OMPMaskedTaskLoopDirective = 301;
	public static final int CXCursor_OMPMaskedTaskLoopSimdDirective = 302;
	public static final int CXCursor_OMPParallelMaskedTaskLoopDirective = 303;
	public static final int CXCursor_OMPParallelMaskedTaskLoopSimdDirective = 304;
	public static final int CXCursor_OMPErrorDirective = 305;
	public static final int CXCursor_LastStmt = 305;
	public static final int CXCursor_TranslationUnit = 350;
	public static final int CXCursor_FirstAttr = 400;
	public static final int CXCursor_UnexposedAttr = 400;
	public static final int CXCursor_IBActionAttr = 401;
	public static final int CXCursor_IBOutletAttr = 402;
	public static final int CXCursor_IBOutletCollectionAttr = 403;
	public static final int CXCursor_CXXFinalAttr = 404;
	public static final int CXCursor_CXXOverrideAttr = 405;
	public static final int CXCursor_AnnotateAttr = 406;
	public static final int CXCursor_AsmLabelAttr = 407;
	public static final int CXCursor_PackedAttr = 408;
	public static final int CXCursor_PureAttr = 409;
	public static final int CXCursor_ConstAttr = 410;
	public static final int CXCursor_NoDuplicateAttr = 411;
	public static final int CXCursor_CUDAConstantAttr = 412;
	public static final int CXCursor_CUDADeviceAttr = 413;
	public static final int CXCursor_CUDAGlobalAttr = 414;
	public static final int CXCursor_CUDAHostAttr = 415;
	public static final int CXCursor_CUDASharedAttr = 416;
	public static final int CXCursor_VisibilityAttr = 417;
	public static final int CXCursor_DLLExport = 418;
	public static final int CXCursor_DLLImport = 419;
	public static final int CXCursor_NSReturnsRetained = 420;
	public static final int CXCursor_NSReturnsNotRetained = 421;
	public static final int CXCursor_NSReturnsAutoreleased = 422;
	public static final int CXCursor_NSConsumesSelf = 423;
	public static final int CXCursor_NSConsumed = 424;
	public static final int CXCursor_ObjCException = 425;
	public static final int CXCursor_ObjCNSObject = 426;
	public static final int CXCursor_ObjCIndependentClass = 427;
	public static final int CXCursor_ObjCPreciseLifetime = 428;
	public static final int CXCursor_ObjCReturnsInnerPointer = 429;
	public static final int CXCursor_ObjCRequiresSuper = 430;
	public static final int CXCursor_ObjCRootClass = 431;
	public static final int CXCursor_ObjCSubclassingRestricted = 432;
	public static final int CXCursor_ObjCExplicitProtocolImpl = 433;
	public static final int CXCursor_ObjCDesignatedInitializer = 434;
	public static final int CXCursor_ObjCRuntimeVisible = 435;
	public static final int CXCursor_ObjCBoxable = 436;
	public static final int CXCursor_FlagEnum = 437;
	public static final int CXCursor_ConvergentAttr = 438;
	public static final int CXCursor_WarnUnusedAttr = 439;
	public static final int CXCursor_WarnUnusedResultAttr = 440;
	public static final int CXCursor_AlignedAttr = 441;
	public static final int CXCursor_LastAttr = 441;
	public static final int CXCursor_PreprocessingDirective = 500;
	public static final int CXCursor_MacroDefinition = 501;
	public static final int CXCursor_MacroExpansion = 502;
	public static final int CXCursor_MacroInstantiation = 502;
	public static final int CXCursor_InclusionDirective = 503;
	public static final int CXCursor_FirstPreprocessing = 500;
	public static final int CXCursor_LastPreprocessing = 503;
	public static final int CXCursor_ModuleImportDecl = 600;
	public static final int CXCursor_TypeAliasTemplateDecl = 601;
	public static final int CXCursor_StaticAssert = 602;
	public static final int CXCursor_FriendDecl = 603;
	public static final int CXCursor_ConceptDecl = 604;
	public static final int CXCursor_FirstExtraDecl = 600;
	public static final int CXCursor_LastExtraDecl = 604;
	public static final int CXCursor_OverloadCandidate = 700;
}
