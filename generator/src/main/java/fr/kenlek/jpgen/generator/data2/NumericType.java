package fr.kenlek.jpgen.generator.data2;

import fr.kenlek.jpgen.generator.data2.features.CommonFlags;
import fr.kenlek.jpgen.generator.data2.features.EnumConstant;
import fr.kenlek.jpgen.generator.data2.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data2.features.TypeFeature;

import java.util.List;

import static fr.kenlek.jpgen.generator.data2.CodeUtils.MEMORY_SEGMENT;

/// Basic numeric types provided by the C standard from 8 to 64 bits long.
/// While the C standard defines types such as `__int128` and `double double`, these
/// lack primitive representation in Java. One could however wrap these using elaborate
/// constructs (e.g: records, [java.math.BigInteger], [java.math.BigDecimal]), but
/// this undertaking lacks efficiency on the JVM, the primary advantage of primitive
/// types being the lack of identity.
public enum NumericType implements Type
{
    INT_8("byte")
    {
        @Override
        String stringize(long value)
        {
            return "(byte) " + value;
        }
    },
    INT_16("short")
    {
        @Override
        String stringize(long value)
        {
            return "(short) " + value;
        }
    },
    INT_32("int")
    {
        @Override
        String stringize(long value)
        {
            return Long.toString(value);
        }
    },
    INT_64("long")
    {
        @Override
        String stringize(long value)
        {
            return value + "L";
        }
    },
    BOOLEAN("boolean")
    {
        @Override
        String stringize(long value)
        {
            return Boolean.toString(value != 0);
        }
    },
    FLOAT_32("float"),
    FLOAT_64("double"),
    CHAR_16("char"),
    POINTER(MEMORY_SEGMENT);

    public final String typeString;

    NumericType(String typeString)
    {
        this.typeString = typeString;
    }

    public static NumericType ofIntegralBytes(int bytes)
    {
        return switch (bytes)
        {
            case 1 -> INT_8;
            case 2 -> INT_16;
            case 4 -> INT_32;
            case 8 -> INT_64;
            default ->
                throw new IllegalArgumentException("No compatible type found for bytes: " + bytes);
        };
    }

    public static NumericType ofFloatingBytes(int bytes)
    {
        return switch (bytes)
        {
            case 4 -> FLOAT_32;
            case 8 -> FLOAT_64;
            default ->
                throw new IllegalArgumentException("No compatible type found for bytes: " + bytes);
        };
    }

    @Override
    public String symbolicName()
    {
        return this.name();
    }

    @Override
    public <T> T apply(TypeFeature<? extends T> feature)
    {
        return feature.result(switch (feature)
        {
            case CommonFlags _ -> false;
            case EnumConstant(long value) -> this.stringize(value);
            case JavaTypeString _ -> this.typeString;
            default -> throw new TypeFeature.UnsupportedException();
        });
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of();
    }

    String stringize(long value)
    {
        throw new TypeFeature.UnsupportedException();
    }
}
