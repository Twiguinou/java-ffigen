
`jpgen-api` comes with several tools to generate bindings from interface classes, these tools are all located under the `fr.kenlek.jpgen.api.dynload` package.

Take for instance the following interface:

```java
import java.lang.foreign.MemorySegment;  
import java.lang.foreign.SegmentAllocator;  
  
public interface Stdlib  
{  
    MemorySegment malloc(long size);  
  
    void free(MemorySegment ptr);  
  
    long strlen(MemorySegment theString);  
  
    div_t div(SegmentAllocator allocator, int dividend, int divisor);  
}
```

There are a few ambiguities to resolve before invoking anything native related:
- `malloc` takes a `size_t` as input which varies between 4 and 8 bytes of size across platforms. However, a Java `long` is always 8 bytes wide.
- Same with `strlen`.
- `div` has one major ambiguity, which is its return type. We need a way to understand that `div_t` is of composite layout and then perform a constructor call to the wrapper class since the generated handle of `Linker::downcall` returns a simple `MemorySegment`.

For reference, here are the C signature of `div` and the Java wrapper class of `div_t`:

```c
typedef struct
{
    int quot;
    int rem;
} div_t;

div_t div(int dividend, int divisor);
```

```java
import java.lang.foreign.MemoryLayout;  
import java.lang.foreign.MemorySegment;  
import java.lang.foreign.StructLayout;  
  
import static java.lang.foreign.ValueLayout.JAVA_INT;  
  
import static fr.kenlek.jpgen.api.ForeignUtils.makeStructLayout;  
  
public record div_t(MemorySegment ptr)  
{  
    public static final StructLayout LAYOUT = makeStructLayout(  
        JAVA_INT.withName("quot"),  
        JAVA_INT.withName("rem")  
    ).withName("div_t");  
    public static final long OFFSET__quot = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("quot"));  
    public static final long OFFSET__rem = LAYOUT.byteOffset(MemoryLayout.PathElement.groupElement("rem"));  
  
    public int quot()  
    {  
        return this.ptr().get(JAVA_INT, OFFSET__quot);  
    }  
  
    public int rem()  
    {  
        return this.ptr().get(JAVA_INT, OFFSET__rem);  
    }  
}
```

When generating a binding to this interface, the user supplies a `ProxyConfiguration` instance which contains primarily both `SymbolLookup` instance and a `Linker` instance. This configuration is stored in the generated class' data for use when creating downcall handles.

My first idea to solve all these ambiguities was to make the user able to decorate the interface with all sorts of annotation, some of which include the ability to:
- make a downcall `critical`, or able to capture call states.
- specify the layout of each type involved in a method, this would solve the problems mentioned previously.
- specify symbolic names to use when looking up for function addresses.
- in a function, interpret the first parameter as the function's address. This would likely clash with the previous annotation.
However, there are two more problems arising from this idea:
- Things would become unreadable in some cases like specifying a layout with class descriptors.
- It would make the interface itself responsible for configuring everything.

All this time I've been kind of a goof. There's only so many features I can code in to make the user more comfortable, thus we need a fully flexible interface. To get started, let's see what a native bound method looks like without any transformation:
- Since the native method handle is taken from the constant pool, it is generated upon first invocation of the generated method. To help the generation of downcall handles, a provided instance of `ProxyConfiguration` is stored in the class data. The first step involves using the `SymbolLookup` to resolve a matching function address, the method's name itself is used to this end. For the `FunctionDescriptor` we first have to check the return type for `void`, then every necessary type is mapped to a `MemoryLayout` using a simple class checking function. *For instance, `long.class` is mapped to `JAVA_LONG`.* Finally, we use `Linker.downcallHandle` to build the method handle that is later stored inside the constant pool.
- When the method is first discovered, the generator creates an implementation method which queries the native method handle from the constant pool and pushes it onto the operand stack. Then, every parameter is pushed onto the operand stack before doing a simple `invokevirtual` instruction. The result of the invocation is returned, without change, from the stack.
And.. that's it! Seriously, it is that simple, plus we avoid any error checking that would normally be necessary when using `MethodHandle.invokeExact`. Of course it can still fail, but only in the following cases:
- No function address could be resolved.
- Some type inside the method's descriptor couldn't be successfully mapped to a `MemoryLayout`.
- The C function itself has a different descriptor, but that we can't check so it's on the user. However this fails hard, most often as a JVM crash.
