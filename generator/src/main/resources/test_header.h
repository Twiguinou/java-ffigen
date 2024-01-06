struct CXCursor
{
    int kind;
    struct
    {
        int b, c;
    } r;
    const void *data[3];
};
