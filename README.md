# TODO list:

* Add documentation throughout the project.
* Bring support to bitfields, replacing the current method which simply replaces those with paddings.
* Give enhanced support for translating documentation from C types to generated Java source code.
* Replace the current implementation for code generation with a templated one.
* Bring support for named parameters in function types.
* Make the `ClassMaker` class be able to generate bindings for variadic functions. However, this would require to let the user select which versions to actually generate as each version of a variadic function requires a unique method handle.
* Some records' members are anonymously declared record types, there should be a way, through Java visibility most certainly, to let the user access nested members.
* When the [Class-File API](https://openjdk.org/jeps/466) comes out it will become easy to modify bytecode without any dependency other than the JDK itself, that means we could finally make use of [Dynamic Class-File Constants](https://openjdk.org/jeps/309)
and the user could only load the functions he actually uses, decreasing startup times. However, there should still be a way to fallback to the traditional way as GraalVM's [Native Image](https://www.graalvm.org/latest/reference-manual/native-image/)
might not support the features mentioned previously.
* Give the ability to add linker options when creating a method handle.
* Now for [Valhalla](https://openjdk.org/projects/valhalla/), we could bring two very important features:
    * Value-based record types to flatten out wrappers over `MemorySegment` instances, potentially eliminating heap allocation for the JVM.
    * Type safety with wrapping over enum types, along with hidden constructors to restrict the user only to defined constants. On a sidenote we could also ensure type safety on types that are "pointers to known type" like callbacks.

# Notice:

* The generator does not load `Clang` on its own. Before using `SourceScopeScanner`, you may need to call `System.loadLibrary` on a compatible shared library.
