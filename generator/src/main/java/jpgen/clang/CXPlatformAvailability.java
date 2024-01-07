package jpgen.clang;

public record CXPlatformAvailability(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.StructLayout LAYOUT$Platform = CXString.gStructLayout.withName("Platform");
	public static final long OFFSET$Platform = 0L;
	public static final java.lang.foreign.StructLayout LAYOUT$Introduced = CXVersion.gStructLayout.withName("Introduced");
	public static final long OFFSET$Introduced = 16L;
	public static final java.lang.foreign.StructLayout LAYOUT$Deprecated = CXVersion.gStructLayout.withName("Deprecated");
	public static final long OFFSET$Deprecated = 28L;
	public static final java.lang.foreign.StructLayout LAYOUT$Obsoleted = CXVersion.gStructLayout.withName("Obsoleted");
	public static final long OFFSET$Obsoleted = 40L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Unavailable = java.lang.foreign.ValueLayout.JAVA_INT.withName("Unavailable");
	public static final long OFFSET$Unavailable = 52L;
	public static final java.lang.foreign.StructLayout LAYOUT$Message = CXString.gStructLayout.withName("Message");
	public static final long OFFSET$Message = 56L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$Platform,
			LAYOUT$Introduced,
			LAYOUT$Deprecated,
			LAYOUT$Obsoleted,
			LAYOUT$Unavailable,
			LAYOUT$Message
	).withName("CXPlatformAvailability");

	public CXPlatformAvailability(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public CXString Platform() {return new CXString(this.ptr.asSlice(OFFSET$Platform, LAYOUT$Platform));}

	public CXVersion Introduced() {return new CXVersion(this.ptr.asSlice(OFFSET$Introduced, LAYOUT$Introduced));}

	public CXVersion Deprecated() {return new CXVersion(this.ptr.asSlice(OFFSET$Deprecated, LAYOUT$Deprecated));}

	public CXVersion Obsoleted() {return new CXVersion(this.ptr.asSlice(OFFSET$Obsoleted, LAYOUT$Obsoleted));}

	public int Unavailable() {return this.ptr.get(LAYOUT$Unavailable, OFFSET$Unavailable);}
	public void Unavailable(int value) {this.ptr.set(LAYOUT$Unavailable, OFFSET$Unavailable, value);}
	public java.lang.foreign.MemorySegment Unavailable_ptr() {return this.ptr.asSlice(OFFSET$Unavailable, LAYOUT$Unavailable);}

	public CXString Message() {return new CXString(this.ptr.asSlice(OFFSET$Message, LAYOUT$Message));}
}
