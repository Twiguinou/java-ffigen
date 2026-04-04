# jpgen

---

`jpgen` is a set of Java libraries making it easier to work with the FFM API introduced in Java 22.

- The main API is located in the [api](api) directory. This library includes common language constructs used in dependent libraries. You may also find tools to bind to native libraries under the `fr.kenlek.jpgen.api.dynload` package.
- The [clangc](clangc) directory includes portable bindings to `libclang`, the latter being used heavily in the generator part of this project.
- A third library can be found under the [generator](generator) directory. This project can be used as an alternative to `jextract` that is more configurable and that is not a command line tool.
- Finally, a Gradle plugin is provided under the [gradle-plugin](gradle-plugin) directory to facilitate the generation of dependencies or artifacts with build scripts.

Every library under this project follows a strict no external dependency basis. Dependencies may only exist between projects of this group. All projects are published to Maven Central.

## Work in progress

* Showcase, tests, examples.
* Now for [Valhalla](https://openjdk.org/projects/valhalla/), we could bring two very important features:
    * Value-based record types to flatten out wrappers over `MemorySegment` instances, potentially eliminating heap allocation for the JVM.
    * Type safety with wrapping over enum types, along with hidden constructors to restrict the user only to defined constants. On a sidenote we could also ensure type safety on types that are "pointers to known type" like callbacks.
* Flexible array types in records.
