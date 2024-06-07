package jpgen.clang;

public record CXPlatformAvailability(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__Platform = jpgen.clang.CXString.gRecordLayout;
    public static final long OFFSET__Platform = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__Introduced = jpgen.clang.CXVersion.gRecordLayout;
    public static final long OFFSET__Introduced = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__Deprecated = jpgen.clang.CXVersion.gRecordLayout;
    public static final long OFFSET__Deprecated = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__Obsoleted = jpgen.clang.CXVersion.gRecordLayout;
    public static final long OFFSET__Obsoleted = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Unavailable = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__Unavailable = 52;
    public static final java.lang.foreign.StructLayout LAYOUT__Message = jpgen.clang.CXString.gRecordLayout;
    public static final long OFFSET__Message = 56;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__Platform,
            LAYOUT__Introduced,
            LAYOUT__Deprecated,
            LAYOUT__Obsoleted,
            LAYOUT__Unavailable,
            LAYOUT__Message
    ).withByteAlignment(8).withName("CXPlatformAvailability");

    public CXPlatformAvailability(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXPlatformAvailability getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXPlatformAvailability(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXPlatformAvailability value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public jpgen.clang.CXString Platform() {return new jpgen.clang.CXString(this.ptr.asSlice(OFFSET__Platform, LAYOUT__Platform));}
    public void Platform(java.util.function.Consumer<jpgen.clang.CXString> consumer) {consumer.accept(this.Platform());}
    public void Platform(jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Platform, LAYOUT__Platform.byteSize());}

    public jpgen.clang.CXVersion Introduced() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Introduced, LAYOUT__Introduced));}
    public void Introduced(java.util.function.Consumer<jpgen.clang.CXVersion> consumer) {consumer.accept(this.Introduced());}
    public void Introduced(jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Introduced, LAYOUT__Introduced.byteSize());}

    public jpgen.clang.CXVersion Deprecated() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Deprecated, LAYOUT__Deprecated));}
    public void Deprecated(java.util.function.Consumer<jpgen.clang.CXVersion> consumer) {consumer.accept(this.Deprecated());}
    public void Deprecated(jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Deprecated, LAYOUT__Deprecated.byteSize());}

    public jpgen.clang.CXVersion Obsoleted() {return new jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Obsoleted, LAYOUT__Obsoleted));}
    public void Obsoleted(java.util.function.Consumer<jpgen.clang.CXVersion> consumer) {consumer.accept(this.Obsoleted());}
    public void Obsoleted(jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Obsoleted, LAYOUT__Obsoleted.byteSize());}

    public int Unavailable() {return this.ptr.get(LAYOUT__Unavailable, OFFSET__Unavailable);}
    public void Unavailable(int value) {this.ptr.set(LAYOUT__Unavailable, OFFSET__Unavailable, value);}
    public java.lang.foreign.MemorySegment $Unavailable() {return this.ptr.asSlice(OFFSET__Unavailable, LAYOUT__Unavailable);}

    public jpgen.clang.CXString Message() {return new jpgen.clang.CXString(this.ptr.asSlice(OFFSET__Message, LAYOUT__Message));}
    public void Message(java.util.function.Consumer<jpgen.clang.CXString> consumer) {consumer.accept(this.Message());}
    public void Message(jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Message, LAYOUT__Message.byteSize());}
}
