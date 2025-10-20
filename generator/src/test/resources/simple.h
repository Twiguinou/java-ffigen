#include <stdint.h>

/**
 * Some brief text about this constant
 */
enum test_enum
{
    ONE,
    TWO,
    THREE
};

struct test_struct
{
    uint32_t a;
    uint64_t d;
};

typedef void (*test_callback)(int a, long b, /* hello */ char c);

struct test_struct a_function(void);

int another_function(int a, int b, int, long);
