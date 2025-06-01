package fr.kenlek.jpgen.generator.data;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.features.EnumConstant;
import fr.kenlek.jpgen.generator.data.features.GetLayout;
import fr.kenlek.jpgen.generator.data.features.HeaderFlag;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data.features.PrintMember;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

/// Basic numeric types provided by the C standard from 8 to 64 bits long.
/// While the C standard defines types such as `__int128` and `double double`, these
/// lack primitive representation in Java. One could however wrap these using elaborate
/// constructs (e.g: records, [java.math.BigInteger], [java.math.BigDecimal]), but
/// this undertaking lacks efficiency on the JVM, the primary advantage of primitive
/// types being the lack of identity.
public enum NumericType implements Type
{
    INT_8("byte", VALUE_LAYOUT + ".JAVA_BYTE", true)
    {
        @Override
        String stringize(long value)
        {
            return "(byte) " + value;
        }
    },
    INT_16("short", VALUE_LAYOUT + ".JAVA_SHORT", true)
    {
        @Override
        String stringize(long value)
        {
            return "(short) " + value;
        }
    },
    INT_32("int", VALUE_LAYOUT + ".JAVA_INT", true)
    {
        @Override
        String stringize(long value)
        {
            return Long.toString(value);
        }
    },
    INT_64("long", VALUE_LAYOUT + ".JAVA_LONG", true)
    {
        @Override
        String stringize(long value)
        {
            return value + "L";
        }
    },
    BOOLEAN("boolean", VALUE_LAYOUT + ".JAVA_BOOLEAN", true)
    {
        @Override
        protected void write(RecordType.Member member, JavaPath layoutsClass, PrintingContext context)
            throws IOException
        {
            if (member instanceof RecordType.Bitfield bitfield)
            {
                context.breakLine("private static final long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3);", member.name, bitfield.bitOffset);
                context.breakLine("private static final byte BITMASK__%s = (byte) ((1 << %d) - 1);", member.name, bitfield.width);
                context.breakLine("private static final byte BITMASK_INV__%1$s = ~BITMASK__%1$s;", member.name);

                context.breakLine();
                context.breakLine("public boolean %s()", member.name);
                context.breakLine('{').pushControlFlow();
                context.breakLine("return ((this.pointer().get(%1$s, MEMBER_OFFSET__%2$s) >>> BITFIELD_OFFSET__%2$s) & BITMASK__%2$s) != 0;", this.layoutField, member.name);
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("public void %s(boolean value)", member.name);
                context.breakLine('{').pushControlFlow();
                context.breakLine("if (value)");
                context.breakLine('{').pushControlFlow();
                context.breakLine("this.pointer().set(%1$s, MEMBER_OFFSET__%2$s, this.pointer().get(%1$s, MEMBER_OFFSET__%2$s) & BITMASK__%2$s);", member.name, INT_8.layoutField, member.name);
                context.popControlFlow().breakLine('}');
                context.breakLine("else");
                context.breakLine('{').pushControlFlow();
                context.breakLine("this.pointer().set(%1$s, MEMBER_OFFSET__%2$s, (this.pointer().get(%1$s, MEMBER_OFFSET__%2$s) & BITMASK_INV__%2$s) | (1 << BITFIELD_OFFSET__%2$s));", this.layoutField, member.name);
                context.popControlFlow().breakLine('}');
                context.popControlFlow().breakLine('}');

                return;
            }

            super.write(member, layoutsClass, context);
        }

        @Override
        String stringize(long value)
        {
            return Boolean.toString(value != 0);
        }
    },
    FLOAT_32("float", VALUE_LAYOUT + ".JAVA_FLOAT", false),
    FLOAT_64("double", VALUE_LAYOUT + ".JAVA_DOUBLE", false),
    CHAR_16("char", VALUE_LAYOUT + ".JAVA_CHAR", false),
    POINTER(MEMORY_SEGMENT, FOREIGN_UTILS + ".UNBOUNDED_POINTER", false);

    public final String typeString;
    public final String layoutField;
    public final boolean bitfieldCompatible;

    NumericType(String typeString, String layoutField, boolean bitfieldCompatible)
    {
        this.typeString = typeString;
        this.layoutField = layoutField;
        this.bitfieldCompatible = bitfieldCompatible;
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

    protected void write(RecordType.Member member, JavaPath layoutsClass, PrintingContext context) throws IOException
    {
        if (member.name == null)
        {
            return;
        }

        context.breakLine();
        context.breakLine("public static final long MEMBER_OFFSET__%s = %s;", member.name, member.containerByteOffset(layoutsClass));

        if (member instanceof RecordType.Bitfield bitfield)
        {
            if (!this.bitfieldCompatible)
            {
                throw new TypeFeature.UnsupportedException();
            }

            context.breakLine("private static final long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3);", member.name, bitfield.bitOffset);
            context.breakLine("private static final %1$s BITMASK__%2$s = (%1$s) ((1 << %3$d) - 1);", this.typeString, member.name, bitfield.width);
            context.breakLine("private static final %1$s BITMASK_INV__%2$s = ~BITMASK__%2$s;", this.typeString, member.name);

            context.breakLine();
            context.breakLine("public %s %s()", this.typeString, member.name);
            context.breakLine('{').pushControlFlow();
            context.breakLine("return (this.pointer().get(%1$s, MEMBER_OFFSET__%2$s) >>> BITFIELD_OFFSET__%2$s) & BITMASK__%2$s;", this.layoutField, member.name);
            context.popControlFlow().breakLine('}');

            context.breakLine();
            context.breakLine("public void %s(%s value)", member.name, this.typeString);
            context.breakLine('{').pushControlFlow();
            context.breakLine("this.pointer().set(%1$s, MEMBER_OFFSET__%2$s, (this.pointer().get(%1$s, MEMBER_OFFSET__%2$s) & BITMASK_INV__%2$s) | (value << BITFIELD_OFFSET__%2$s));", this.layoutField, member.name);
            context.popControlFlow().breakLine('}');

            return;
        }

        context.breakLine();
        context.breakLine("public %s %s()", this.typeString, member.name);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return this.pointer().get(%s, MEMBER_OFFSET__%s);", this.layoutField, member.name);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public void %s(%s value)", member.name, this.typeString);
        context.breakLine('{').pushControlFlow();
        context.breakLine("this.pointer().set(%s, MEMBER_OFFSET__%s, value);", this.layoutField, member.name);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public %s $%s()", MEMORY_SEGMENT, member.name);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return this.pointer().asSlice(MEMBER_OFFSET__%s, %s);", member.name, this.layoutField);
        context.popControlFlow().breakLine('}');
    }

    protected void write(PrintMember.Array array, PrintingContext context) throws IOException
    {
        context.breakLine();
        context.breakLine("public %s %s(long index)", this.typeString, array.name);
        context.breakLine('{').pushControlFlow();
        context.breakLine("return this.pointer().getAtIndex(%s, index);", array.name, this.layoutField);
        context.popControlFlow().breakLine('}');

        context.breakLine();
        context.breakLine("public void %s(long index, %s value)", array.name, this.typeString);
        context.breakLine('{').pushControlFlow();
        context.breakLine("this.%s().setAtIndex(%s, index, value);", array.name, this.layoutField);
        context.popControlFlow().breakLine('}');
    }

    @Override
    public void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
    {
        switch (feature)
        {
            case PrintMember.Plain plain -> this.write(plain.member, plain.layoutsClass, context);
            case PrintMember.Array array -> this.write(array, context);
            default -> throw new TypeFeature.UnsupportedException();
        }
    }

    @Override
    public <T> T apply(TypeFeature<? extends T> feature)
    {
        if (feature == HeaderFlag.APPEND_ALLOCATOR)
        {
            return feature.result(false);
        }

        return feature.result(switch (feature)
        {
            case EnumConstant(long value) -> this.stringize(value);
            case JavaTypeString _ -> this.typeString;
            case GetLayout _ -> this.layoutField;
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
