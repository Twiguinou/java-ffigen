package fr.akshir.jpgen.clang;

public record CXIdxEntityRefInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
    public static final long OFFSET__kind = 0;
    public static final java.lang.foreign.StructLayout LAYOUT__cursor = fr.akshir.jpgen.clang.CXCursor.gRecordLayout.withName("cursor");
    public static final long OFFSET__cursor = 8;
    public static final java.lang.foreign.StructLayout LAYOUT__loc = fr.akshir.jpgen.clang.CXIdxLoc.gRecordLayout.withName("loc");
    public static final long OFFSET__loc = 40;
    public static final java.lang.foreign.AddressLayout LAYOUT__referencedEntity = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("referencedEntity");
    public static final long OFFSET__referencedEntity = 64;
    public static final java.lang.foreign.AddressLayout LAYOUT__parentEntity = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("parentEntity");
    public static final long OFFSET__parentEntity = 72;
    public static final java.lang.foreign.AddressLayout LAYOUT__container = fr.akshir.jpgen.NativeTypes.UNBOUNDED_POINTER.withName("container");
    public static final long OFFSET__container = 80;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__role = java.lang.foreign.ValueLayout.JAVA_INT.withName("role");
    public static final long OFFSET__role = 88;

    public static final java.lang.foreign.StructLayout gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT__kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT__cursor,
            LAYOUT__loc,
            LAYOUT__referencedEntity,
            LAYOUT__parentEntity,
            LAYOUT__container,
            LAYOUT__role,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withByteAlignment(8).withName("CXIdxEntityRefInfo");

    public CXIdxEntityRefInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXIdxEntityRefInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXIdxEntityRefInfo value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public fr.akshir.jpgen.clang.CXCursor cursor() {return new fr.akshir.jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET__cursor, LAYOUT__cursor));}
    public void cursor(java.util.function.Consumer<fr.akshir.jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(fr.akshir.jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__cursor, LAYOUT__cursor.byteSize());}

    public fr.akshir.jpgen.clang.CXIdxLoc loc() {return new fr.akshir.jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET__loc, LAYOUT__loc));}
    public void loc(java.util.function.Consumer<fr.akshir.jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(fr.akshir.jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET__loc, LAYOUT__loc.byteSize());}

    public java.lang.foreign.MemorySegment referencedEntity() {return this.ptr.get(LAYOUT__referencedEntity, OFFSET__referencedEntity);}
    public void referencedEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__referencedEntity, OFFSET__referencedEntity, value);}
    public java.lang.foreign.MemorySegment $referencedEntity() {return this.ptr.asSlice(OFFSET__referencedEntity, LAYOUT__referencedEntity);}

    public java.lang.foreign.MemorySegment parentEntity() {return this.ptr.get(LAYOUT__parentEntity, OFFSET__parentEntity);}
    public void parentEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__parentEntity, OFFSET__parentEntity, value);}
    public java.lang.foreign.MemorySegment $parentEntity() {return this.ptr.asSlice(OFFSET__parentEntity, LAYOUT__parentEntity);}

    public java.lang.foreign.MemorySegment container() {return this.ptr.get(LAYOUT__container, OFFSET__container);}
    public void container(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT__container, OFFSET__container, value);}
    public java.lang.foreign.MemorySegment $container() {return this.ptr.asSlice(OFFSET__container, LAYOUT__container);}

    public int role() {return this.ptr.get(LAYOUT__role, OFFSET__role);}
    public void role(int value) {this.ptr.set(LAYOUT__role, OFFSET__role, value);}
    public java.lang.foreign.MemorySegment $role() {return this.ptr.asSlice(OFFSET__role, LAYOUT__role);}
}
