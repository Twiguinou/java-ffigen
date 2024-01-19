package vulkan;

public record VkSRTDataNV(java.lang.foreign.MemorySegment ptr)
{
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$sx = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$sx = 0L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$a = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$a = 4L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$b = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$b = 8L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$pvx = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$pvx = 12L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$sy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$sy = 16L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$c = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$c = 20L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$pvy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$pvy = 24L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$sz = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$sz = 28L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$pvz = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$pvz = 32L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$qx = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$qx = 36L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$qy = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$qy = 40L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$qz = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$qz = 44L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$qw = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$qw = 48L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$tx = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$tx = 52L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$ty = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$ty = 56L;
    public static final java.lang.foreign.ValueLayout.OfFloat LAYOUT$tz = java.lang.foreign.ValueLayout.JAVA_FLOAT;
    public static final long OFFSET$tz = 60L;

    public static final java.lang.foreign.StructLayout gStructLayout = java.lang.foreign.MemoryLayout.structLayout(
            LAYOUT$sx,
            LAYOUT$a,
            LAYOUT$b,
            LAYOUT$pvx,
            LAYOUT$sy,
            LAYOUT$c,
            LAYOUT$pvy,
            LAYOUT$sz,
            LAYOUT$pvz,
            LAYOUT$qx,
            LAYOUT$qy,
            LAYOUT$qz,
            LAYOUT$qw,
            LAYOUT$tx,
            LAYOUT$ty,
            LAYOUT$tz
    ).withName("VkSRTDataNV");

    public VkSRTDataNV(java.lang.foreign.SegmentAllocator allocator)
    {
        this(allocator.allocate(gStructLayout));
    }

    public float sx() {return this.ptr.get(LAYOUT$sx, OFFSET$sx);}
    public void sx(float value) {this.ptr.set(LAYOUT$sx, OFFSET$sx, value);}
    public java.lang.foreign.MemorySegment sx_ptr() {return this.ptr.asSlice(OFFSET$sx, LAYOUT$sx);}

    public float a() {return this.ptr.get(LAYOUT$a, OFFSET$a);}
    public void a(float value) {this.ptr.set(LAYOUT$a, OFFSET$a, value);}
    public java.lang.foreign.MemorySegment a_ptr() {return this.ptr.asSlice(OFFSET$a, LAYOUT$a);}

    public float b() {return this.ptr.get(LAYOUT$b, OFFSET$b);}
    public void b(float value) {this.ptr.set(LAYOUT$b, OFFSET$b, value);}
    public java.lang.foreign.MemorySegment b_ptr() {return this.ptr.asSlice(OFFSET$b, LAYOUT$b);}

    public float pvx() {return this.ptr.get(LAYOUT$pvx, OFFSET$pvx);}
    public void pvx(float value) {this.ptr.set(LAYOUT$pvx, OFFSET$pvx, value);}
    public java.lang.foreign.MemorySegment pvx_ptr() {return this.ptr.asSlice(OFFSET$pvx, LAYOUT$pvx);}

    public float sy() {return this.ptr.get(LAYOUT$sy, OFFSET$sy);}
    public void sy(float value) {this.ptr.set(LAYOUT$sy, OFFSET$sy, value);}
    public java.lang.foreign.MemorySegment sy_ptr() {return this.ptr.asSlice(OFFSET$sy, LAYOUT$sy);}

    public float c() {return this.ptr.get(LAYOUT$c, OFFSET$c);}
    public void c(float value) {this.ptr.set(LAYOUT$c, OFFSET$c, value);}
    public java.lang.foreign.MemorySegment c_ptr() {return this.ptr.asSlice(OFFSET$c, LAYOUT$c);}

    public float pvy() {return this.ptr.get(LAYOUT$pvy, OFFSET$pvy);}
    public void pvy(float value) {this.ptr.set(LAYOUT$pvy, OFFSET$pvy, value);}
    public java.lang.foreign.MemorySegment pvy_ptr() {return this.ptr.asSlice(OFFSET$pvy, LAYOUT$pvy);}

    public float sz() {return this.ptr.get(LAYOUT$sz, OFFSET$sz);}
    public void sz(float value) {this.ptr.set(LAYOUT$sz, OFFSET$sz, value);}
    public java.lang.foreign.MemorySegment sz_ptr() {return this.ptr.asSlice(OFFSET$sz, LAYOUT$sz);}

    public float pvz() {return this.ptr.get(LAYOUT$pvz, OFFSET$pvz);}
    public void pvz(float value) {this.ptr.set(LAYOUT$pvz, OFFSET$pvz, value);}
    public java.lang.foreign.MemorySegment pvz_ptr() {return this.ptr.asSlice(OFFSET$pvz, LAYOUT$pvz);}

    public float qx() {return this.ptr.get(LAYOUT$qx, OFFSET$qx);}
    public void qx(float value) {this.ptr.set(LAYOUT$qx, OFFSET$qx, value);}
    public java.lang.foreign.MemorySegment qx_ptr() {return this.ptr.asSlice(OFFSET$qx, LAYOUT$qx);}

    public float qy() {return this.ptr.get(LAYOUT$qy, OFFSET$qy);}
    public void qy(float value) {this.ptr.set(LAYOUT$qy, OFFSET$qy, value);}
    public java.lang.foreign.MemorySegment qy_ptr() {return this.ptr.asSlice(OFFSET$qy, LAYOUT$qy);}

    public float qz() {return this.ptr.get(LAYOUT$qz, OFFSET$qz);}
    public void qz(float value) {this.ptr.set(LAYOUT$qz, OFFSET$qz, value);}
    public java.lang.foreign.MemorySegment qz_ptr() {return this.ptr.asSlice(OFFSET$qz, LAYOUT$qz);}

    public float qw() {return this.ptr.get(LAYOUT$qw, OFFSET$qw);}
    public void qw(float value) {this.ptr.set(LAYOUT$qw, OFFSET$qw, value);}
    public java.lang.foreign.MemorySegment qw_ptr() {return this.ptr.asSlice(OFFSET$qw, LAYOUT$qw);}

    public float tx() {return this.ptr.get(LAYOUT$tx, OFFSET$tx);}
    public void tx(float value) {this.ptr.set(LAYOUT$tx, OFFSET$tx, value);}
    public java.lang.foreign.MemorySegment tx_ptr() {return this.ptr.asSlice(OFFSET$tx, LAYOUT$tx);}

    public float ty() {return this.ptr.get(LAYOUT$ty, OFFSET$ty);}
    public void ty(float value) {this.ptr.set(LAYOUT$ty, OFFSET$ty, value);}
    public java.lang.foreign.MemorySegment ty_ptr() {return this.ptr.asSlice(OFFSET$ty, LAYOUT$ty);}

    public float tz() {return this.ptr.get(LAYOUT$tz, OFFSET$tz);}
    public void tz(float value) {this.ptr.set(LAYOUT$tz, OFFSET$tz, value);}
    public java.lang.foreign.MemorySegment tz_ptr() {return this.ptr.asSlice(OFFSET$tz, LAYOUT$tz);}
}
