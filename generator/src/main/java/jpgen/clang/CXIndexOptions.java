package jpgen.clang;

public record CXIndexOptions(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Size = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$Size = 0L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$ThreadBackgroundPriorityForIndexing = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$ThreadBackgroundPriorityForIndexing = 4L;
	public static final java.lang.foreign.ValueLayout.OfByte LAYOUT$ThreadBackgroundPriorityForEditing = java.lang.foreign.ValueLayout.JAVA_BYTE;
	public static final long OFFSET$ThreadBackgroundPriorityForEditing = 5L;
	public static final java.lang.foreign.AddressLayout LAYOUT$PreambleStoragePath = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$PreambleStoragePath = 16L;
	public static final java.lang.foreign.AddressLayout LAYOUT$InvocationEmissionPath = java.lang.foreign.ValueLayout.ADDRESS;
	public static final long OFFSET$InvocationEmissionPath = 24L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$Size,
			LAYOUT$ThreadBackgroundPriorityForIndexing,
			LAYOUT$ThreadBackgroundPriorityForEditing,
			java.lang.foreign.MemoryLayout.paddingLayout(10),
			LAYOUT$PreambleStoragePath,
			LAYOUT$InvocationEmissionPath
	).withName("CXIndexOptions");

	public CXIndexOptions(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int Size() {return this.ptr.get(LAYOUT$Size, OFFSET$Size);}
	public void Size(int value) {this.ptr.set(LAYOUT$Size, OFFSET$Size, value);}
	public java.lang.foreign.MemorySegment Size_ptr() {return this.ptr.asSlice(OFFSET$Size, LAYOUT$Size);}

	public char ThreadBackgroundPriorityForIndexing() {return (char)this.ptr.get(LAYOUT$ThreadBackgroundPriorityForIndexing, OFFSET$ThreadBackgroundPriorityForIndexing);}
	public void ThreadBackgroundPriorityForIndexing(char value) {this.ptr.set(LAYOUT$ThreadBackgroundPriorityForIndexing, OFFSET$ThreadBackgroundPriorityForIndexing, (byte)value);}
	public java.lang.foreign.MemorySegment ThreadBackgroundPriorityForIndexing_ptr() {return this.ptr.asSlice(OFFSET$ThreadBackgroundPriorityForIndexing, LAYOUT$ThreadBackgroundPriorityForIndexing);}

	public char ThreadBackgroundPriorityForEditing() {return (char)this.ptr.get(LAYOUT$ThreadBackgroundPriorityForEditing, OFFSET$ThreadBackgroundPriorityForEditing);}
	public void ThreadBackgroundPriorityForEditing(char value) {this.ptr.set(LAYOUT$ThreadBackgroundPriorityForEditing, OFFSET$ThreadBackgroundPriorityForEditing, (byte)value);}
	public java.lang.foreign.MemorySegment ThreadBackgroundPriorityForEditing_ptr() {return this.ptr.asSlice(OFFSET$ThreadBackgroundPriorityForEditing, LAYOUT$ThreadBackgroundPriorityForEditing);}

	public java.lang.foreign.MemorySegment PreambleStoragePath() {return this.ptr.get(LAYOUT$PreambleStoragePath, OFFSET$PreambleStoragePath);}
	public void PreambleStoragePath(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$PreambleStoragePath, OFFSET$PreambleStoragePath, value);}
	public java.lang.foreign.MemorySegment PreambleStoragePath_ptr() {return this.ptr.asSlice(OFFSET$PreambleStoragePath, LAYOUT$PreambleStoragePath);}

	public java.lang.foreign.MemorySegment InvocationEmissionPath() {return this.ptr.get(LAYOUT$InvocationEmissionPath, OFFSET$InvocationEmissionPath);}
	public void InvocationEmissionPath(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$InvocationEmissionPath, OFFSET$InvocationEmissionPath, value);}
	public java.lang.foreign.MemorySegment InvocationEmissionPath_ptr() {return this.ptr.asSlice(OFFSET$InvocationEmissionPath, LAYOUT$InvocationEmissionPath);}
}
