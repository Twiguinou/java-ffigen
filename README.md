# jpgen

`jpgen` is a set of Java libraries making it easier to work with the FFM API introduced in Java 22.

- The main API is located in the `api` directory. This library includes common language models used in dependant libraries. You may also find tools to bind to native libraries under
the `fr.kenlek.jpgen.api.dynload` package.
- The `clangc` directory includes portable bindings to `libclang`, the latter being used heavily in the `jpgen-generator` project.
- A third project can be found under the `generator` directory. This project can be used as an alternative to `jextract` that is more configurable and that is not a command line tool.

The generator can be quite hard to use to dynamically build dependencies for an existing project. For this reason, a Gradle plugin is available under the `gradle-plugin` directory.
This plugin simplifies all steps, from parsing to compilation with CMake.

## Work in progress

* Give enhanced support for translating documentation from C types to generated Java source code.
* Showcase, tests, examples.
* Now for [Valhalla](https://openjdk.org/projects/valhalla/), we could bring two very important features:
    * Value-based record types to flatten out wrappers over `MemorySegment` instances, potentially eliminating heap allocation for the JVM.
    * Type safety with wrapping over enum types, along with hidden constructors to restrict the user only to defined constants. On a sidenote we could also ensure type safety on types that are "pointers to known type" like callbacks.
* Flexible array types in records.

## Cross-platform usage

C is inherently non-portable because of preprocessing shenanigans. If you decide to bind to a library that changes between platforms I greatly advise to
consider conditional compilation.
