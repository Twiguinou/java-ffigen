package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.EnumConstantHint;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

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
            return Long.toString((byte)value);
        }
    },
    INT_16("short", VALUE_LAYOUT.concat(".JAVA_SHORT"), true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString((short)value);
        }
    },
    INT_32("int", VALUE_LAYOUT.concat(".JAVA_INT"), true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString((int)value);
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
        void writeBitfieldAccess(PrintingContext context, String pointer, String name, long width) throws IOException
        {
            // booleans are sneaky bytes
            RecordLocation.writeConstant(context, _ -> context.append("byte BITMASK__%s = (byte) ((1 << %d) - 1)", name, width));
            RecordLocation.writeConstant(context, _ -> context.append("byte BITMASK_INV__%1$s = ~BITMASK__%1$s", name));
            RecordLocation.writeFunction(context, true,
                    _ -> context.append("boolean %s()", name),
                    _ -> context.append("return ((%1$s.get(%2$s, MEMBER_OFFSET__%3$s) >> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s) != 0;",
                            pointer, INT_8.layoutField, name));
            RecordLocation.writeFunction(context, false,
                    _ -> context.append("void %s(boolean value)", name),
                    _ ->
                    {
                        context.breakLine("if (value) %1$s.set(%2$s, MEMBER_OFFSET__%3$s, %1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s);",
                                pointer, INT_8.layoutField, name);
                        context.breakLine("else %1$s.set(%2$s, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (1 << BITFIELD_OFFSET__%3$s));",
                                pointer, INT_8.layoutField, name);
                    });
        }
    },
    FLOAT_32("float", VALUE_LAYOUT.concat(".JAVA_FLOAT"), false),
    FLOAT_64("double", VALUE_LAYOUT.concat(".JAVA_DOUBLE"), false),
    CHAR_16("char", VALUE_LAYOUT.concat(".JAVA_CHAR"), false),
    POINTER(MEMORY_SEGMENT, FOREIGN_UTILS.concat(".UNBOUNDED_POINTER"), false),;

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
            default -> throw new IllegalArgumentException(
                    String.format("No compatible type found for bytes: %s", bytes));
        };
    }

    public static NumericType mapFloatBytes(int bytes)
    {
        return switch (bytes)
        {
            case 4 -> FLOAT_32;
            case 8 -> FLOAT_64;
            default -> throw new IllegalArgumentException(
                    String.format("No compatible type found for bytes: %s", bytes));
        };
    }

    @Override
    public String symbolicName()
    {
        return this.name();
    }

    @Override
    public void write(PrintingContext context, InputLocation location) throws IOException
    {
        RecordType.Member member;
        if (location instanceof RecordLocation rl && (member = rl.member()).name().isPresent())
        {
            String name = member.name().orElseThrow();
            String pointer = rl.pointer();

            context.breakLine();
            RecordLocation.writeConstant(context, _ -> context.append("long MEMBER_OFFSET__%s = %s", name, rl.member().containerByteOffset(rl.layoutsClass())));
            if (member instanceof RecordType.Bitfield bitfield)
            {
                if (this.m_integral)
                {
                    RecordLocation.writeConstant(context,
                            _ -> context.append("long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3)", name, rl.member().bitOffset));
                    this.writeBitfieldAccess(context, pointer, name, bitfield.width);
                }
            }
            else
            {
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("%s %s()", this.m_javaType, name),
                        _ -> context.append("return %s.get(%s, MEMBER_OFFSET__%s);", pointer, this.layoutField, name));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("void %s(%s value)", name, this.m_javaType),
                        _ -> context.append("%s.set(%s, MEMBER_OFFSET__%s, value);", pointer, this.layoutField, name));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("%s $%s()", MEMORY_SEGMENT, name),
                        _ -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s);", pointer, name, this.layoutField));
            }
        }
        else if (location instanceof RecordLocation.Array(_, String name))
        {
            RecordLocation.writeFunction(context, true,
                    _ -> context.append("%s %s(long index)", this.m_javaType, name),
                    _ -> context.append("return this.%s().getAtIndex(%s, index);", name, this.layoutField));
            RecordLocation.writeFunction(context, true,
                    _ -> context.append("void %s(long index, %s value)", name, this.m_javaType),
                    _ -> context.append("this.%s().setAtIndex(%s, index, value);", name, this.layoutField));
        }
    }

    String readValue(long value)
    {
        throw new UnsupportedOperationException();
    }

    void writeBitfieldAccess(PrintingContext context, String pointer, String name, long width) throws IOException
    {
        RecordLocation.writeConstant(context, _ -> context.append("%1$s BITMASK__%2$s = (%1$s) ((1 << %3$d) - 1)", this.m_javaType, name, width));
        RecordLocation.writeConstant(context, _ -> context.append("%1$s BITMASK_INV__%2$s = ~BITMASK__%2$s", this.m_javaType, name));
        RecordLocation.writeFunction(context, true,
                _ -> context.append("%s %s()", this.m_javaType, name),
                _ -> context.append("return (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) >>> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s;",
                        pointer, this.layoutField, name));
        RecordLocation.writeFunction(context, true,
                _ -> context.append("void %s(%s value)", name, this.m_javaType),
                _ -> context.append("%1$s.set(%2$s, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (value << BITFIELD_OFFSET__%3$s));",
                        pointer, this.layoutField, name));
    }

    @Override
    public String process(ProcessingHint hint)
    {
        return switch (hint)
        {
            case LayoutReference reference -> reference.processLayout(this.layoutField);
            case TypeReference _ -> this.m_javaType;
            case TypeOp op -> op.cast(this.m_javaType);
            case EnumConstantHint(long value) -> this.readValue(value);
            default -> throw new UnsupportedOperationException();
        };
    }

    @Override
    public TypeKind kind()
    {
        return TypeKind.COMMON;
    }

    @Override
    public List<Type> getDependencies()
    {
        return List.of();
    }
}
