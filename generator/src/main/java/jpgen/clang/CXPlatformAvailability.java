package jpgen.clang;

public record CXPlatformAvailability(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$Platform = jpgen.clang.CXString.gStructLayout;
    public static final long OFFSET$Platform = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$Introduced = jpgen.clang.CXVersion.gStructLayout;
    public static final long OFFSET$Introduced = 16L;
    public static final java.lang.foreign.GroupLayout LAYOUT$Deprecated = jpgen.clang.CXVersion.gStructLayout;
    public static final long OFFSET$Deprecated = 28L;
    public static final java.lang.foreign.GroupLayout LAYOUT$Obsoleted = jpgen.clang.CXVersion.gStructLayout;
    public static final long OFFSET$Obsoleted = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$Unavailable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$Unavailable = 52L;
    public static final java.lang.foreign.GroupLayout LAYOUT$Message = jpgen.clang.CXString.gStructLayout;
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

    public jpgen.clang.CXString Platform() {return new jpgen.clang.CXString(this.ptr.asSlice(OFFSET$Platform, LAYOUT$Platform));}

    public jpgen.clang.CXVersion Introduced() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET$Introduced, LAYOUT$Introduced));}

    public jpgen.clang.CXVersion Deprecated() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET$Deprecated, LAYOUT$Deprecated));}

    public jpgen.clang.CXVersion Obsoleted() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET$Obsoleted, LAYOUT$Obsoleted));}

    public int Unavailable() {return this.ptr.get(LAYOUT$Unavailable, OFFSET$Unavailable);}
    public void Unavailable(int value) {this.ptr.set(LAYOUT$Unavailable, OFFSET$Unavailable, value);}
    public java.lang.foreign.MemorySegment Unavailable_ptr() {return this.ptr.asSlice(OFFSET$Unavailable, LAYOUT$Unavailable);}

    public jpgen.clang.CXString Message() {return new jpgen.clang.CXString(this.ptr.asSlice(OFFSET$Message, LAYOUT$Message));}
}
