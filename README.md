# jpgen
**C header extractor / binding generator**

## Notice

* This library does not load `Clang` on its own. Before using `SourceScopeScanner`, you may need to call `System.loadLibrary` on a compatible shared library.
On a sidenote, many LLVM versions change the content of clang-c, thus the set of available functions and symbols is never the same. The bindings provided
with this library will fail only when calling a function that was not found during initialization.
* As `libclang` installs its own signal handlers if told to do so, you may encounter crashes, mostly on POSIX systems. You can solve this easily using the following environment variable:
`LIBCLANG_DISABLE_CRASH_RECOVERY=1`.
Alternatively, you can load `libjsig` before loading `libclang`.

## Work in progress

* Add documentation throughout the project.
* Give enhanced support for translating documentation from C types to generated Java source code.
* When the [Class-File API](https://openjdk.org/jeps/466) comes out it will become easy to modify bytecode without any dependency other than the JDK itself, that means we could finally make use of [Dynamic Class-File Constants](https://openjdk.org/jeps/309)
and the user could only load the functions he actually uses, decreasing startup times. However, there should still be a way to fallback to the traditional way as GraalVM's [Native Image](https://www.graalvm.org/latest/reference-manual/native-image/)
might not support the features mentioned previously.
* Showcase, tests, examples.
* Now for [Valhalla](https://openjdk.org/projects/valhalla/), we could bring two very important features:
    * Value-based record types to flatten out wrappers over `MemorySegment` instances, potentially eliminating heap allocation for the JVM.
    * Type safety with wrapping over enum types, along with hidden constructors to restrict the user only to defined constants. On a sidenote we could also ensure type safety on types that are "pointers to known type" like callbacks.

## Cross-platform usage

C is inherently non-portable because of preprocessing shenanigans. If you decide to bind to a library that changes between platforms I greatly advise to
consider conditional compilation.
