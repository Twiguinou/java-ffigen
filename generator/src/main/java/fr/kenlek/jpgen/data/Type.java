package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.ClangUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.ClassMaker.*;

public interface Type extends DependencyProvider
{
    String getSymbolicName();

    void write(PrintingContext context, WriteLocation location) throws IOException;

    String process(ProcessingHint hint);

    TypeKind kind();

    default Type flatten()
    {
        return this;
    }

    /// A type that lacks memory representation, this includes size and alignment.
    interface Virtual extends Type
    {
        @Override
        default String getSymbolicName()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default void write(PrintingContext context, WriteLocation location) {}

        @Override
        default String process(ProcessingHint hint)
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default List<Type> getDependencies()
        {
            return List.of();
        }
    }

    Type VOID = new Virtual()
    {
        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case TypeLocationHint.CALLBACK, TypeLocationHint.CALLBACK_RAW, TypeLocationHint.FUNCTION -> "void";
                case TypeOperationHint(_, String element) -> element;
                default -> throw new UnsupportedOperationException();
            };
        }

        @Override
        public TypeKind kind()
        {
            return TypeKind.VOID;
        }

        @Override
        public String toString()
        {
            return "Void";
        }
    };

    record Pointer(Type referenced) implements Type
    {
        @Override
        public String getSymbolicName()
        {
            return "PTR";
        }

        @Override
        public void write(PrintingContext context, WriteLocation location) throws IOException
        {
            if (location instanceof WriteLocation.RecordAccess access)
            {
                String name = access.member().name().orElseThrow();

                context.breakLine();
                context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                        name, access.layoutData(), access.index());
                context.breakLine("public %1$s %2$s() {return %3$s.get(%4$s, MEMBER_OFFSET__%2$s);}",
                        MEMORY_SEGMENT, name, access.pointer(), UNBOUNDED_POINTER);
                context.breakLine("public void %1$s(%2$s value) {%3$s.set(%4$s, MEMBER_OFFSET__%1$s, value);}",
                        name, MEMORY_SEGMENT, access.pointer(), UNBOUNDED_POINTER);
                context.breakLine("public %1$s $%2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s);}",
                        MEMORY_SEGMENT, name, access.pointer(), UNBOUNDED_POINTER);
            }
            else if (location instanceof WriteLocation.ArrayRecordAccess(_, String name))
            {
                context.breakLine("public %1$s %2$s(long index) {return this.%2$s().getAtIndex(%3$s, index);}",
                        MEMORY_SEGMENT, name, UNBOUNDED_POINTER);
                context.breakLine("public void %1$s(long index, %2$s value) {this.%1$s().setAtIndex(%3$s, index, value);}",
                        name, MEMORY_SEGMENT, UNBOUNDED_POINTER);
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case LayoutReferenceHint reference -> reference.processLayout(UNBOUNDED_POINTER);
                case TypeOperationHint op -> op.cast(MEMORY_SEGMENT);
                case TypeLocationHint.CALLBACK, TypeLocationHint.CALLBACK_RAW, TypeLocationHint.FUNCTION -> MEMORY_SEGMENT;
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

        @Override
        public String toString()
        {
            // Infinite recursion workaround
            return "Pointer";
        }
    }

    record Array(Type element, long length) implements Type
    {
        @Override
        public String getSymbolicName()
        {
            return String.format("ARRAY_%d__%s", this.length, this.element.getSymbolicName());
        }

        @Override
        public void write(PrintingContext context, WriteLocation location) throws IOException
        {
            if (location == WriteLocation.Static.LAYOUTS_CLASS)
            {
                context.breakLine("public static final %s %s = %s.sequenceLayout(%d, %s);",
                        SEQUENCE_LAYOUT, this.getSymbolicName(), MEMORY_LAYOUT, this.length,
                        this.element.process(new LayoutReferenceHint.Physical()));
            }
            else if (location instanceof WriteLocation.RecordAccess access)
            {
                String name = access.member().name().orElseThrow();

                context.breakLine();
                context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                        name, access.layoutData(), access.index());
                context.breakLine("public %1$s %2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s);}",
                        MEMORY_SEGMENT, name, access.pointer(), access.layoutsClass().child(this.getSymbolicName()));

                this.element.write(context, new WriteLocation.ArrayRecordAccess(access.layoutsClass(), name));
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case LayoutReferenceHint.Descriptor descriptor -> descriptor.processLayout(UNBOUNDED_POINTER);
                case LayoutReferenceHint reference ->
                        reference.processLayout(reference.layoutsClass().child(this.getSymbolicName()));
                case TypeLocationHint.CALLBACK, TypeLocationHint.CALLBACK_RAW, TypeLocationHint.FUNCTION -> MEMORY_SEGMENT;
                case TypeOperationHint op -> op.cast(MEMORY_SEGMENT);
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
            return Stream.concat(this.element.getDependencies().stream(), Stream.of(this)).toList();
        }
    }

    interface Delegated extends Type
    {
        Type underlying();

        @Override
        default String getSymbolicName()
        {
            return this.underlying().getSymbolicName();
        }

        @Override
        default void write(PrintingContext context, WriteLocation location) throws IOException
        {
            if (location != WriteLocation.Static.LAYOUTS_CLASS)
            {
                this.underlying().write(context, location);
            }
        }

        @Override
        default String process(ProcessingHint hint)
        {
            return this.underlying().process(hint);
        }

        @Override
        default TypeKind kind()
        {
            return this.underlying().kind();
        }

        @Override
        default Type flatten()
        {
            return this.underlying().flatten();
        }

        @Override
        default List<Type> getDependencies()
        {
            return this.underlying().getDependencies();
        }
    }

    // In other words, a typedef.
    record Alias(JavaPath path, Type underlying) implements Delegated, Declaration
    {
        public Optional<CallbackDeclaration> toCallback(CXCursor declarationCursor, String descriptorName, String stubName)
        {
            if (this.flatten() instanceof Pointer pointer &&
                pointer.referenced.flatten() instanceof FunctionType functionType)
            {
                String[] parametersNames = new String[functionType.parametersTypes().size()];
                try (Arena arena = Arena.ofConfined())
                {
                    clang_visitChildren(declarationCursor, ((CXCursorVisitor) (cursor, _, pIndex) ->
                    {
                        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl)
                        {
                            int index = pIndex.getAtIndex(ValueLayout.JAVA_INT, 0);
                            parametersNames[index] = ClangUtils.getCursorSpelling(arena, cursor)
                                    .orElse(String.format("$arg%d", index + 1));
                            pIndex.set(ValueLayout.JAVA_INT, 0, index + 1);
                        }

                        return CXChildVisit_Continue;
                    }).makeHandle(arena), arena.allocateFrom(ValueLayout.JAVA_INT, 0));
                }

                return Optional.of(new CallbackDeclaration(
                        this.path, functionType, List.of(parametersNames), descriptorName, stubName));
            }

            return Optional.empty();
        }

        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.path, this.underlying);
        }
    }
}
