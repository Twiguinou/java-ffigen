package fr.kenlek.jpgen.util;

import fr.kenlek.jpgen.data.CodeUtils;
import fr.kenlek.jpgen.data.Feature;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.TypeKind;
import fr.kenlek.jpgen.data.features.GetEnumConstant;
import fr.kenlek.jpgen.data.features.GetLayout;
import fr.kenlek.jpgen.data.features.GetTypeReference;
import fr.kenlek.jpgen.data.features.PrintMember;
import fr.kenlek.jpgen.data.features.ProcessTypeValue;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.data.CodeUtils.*;

// 32-bits booleans are often used in C libraries for portability.
public final class Bool32Type implements Type
{
    public static final Bool32Type INSTANCE = new Bool32Type();

    private Bool32Type() {}

    @Override
    public String symbolicName()
    {
        return "BOOL_32";
    }

    @Override
    public TypeKind kind()
    {
        return TypeKind.TRANSLATABLE;
    }

    @Override
    public void consume(Feature.Void feature) throws IOException
    {
        if (feature instanceof PrintMember.Plain plain && plain.member.name().isPresent())
        {
            String name = plain.member.name().orElseThrow();

            plain.context.breakLine();
            if (plain.member instanceof RecordType.Bitfield bitfield)
            {
                plain.writeConstant(context -> context.append("long MEMBER_OFFSET__%s = %s", name, bitfield.containerByteOffset(plain.layoutsClass)));
                plain.writeConstant(context -> context.append("long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3)", name, plain.member.bitOffset));
                plain.writeConstant(context -> context.append("int BITMASK__%s = (1 << %d) - 1", name, bitfield.width));
                plain.writeConstant(context -> context.append("int BITMASK_INV__%1$s = ~BITMASK__%1$s", name));
                plain.writeFunction(true,
                        context -> context.append("boolean %s()", name),
                        context -> context.append("return ((%1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) >> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s) != 0;", plain.pointer, VALUE_LAYOUT, name));
                plain.writeFunction(false,
                        context -> context.append("void %s(boolean value)", name),
                        context ->
                        {
                            context.breakLine("if (value) %1$s.set(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s, %1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s);", plain.pointer, VALUE_LAYOUT, name);
                            context.breakLine("else %1$s.set(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (1 << BITFIELD_OFFSET__%3$s));", plain.pointer, VALUE_LAYOUT, name);
                        });
            }
            else
            {
                plain.writeConstant(context -> context.append("long MEMBER_OFFSET__%s = %s", name, plain.member.containerByteOffset(plain.layoutsClass)));
                plain.writeFunction(true,
                        context -> context.append("boolean %s()", name),
                        context -> context.append("return %s.get(%s.JAVA_INT, MEMBER_OFFSET__%s) != 0;", plain.pointer, VALUE_LAYOUT, name));
                plain.writeFunction(true,
                        context -> context.append("void %s(boolean value)", name),
                        context -> context.append("%s.set(%s.JAVA_INT, MEMBER_OFFSET__%s, value ? 1 : 0);", plain.pointer, VALUE_LAYOUT, name));
                plain.writeFunction(true,
                        context -> context.append("%s $%s()", CodeUtils.MEMORY_SEGMENT, name),
                        context -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s.JAVA_INT);", plain.pointer, name, VALUE_LAYOUT));
            }
        }
        else if (feature instanceof PrintMember.Array array)
        {
            array.writeFunction(true,
                    context -> context.append("boolean %s(long index)", array.name),
                    context -> context.append("return this.%s().getAtIndex(%s.JAVA_INT, index) != 0;", array.name, VALUE_LAYOUT));
            array.writeFunction(true,
                    context -> context.append("void %s(long index, boolean value)", array.name),
                    context -> context.append("this.%s().setAtIndex(%s.JAVA_INT, index, value ? 1 : 0);", array.name, VALUE_LAYOUT));
        }
    }

    @Override
    public String process(Feature feature)
    {
        return switch (feature)
        {
            case GetTypeReference typeReference when typeReference.isRawCallback() -> "int";
            case GetTypeReference _ -> "boolean";
            case ProcessTypeValue typeValue when typeValue.wrap() -> String.format("(%s) != 0", typeValue.cast("int"));
            case ProcessTypeValue(_, _, String element) -> element.concat(" ? 1 : 0");
            case GetEnumConstant(long value) -> Boolean.toString(value != 0);
            case GetLayout layout -> layout.processLayout(VALUE_LAYOUT.concat(".JAVA_INT"));
            default -> throw new Feature.UnsupportedException();
        };
    }

    @Override
    public List<Type> getDependencies()
    {
        return List.of();
    }
}
