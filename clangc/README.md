## Using `libclang` with Java (Linux & OSX)
* As `libclang` installs its own signal handlers if told to do so, you may encounter crashes, mostly on POSIX systems. You can solve this easily using the following environment variable:
`LIBCLANG_DISABLE_CRASH_RECOVERY=1`. Alternatively, you can load `libjsig` before loading `libclang`. This does not appear to be a problem on Windows.
