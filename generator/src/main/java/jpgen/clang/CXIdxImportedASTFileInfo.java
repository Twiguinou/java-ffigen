package jpgen.clang;

public record CXIdxImportedASTFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT__file = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__file = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__module = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET__module = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__loc = jpgen.clang.CXIdxLoc.gRecordLayout;
    public static final long OFFSET__loc = 16;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isImplicit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET__isImplicit = 40;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__file,
            LAYOUT__module,
            LAYOUT__loc,
            LAYOUT__isImplicit,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxImportedASTFileInfo");

    public CXIdxImportedASTFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxImportedASTFileInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxImportedASTFileInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxImportedASTFileInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public java.lang.foreign.MemorySegment file() {return this.ptr.get(LAYOUT__file, OFFSET__file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__file, OFFSET__file, value);}
    public java.lang.foreign.MemorySegment $file() {return this.ptr.asSlice(OFFSET__file, LAYOUT__file);}

    public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT__module, OFFSET__module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__module, OFFSET__module, value);}
    public java.lang.foreign.MemorySegment $module() {return this.ptr.asSlice(OFFSET__module, LAYOUT__module);}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__loc, LAYOUT__loc));}
    public void loc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__loc, LAYOUT__loc.byteSize());}

    public int isImplicit() {return this.ptr.get(LAYOUT__isImplicit, OFFSET__isImplicit);}
    public void isImplicit(int value) {this.ptr.set(LAYOUT__isImplicit, OFFSET__isImplicit, value);}
    public java.lang.foreign.MemorySegment $isImplicit() {return this.ptr.asSlice(OFFSET__isImplicit, LAYOUT__isImplicit);}
}
