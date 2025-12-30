package fr.kenlek.jpgen.api.data;

import fr.kenlek.jpgen.api.dynload.DowncallTransformer;
import fr.kenlek.jpgen.api.dynload.UpcallTransformer;

public final class TypeUtils
{private TypeUtils() {}

    public static final DowncallTransformer C_TYPES_DOWNCALL_TRANSFORMER = CLong.DOWNCALL_TRANSFORMER
        .and(CSizeT.DOWNCALL_TRANSFORMER);
    public static final UpcallTransformer C_TYPES_UPCALL_TRANSFORMER = CLong.UPCALL_TRANSFORMER
        .and(CSizeT.UPCALL_TRANSFORMER);
}
