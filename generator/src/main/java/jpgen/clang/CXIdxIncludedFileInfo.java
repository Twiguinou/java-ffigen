package jpgen.clang;

public record CXIdxIncludedFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.GroupLayout LAYOUT$hashLoc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$hashLoc = 0L;
    public static final java.lang.foreign.AddressLayout LAYOUT$filename = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$filename = 24L;
    public static final java.lang.foreign.AddressLayout LAYOUT$file = java.lang.foreign.ValueLayout.ADDRESS;
    public static final long OFFSET$file = 32L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isImport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isImport = 40L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isAngled = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isAngled = 44L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$isModuleImport = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$isModuleImport = 48L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$hashLoc,
            LAYOUT$filename,
            LAYOUT$file,
            LAYOUT$isImport,
            LAYOUT$isAngled,
            LAYOUT$isModuleImport,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxIncludedFileInfo");

    public CXIdxIncludedFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public jpgen.clang.CXIdxLoc hashLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$hashLoc, LAYOUT$hashLoc));}
    public void hashLoc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.hashLoc());}
    public void hashLoc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$hashLoc, LAYOUT$hashLoc.byteSize());}

    public java.lang.foreign.MemorySegment filename() {return this.ptr.get(LAYOUT$filename, OFFSET$filename);}
    public void filename(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$filename, OFFSET$filename, value);}
    public java.lang.foreign.MemorySegment filename_ptr() {return this.ptr.asSlice(OFFSET$filename, LAYOUT$filename);}

    public java.lang.foreign.MemorySegment file() {return this.ptr.get(LAYOUT$file, OFFSET$file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$file, OFFSET$file, value);}
    public java.lang.foreign.MemorySegment file_ptr() {return this.ptr.asSlice(OFFSET$file, LAYOUT$file);}

    public int isImport() {return this.ptr.get(LAYOUT$isImport, OFFSET$isImport);}
    public void isImport(int value) {this.ptr.set(LAYOUT$isImport, OFFSET$isImport, value);}
    public java.lang.foreign.MemorySegment isImport_ptr() {return this.ptr.asSlice(OFFSET$isImport, LAYOUT$isImport);}

    public int isAngled() {return this.ptr.get(LAYOUT$isAngled, OFFSET$isAngled);}
    public void isAngled(int value) {this.ptr.set(LAYOUT$isAngled, OFFSET$isAngled, value);}
    public java.lang.foreign.MemorySegment isAngled_ptr() {return this.ptr.asSlice(OFFSET$isAngled, LAYOUT$isAngled);}

    public int isModuleImport() {return this.ptr.get(LAYOUT$isModuleImport, OFFSET$isModuleImport);}
    public void isModuleImport(int value) {this.ptr.set(LAYOUT$isModuleImport, OFFSET$isModuleImport, value);}
    public java.lang.foreign.MemorySegment isModuleImport_ptr() {return this.ptr.asSlice(OFFSET$isModuleImport, LAYOUT$isModuleImport);}
}
