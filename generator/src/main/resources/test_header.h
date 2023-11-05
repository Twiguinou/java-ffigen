//struct test_struct;
//
//struct test_struct
//{
//    int a, b;
//};
//
//typedef struct test_struct test_struct_t;

typedef struct test_struct
{
    int a, b;
} test_struct_t;

int hello(test_struct_t arg1, struct {int a, b, c;} arg2);
