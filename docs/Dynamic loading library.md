
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
-  Same with `strlen`.
-  `div` has one major ambiguity, which is its return type. We need a way to understand that `div_t` is of composite layout and then perform a constructor call to the wrapper class since the generated handle of `Linker::downcall` returns a simple `MemorySegment`.

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
-  make a downcall `critical`, or able to capture call states.
-  specify the layout of each type involved in a method, this would solve the problems mentioned previously.
-  specify symbolic names to use when looking up for function addresses.
-  in a function, interpret the first parameter as the function's address. This would likely clash with the previous annotation.
However, there are two more problems arising from this idea:
-  Things would become unreadable in some cases like specifying a layout with class descriptors.
-  It would make the interface itself responsible for configuring everything.