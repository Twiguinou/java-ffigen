package fr.kenlek.jpgen.clang;

import fr.kenlek.jpgen.NativeTypes;

public record CXTUResourceUsageEntry(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfInt LAYOUT__kind;
    public static final long OFFSET__kind;
    public static final java.lang.foreign.ValueLayout LAYOUT__amount;
    public static final long OFFSET__amount;

    public static final java.lang.foreign.StructLayout gRecordLayout;

    public CXTUResourceUsageEntry(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gRecordLayout));
    }

    public static CXTUResourceUsageEntry getAtIndex(java.lang.foreign.MemorySegment buffer, int index)
    {
        return new CXTUResourceUsageEntry(buffer.asSlice(index * gRecordLayout.byteSize(), gRecordLayout));
    }

    public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, CXTUResourceUsageEntry value)
    {
        java.lang.foreign.MemorySegment.copy(value.ptr, 0, buffer, index * gRecordLayout.byteSize(), gRecordLayout.byteSize());
    }

    public int kind() {return this.ptr.get(LAYOUT__kind, OFFSET__kind);}
    public void kind(int value) {this.ptr.set(LAYOUT__kind, OFFSET__kind, value);}
    public java.lang.foreign.MemorySegment $kind() {return this.ptr.asSlice(OFFSET__kind, LAYOUT__kind);}

    public int amount() {return this.ptr.get(java.lang.foreign.ValueLayout.JAVA_INT, OFFSET__amount);}
    public void amount(int value) {this.ptr.set(java.lang.foreign.ValueLayout.JAVA_INT, OFFSET__amount, value);}
    public java.lang.foreign.MemorySegment $amount() {return this.ptr.asSlice(OFFSET__amount, LAYOUT__amount);}

    static
    {
        LAYOUT__kind = java.lang.foreign.ValueLayout.JAVA_INT.withName("kind");
        OFFSET__kind = 0;

        if (NativeTypes.isP64())
        {
            LAYOUT__amount = java.lang.foreign.ValueLayout.JAVA_INT.withName("amount");
            OFFSET__amount = 4;

            gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
                    LAYOUT__kind,
                    LAYOUT__amount
            ).withByteAlignment(4).withName("CXTUResourceUsageEntry");
        }
        else
        {
            LAYOUT__amount = java.lang.foreign.ValueLayout.JAVA_LONG.withName("amount");
            OFFSET__amount = 8;

            gRecordLayout = java.lang.foreign.MemoryLayout.structLayout(
                    LAYOUT__kind,
                    java.lang.foreign.MemoryLayout.paddingLayout(4),
                    LAYOUT__amount
            ).withByteAlignment(8).withName("CXTUResourceUsageEntry");
        }
    }
}
