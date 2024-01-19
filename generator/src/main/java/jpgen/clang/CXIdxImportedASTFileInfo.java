package jpgen.clang;

public record CXIdxImportedASTFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.AddressLayout LAYOUT$file = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$file = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$module = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$module = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$loc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$loc = 16L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isImplicit = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isImplicit = 40L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$file,
            LAYOUT$module,
            LAYOUT$loc,
            LAYOUT$isImplicit,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxImportedASTFileInfo");

    public CXIdxImportedASTFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public java.lang.foreign.MemorySegment file() {return this.ptr.get(LAYOUT$file, OFFSET$file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$file, OFFSET$file, value);}
    public java.lang.foreign.MemorySegment file_ptr() {return this.ptr.asSlice(OFFSET$file, LAYOUT$file);}

    public java.lang.foreign.MemorySegment module() {return this.ptr.get(LAYOUT$module, OFFSET$module);}
    public void module(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$module, OFFSET$module, value);}
    public java.lang.foreign.MemorySegment module_ptr() {return this.ptr.asSlice(OFFSET$module, LAYOUT$module);}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}

    public int isImplicit() {return this.ptr.get(LAYOUT$isImplicit, OFFSET$isImplicit);}
    public void isImplicit(int value) {this.ptr.set(LAYOUT$isImplicit, OFFSET$isImplicit, value);}
    public java.lang.foreign.MemorySegment isImplicit_ptr() {return this.ptr.asSlice(OFFSET$isImplicit, LAYOUT$isImplicit);}
}
