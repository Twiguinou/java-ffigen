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
            context.append("public static final ").append(declaration.getEnumConstantType()).append(' ').append(constant.name())
                    .append(" = ").append(declaration.getWrappedEnumConstant(constant.value())).breakLine(';');
        }
        context.popControlFlow();

        context.breakLine('}');
    }

    public static void makeRecord(PrintingContext context, RecordType.Decl record) throws IOException
    {
        if (record.isIncomplete())
        {
            throw new IllegalArgumentException("Provided record declaration is incomplete");
        }

        emitClassPrefix(context, record);

        String pointerName = record.information().pointerName();
        String layoutName = record.information().layoutName();

        context.append("public record ").append(record.name()).append("(java.lang.foreign.MemorySegment ").append(pointerName).breakLine(')');
        context.breakLine('{');
        context.pushControlFlow();

        long offset = 0;
        for (RecordType.Member member : record.members)
        {
            switch (member)
            {
                case RecordType.Padding(long size) -> offset += size;
                case RecordType.Field(Type fieldType, String fieldName) ->
                {
                    fieldType.writeMemberProperties(context, fieldName, offset);
                    if (record.kind == RecordType.Kind.STRUCT)
                    {
                        offset += fieldType.layout().orElseThrow().byteSize();
                    }
                }
                case RecordType.Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not supported.");
            }
        }

        Iterator<RecordType.Member> memberIterator;

        context.breakLine();
        context.append("public static final java.lang.foreign.").append(record.kind == RecordType.Kind.UNION ? "UnionLayout" : "StructLayout").append(' ').append(layoutName)
                .append(" = java.lang.foreign.MemoryLayout.").append(record.kind == RecordType.Kind.UNION ? "unionLayout" : "structLayout").breakLine('(');
        context.pushControlFlow().pushControlFlow();
        memberIterator = record.members.iterator();
        while (memberIterator.hasNext())
        {
            switch (memberIterator.next())
            {
                case RecordType.Padding(long size) -> context.append("java.lang.foreign.MemoryLayout.paddingLayout(").append(Long.toString(size)).append(')');
                case RecordType.Field(Type fieldType, String fieldName) -> context.append(fieldType.getLayoutList(fieldName));
                case RecordType.Bitfield _ -> throw new UnsupportedOperationException("Bitfields are not supported.");
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

        String pointerString = String.format("this.%s", pointerName);
        for (RecordType.Member member : record.members)
        {
            if (member instanceof RecordType.Field(Type type, String name))
            {
                type.writeAccessors(context, name, pointerString);
            }
        }

        context.popControlFlow();
        context.breakLine('}');
    }

    public static String getFunctionDescriptor(FunctionType type)
    {
        StringBuilder parameterList = new StringBuilder();
        Iterator<Type> parameterIterator = type.parameterTypes().iterator();
        while (parameterIterator.hasNext())
        {
            parameterList.append(parameterIterator.next().getFunctionLayoutInstance());
            if (parameterIterator.hasNext()) parameterList.append(", ");
        }

        return type.returnType().getFunctionDescriptor(parameterList.toString());
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

            context.breakLine();
            if (handleSupplier.isEmpty())
            {
                context.append("public static final java.lang.foreign.MemorySegment MTD_ADDRESS__").append(name).breakLine(';');
                context.append("public static final java.lang.invoke.MethodHandle MTD__").append(name).breakLine(';');
            }

            ParallelIterator<Type, String> parameterIterator;

            parameterIterator = ParallelIterator.of(type.parameterTypes().iterator(), specifier.function().parameterNames.iterator());
            context.append("public static ").append(type.returnType().getWrappedFunctionReturnType()).append(' ').append(name).append('(');
            if (allocatorName.isPresent())
            {
                context.append("java.lang.foreign.SegmentAllocator ").append(allocatorName.get());
                if (parameterIterator.hasNext()) context.append(", ");
            }

            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();

                context.append(parameter.a().getWrappedFunctionParameterType()).append(' ').append(parameter.b());
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
                result.append(parameter.a().getUnwrappedFunctionParameter(parameter.b()));
                if (parameterIterator.hasNext()) result.append(", ");
            }
            result.append(')');

            context.append("try {");
            context.append(type.returnType().getWrappedFunctionReturnValue(result.toString())).breakLine(";}");
            context.breakLine("catch (java.lang.Throwable _) {throw new java.lang.AssertionError();}");

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
                context.append("MTD__").append(name).append(" = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__").append(name).append(", ").append(getFunctionDescriptor(type)).breakLine(");");
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

        boolean redirect = callback.requiresRedirect();
        FunctionType type = callback.type;

        context.append("public interface ").breakLine(callback.name());
        context.breakLine('{');
        context.pushControlFlow();

        context.append("java.lang.foreign.FunctionDescriptor ").append(callback.descriptorName).append(" = ").append(getFunctionDescriptor(type)).breakLine(';');
        context.append("java.lang.invoke.MethodHandle ").append(callback.stubName).append(" = jpgen.NativeTypes.initUpcallStub(").append(callback.descriptorName).append(", \"invoke\", ").append(callback.name()).breakLine(".class);");

        ParallelIterator<Type, String> parameterIterator;

        parameterIterator = callback.getParameterIterator();
        context.breakLine();
        context.append(type.returnType().getWrappedFunctionReturnType()).append(" invoke(");
        while (parameterIterator.hasNext())
        {
            ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
            context.append(parameter.a().getWrappedFunctionParameterType()).append(' ').append(parameter.b());
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
            context.append("default ").append(type.returnType().getUnwrappedFunctionReturnType()).append(" invoke(");
            while (parameterIterator.hasNext())
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                context.append(parameter.a().getUnwrappedFunctionParameterType()).append(' ').append(parameter.b());
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
                result.append(parameter.a().getWrappedFunctionParameter(parameter.b()));
                if (parameterIterator.hasNext())
                {
                    result.append(", ");
                }
            }
            result.append(')');

            context.append(type.returnType().getUnwrappedFunctionReturnValue(result.toString())).breakLine(';');

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
