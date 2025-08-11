package types;

public final class TypesTest
{private TypesTest() {}

    private static String binaryString(int i)
    {
        return "0b" + "0".repeat(Integer.numberOfLeadingZeros(i)) + Integer.toBinaryString(i);
    }

    private static String binaryString(long i)
    {
        return "0b" + "0".repeat(Long.numberOfLeadingZeros(i)) + Long.toBinaryString(i);
    }

    public static void main(String... args)
    {
        int i = 3 << 30;
        System.out.println(binaryString(i));
        System.out.println(binaryString((long) i));
        System.out.println(binaryString(Integer.toUnsignedLong(i)));
        System.out.println(i + "  " + (long) i);

        System.out.println();
        long l = ((long) 1 << 63) | 1;
        System.out.println(binaryString(l));
        System.out.println(binaryString((int) l));
    }
}
