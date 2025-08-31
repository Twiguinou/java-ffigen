## Deprecated

The generator part of this library is deprecated.

I strongly advise against using this tool, here are many reasons why:
- It may only generate for a single target at a time, making it very hazardous to publish libraries with.
- While very convenient, it has been increasingly difficult to maintain when the rest of the library has evolved
faster recently.
- Difficult to use with a build system. As a matter of fact, the Gradle plugin part is still in a WIP status
as, for now, it does not integrate well with Kotlin or Groovy build scripts.
- And many more reasons: buggy, untested, slow, etc..
