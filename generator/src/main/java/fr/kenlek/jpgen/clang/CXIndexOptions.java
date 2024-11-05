/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXIndexOptions(java.lang.foreign.MemorySegment ptr)
{
    public static final fr.kenlek.jpgen.LayoutData<java.lang.foreign.StructLayout> LAYOUT_DATA = fr.kenlek.jpgen.ForeignUtils.LAYOUT_PROVIDER.createStruct("CXIndexOptions", java.util.List.of(
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_INT.withName("Size")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_BYTE.withName("ThreadBackgroundPriorityForIndexing")),
            new fr.kenlek.jpgen.Member.Field(java.lang.foreign.ValueLayout.JAVA_BYTE.withName("ThreadBackgroundPriorityForEditing")),
            new fr.kenlek.jpgen.Member.Bitfield(java.lang.foreign.ValueLayout.JAVA_INT.withName("ExcludeDeclarationsFromPCH"), 1),
            new fr.kenlek.jpgen.Member.Bitfield(java.lang.foreign.ValueLayout.JAVA_INT.withName("DisplayDiagnostics"), 1),
            new fr.kenlek.jpgen.Member.Bitfield(java.lang.foreign.ValueLayout.JAVA_INT.withName("StorePreamblesInMemory"), 1),
            new fr.kenlek.jpgen.Member.Bitfield(java.lang.foreign.ValueLayout.JAVA_INT.withoutName(), 13),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("PreambleStoragePath")),
            new fr.kenlek.jpgen.Member.Field(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER.withName("InvocationEmissionPath"))
    ));

    public CXIndexOptions(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(LAYOUT_DATA.layout));
    }

    public static CXIndexOptions getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXIndexOptions(buffer.asSlice(index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXIndexOptions value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * LAYOUT_DATA.layout.byteSize(), LAYOUT_DATA.layout.byteSize());
    }

    public void copyFrom(CXIndexOptions other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, LAYOUT_DATA.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Size = LAYOUT_DATA.state(0).byteOffset();
    public int Size() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Size);}
    public void Size(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Size, value);}
    public java.lang.foreign.MemorySegment $Size() {return this.ptr.asSlice(MEMBER_OFFSET__Size, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__ThreadBackgroundPriorityForIndexing = LAYOUT_DATA.state(1).byteOffset();
    public byte ThreadBackgroundPriorityForIndexing() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_BYTE, MEMBER_OFFSET__ThreadBackgroundPriorityForIndexing);}
    public void ThreadBackgroundPriorityForIndexing(byte value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_BYTE, MEMBER_OFFSET__ThreadBackgroundPriorityForIndexing, value);}
    public java.lang.foreign.MemorySegment $ThreadBackgroundPriorityForIndexing() {return this.ptr.asSlice(MEMBER_OFFSET__ThreadBackgroundPriorityForIndexing, java.lang.foreign.ValueLayout.JAVA_BYTE);}

    public static final long MEMBER_OFFSET__ThreadBackgroundPriorityForEditing = LAYOUT_DATA.state(2).byteOffset();
    public byte ThreadBackgroundPriorityForEditing() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_BYTE, MEMBER_OFFSET__ThreadBackgroundPriorityForEditing);}
    public void ThreadBackgroundPriorityForEditing(byte value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_BYTE, MEMBER_OFFSET__ThreadBackgroundPriorityForEditing, value);}
    public java.lang.foreign.MemorySegment $ThreadBackgroundPriorityForEditing() {return this.ptr.asSlice(MEMBER_OFFSET__ThreadBackgroundPriorityForEditing, java.lang.foreign.ValueLayout.JAVA_BYTE);}

    public static final long MEMBER_OFFSET__ExcludeDeclarationsFromPCH = LAYOUT_DATA.state(3).byteOffset();
    public static final long BITFIELD_OFFSET__ExcludeDeclarationsFromPCH = LAYOUT_DATA.state(3).offset() - (MEMBER_OFFSET__ExcludeDeclarationsFromPCH << 3);
    public static final int BITMASK__ExcludeDeclarationsFromPCH = (int) ((1 << 1) - 1);
    public static final int BITMASK_INV__ExcludeDeclarationsFromPCH = ~BITMASK__ExcludeDeclarationsFromPCH;
    public int ExcludeDeclarationsFromPCH() {return (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__ExcludeDeclarationsFromPCH) >>> BITFIELD_OFFSET__ExcludeDeclarationsFromPCH) & BITMASK__ExcludeDeclarationsFromPCH;}
    public void ExcludeDeclarationsFromPCH(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__ExcludeDeclarationsFromPCH, (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__ExcludeDeclarationsFromPCH) & BITMASK_INV__ExcludeDeclarationsFromPCH) | (value << BITFIELD_OFFSET__ExcludeDeclarationsFromPCH));}

    public static final long MEMBER_OFFSET__DisplayDiagnostics = LAYOUT_DATA.state(4).byteOffset();
    public static final long BITFIELD_OFFSET__DisplayDiagnostics = LAYOUT_DATA.state(4).offset() - (MEMBER_OFFSET__DisplayDiagnostics << 3);
    public static final int BITMASK__DisplayDiagnostics = (int) ((1 << 1) - 1);
    public static final int BITMASK_INV__DisplayDiagnostics = ~BITMASK__DisplayDiagnostics;
    public int DisplayDiagnostics() {return (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__DisplayDiagnostics) >>> BITFIELD_OFFSET__DisplayDiagnostics) & BITMASK__DisplayDiagnostics;}
    public void DisplayDiagnostics(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__DisplayDiagnostics, (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__DisplayDiagnostics) & BITMASK_INV__DisplayDiagnostics) | (value << BITFIELD_OFFSET__DisplayDiagnostics));}

    public static final long MEMBER_OFFSET__StorePreamblesInMemory = LAYOUT_DATA.state(5).byteOffset();
    public static final long BITFIELD_OFFSET__StorePreamblesInMemory = LAYOUT_DATA.state(5).offset() - (MEMBER_OFFSET__StorePreamblesInMemory << 3);
    public static final int BITMASK__StorePreamblesInMemory = (int) ((1 << 1) - 1);
    public static final int BITMASK_INV__StorePreamblesInMemory = ~BITMASK__StorePreamblesInMemory;
    public int StorePreamblesInMemory() {return (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__StorePreamblesInMemory) >>> BITFIELD_OFFSET__StorePreamblesInMemory) & BITMASK__StorePreamblesInMemory;}
    public void StorePreamblesInMemory(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__StorePreamblesInMemory, (this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__StorePreamblesInMemory) & BITMASK_INV__StorePreamblesInMemory) | (value << BITFIELD_OFFSET__StorePreamblesInMemory));}

    public static final long MEMBER_OFFSET__PreambleStoragePath = LAYOUT_DATA.state(7).byteOffset();
    public java.lang.foreign.MemorySegment PreambleStoragePath() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__PreambleStoragePath);}
    public void PreambleStoragePath(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__PreambleStoragePath, value);}
    public java.lang.foreign.MemorySegment $PreambleStoragePath() {return this.ptr.asSlice(MEMBER_OFFSET__PreambleStoragePath, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}

    public static final long MEMBER_OFFSET__InvocationEmissionPath = LAYOUT_DATA.state(8).byteOffset();
    public java.lang.foreign.MemorySegment InvocationEmissionPath() {return this.ptr.get(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__InvocationEmissionPath);}
    public void InvocationEmissionPath(java.lang.foreign.MemorySegment value) {this.ptr.set(fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER, MEMBER_OFFSET__InvocationEmissionPath, value);}
    public java.lang.foreign.MemorySegment $InvocationEmissionPath() {return this.ptr.asSlice(MEMBER_OFFSET__InvocationEmissionPath, fr.kenlek.jpgen.ForeignUtils.UNBOUNDED_POINTER);}
}
