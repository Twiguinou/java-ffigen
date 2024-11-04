package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.StaticLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.path.JavaPath;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public class SpecializedRecordDeclaration extends RecordType.Decl
{
    public final Inheritance<SpecializedRecordDeclaration> inheritance;

    public SpecializedRecordDeclaration(JavaPath path, Kind kind, List<Member> members, Inheritance.Subclass<SpecializedRecordDeclaration> subclass)
    {
        super(path, subclass.base().value().pointerName, kind, members);
        this.inheritance = subclass;
    }

    public SpecializedRecordDeclaration(JavaPath path, String pointerName, List<Member> members, Inheritance.Base<SpecializedRecordDeclaration> base)
    {
        super(path, pointerName, Kind.UNSPECIFIED, members);
        this.inheritance = base;
    }

    @Override
    public boolean printable()
    {
        return true;
    }

    @Override
    public String process(ProcessingHint hint)
    {
        if (this.inheritance instanceof Inheritance.Base<SpecializedRecordDeclaration> _)
        {
            if (hint instanceof TypeOp op && op.wrap())
            {
                return String.format("%s.of(%s)", this.path(), op.cast(MEMORY_SEGMENT));
            }
            else if (hint instanceof LayoutReference ref)
            {
                return ref.processLayout(ref.layoutsClass().child(this.symbolicName()));
            }
        }

        return super.process(hint);
    }

    @Override
    public Decl withPath(JavaPath path)
    {
        return switch (this.inheritance)
        {
            case Inheritance.Base<SpecializedRecordDeclaration> base -> new SpecializedRecordDeclaration(path, this.pointerName, this.members, base);
            case Inheritance.Subclass<SpecializedRecordDeclaration> subclass -> new SpecializedRecordDeclaration(path, this.kind, this.members, subclass);
        };
    }


    @Override
    public void write(PrintingContext context, InputLocation location) throws IOException
    {
        if (this.inheritance instanceof Inheritance.Base(List<Inheritance.Element<SpecializedRecordDeclaration>> children))
        {
            switch (location)
            {
                case StaticLocation.LAYOUTS_CLASS ->
                {
                    LayoutReference physicalRef = new LayoutReference.Physical();

                    context.breakLine("public static final %s %s = %s.select(", GROUP_LAYOUT, this.symbolicName(), HOST).pushControlFlow(2);
                    for (int i = 0;; i++)
                    {
                        Inheritance.Element<SpecializedRecordDeclaration> child = children.get(i);
                        context.append("new %s.Value<>(%s, %s)", HOST, child.host().path(), child.value().process(physicalRef));
                        if (i >= children.size() - 1)
                        {
                            context.breakLine();
                            break;
                        }

                        context.breakLine(',');
                    }
                    context.popControlFlow(2).breakLine(");");
                }
                case RecordLocation rl when rl.member().name().isPresent() ->
                {
                    String name = rl.member().name().orElseThrow();
                    String layout = rl.layoutsClass().child(this.symbolicName()).toString();
                    String pointer = rl.pointer();

                    context.breakLine();
                    rl.target().tryWriteConstant(context, _ -> context.append("long MEMBER_OFFSET__%s = %s.state(%d).byteOffset()",
                            name, rl.layoutData(), rl.index()));
                    rl.target().writeFunction(context, true,
                            _ -> context.append("%s %s()", this.path(), name),
                            _ -> context.append("return %s.of(%s.asSlice(MEMBER_OFFSET__%s, %s.layout));", this.path(), pointer, name, layout));
                    rl.target().writeFunction(context, true,
                            _ -> context.append("void %s(%s<%s> consumer)", name, CONSUMER, this.path()),
                            _ -> context.append("consumer.accept(this.%s());", name));
                    rl.target().writeFunction(context, true,
                            _ -> context.append("void %s(%s value)", name, this.path()),
                            _ -> context.append("%s.copy(value.%s(), 0, %s, MEMBER_OFFSET__%s, %s.layout.byteSize());",
                                    MEMORY_SEGMENT, this.pointerName, pointer, name, layout));
                    rl.target().writeFunction(context, true,
                            _ -> context.append("%s $%s()", MEMORY_SEGMENT, name),
                            _ -> context.append("return %s.asSlice(MEMBER_OFFSET__%s, %s.layout);", pointer, name, layout));
                }
                default -> super.write(context, location);
            }
        }
        else
        {
            super.write(context, location);
        }
    }

    private boolean fuzzyContainsMember(Member member)
    {
        return this.members.stream().anyMatch(member::fuzzyEquals);
    }

    @Override
    public void writeSourceFile(PrintingContext context, JavaPath layoutsClass) throws IOException
    {
        String pointer = String.format("this.%s()", this.pointerName);
        String layout = this.process(new LayoutReference.Physical(layoutsClass));
        this.emitClassPrefix(context);

        switch (this.inheritance)
        {
            case Inheritance.Base(List<Inheritance.Element<SpecializedRecordDeclaration>> children) ->
            {
                if (children.isEmpty()) throw new IllegalStateException("No subclass provided.");

                //context.breakLine("public sealed interface %s permits %s", this.path().tail(), children.stream()
                //        .map(c -> c.value().path().toString())
                //        .collect(Collectors.joining(", ")));
                context.breakLine("public interface %s", this.path().tail());
                context.breakLine('{').pushControlFlow();

                context.breakLine("%s<%s, %s> $ELEMENT_MAKER = %s.select(", FUNCTION, MEMORY_SEGMENT, this.path().tail(), HOST).pushControlFlow(2);
                for (int i = 0;; i++)
                {
                    Inheritance.Element<SpecializedRecordDeclaration> child = children.get(i);
                    context.append("new %s.Value<>(%s, %s::new)", HOST, child.host().path(), child.value().path());
                    if (i >= children.size() - 1)
                    {
                        context.breakLine();
                        break;
                    }

                    context.breakLine(',');
                }
                context.popControlFlow(2).breakLine(");");

                context.breakLine();
                context.breakLine("static %s of(%s data)", this.path().tail(), MEMORY_SEGMENT);
                context.breakLine('{').pushControlFlow();
                context.breakLine("return $ELEMENT_MAKER.apply(data);");
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("static %s allocate(%s allocator)", this.path().tail(), SEGMENT_ALLOCATOR);
                context.breakLine('{').pushControlFlow();
                context.breakLine("return of(allocator.allocate(%s));", layout);
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("static %s getAtIndex(%s buffer, long index)", this.path().tail(), MEMORY_SEGMENT);
                context.breakLine('{').pushControlFlow();
                context.breakLine("return of(buffer.asSlice(index * %1$s.byteSize(), %1$s));", layout);
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("static void setAtIndex(%s buffer, long index, %s value)", MEMORY_SEGMENT, this.path().tail());
                context.breakLine('{').pushControlFlow();
                context.breakLine("%1$s.copy(value.%2$s(), 0, buffer, index * %3$s.byteSize(), %3$s.byteSize());",
                        MEMORY_SEGMENT, this.pointerName, layout);
                context.popControlFlow().breakLine('}');

                context.breakLine();
                context.breakLine("%s %s();", MEMORY_SEGMENT, this.pointerName);

                context.breakLine();
                context.breakLine("default void copyFrom(%s other)", this.path().tail());
                context.breakLine('{').pushControlFlow();
                context.breakLine("%s.copy(other.%s(), 0, %s, 0, %s.byteSize());", MEMORY_SEGMENT, this.pointerName, pointer, layout);
                context.popControlFlow().breakLine('}');
            }
            case Inheritance.Subclass(Inheritance.Element<SpecializedRecordDeclaration> base) ->
            {
                context.breakLine("public record %s(%s %s) implements %s", this.path().tail(), MEMORY_SEGMENT, this.pointerName,
                        base.value().path());
                context.breakLine('{').pushControlFlow();

                context.breakLine("public %s(%s allocator)", this.path().tail(), SEGMENT_ALLOCATOR);
                context.breakLine('{').pushControlFlow();
                context.breakLine("this(allocator.allocate(%s));", layout);
                context.popControlFlow().breakLine('}');
            }
        }

        for (int i = 0; i < this.members.size(); i++)
        {
            Member member = this.members.get(i);
            RecordLocation.Target target = switch (this.inheritance)
            {
                case Inheritance.Base<SpecializedRecordDeclaration> _ -> RecordLocation.Target.PROTOTYPE;
                case Inheritance.Subclass(Inheritance.Element<SpecializedRecordDeclaration> base)
                        when base.value().fuzzyContainsMember(member) -> RecordLocation.Target.OVERRIDE;
                case Inheritance.Subclass<SpecializedRecordDeclaration> _ -> RecordLocation.Target.PLAIN;
            };

            member.type().write(context, new RecordLocation(layoutsClass, this, i, target));
        }

        context.popControlFlow().breakLine('}');
    }

    @Override
    public List<Type> getDependencies()
    {
        return switch (this.inheritance)
        {
            case Inheritance.Base(List<Inheritance.Element<SpecializedRecordDeclaration>> children) -> Stream.concat(
                    children.stream().flatMap(c -> c.value().getDependencies().stream()),
                    Stream.of(this)
            ).toList();
            case Inheritance.Subclass<SpecializedRecordDeclaration> _ -> super.getDependencies();
        };
    }
}
