package fr.kenlek.jpgen.api;

import java.lang.foreign.MemorySegment;

/// Classes implementing this interface can be used as wrapper types for native proxies.
/// @see fr.kenlek.jpgen.api.dynload.DowncallTransformer#PUBLIC_GROUP_TRANSFORMER
public interface Addressable
{
    /// Unwraps this to the representing [MemorySegment] slice.
    /// @return A memory segment representing this very object.
    MemorySegment pointer();
}
