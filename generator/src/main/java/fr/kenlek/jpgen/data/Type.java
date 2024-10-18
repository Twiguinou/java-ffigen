package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.ClangUtils;
import fr.kenlek.jpgen.PrintingContext;
import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.CXCursorVisitor;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.RecordLocation;
import fr.kenlek.jpgen.data.impl.StaticLocation;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.clang.CXCursorKind.*;
import static fr.kenlek.jpgen.clang.CXChildVisitResult.*;
import static fr.kenlek.jpgen.data.CodeUtils.*;

public interface Type extends DependencyProvider
{
    interface InputLocation {}
    interface ProcessingHint {}

    interface Reference<T extends Type>
    {
        T get();
    }

    /// Construct and return the symbolic name representing this very type.
    /// The returned [String] must be a valid and unique Java identifier.
    String symbolicName();

    TypeKind kind();

    void write(PrintingContext context, InputLocation location) throws IOException;

    String process(ProcessingHint hint);

    /// Downcast this type to the closest non-delegated representation.
    default Type flatten()
    {
        return this;
    }

    /// A type that lacks memory representation, this includes size and alignment.
    interface Virtual extends Type
    {
        @Override
        default String symbolicName()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        default void write(PrintingContext context, InputLocation location)
        {
            throw new UnsupportedOperationException();
        }

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
                case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> "void";
                case TypeOp(_, String element) -> element;
                default -> Virtual.super.process(hint);
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
        public String symbolicName()
        {
            return "PTR";
        }

        @Override
        public void write(PrintingContext context, InputLocation location) throws IOException
        {
            if (location instanceof RecordLocation rl && rl.member().name().isPresent())
            {
                String name = rl.member().name().orElseThrow();
                String pointer = rl.pointer();

                context.breakLine();
                context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                        name, rl.layoutData(), rl.index());
                context.breakLine("public %1$s %2$s() {return %3$s.get(%4$s, MEMBER_OFFSET__%2$s);}",
                        MEMORY_SEGMENT, name, pointer, UNBOUNDED_POINTER);
                context.breakLine("public void %1$s(%2$s value) {%3$s.set(%4$s, MEMBER_OFFSET__%1$s, value);}",
                        name, MEMORY_SEGMENT, pointer, UNBOUNDED_POINTER);
                context.breakLine("public %1$s $%2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s);}",
                        MEMORY_SEGMENT, name, pointer, UNBOUNDED_POINTER);
            }
            else if (location instanceof RecordLocation.Array(_, String name))
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
                case LayoutReference reference -> reference.processLayout(UNBOUNDED_POINTER);
                case TypeOp op -> op.cast(MEMORY_SEGMENT);
                case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> MEMORY_SEGMENT;
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
        public String symbolicName()
        {
            return String.format("ARRAY_%d__%s", this.length(), this.element().symbolicName());
        }

        @Override
        public void write(PrintingContext context, InputLocation location) throws IOException
        {
            if (location == StaticLocation.LAYOUTS_CLASS)
            {
                context.breakLine("public static final %s %s = %s.sequenceLayout(%d, %s);",
                        SEQUENCE_LAYOUT, this.symbolicName(), MEMORY_LAYOUT, this.length(), this.element().process(new LayoutReference.Physical()));
            }
            else if (location instanceof RecordLocation rl && rl.member().name().isPresent())
            {
                String name = rl.member().name().orElseThrow();

                context.breakLine();
                context.breakLine("public static final long MEMBER_OFFSET__%s = %s.state(%d).byteOffset();",
                        name, rl.layoutData(), rl.index());
                context.breakLine("public %1$s %2$s() {return %3$s.asSlice(MEMBER_OFFSET__%2$s, %4$s);}",
                        MEMORY_SEGMENT, name, rl.pointer(), rl.layoutsClass().child(this.symbolicName()));
                this.element().write(context, new RecordLocation.Array(rl.layoutsClass(), name));
            }
        }

        @Override
        public String process(ProcessingHint hint)
        {
            return switch (hint)
            {
                case LayoutReference.Descriptor descriptor -> descriptor.processLayout(UNBOUNDED_POINTER);
                case LayoutReference reference -> reference.processLayout(reference.layoutsClass().child(this.symbolicName()));
                case TypeReference.CALLBACK, TypeReference.CALLBACK_RAW, TypeReference.FUNCTION -> MEMORY_SEGMENT;
                case TypeOp op -> op.cast(MEMORY_SEGMENT);
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

    /// This interface provides an easy way to decorate another type.
    interface Delegated extends Type
    {
        Type underlying();

        @Override
        default String symbolicName()
        {
            return this.underlying().symbolicName();
        }

        @Override
        default void write(PrintingContext context, InputLocation location) throws IOException
        {
            if (location != StaticLocation.LAYOUTS_CLASS)
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

                return Optional.of(new CallbackDeclaration(this.path(), () -> functionType,
                        List.of(parametersNames), descriptorName, stubName));
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
