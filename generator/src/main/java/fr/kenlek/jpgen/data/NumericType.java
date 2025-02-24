package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.data.features.CommonFlags;
import fr.kenlek.jpgen.data.features.GetEnumConstant;
import fr.kenlek.jpgen.data.features.GetLayout;
import fr.kenlek.jpgen.data.features.GetTypeReference;
import fr.kenlek.jpgen.data.features.PrintMember;
import fr.kenlek.jpgen.data.features.ProcessTypeValue;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

/// Basic numeric types provided by the C standard from 8 to 64 bits long.
/// While the C standard defines types such as `__int128` and `double double`, these
/// lack primitive representation in Java. One could however wrap these using elaborate
/// constructs (e.g: records, [java.math.BigInteger], [java.math.BigDecimal]), but
/// this undertaking lacks efficiency on the JVM, the primary advantage of primitive
/// types being the lack of identity.
public enum NumericType implements Type
{
    INT_8("byte", VALUE_LAYOUT.concat(".JAVA_BYTE"), true)
        {
            @Override
            String readValue(long value)
            {
                return Long.toString((byte) value);
            }
        },
    INT_16("short", VALUE_LAYOUT.concat(".JAVA_SHORT"), true)
        {
            @Override
            String readValue(long value)
            {
                return Long.toString((short) value);
            }
        },
    INT_32("int", VALUE_LAYOUT.concat(".JAVA_INT"), true)
        {
            @Override
            String readValue(long value)
            {
                return Long.toString((int) value);
            }
        },
    INT_64("long", VALUE_LAYOUT.concat(".JAVA_LONG"), true)
        {
            @Override
            String readValue(long value)
            {
                return Long.toString(value);
            }
        },
    BOOLEAN("boolean", VALUE_LAYOUT.concat(".JAVA_BOOLEAN"), true)
        {
            @Override
            String readValue(long value)
            {
                return Boolean.toString(value != 0);
            }

            @Override
            void writeBitfieldAccess(PrintMember.Plain plain, String name, long width) throws IOException
            {
                // booleans are sneaky bytes
                plain.writeConstant(context -> context.append("byte BITMASK__%s = (byte) ((1 << %d) - 1)", name, width));
                plain.writeConstant(context -> context.append("byte BITMASK_INV__%1$s = ~BITMASK__%1$s", name));
                plain.writeFunction(true,
                    context -> context.append("boolean %s()", name),
                    context -> context.append("return ((%1$s.get(%2$s, MEMBER_OFFSET__%3$s) >> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s) != 0;", plain.pointer, INT_8.layoutField, name)
                );
                plain.writeFunction(false,
                    context -> context.append("void %s(boolean value)", name),
                    context ->
                    {
                        context.breakLine("if (value) %1$s.set(%2$s, MEMBER_OFFSET__%3$s, %1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s);", plain.pointer, INT_8.layoutField, name);
                        context.breakLine("else %1$s.set(%2$s, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (1 << BITFIELD_OFFSET__%3$s));", plain.pointer, INT_8.layoutField, name);
                    });
            }
        },
    FLOAT_32("float", VALUE_LAYOUT.concat(".JAVA_FLOAT"), false),
    FLOAT_64("double", VALUE_LAYOUT.concat(".JAVA_DOUBLE"), false),
    CHAR_16("char", VALUE_LAYOUT.concat(".JAVA_CHAR"), false),
    POINTER(MEMORY_SEGMENT, FOREIGN_UTILS.concat(".UNBOUNDED_POINTER"), false),
    ;

    private final String m_javaType;
    final String layoutField;
    private final boolean m_integral;

    NumericType(String javaType, String layoutField, boolean integral)
    {
        this.m_javaType = javaType;
        this.layoutField = layoutField;
        this.m_integral = integral;
    }

    public static NumericType mapIntegralBytes(int bytes)
    {
        return switch (bytes)
        {
            case 1 -> INT_8;
            case 2 -> INT_16;
            case 4 -> INT_32;
            case 8 -> INT_64;
            default ->
                throw new IllegalArgumentException("No compatible type found for bytes: ".concat(Integer.toString(bytes)));
        };
    }

    public static NumericType mapFloatBytes(int bytes)
    {
        return switch (bytes)
        {
            case 4 -> FLOAT_32;
            case 8 -> FLOAT_64;
            default ->
                throw new IllegalArgumentException("No compatible type found for bytes: ".concat(Integer.toString(bytes)));
        };
    }

    @Override
    public String symbolicName()
    {
        return this.name();
    }

    @Override
    public void print(Feature.Opt feature) throws IOException
    {
        if (feature instanceof PrintMember.Plain plain && plain.member.name().isPresent())
        {
            String name = plain.member.name().orElseThrow();
            String pointer = plain.pointer;

            plain.context().breakLine();
            plain.writeConstant(context -> context.append("long MEMBER_OFFSET__%s = %s", name, plain.member.containerByteOffset(plain.layoutsClass)));
            if (plain.member instanceof RecordType.Bitfield bitfield)
            {
                if (this.m_integral)
                {
                    plain.writeConstant(context -> context.append("long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3)", name, bitfield.bitOffset));
                    this.writeBitfieldAccess(plain, name, bitfield.width);
                }
            }
            else
            {
                plain.writeFunction(true,
                    context -> context.append("%s %s()", this.m_javaType, name),
                    context -> context.append("return %s.get(%s, MEMBER_OFFSET__%s);", pointer, this.layoutField, name)
                );
                plain.writeFunction(true,
                    context -> context.append("void %s(%s value)", name, this.m_javaType),
                    context -> context.append("%s.set(%s, MEMBER_OFFSET__%s, value);", pointer, this.layoutField, name)
                );
                plain.writeFunction(true,
                    context -> context.append("%s $%s()", MEMORY_SEGMENT, name),
                    context -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s);", pointer, name, this.layoutField)
                );
            }
        }
        else if (feature instanceof PrintMember.Array array)
        {
            array.writeFunction(true,
                context -> context.append("%s %s(long index)", this.m_javaType, array.name),
                context -> context.append("return this.%s().getAtIndex(%s, index);", array.name, this.layoutField)
            );
            array.writeFunction(true,
                context -> context.append("void %s(long index, %s value)", array.name, this.m_javaType),
                context -> context.append("this.%s().setAtIndex(%s, index, value);", array.name, this.layoutField)
            );
        }
    }

    String readValue(long value)
    {
        throw new UnsupportedOperationException();
    }

    void writeBitfieldAccess(PrintMember.Plain plain, String name, long width) throws IOException
    {
        plain.writeConstant(context -> context.append("%1$s BITMASK__%2$s = (%1$s) ((1 << %3$d) - 1)", this.m_javaType, name, width));
        plain.writeConstant(context -> context.append("%1$s BITMASK_INV__%2$s = ~BITMASK__%2$s", this.m_javaType, name));
        plain.writeFunction(true,
            context -> context.append("%s %s()", this.m_javaType, name),
            context -> context.append("return (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) >>> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s;", plain.pointer, this.layoutField, name)
        );
        plain.writeFunction(true,
            context -> context.append("void %s(%s value)", name, this.m_javaType),
            context -> context.append("%1$s.set(%2$s, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (value << BITFIELD_OFFSET__%3$s));", plain.pointer, this.layoutField, name)
        );
    }

    @Override
    public String process(Feature feature)
    {
        return switch (feature)
        {
            case GetLayout layout -> layout.processLayout(this.layoutField);
            case GetTypeReference _ -> this.m_javaType;
            case ProcessTypeValue typeValue -> typeValue.cast(this.m_javaType);
            case GetEnumConstant(long value) -> this.readValue(value);
            default -> throw new Feature.UnsupportedException();
        };
    }

    @Override
    public boolean check(Feature.Flag flag)
    {
        if (flag instanceof CommonFlags)
        {
            return false;
        }

        throw new Feature.UnsupportedException();
    }

    @Override
    public List<Type> getDependencies()
    {
        return List.of();
    }
}
