/* Automatically generated source file, do not edit! */
package fr.kenlek.jpgen.clang;

public record CXPlatformAvailability(java.lang.foreign.MemorySegment ptr)
{
    public CXPlatformAvailability(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout));
    }

    public static CXPlatformAvailability getAtIndex(java.lang.foreign.MemorySegment buffer, long index)
    {
        return new CXPlatformAvailability(buffer.asSlice(index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, long index, CXPlatformAvailability value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout.byteSize(), fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout.byteSize());
    }

    public void copyFrom(CXPlatformAvailability other)
    {
        java.lang.foreign.MemorySegment.copy(other.ptr, 0, this.ptr, 0, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.layout.byteSize());
    }

    public static final long MEMBER_OFFSET__Platform = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(0).byteOffset();
    public fr.kenlek.jpgen.clang.CXString Platform() {return new fr.kenlek.jpgen.clang.CXString(this.ptr.asSlice(MEMBER_OFFSET__Platform, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));}
    public void Platform(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXString> consumer) {consumer.accept(this.Platform());}
    public void Platform(fr.kenlek.jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__Platform, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize());}
    public java.lang.foreign.MemorySegment $Platform() {return this.ptr.asSlice(MEMBER_OFFSET__Platform, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout);}

    public static final long MEMBER_OFFSET__Introduced = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(1).byteOffset();
    public fr.kenlek.jpgen.clang.CXVersion Introduced() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(MEMBER_OFFSET__Introduced, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout));}
    public void Introduced(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Introduced());}
    public void Introduced(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__Introduced, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize());}
    public java.lang.foreign.MemorySegment $Introduced() {return this.ptr.asSlice(MEMBER_OFFSET__Introduced, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout);}

    public static final long MEMBER_OFFSET__Deprecated = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(2).byteOffset();
    public fr.kenlek.jpgen.clang.CXVersion Deprecated() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(MEMBER_OFFSET__Deprecated, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout));}
    public void Deprecated(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Deprecated());}
    public void Deprecated(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__Deprecated, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize());}
    public java.lang.foreign.MemorySegment $Deprecated() {return this.ptr.asSlice(MEMBER_OFFSET__Deprecated, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout);}

    public static final long MEMBER_OFFSET__Obsoleted = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(3).byteOffset();
    public fr.kenlek.jpgen.clang.CXVersion Obsoleted() {return new fr.kenlek.jpgen.clang.CXVersion(this.ptr.asSlice(MEMBER_OFFSET__Obsoleted, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout));}
    public void Obsoleted(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXVersion> consumer) {consumer.accept(this.Obsoleted());}
    public void Obsoleted(fr.kenlek.jpgen.clang.CXVersion value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__Obsoleted, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout.byteSize());}
    public java.lang.foreign.MemorySegment $Obsoleted() {return this.ptr.asSlice(MEMBER_OFFSET__Obsoleted, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXVersion.layout);}

    public static final long MEMBER_OFFSET__Unavailable = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(4).byteOffset();
    public int Unavailable() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Unavailable);}
    public void Unavailable(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, MEMBER_OFFSET__Unavailable, value);}
    public java.lang.foreign.MemorySegment $Unavailable() {return this.ptr.asSlice(MEMBER_OFFSET__Unavailable, java.lang.foreign.ValueLayout.JAVA_INT);}

    public static final long MEMBER_OFFSET__Message = fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXPlatformAvailability.state(5).byteOffset();
    public fr.kenlek.jpgen.clang.CXString Message() {return new fr.kenlek.jpgen.clang.CXString(this.ptr.asSlice(MEMBER_OFFSET__Message, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout));}
    public void Message(java.util.function.Consumer<fr.kenlek.jpgen.clang.CXString> consumer) {consumer.accept(this.Message());}
    public void Message(fr.kenlek.jpgen.clang.CXString value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, MEMBER_OFFSET__Message, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout.byteSize());}
    public java.lang.foreign.MemorySegment $Message() {return this.ptr.asSlice(MEMBER_OFFSET__Message, fr.kenlek.jpgen.clang.Layouts.RECORD_DECL__fr$kenlek$jpgen$clang$CXString.layout);}
}
