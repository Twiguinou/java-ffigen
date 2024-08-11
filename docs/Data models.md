Here is a table showing some data models' implementation of the C standard:

|                                                 | ILP32 | LLP64 (P64) | LP64 |
| ----------------------------------------------- | ----- | ----------- | ---- |
| `char`<br>`unsigned char`                       | 8     | 8           | 8    |
| `short (int)`<br>`unsigned short (int)`         | 16    | 16          | 16   |
| `int`<br>`unsigned int`                         | 32    | 32          | 32   |
| `long (int)`<br>`unsigned long (int)`           | 32    | 32          | 64   |
| `long long (int)`<br>`unsigned long long (int)` | 64    | 64          | 64   |
| Pointers                                        | 32    | 64          | 64   |
* Microsoft has pretty much bad reputation because of their use of LLP64 on 64-bits versions of Windows. In other words, only pointers and  `long long` variations are 8 bytes wide.
* Contrary to MS-DOS, Unix based systems (macOS, Linux distributions, Solaris, FreeBSD, etc..) have a different approach, these use the LP64 data model for 64-bits platforms and ILP32 for 32-bits ones.
* To sum it up, 32-bits systems are mostly fine as it is generally safe to assume that these use ILP32, so nothing changes to say to least. However, things begin to split up on 64-bits systems as `long` can change of size from one computer to the other.

Java is a very good programming language, the developer never has to worry about the size of primitives (apart from `boolean` but who cares), C is lacking this safety belt. To counter that, one could use `stdint.h`, which is great from the developer's standpoint but a nightmare for us the poor souls wanting to use C libraries on other languages. The reason is simply that `stdint.h` is provided by the implementation and is not a language feature, Clang itself doesn't know what `uint32_t` is until it reads a definition of it, even the user can define `uint64_t` himself. That means we can't simply parse the declaration and tell it is a 32-bit integer.

When we use Clang to parse a set of headers we also make assumptions about the target platform or the preprocessor cannot work out everything.

While I am eager to find a solution for this problem, I feel like it is going to take a very long time.