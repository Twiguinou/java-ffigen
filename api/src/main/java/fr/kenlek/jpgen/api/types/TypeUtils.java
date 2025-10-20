package fr.kenlek.jpgen.api.types;

import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.UpcallTransformer;

public final class TypeUtils
{private TypeUtils() {}

    public static final DowncallTransformer DOWNCALL_C_TYPES_TRANSFORMER = CLong.DOWNCALL_TRANSFORMER
        .and(CUnsignedLong.DOWNCALL_TRANSFORMER)
        .and(CSizeT.DOWNCALL_TRANSFORMER);
    public static final UpcallTransformer UPCALL_C_TYPES_TRANSFORMER = CLong.UPCALL_TRANSFORMER
        .and(CUnsignedLong.UPCALL_TRANSFORMER)
        .and(CSizeT.UPCALL_TRANSFORMER);
}
