package fr.kenlek.jpgen.api;

import module java.base;

/// Classes implementing this interface can be used as wrapper types for native proxies.
/// @see fr.kenlek.jpgen.api.dynload.DowncallTransformer#PUBLIC_GROUP_TRANSFORMER
public interface Addressable
{
    /// Verifies that a [MemorySegment] satisfies the constraints of a [MemoryLayout],
    /// and throws an [IllegalArgumentException] if it is not the case.
    static void checkLayoutConstraints(MemorySegment slice, MemoryLayout layout)
    {
        if (slice.maxByteAlignment() < layout.byteAlignment() || slice.byteSize() != layout.byteSize())
        {
            throw new IllegalArgumentException("Memory slice does not follow layout constraints.");
        }
    }

    /// Unwraps this to the representing [MemorySegment] slice.
    /// @return A memory segment representing this very object.
    MemorySegment pointer();

    /// The memory layout that [#pointer] complies to. Every implementation
    /// of this interface must guarantee that relationship.
    MemoryLayout layout();
}
