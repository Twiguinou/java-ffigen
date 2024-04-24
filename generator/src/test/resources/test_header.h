typedef int MY_INTEGER;

enum test_enum
{
    A,
    B,
    C,
    D
};

struct test_struct
{
    struct test_struct* P;
    int a: 3;
    int b: 5;
};

int hello(MY_INTEGER a, double c);
