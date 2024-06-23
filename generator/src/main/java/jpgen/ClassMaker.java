package jpgen;

import jpgen.data.CallbackDeclaration;
import jpgen.data.Constant;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.Type;
import jpgen.data.HeaderDeclaration;

import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

public final class ClassMaker
{private ClassMaker() {}

    private static void emitClassPrefix(PrintingContext context, Declaration declaration) throws IOException
    {
        Optional<String> canonicalPackage = declaration.canonicalPackage();
        if (canonicalPackage.isPresent())
        {
            context.append("package ").append(canonicalPackage.get()).breakLine(';');
            context.breakLine();
        }
    }

    public static void makeEnum(PrintingContext context, EnumType.Decl declaration) throws IOException
    {
        emitClassPrefix(context, declaration);

        context.append("public final class ").breakLine(declaration.name());
        context.append("{private ").append(declaration.name()).breakLine("() {}");

        context.breakLine();
        context.pushControlFlow();
        for (EnumType.Constant constant : declaration.constants)
        {
            context.append("public static final ").append(declaration.javaType()).append(' ').append(constant.name())
                    .append(" = ").append(Long.toString(constant.value())).breakLine(';');
        }
        context.popControlFlow();

        context.breakLine('}');
    }

    public static void makeRecord(PrintingContext context, RecordType.Decl record) throws IOException
    {
        emitClassPrefix(context, record);

        String pointerName = record.information().pointerName();
        String layoutName = record.information().layoutName();

        context.append("public record ").append(record.name()).append("(java.lang.foreign.MemorySegment ").append(pointerName).breakLine(')');
        context.breakLine('{');
        context.pushControlFlow();

        long offset = 0;
        for (RecordType.Member member : record.members)
        {
            if (member instanceof RecordType.Field(Type type, String name))
            {
                context.append("public static final ").append(type.layoutClass()).append(" LAYOUT__").append(name).append(" = ").append(type.layoutInstance()).breakLine(';');
                context.append("public static final long OFFSET__").append(name).append(" = ").append(Long.toString(offset)).breakLine(';');
                offset += type.layout().orElseThrow().byteSize();
            }
            else if (member instanceof RecordType.Padding(long size))
            {
                offset += size;
            }
            else if (member instanceof RecordType.Bitfield)
            {
                throw new UnsupportedOperationException("Bitfields are not supported.");
            }
        }

        Iterator<RecordType.Member> memberIterator;

        context.breakLine();
        context.append("public static final ").append(record.layoutClass()).append(' ').append(layoutName)
                .append(" = java.lang.foreign.MemoryLayout.").append(record.kind == RecordType.Kind.UNION ? "unionLayout" : "structLayout").breakLine('(');
        context.pushControlFlow().pushControlFlow();
        memberIterator = record.members.iterator();
        while (memberIterator.hasNext())
        {
            RecordType.Member member = memberIterator.next();
            if (member instanceof RecordType.Field(_, String name))
            {
                context.append("LAYOUT__").append(name);
            }
            else if (member instanceof RecordType.Padding(long size))
            {
                context.append("java.lang.foreign.MemoryLayout.paddingLayout(").append(Long.toString(size)).append(')');
            }
            else if (member instanceof RecordType.Bitfield)
            {
                throw new UnsupportedOperationException("Bitfields are not supported.");
            }

            if (memberIterator.hasNext()) context.breakLine(',');
            else context.breakLine();
        }
        context.popControlFlow().popControlFlow();
        context.append(").withByteAlignment(").append(Long.toString(record.alignment)).append(").withName(\"").append(record.name()).breakLine("\");");

        context.breakLine();
        context.append("public ").append(record.name()).breakLine("(java.lang.foreign.SegmentAllocator allocator)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("this(allocator.allocate(").append(layoutName).breakLine("));");
        context.popControlFlow();
        context.breakLine('}');

        context.breakLine();
        context.append("public static ").append(record.name()).breakLine(" getAtIndex(java.lang.foreign.MemorySegment buffer, int index)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("return new ").append(record.name()).append("(buffer.asSlice(index * ").append(layoutName).append(".byteSize(), ").append(layoutName).breakLine("));");
        context.popControlFlow();
        context.breakLine('}');

        context.breakLine();
        context.append("public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, ").append(record.name()).breakLine(" value)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("java.lang.foreign.MemorySegment.copy(value.").append(pointerName).append(", 0, buffer, index * ").append(layoutName).append(".byteSize(), ").append(layoutName).breakLine(".byteSize());");
        context.popControlFlow();
        context.breakLine('}');

        for (RecordType.Member member : record.members)
        {
            if (member instanceof RecordType.Field(Type type, String name))
            {
                String layoutString = String.format("LAYOUT__%s", name);
                String offsetString = String.format("OFFSET__%s", name);
                String pointerString = String.format("this.%s", pointerName);

                type.writeAccessors(context, name, layoutString, offsetString, pointerString);
            }
        }

        context.popControlFlow();
        context.breakLine('}');
    }

    public static void makeHeader(PrintingContext context, HeaderDeclaration header) throws IOException
    {
        emitClassPrefix(context, header);

        context.append("public final class ").breakLine(header.name());
        context.append("{private ").append(header.name()).breakLine("() {}");
        context.pushControlFlow();

        Iterator<Constant> constantIterator = header.constants().iterator();
        if (constantIterator.hasNext())
        {
            context.breakLine();
            do
            {
                constantIterator.next().write(context);
                context.breakLine();
            }
            while (constantIterator.hasNext());
        }

        for (HeaderDeclaration.FunctionSpecifier specifier : header.functions())
        {
            String name = specifier.function().name();
            FunctionType type = specifier.function().descriptorType;
            Optional<String> handleSupplier = specifier.getFunctionHandle();
            Optional<String> allocatorName = specifier.getAllocatorParameterName();
            Optional<String> exceptionName = specifier.getExceptionName();

            context.breakLine();
            if (handleSupplier.isEmpty())
            {
                context.append("public static final java.lang.foreign.MemorySegment MTD_ADDRESS__").append(name).breakLine(';');
                context.append("public static final java.lang.invoke.MethodHandle MTD__").append(name).breakLine(';');
            }

            ParallelIterator<Type, String> parameterIterator;

            parameterIterator = ParallelIterator.of(type.parameterTypes().iterator(), specifier.function().parameterNames.iterator());
            context.append("public static ").append(type.returnType().javaType()).append(' ').append(name).append('(');
            if (allocatorName.isPresent())
            {
                context.append("java.lang.foreign.SegmentAllocator ").append(allocatorName.get());
                if (parameterIterator.hasNext()) context.append(", ");
            }

            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();

                context.append(parameter.a().javaType()).append(' ').append(parameter.b());
                if (parameterIterator.hasNext()) context.append(", ");
            }

            context.breakLine(')');
            context.breakLine('{');
            context.pushControlFlow();

            parameterIterator = ParallelIterator.of(type.parameterTypes().iterator(), specifier.function().parameterNames.iterator());

            StringBuilder result = new StringBuilder();
            handleSupplier.ifPresentOrElse(result::append, () -> result.append("MTD__").append(name));
            result.append(".invokeExact(");
            if (allocatorName.isPresent())
            {
                result.append(allocatorName.get());
                if (parameterIterator.hasNext()) result.append(", ");
            }

            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                parameter.a().writeParameterUnwrapping(result, parameter.b());
                if (parameterIterator.hasNext()) result.append(", ");
            }
            result.append(')');

            context.append("try {");
            type.returnType().writeReturnWrapping(context, result.toString());
            context.breakLine(";}");

            if (exceptionName.isPresent())
            {
                context.append("catch (java.lang.Throwable ").append(exceptionName.get()).append(") {throw new java.lang.AssertionError(").append(exceptionName.get()).breakLine(");}");
            }
            else
            {
                context.breakLine("catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}");
            }

            context.popControlFlow();
            context.breakLine('}');
        }

        context.breakLine();
        context.breakLine("static");
        context.breakLine('{');
        context.pushControlFlow();
        context.breakLine("java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));");

        context.breakLine();
        for (HeaderDeclaration.FunctionSpecifier specifier : header.functions())
        {
            if (specifier.getFunctionHandle().isEmpty())
            {
                String name = specifier.function().name();
                FunctionType type = specifier.function().descriptorType;

                context.append("MTD_ADDRESS__").append(name).append(" = lookup.find(\"").append(name).breakLine("\").orElseThrow();");

                context.append("MTD__").append(name).append(" = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__").append(name).append(", ");
                type.returnType().writeDescriptorFunction(context, type.parameterTypes());
                context.breakLine(");");
            }
        }

        context.popControlFlow();
        context.breakLine('}');

        context.popControlFlow();
        context.breakLine('}');
    }

    public static void makeCallback(PrintingContext context, CallbackDeclaration callback) throws IOException
    {
        emitClassPrefix(context, callback);

        boolean redirect = callback.requiredRedirect();
        FunctionType type = callback.type;

        context.append("public interface ").breakLine(callback.name());
        context.breakLine('{');
        context.pushControlFlow();

        context.append("java.lang.foreign.FunctionDescriptor ").append(callback.descriptorName).append(" = ");
        type.returnType().writeDescriptorFunction(context, type.parameterTypes());
        context.breakLine(';');
        context.append("java.lang.invoke.MethodHandle ").append(callback.stubName).append(" = jpgen.NativeTypes.initUpcallStub(").append(callback.descriptorName).append(", \"invoke\", ").append(callback.name()).breakLine(".class);");

        ParallelIterator<Type, String> parameterIterator;

        parameterIterator = callback.getParameterIterator();
        context.breakLine();
        context.append(type.returnType().javaType()).append(" invoke (");
        while (parameterIterator.hasNext())
        {
            ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
            context.append(parameter.a().javaType()).append(' ').append(parameter.b());
            if (parameterIterator.hasNext())
            {
                context.append(", ");
            }
        }
        context.breakLine(");");

        if (redirect)
        {
            context.breakLine();

            parameterIterator = callback.getParameterIterator();
            context.append("default ").append(type.returnType().nativeType()).append(" invoke(");
            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                context.append(parameter.a().nativeType()).append(' ').append(parameter.b());
                if (parameterIterator.hasNext())
                {
                    context.append(", ");
                }
            }
            context.breakLine(')');
            context.breakLine('{');
            context.pushControlFlow();

            parameterIterator = callback.getParameterIterator();

            StringBuilder result = new StringBuilder();
            result.append("this.invoke(");
            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                parameter.a().writeParameterWrapping(result, parameter.b());
                if (parameterIterator.hasNext())
                {
                    result.append(", ");
                }
            }
            result.append(')');

            type.returnType().writeReturnUnwrapping(context, result.toString());
            context.breakLine(';');

            context.popControlFlow();
            context.breakLine('}');
        }

        context.breakLine();
        context.breakLine("default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(").append(callback.stubName).append(".bindTo(this), ").append(callback.descriptorName).breakLine(", arena);");
        context.popControlFlow();
        context.breakLine('}');

        context.popControlFlow();
        context.breakLine('}');
    }
}
