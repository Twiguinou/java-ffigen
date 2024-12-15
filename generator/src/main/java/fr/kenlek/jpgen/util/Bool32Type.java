package fr.kenlek.jpgen.util;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.CodeUtils;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.TypeKind;
import fr.kenlek.jpgen.data.impl.EnumConstantHint;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

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
    public void write(PrintingContext context, InputLocation location) throws IOException
    {
        if (location instanceof RecordLocation rl && rl.member().name().isPresent())
        {
            String name = rl.member().name().orElseThrow();
            String pointer = rl.pointer();

            context.breakLine();
            if (rl.member() instanceof RecordType.Bitfield bitfield)
            {
                RecordLocation.writeConstant(context, _ -> context.append("long MEMBER_OFFSET__%s = %s", name, bitfield.containerByteOffset(rl.layoutsClass())));
                RecordLocation.writeConstant(context,
                        _ -> context.append("long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3)", name, rl.member().bitOffset));
                RecordLocation.writeConstant(context, _ -> context.append("int BITMASK__%s = (1 << %d) - 1", name, bitfield.width));
                RecordLocation.writeConstant(context, _ -> context.append("int BITMASK_INV__%1$s = ~BITMASK__%1$s", name));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("boolean %s()", name),
                        _ -> context.append("return ((%1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) >> BITFIELD_OFFSET__%3$s) & BITMASK__%3$s) != 0;",
                                pointer, VALUE_LAYOUT, name));
                RecordLocation.writeFunction(context, false,
                        _ -> context.append("void %s(boolean value)", name),
                        _ ->
                        {
                            context.breakLine("if (value) %1$s.set(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s, %1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s);",
                                    pointer, VALUE_LAYOUT, name);
                            context.breakLine("else %1$s.set(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s, (%1$s.get(%2$s.JAVA_INT, MEMBER_OFFSET__%3$s) & BITMASK_INV__%3$s) | (1 << BITFIELD_OFFSET__%3$s));",
                                    pointer, VALUE_LAYOUT, name);
                        });
            }
            else
            {
                RecordLocation.writeConstant(context, _ -> context.append("long MEMBER_OFFSET__%s = %s", name, rl.member().containerByteOffset(rl.layoutsClass())));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("boolean %s()", name),
                        _ -> context.append("return %s.get(%s.JAVA_INT, MEMBER_OFFSET__%s) != 0;", pointer, VALUE_LAYOUT, name));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("void %s(boolean value)", name),
                        _ -> context.append("%s.set(%s.JAVA_INT, MEMBER_OFFSET__%s, value ? 1 : 0);", pointer, VALUE_LAYOUT, name));
                RecordLocation.writeFunction(context, true,
                        _ -> context.append("%s $%s()", CodeUtils.MEMORY_SEGMENT, name),
                        _ -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s.JAVA_INT);", pointer, name, VALUE_LAYOUT));
            }
        }
        else if (location instanceof RecordLocation.Array(_, String name))
        {
            RecordLocation.writeFunction(context, true,
                    _ -> context.append("boolean %s(long index)", name),
                    _ -> context.append("return this.%s().getAtIndex(%s.JAVA_INT, index) != 0;", name, VALUE_LAYOUT));
            RecordLocation.writeFunction(context, true,
                    _ -> context.append("void %s(long index, boolean value)", name),
                    _ -> context.append("this.%s().setAtIndex(%s.JAVA_INT, index, value ? 1 : 0);", name, VALUE_LAYOUT));
        }
    }

    @Override
    public String process(ProcessingHint hint)
    {
        return switch (hint)
        {
            case TypeReference reference when reference.isRawCallback() -> "int";
            case TypeReference _ -> "boolean";
            case TypeOp op when op.wrap() -> String.format("(%s) != 0", op.cast("int"));
            case TypeOp(_, _, String element) -> element.concat(" ? 1 : 0");
            case EnumConstantHint(long value) -> Boolean.toString(value != 0);
            case LayoutReference reference -> reference.processLayout(VALUE_LAYOUT.concat(".JAVA_INT"));
            default -> throw new UnsupportedOperationException();
        };
    }

    @Override
    public List<Type> getDependencies()
    {
        return List.of();
    }
}
