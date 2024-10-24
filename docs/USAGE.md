## Hints on producing portable bindings

While Java is a portable language with very few implementation-defined specifications (e.g: `boolean`), C is
not and requires careful consideration of the compiler and target platform.
Take for instance the following structure:

```
typedef struct
{
    int foo;
    long bar;
} test_struct;
```

On Windows, and more particularly Microsoft's ABI, `sizeof(test_struct)` will return 8 because `long`s
are 4 bytes wide and aligned. On SYSV / Itanium `sizeof(test_struct)` becomes 16 as `long`s are now
8 bytes wide and aligned, this requires a 4 bytes padding between `foo` and `bar`. One could also mention
bit-fields, which really causes anyone a headache when trying to predict the layout of a struct containing one.

To sum it up, C programs do not produce the same output on every platform and may also infer with the
compiler using preprocessing shenanigans. (Interestingly enough, some compilers provide the time at
which compilation occurs, and you may always go further with this.)

With all those portability issues, `jpgen` attempts to solve this using multiple parsing passes of
a same program. By specifying all platforms the developer is willing to distribute for, `jpgen` finds
inconsistencies and attempts to bypass those.
