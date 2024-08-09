package fr.kenlek.jpgen.clang;

public record CXIndexOptions(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Size = java.lang.foreign.ValueLayout.JAVA_INT.withName("Size");
    public static final long OFFSET__Size = 0;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ThreadBackgroundPriorityForIndexing = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("ThreadBackgroundPriorityForIndexing");
    public static final long OFFSET__ThreadBackgroundPriorityForIndexing = 4;
    public static final java.lang.foreign.ValueLayout.OfByte LAYOUT__ThreadBackgroundPriorityForEditing = java.lang.foreign.ValueLayout.JAVA_BYTE.withName("ThreadBackgroundPriorityForEditing");
    public static final long OFFSET__ThreadBackgroundPriorityForEditing = 5;
    public static final java.lang.foreign.AddressLayout LAYOUT__PreambleStoragePath = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("PreambleStoragePath");
    public static final long OFFSET__PreambleStoragePath = 16;
    public static final java.lang.foreign.AddressLayout LAYOUT__InvocationEmissionPath = fr.kenlek.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("InvocationEmissionPath");
    public static final long OFFSET__InvocationEmissionPath = 24;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__Size,
            LAYOUT__ThreadBackgroundPriorityForIndexing,
            LAYOUT__ThreadBackgroundPriorityForEditing,
            java.lang.foreign.MemoryLayout.paddingLayout(10),
            LAYOUT__PreambleStoragePath,
            LAYOUT__InvocationEmissionPath
    ).withByteAlignment(8).withName("CXIndexOptions");

    public CXIndexOptions(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIndexOptions getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIndexOptions(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIndexOptions value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int Size() {return this.ptr.get(LAYOUT__Size, OFFSET__Size);}
    public void Size(int value) {this.ptr.set(LAYOUT__Size, OFFSET__Size, value);}
    public java.lang.foreign.MemorySegment $Size() {return this.ptr.asSlice(OFFSET__Size, LAYOUT__Size);}

    public byte ThreadBackgroundPriorityForIndexing() {return this.ptr.get(LAYOUT__ThreadBackgroundPriorityForIndexing, OFFSET__ThreadBackgroundPriorityForIndexing);}
    public void ThreadBackgroundPriorityForIndexing(byte value) {this.ptr.set(LAYOUT__ThreadBackgroundPriorityForIndexing, OFFSET__ThreadBackgroundPriorityForIndexing, value);}
    public java.lang.foreign.MemorySegment $ThreadBackgroundPriorityForIndexing() {return this.ptr.asSlice(OFFSET__ThreadBackgroundPriorityForIndexing, LAYOUT__ThreadBackgroundPriorityForIndexing);}

    public byte ThreadBackgroundPriorityForEditing() {return this.ptr.get(LAYOUT__ThreadBackgroundPriorityForEditing, OFFSET__ThreadBackgroundPriorityForEditing);}
    public void ThreadBackgroundPriorityForEditing(byte value) {this.ptr.set(LAYOUT__ThreadBackgroundPriorityForEditing, OFFSET__ThreadBackgroundPriorityForEditing, value);}
    public java.lang.foreign.MemorySegment $ThreadBackgroundPriorityForEditing() {return this.ptr.asSlice(OFFSET__ThreadBackgroundPriorityForEditing, LAYOUT__ThreadBackgroundPriorityForEditing);}

    public java.lang.foreign.MemorySegment PreambleStoragePath() {return this.ptr.get(LAYOUT__PreambleStoragePath, OFFSET__PreambleStoragePath);}
    public void PreambleStoragePath(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__PreambleStoragePath, OFFSET__PreambleStoragePath, value);}
    public java.lang.foreign.MemorySegment $PreambleStoragePath() {return this.ptr.asSlice(OFFSET__PreambleStoragePath, LAYOUT__PreambleStoragePath);}

    public java.lang.foreign.MemorySegment InvocationEmissionPath() {return this.ptr.get(LAYOUT__InvocationEmissionPath, OFFSET__InvocationEmissionPath);}
    public void InvocationEmissionPath(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__InvocationEmissionPath, OFFSET__InvocationEmissionPath, value);}
    public java.lang.foreign.MemorySegment $InvocationEmissionPath() {return this.ptr.asSlice(OFFSET__InvocationEmissionPath, LAYOUT__InvocationEmissionPath);}
}
