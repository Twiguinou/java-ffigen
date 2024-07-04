package jpgen.clang;

public record CXIdxIncludedFileInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.StructLayout LAYOUT__hashLoc = jpgen.clang.CXIdxLoc.gRecordLayout.withName("hashLoc");
    public static final long OFFSET__hashLoc = 0;
    public static final java.lang.foreign.AddressLayout LAYOUT__filename = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("filename");
    public static final long OFFSET__filename = 24;
    public static final java.lang.foreign.AddressLayout LAYOUT__file = jpgen.NativeTypes.UNBOUNDED_POINTER.withName("file");
    public static final long OFFSET__file = 32;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isImport = java.lang.foreign.ValueLayout.JAVA_INT.withName("isImport");
    public static final long OFFSET__isImport = 40;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isAngled = java.lang.foreign.ValueLayout.JAVA_INT.withName("isAngled");
    public static final long OFFSET__isAngled = 44;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__isModuleImport = java.lang.foreign.ValueLayout.JAVA_INT.withName("isModuleImport");
    public static final long OFFSET__isModuleImport = 48;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__hashLoc,
            LAYOUT__filename,
            LAYOUT__file,
            LAYOUT__isImport,
            LAYOUT__isAngled,
            LAYOUT__isModuleImport,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxIncludedFileInfo");

    public CXIdxIncludedFileInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxIncludedFileInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxIncludedFileInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxIncludedFileInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public jpgen.clang.CXIdxLoc hashLoc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__hashLoc, LAYOUT__hashLoc));}
    public void hashLoc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.hashLoc());}
    public void hashLoc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__hashLoc, LAYOUT__hashLoc.byteSize());}

    public java.lang.foreign.MemorySegment filename() {return this.ptr.get(LAYOUT__filename, OFFSET__filename);}
    public void filename(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__filename, OFFSET__filename, value);}
    public java.lang.foreign.MemorySegment $filename() {return this.ptr.asSlice(OFFSET__filename, LAYOUT__filename);}

    public java.lang.foreign.MemorySegment file() {return this.ptr.get(LAYOUT__file, OFFSET__file);}
    public void file(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__file, OFFSET__file, value);}
    public java.lang.foreign.MemorySegment $file() {return this.ptr.asSlice(OFFSET__file, LAYOUT__file);}

    public int isImport() {return this.ptr.get(LAYOUT__isImport, OFFSET__isImport);}
    public void isImport(int value) {this.ptr.set(LAYOUT__isImport, OFFSET__isImport, value);}
    public java.lang.foreign.MemorySegment $isImport() {return this.ptr.asSlice(OFFSET__isImport, LAYOUT__isImport);}

    public int isAngled() {return this.ptr.get(LAYOUT__isAngled, OFFSET__isAngled);}
    public void isAngled(int value) {this.ptr.set(LAYOUT__isAngled, OFFSET__isAngled, value);}
    public java.lang.foreign.MemorySegment $isAngled() {return this.ptr.asSlice(OFFSET__isAngled, LAYOUT__isAngled);}

    public int isModuleImport() {return this.ptr.get(LAYOUT__isModuleImport, OFFSET__isModuleImport);}
    public void isModuleImport(int value) {this.ptr.set(LAYOUT__isModuleImport, OFFSET__isModuleImport, value);}
    public java.lang.foreign.MemorySegment $isModuleImport() {return this.ptr.asSlice(OFFSET__isModuleImport, LAYOUT__isModuleImport);}
}
