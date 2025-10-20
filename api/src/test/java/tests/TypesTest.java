package tests;

public final class TypesTest
{private TypesTest() {}

    private static String binaryString(int i)
    {
        if (i == 0)
        {
            return "0b" + "0".repeat(32);
        }

        return "0b" + "0".repeat(Integer.numberOfLeadingZeros(i)) + Integer.toBinaryString(i);
    }

    private static String binaryString(long l)
    {
        if (l == 0)
        {
            return "0b" + "0".repeat(64);
        }

        return "0b" + "0".repeat(Long.numberOfLeadingZeros(l)) + Long.toBinaryString(l);
    }

    static void main()
    {
        int i = 3 << 30;
        IO.println(binaryString(i));
        IO.println(binaryString((long) i));
        IO.println(binaryString(Integer.toUnsignedLong(i)));
        IO.println(i + "  " + (long) i);

        IO.println();
        long l = ((long) 1 << 63) | 1;
        IO.println(binaryString(l));
        IO.println(binaryString((int) l));
    }
}
