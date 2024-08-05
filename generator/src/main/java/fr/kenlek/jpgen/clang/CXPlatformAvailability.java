package fr.kenlek.jpgen.clang;

public record CXPlatformAvailability(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__Platform = fr.kenlek.jpgen.clang.CXString.gRecordLayout.withName("Platform");
    public static final long OFFSET__Platform = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__Introduced = fr.kenlek.jpgen.clang.CXVersion.gRecordLayout.withName("Introduced");
    public static final long OFFSET__Introduced = 16;
    public static final java.lang.foreign.StructLayout LAYOUT__Deprecated = fr.kenlek.jpgen.clang.CXVersion.gRecordLayout.withName("Deprecated");
    public static final long OFFSET__Deprecated = 28;
    public static final java.lang.foreign.StructLayout LAYOUT__Obsoleted = fr.kenlek.jpgen.clang.CXVersion.gRecordLayout.withName("Obsoleted");
    public static final long OFFSET__Obsoleted = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__Unavailable = java.lang.foreign.ValueLayout.JAVA_INT.withName("Unavailable");
    public static final long OFFSET__Unavailable = 52;
    public static final java.lang.foreign.StructLayout LAYOUT__Message = fr.kenlek.jpgen.clang.CXString.gRecordLayout.withName("Message");
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

    public fr.kenlek.jpgen.clang.CXString Platform() {return new fr.kenlek.jpgen.clang.CXString(this.ptr.asSlice(OFFSET__Platform, LAYOUT__Platform));}
    public void Platform(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXString> consumer) {consumer.accept(this.Platform());}
    public void Platform(fr.kenlek.jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Platform, LAYOUT__Platform.byteSize());}

    public fr.kenlek.jpgen.clang.CXVersion Introduced() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Introduced, LAYOUT__Introduced));}
    public void Introduced(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Introduced());}
    public void Introduced(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Introduced, LAYOUT__Introduced.byteSize());}

    public fr.kenlek.jpgen.clang.CXVersion Deprecated() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Deprecated, LAYOUT__Deprecated));}
    public void Deprecated(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Deprecated());}
    public void Deprecated(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Deprecated, LAYOUT__Deprecated.byteSize());}

    public fr.kenlek.jpgen.clang.CXVersion Obsoleted() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(OFFSET__Obsoleted, LAYOUT__Obsoleted));}
    public void Obsoleted(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Obsoleted());}
    public void Obsoleted(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Obsoleted, LAYOUT__Obsoleted.byteSize());}

    public int Unavailable() {return this.ptr.get(LAYOUT__Unavailable, OFFSET__Unavailable);}
    public void Unavailable(int value) {this.ptr.set(LAYOUT__Unavailable, OFFSET__Unavailable, value);}
    public java.lang.foreign.MemorySegment $Unavailable() {return this.ptr.asSlice(OFFSET__Unavailable, LAYOUT__Unavailable);}

    public fr.kenlek.jpgen.clang.CXString Message() {return new fr.kenlek.jpgen.clang.CXString(this.ptr.asSlice(OFFSET__Message, LAYOUT__Message));}
    public void Message(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXString> consumer) {consumer.accept(this.Message());}
    public void Message(fr.kenlek.jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__Message, LAYOUT__Message.byteSize());}
}
