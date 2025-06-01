package fr.kenlek.jpgen.generator.util;

import fr.kenlek.jpgen.generator.PrintingContext;
import fr.kenlek.jpgen.generator.data.DependencyProvider;
import fr.kenlek.jpgen.generator.data.JavaPath;
import fr.kenlek.jpgen.generator.data.RecordType;
import fr.kenlek.jpgen.generator.data.Type;
import fr.kenlek.jpgen.generator.data.features.EnumConstant;
import fr.kenlek.jpgen.generator.data.features.GetLayout;
import fr.kenlek.jpgen.generator.data.features.HeaderFlag;
import fr.kenlek.jpgen.generator.data.features.HintWriteFeature;
import fr.kenlek.jpgen.generator.data.features.JavaTypeString;
import fr.kenlek.jpgen.generator.data.features.PrintMember;
import fr.kenlek.jpgen.generator.data.features.TypeFeature;

import java.io.IOException;
import java.util.List;

import static fr.kenlek.jpgen.generator.data.CodeUtils.*;

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
    public void apply(TypeFeature.Write feature, PrintingContext context) throws IOException
    {
        switch (feature)
        {
            case HintWriteFeature.PRINT_LAYOUT ->
                context.breakLine("@%1$s(\"%2$s\") public static final %3$s.OfInt %2$s = %3$s.JAVA_INT.withName(\"%2$s\");",
                    LAYOUT_VALUE, this.symbolicName(), VALUE_LAYOUT);
            case PrintMember.Plain plain ->
            {
                String name = plain.member.name;
                if (name == null)
                {
                    return;
                }

                context.breakLine();
                context.breakLine("public static final long MEMBER_OFFSET__%s = %s;", name, plain.member.containerByteOffset(plain.layoutsClass));
                if (plain.member instanceof RecordType.Bitfield bitfield)
                {
                    context.breakLine("private static final long BITFIELD_OFFSET__%1$s = %2$d - (MEMBER_OFFSET__%1$s << 3);", name, bitfield.bitOffset);
                    context.breakLine("private static final int BITMASK__%s = (1 << %d) - 1;", name, bitfield.width);
                    context.breakLine("private static final int BITMASK_INV__%1$s = ~BITMASK__%1$s;", name);

                    context.breakLine();
                    context.breakLine("public boolean %s()", name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("return ((this.pointer().get(%1$s.JAVA_INT, MEMBER_OFFSET__%2$s) >>> BITFIELD_OFFSET__%2$s) & BITMASK__%2$s) != 0;", VALUE_LAYOUT, name);
                    context.popControlFlow().breakLine('}');

                    context.breakLine();
                    context.breakLine("public void %s(boolean value)", name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("if (value)");
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("this.pointer().set(%1$s.JAVA_INT, MEMBER_OFFSET__%2$s, this.pointer().get(%1$s.JAVA_INT, MEMBER_OFFSET__%2$s) & BITMASK__%2$s);", VALUE_LAYOUT, name);
                    context.popControlFlow().breakLine('}');
                    context.breakLine("else");
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("this.pointer().set(%1$s.JAVA_INT, MEMBER_OFFSET__%2$s, (this.pointer().get(%1$s.JAVA_INT, MEMBER_OFFSET__%2$s) & BITMASK_INV__%2$s) | (1 << BITFIELD_OFFSET__%2$s));", VALUE_LAYOUT, name);
                    context.popControlFlow().breakLine('}');
                    context.popControlFlow().breakLine('}');
                }
                else
                {
                    context.breakLine();
                    context.breakLine("public boolean %s()", name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("return this.pointer().get(%s.JAVA_INT, MEMBER_OFFSET__%s) != 0;", VALUE_LAYOUT, name);
                    context.popControlFlow().breakLine('}');

                    context.breakLine();
                    context.breakLine("public void %s(boolean value)", name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("this.pointer().set(%s.JAVA_INT, MEMBER_OFFSET__%s, value ? 1 : 0);", VALUE_LAYOUT, name);
                    context.popControlFlow().breakLine('}');

                    context.breakLine();
                    context.breakLine("public %s $%s()", MEMORY_SEGMENT, name);
                    context.breakLine('{').pushControlFlow();
                    context.breakLine("return this.pointer().asSlice(MEMBER_OFFSET__%s, %s.JAVA_INT);", name, VALUE_LAYOUT);
                    context.popControlFlow().breakLine('}');
                }
            }
            case PrintMember.Array array ->
            {
                context.breakLine();
                context.breakLine("public boolean %s(long index)", array.name);
                context.breakLine('{').pushControlFlow();
                context.breakLine("return this.%s().getAtIndex(%s.JAVA_INT, %s) != 0;", array.name, VALUE_LAYOUT);
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("public void %s(long index, boolean value)", array.name);
                context.breakLine('{').pushControlFlow();
                context.breakLine("this.%s().setAtIndex(%s.JAVA_INT, index, value ? 1 : 0);", array.name, VALUE_LAYOUT);
                context.popControlFlow().breakLine('}');
            }
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
            case EnumConstant(long value) -> Boolean.toString(value != 0);
            case GetLayout(JavaPath layoutsClass) -> layoutsClass.child(this.symbolicName()).toString();
            case JavaTypeString(JavaTypeString.Target target, JavaPath layoutsClass) -> switch (target)
            {
                case ENUM_CONSTANT_TYPE -> "boolean";
                default -> "@%s(value = \"%s\", container = %s.class) boolean".formatted(LAYOUT, this.symbolicName(), layoutsClass);
            };
            default -> throw new TypeFeature.UnsupportedException();
        });
    }

    @Override
    public List<? extends DependencyProvider> dependencies()
    {
        return List.of(this);
    }
}
