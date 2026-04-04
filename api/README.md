# jpgen-api

Helper library for use of jpgen-generated sources, built on top of the FFM API. It has no dependency and can be used
to easily create interoperating Java code.

---

## Installation

```kotlin
dependencies {
    implementation("fr.kenlek.jpgen:jpgen-api:0.2.3")
}
```

## Native proxies

The main part of this library involves creating proxies that automatically create downcall handles and transitions
for foreign functions.

### Basic usage

Define a Java interface for the native library:
```java
public interface MyLib
{
    int init();

    void cleanup();

    MemorySegment allocate(long size);

    void free(MemorySegment ptr);
}
```

Generate a runtime proxy:
```java
MethodHandles.Lookup lookup = MethodHandles.lookup();
MyLib lib = NativeProxies.make(lookup, MyLib.class, DowncallDispatcher.DEFAULT);
lib.init();
```

Under the hood, `NativeProxies.make` creates a hidden class implementing every non-default function of the given
interface. In order to speedup the creation of that proxy, every function has a small bootstrapper that initializes the variables
needed for subsequent downcalls. This means the cost of creating a downcall is deferred to the first invocation of its function.

### Downcall dispatching

Downcall transformers are responsible for actually creating the compatibility layer. Conceptually speaking, all they do is take
a method and return a `MethodHandle` that matches exactly its descriptor. The main implementation in place is available at `LinkingDowncallDispatcher`,
and recognizes a bunch of annotations the user can use to shape the creation of downcalls.

For instance, you can manually specify the symbol of a function like so:
```java
@Redirect("malloc")
MemorySegment allocate(long size);
```

In order to resolve the native descriptor of said function, the dispatcher performs a few searches. Basic types like primitives, Strings and
`MemorySegment` map to standard equivalents: `JAVA_BYTE`, `JAVA_INT`, `JAVA_FLOAT`, `ADDRESS`, etc. It is very important that the native descriptor
matches that of the real function.

You can also hide parameters from the type resolving process:
```java
div_t div(@Ignore SegmentAllocator allocator, int dividend, int divisor);
```

Or simply tell the dispatcher to use yours:
```java
// boolean natively maps to JAVA_BOOLEAN whose's size
// is implementation-defined
@Layout("int") boolean isValidInt(int i);
```

All these annotations also have a global version that one can use to modify all occurrences of certain types.

However, by default, the dispatcher does not perform transformations of input arguments; this means that while `String` maps to
`ForeignUtils.UNBOUNDED_POINTER`, the dispatcher will not install the code responsible for allocating said character sequence.

### Downcall transformers

Downcall transformers perform the transformation of a downcall handle up to the method type expected by the corresponding Java method, part of the
original interface. Take the previous example:
```java
@Layout("int") boolean isValidInt(int i);
```

The original downcall method handle returns `int` but the method expects `boolean`. A downcall transformer can be inserted after
the dispatching phase to resolve this conflict. For this case, we can use `DowncallTransformer.BOOL32_TRANSFORMER` like so:
```java
DowncallDispatcher dispatcher = ...
dispatcher = dispatcher.and(DowncallTransformer.BOOL32_TRANSFORMER);
```

As we mentioned previously, one particular issue is the conversion of Java Strings to in-memory character sequences. For that, a
transformer is available (a simple UTF-8 version is available but others can be provided on demand); it automatically manages:
- The creation of a confined Arena.
- The allocation, using said Arena, of every String to the expected charset.
- The substitution of every compatible parameter.
- And finally, the termination of the Arena after the downcall is finished.

Take for instance:
```java
// CSizeT is a type defined in fr.kenlek.jpgen.api.data and manages the
// differences in implementation across systems. Its layout is implicitly
// resolved by the default dispatcher.
CSizeT strlen(String str);
```

```java
DowncallDispatcher dispatcher = ...
dispatcher = dispatcher.and(DowncallTransformer.UTF8_STRING_TRANSFORMER);
// or if you want another encoding
dispatcher = dispatcher.and(DowncallTransformer.stringTransformer(StandardCharsets.UTF_16));
```

### Upcalls

Upcalls use similar constructs. All standard downcall transformers have equivalents that work on upcalls. The difference
with upcalls resides in limitations. For instance, upcalls can throw exceptions but those that would propagate out of the function's
scope cause the JVM to terminate. You can use upcall transformers to automatically wrap upcalls with exception catchers. These catchers
must not break the control flow and, in the event of an exception, return cleanly.

We typically define upcall interfaces like so:
```java
@FunctionalInterface
public interface MyFunc
{
    // Only one method with this annotation must exist for the dispatcher to find it
    @UpcallTarget
    int invoke(int a, int b);
}
```

Alternatively, upcall dispatchers must be able to work with static methods.
