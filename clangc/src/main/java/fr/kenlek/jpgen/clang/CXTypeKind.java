package fr.kenlek.jpgen.clang;

public final class CXTypeKind
{private CXTypeKind() {}

    public static final int CXType_Invalid = 0;
    public static final int CXType_Unexposed = 1;
    public static final int CXType_Void = 2;
    public static final int CXType_Bool = 3;
    public static final int CXType_Char_U = 4;
    public static final int CXType_UChar = 5;
    public static final int CXType_Char16 = 6;
    public static final int CXType_Char32 = 7;
    public static final int CXType_UShort = 8;
    public static final int CXType_UInt = 9;
    public static final int CXType_ULong = 10;
    public static final int CXType_ULongLong = 11;
    public static final int CXType_UInt128 = 12;
    public static final int CXType_Char_S = 13;
    public static final int CXType_SChar = 14;
    public static final int CXType_WChar = 15;
    public static final int CXType_Short = 16;
    public static final int CXType_Int = 17;
    public static final int CXType_Long = 18;
    public static final int CXType_LongLong = 19;
    public static final int CXType_Int128 = 20;
    public static final int CXType_Float = 21;
    public static final int CXType_Double = 22;
    public static final int CXType_LongDouble = 23;
    public static final int CXType_NullPtr = 24;
    public static final int CXType_Overload = 25;
    public static final int CXType_Dependent = 26;
    public static final int CXType_ObjCId = 27;
    public static final int CXType_ObjCClass = 28;
    public static final int CXType_ObjCSel = 29;
    public static final int CXType_Float128 = 30;
    public static final int CXType_Half = 31;
    public static final int CXType_Float16 = 32;
    public static final int CXType_ShortAccum = 33;
    public static final int CXType_Accum = 34;
    public static final int CXType_LongAccum = 35;
    public static final int CXType_UShortAccum = 36;
    public static final int CXType_UAccum = 37;
    public static final int CXType_ULongAccum = 38;
    public static final int CXType_BFloat16 = 39;
    public static final int CXType_Ibm128 = 40;
    public static final int CXType_FirstBuiltin = 2;
    public static final int CXType_LastBuiltin = 40;
    public static final int CXType_Complex = 100;
    public static final int CXType_Pointer = 101;
    public static final int CXType_BlockPointer = 102;
    public static final int CXType_LValueReference = 103;
    public static final int CXType_RValueReference = 104;
    public static final int CXType_Record = 105;
    public static final int CXType_Enum = 106;
    public static final int CXType_Typedef = 107;
    public static final int CXType_ObjCInterface = 108;
    public static final int CXType_ObjCObjectPointer = 109;
    public static final int CXType_FunctionNoProto = 110;
    public static final int CXType_FunctionProto = 111;
    public static final int CXType_ConstantArray = 112;
    public static final int CXType_Vector = 113;
    public static final int CXType_IncompleteArray = 114;
    public static final int CXType_VariableArray = 115;
    public static final int CXType_DependentSizedArray = 116;
    public static final int CXType_MemberPointer = 117;
    public static final int CXType_Auto = 118;
    public static final int CXType_Elaborated = 119;
    public static final int CXType_Pipe = 120;
    public static final int CXType_OCLImage1dRO = 121;
    public static final int CXType_OCLImage1dArrayRO = 122;
    public static final int CXType_OCLImage1dBufferRO = 123;
    public static final int CXType_OCLImage2dRO = 124;
    public static final int CXType_OCLImage2dArrayRO = 125;
    public static final int CXType_OCLImage2dDepthRO = 126;
    public static final int CXType_OCLImage2dArrayDepthRO = 127;
    public static final int CXType_OCLImage2dMSAARO = 128;
    public static final int CXType_OCLImage2dArrayMSAARO = 129;
    public static final int CXType_OCLImage2dMSAADepthRO = 130;
    public static final int CXType_OCLImage2dArrayMSAADepthRO = 131;
    public static final int CXType_OCLImage3dRO = 132;
    public static final int CXType_OCLImage1dWO = 133;
    public static final int CXType_OCLImage1dArrayWO = 134;
    public static final int CXType_OCLImage1dBufferWO = 135;
    public static final int CXType_OCLImage2dWO = 136;
    public static final int CXType_OCLImage2dArrayWO = 137;
    public static final int CXType_OCLImage2dDepthWO = 138;
    public static final int CXType_OCLImage2dArrayDepthWO = 139;
    public static final int CXType_OCLImage2dMSAAWO = 140;
    public static final int CXType_OCLImage2dArrayMSAAWO = 141;
    public static final int CXType_OCLImage2dMSAADepthWO = 142;
    public static final int CXType_OCLImage2dArrayMSAADepthWO = 143;
    public static final int CXType_OCLImage3dWO = 144;
    public static final int CXType_OCLImage1dRW = 145;
    public static final int CXType_OCLImage1dArrayRW = 146;
    public static final int CXType_OCLImage1dBufferRW = 147;
    public static final int CXType_OCLImage2dRW = 148;
    public static final int CXType_OCLImage2dArrayRW = 149;
    public static final int CXType_OCLImage2dDepthRW = 150;
    public static final int CXType_OCLImage2dArrayDepthRW = 151;
    public static final int CXType_OCLImage2dMSAARW = 152;
    public static final int CXType_OCLImage2dArrayMSAARW = 153;
    public static final int CXType_OCLImage2dMSAADepthRW = 154;
    public static final int CXType_OCLImage2dArrayMSAADepthRW = 155;
    public static final int CXType_OCLImage3dRW = 156;
    public static final int CXType_OCLSampler = 157;
    public static final int CXType_OCLEvent = 158;
    public static final int CXType_OCLQueue = 159;
    public static final int CXType_OCLReserveID = 160;
    public static final int CXType_ObjCObject = 161;
    public static final int CXType_ObjCTypeParam = 162;
    public static final int CXType_Attributed = 163;
    public static final int CXType_OCLIntelSubgroupAVCMcePayload = 164;
    public static final int CXType_OCLIntelSubgroupAVCImePayload = 165;
    public static final int CXType_OCLIntelSubgroupAVCRefPayload = 166;
    public static final int CXType_OCLIntelSubgroupAVCSicPayload = 167;
    public static final int CXType_OCLIntelSubgroupAVCMceResult = 168;
    public static final int CXType_OCLIntelSubgroupAVCImeResult = 169;
    public static final int CXType_OCLIntelSubgroupAVCRefResult = 170;
    public static final int CXType_OCLIntelSubgroupAVCSicResult = 171;
    public static final int CXType_OCLIntelSubgroupAVCImeResultSingleReferenceStreamout = 172;
    public static final int CXType_OCLIntelSubgroupAVCImeResultDualReferenceStreamout = 173;
    public static final int CXType_OCLIntelSubgroupAVCImeSingleReferenceStreamin = 174;
    public static final int CXType_OCLIntelSubgroupAVCImeDualReferenceStreamin = 175;
    public static final int CXType_OCLIntelSubgroupAVCImeResultSingleRefStreamout = 172;
    public static final int CXType_OCLIntelSubgroupAVCImeResultDualRefStreamout = 173;
    public static final int CXType_OCLIntelSubgroupAVCImeSingleRefStreamin = 174;
    public static final int CXType_OCLIntelSubgroupAVCImeDualRefStreamin = 175;
    public static final int CXType_ExtVector = 176;
    public static final int CXType_Atomic = 177;
    public static final int CXType_BTFTagAttributed = 178;
    public static final int CXType_HLSLResource = 179;
    public static final int CXType_HLSLAttributedResource = 180;
}
