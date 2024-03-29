package jpgen.clang;

public record CXIdxEntityRefInfo(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$kind = 0L;
    public static final java.lang.foreign.GroupLayout LAYOUT$cursor = jpgen.clang.CXCursor.gStructLayout;
    public static final long OFFSET$cursor = 8L;
    public static final java.lang.foreign.GroupLayout LAYOUT$loc = jpgen.clang.CXIdxLoc.gStructLayout;
    public static final long OFFSET$loc = 40L;
    public static final java.lang.foreign.AddressLayout LAYOUT$referencedEntity = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$referencedEntity = 64L;
    public static final java.lang.foreign.AddressLayout LAYOUT$parentEntity = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$parentEntity = 72L;
    public static final java.lang.foreign.AddressLayout LAYOUT$container = jpgen.NativeTypes.UNBOUNDED_POINTER;
    public static final long OFFSET$container = 80L;
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$role = java.lang.foreign.ValueLayout.JAVA_INT;
    public static final long OFFSET$role = 88L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$kind,
            java.lang.foreign.MemoryLayout.paddingLayout(4),
            LAYOUT$cursor,
            LAYOUT$loc,
            LAYOUT$referencedEntity,
            LAYOUT$parentEntity,
            LAYOUT$container,
            LAYOUT$role,
            java.lang.foreign.MemoryLayout.paddingLayout(4)
    ).withName("CXIdxEntityRefInfo");

    public CXIdxEntityRefInfo(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public static CXIdxEntityRefInfo getAtIndex(java.lang.foreign.MemorySegment buffer, int i)
    {
        return new CXIdxEntityRefInfo(buffer.asSlice(i * gStructLayout.byteSize(), gStructLayout));
    }

    public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
    public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
    public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

    public jpgen.clang.CXCursor cursor() {return new jpgen.clang.CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}
    public void cursor(java.util.function.Consumer<jpgen.clang.CXCursor> consumer) {consumer.accept(this.cursor());}
    public void cursor(jpgen.clang.CXCursor value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$cursor, LAYOUT$cursor.byteSize());}

    public jpgen.clang.CXIdxLoc loc() {return new jpgen.clang.CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}
    public void loc(java.util.function.Consumer<jpgen.clang.CXIdxLoc> consumer) {consumer.accept(this.loc());}
    public void loc(jpgen.clang.CXIdxLoc value) {java.lang.foreign.MemorySegment.copy(value.ptr(), 0, this.ptr, OFFSET$loc, LAYOUT$loc.byteSize());}

    public java.lang.foreign.MemorySegment referencedEntity() {return this.ptr.get(LAYOUT$referencedEntity, OFFSET$referencedEntity);}
    public void referencedEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$referencedEntity, OFFSET$referencedEntity, value);}
    public java.lang.foreign.MemorySegment referencedEntity_ptr() {return this.ptr.asSlice(OFFSET$referencedEntity, LAYOUT$referencedEntity);}

    public java.lang.foreign.MemorySegment parentEntity() {return this.ptr.get(LAYOUT$parentEntity, OFFSET$parentEntity);}
    public void parentEntity(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$parentEntity, OFFSET$parentEntity, value);}
    public java.lang.foreign.MemorySegment parentEntity_ptr() {return this.ptr.asSlice(OFFSET$parentEntity, LAYOUT$parentEntity);}

    public java.lang.foreign.MemorySegment container() {return this.ptr.get(LAYOUT$container, OFFSET$container);}
    public void container(java.lang.foreign.MemorySegment value) {this.ptr.set(LAYOUT$container, OFFSET$container, value);}
    public java.lang.foreign.MemorySegment container_ptr() {return this.ptr.asSlice(OFFSET$container, LAYOUT$container);}

    public int role() {return this.ptr.get(LAYOUT$role, OFFSET$role);}
    public void role(int value) {this.ptr.set(LAYOUT$role, OFFSET$role, value);}
    public java.lang.foreign.MemorySegment role_ptr() {return this.ptr.asSlice(OFFSET$role, LAYOUT$role);}
}
