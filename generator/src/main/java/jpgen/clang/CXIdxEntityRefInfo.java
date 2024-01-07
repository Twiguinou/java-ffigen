package jpgen.clang;

public record CXIdxEntityRefInfo(java.lang.foreign.MemorySegment ptr)
{
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
	public static final long OFFSET$kind = 0L;
	public static final java.lang.foreign.StructLayout LAYOUT$cursor = CXCursor.gStructLayout.withName("cursor");
	public static final long OFFSET$cursor = 8L;
	public static final java.lang.foreign.StructLayout LAYOUT$loc = CXIdxLoc.gStructLayout.withName("loc");
	public static final long OFFSET$loc = 40L;
	public static final java.lang.foreign.AddressLayout LAYOUT$referencedEntity = java.lang.foreign.ValueLayout.ADDRESS.withName("referencedEntity");
	public static final long OFFSET$referencedEntity = 64L;
	public static final java.lang.foreign.AddressLayout LAYOUT$parentEntity = java.lang.foreign.ValueLayout.ADDRESS.withName("parentEntity");
	public static final long OFFSET$parentEntity = 72L;
	public static final java.lang.foreign.AddressLayout LAYOUT$container = java.lang.foreign.ValueLayout.ADDRESS.withName("container");
	public static final long OFFSET$container = 80L;
	public static final java.lang.foreign.ValueLayout.OfInt LAYOUT$role = java.lang.foreign.ValueLayout.JAVA_INT.withName("role");
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

	public int kind() {return this.ptr.get(LAYOUT$kind, OFFSET$kind);}
	public void kind(int value) {this.ptr.set(LAYOUT$kind, OFFSET$kind, value);}
	public java.lang.foreign.MemorySegment kind_ptr() {return this.ptr.asSlice(OFFSET$kind, LAYOUT$kind);}

	public CXCursor cursor() {return new CXCursor(this.ptr.asSlice(OFFSET$cursor, LAYOUT$cursor));}

	public CXIdxLoc loc() {return new CXIdxLoc(this.ptr.asSlice(OFFSET$loc, LAYOUT$loc));}

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
