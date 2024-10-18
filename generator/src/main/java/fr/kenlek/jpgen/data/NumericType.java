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
    INT_8("byte", "JAVA_BYTE", true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString((byte)value);
        }
    },
    INT_16("short", "JAVA_SHORT", true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString((short)value);
        }
    },
    INT_32("int", "JAVA_INT", true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString((int)value);
        }
    },
    INT_64("long", "JAVA_LONG", true)
    {
        @Override
        String readValue(long value)
        {
            return Long.toString(value);
        }
    },
    BOOLEAN("boolean", "JAVA_BOOLEAN", true)
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
            context.breakLine("public static final byte BITMASK__%s = (byte) ((1 << %d) - 1);", name, width);
            context.breakLine("public static final byte BITMASK_INV__%1$s = ~BITMASK__%1$s;", name);
            context.breakLine("public boolean %1$s() {return ((%2$s.get(%3$s, MEMBER_OFFSET__%1$s) >> BITFIELD_OFFSET__%1$s) & BITMASK__%1$s) != 0;}",
                    name, pointer, INT_8.layoutField);
            context.breakLine("public void %s(boolean value)", name);
            context.breakLine('{').pushControlFlow();
            context.breakLine("if (value) %1$s.set(%2$s, MEMBER_OFFSET__%3$s, %1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s);",
                    pointer, INT_8.layoutField, name);
            context.breakLine("else %1$s.set(%2$s, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (1 << BITFIELD_OFFSET__%3$s));",
                    pointer, INT_8.layoutField, name);
            context.popControlFlow().breakLine('}');
        }
    },
    FLOAT_32("float", "JAVA_FLOAT", false)
    {
        @Override
        String readValue(long value)
        {
            throw new UnsupportedOperationException();
        }
    },
    FLOAT_64("double", "JAVA_DOUBLE", false)
    {
        @Override
        String readValue(long value)
        {
            throw new UnsupportedOperationException();
        }
    },
    CHAR_16("char", "JAVA_CHAR", false)
    {
        @Override
        String readValue(long value)
        {
            throw new UnsupportedOperationException();
        }
    };

    private final String m_javaType;
    final String layoutField;
    private final boolean m_integral;

    NumericType(String javaType, String layoutField, boolean integral)
    {
        this.m_javaType = javaType;
        this.layoutField = String.format("%s.%s", VALUE_LAYOUT, layoutField);
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
            context.breakLine("public static final long MEMBER_OFFSET__%1$s = %2$s.state(%3$d).byteOffset();",
                    name, rl.layoutData(), rl.index());
            if (member instanceof RecordType.Field)
            {
                context.breakLine("public %1$s %2$s() {return %3$s.get(%4$s, MEMBER_OFFSET__%2$s);}",
                        this.m_javaType, name, pointer, this.layoutField);
                context.breakLine("public void %1$s(%2$s value) {%3$s.set(%4$s, MEMBER_OFFSET__%1$s, value);}",
                        name, this.m_javaType, pointer, this.layoutField);
                context.breakLine("public %1$s $%2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s);}",
                        MEMORY_SEGMENT, name, pointer, this.layoutField);
            }
            else if (this.m_integral)
            {
                long width = ((RecordType.Bitfield)member).width();

                context.breakLine("public static final long BITFIELD_OFFSET__%1$s = %2$s.state(%3$d).offset() - (MEMBER_OFFSET__%1$s << 3);",
                        name, rl.layoutData(), rl.index());
                this.writeBitfieldAccess(context, pointer, name, width);
            }
        }
        else if (location instanceof RecordLocation.Array(_, String name))
        {
            context.breakLine("public %1$s %2$s(long index) {return this.%2$s().getAtIndex(%3$s, index);}",
                    this.m_javaType, name, this.layoutField);
            context.breakLine("public void %1$s(long index, %2$s value) {this.%1$s().setAtIndex(%3$s, index, value);}",
                    name, this.m_javaType, this.layoutField);
        }
    }

    abstract String readValue(long value);

    void writeBitfieldAccess(PrintingContext context, String pointer, String name, long width) throws IOException
    {
        context.breakLine("public static final %1$s BITMASK__%2$s = (%1$s) ((1 << %3$d) - 1);", this.m_javaType, name, width);
        context.breakLine("public static final %1$s BITMASK_INV__%2$s = ~BITMASK__%2$s;", this.m_javaType, name);
        context.breakLine("public %1$s %2$s() {return (%3$s.get(%4$s, MEMBER_OFFSET__%2$s) >>> BITFIELD_OFFSET__%2$s) & BITMASK__%2$s;}",
                this.m_javaType, name, pointer, this.layoutField);
        context.breakLine("public void %1$s(%2$s value) {%3$s.set(%4$s, MEMBER_OFFSET__%1$s, (%3$s.get(%4$s, MEMBER_OFFSET__%1$s) & BITMASK_INV__%1$s) | (value << BITFIELD_OFFSET__%1$s));}",
                name, this.m_javaType, pointer, this.layoutField);
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
