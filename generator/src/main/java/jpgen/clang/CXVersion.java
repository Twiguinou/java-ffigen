package jpgen.clang;

public record CXVersion(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Major = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$Major = 0L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Minor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$Minor = 4L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Subminor = java.lang.foreign.ValueLayout.JAVA_INT;
	public static final long OFFSET$Subminor = 8L;

	public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
			LAYOUT$Major,
			LAYOUT$Minor,
			LAYOUT$Subminor
	).withName("CXVersion");

	public CXVersion(java.lang.foreign.SegmentAllocator allocator)
	{
		this(allocator.allocate(gStructLayout));
	}

	public int Major() {return this.ptr.get(LAYOUT$Major, OFFSET$Major);}
	public void Major(int value) {this.ptr.set(LAYOUT$Major, OFFSET$Major, value);}
	public java.lang.foreign.MemorySegment Major_ptr() {return this.ptr.asSlice(OFFSET$Major, LAYOUT$Major);}

	public int Minor() {return this.ptr.get(LAYOUT$Minor, OFFSET$Minor);}
	public void Minor(int value) {this.ptr.set(LAYOUT$Minor, OFFSET$Minor, value);}
	public java.lang.foreign.MemorySegment Minor_ptr() {return this.ptr.asSlice(OFFSET$Minor, LAYOUT$Minor);}

	public int Subminor() {return this.ptr.get(LAYOUT$Subminor, OFFSET$Subminor);}
	public void Subminor(int value) {this.ptr.set(LAYOUT$Subminor, OFFSET$Subminor, value);}
	public java.lang.foreign.MemorySegment Subminor_ptr() {return this.ptr.asSlice(OFFSET$Subminor, LAYOUT$Subminor);}
}
