package jpgen;

import jpgen.data.CallbackDeclaration;
import jpgen.data.Constant;
import jpgen.data.Declaration;
import jpgen.data.EnumType;
import jpgen.data.FunctionDeclaration;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.Type;
import jpgen.data.HeaderDeclaration;

import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;

public final class ClassMaker
{private ClassMaker() {}

    private static void emitClassPrefix(PrintingContext context, Declaration declaration) throws IOException
    {
        Optional<String> canonicalPackage = declaration.location().get();
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
        return type.returnType().getFunctionDescriptor(type.parametersTypes().stream()
                .map(Type::getFunctionLayoutInstance)
                .collect(Collectors.joining(", ")));
    }

    public static void makeHeader(PrintingContext context, HeaderDeclaration header) throws IOException
    {
        for (HeaderDeclaration.FunctionSpecifier specifier : header.functions())
        {
            if (specifier.function().descriptorType.variadic())
            {
                throw new UnsupportedOperationException("Variadic functions are not supported.");
            }
        }

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
            FunctionDeclaration function = specifier.function();
            Optional<String> handleSupplier = specifier.getFunctionHandle();
            Optional<String> allocatorName = specifier.getAllocatorParameterName();
            Type returnType = function.descriptorType.returnType();

            context.breakLine();
            if (handleSupplier.isEmpty())
            {
                context.append("public static final java.lang.foreign.MemorySegment MTD_ADDRESS__").append(name).breakLine(';');
                context.append("public static final java.lang.invoke.MethodHandle MTD__").append(name).breakLine(';');
            }

            String parameterList;

            context.append("public static ").append(returnType.getWrappedFunctionReturnType()).append(' ').append(name).append('(');
            parameterList = function.parameters.stream()
                    .map(parameter -> String.format("%s %s", parameter.type().getWrappedFunctionParameterType(), parameter.name()))
                    .collect(Collectors.joining(", "));
            if (allocatorName.isPresent())
            {
                context.append("java.lang.foreign.SegmentAllocator ").append(allocatorName.get());
                if (!parameterList.isEmpty()) context.append(", ");
            }
            context.append(parameterList).breakLine(')');
            context.breakLine('{');
            context.pushControlFlow();

            StringBuilder result = new StringBuilder();
            handleSupplier.ifPresentOrElse(result::append, () -> result.append("MTD__").append(name));
            result.append(".invokeExact(");
            parameterList = function.parameters.stream()
                    .map(parameter -> parameter.type().getUnwrappedFunctionParameter(parameter.name()))
                    .collect(Collectors.joining(", "));
            if (allocatorName.isPresent())
            {
                result.append(allocatorName.get());
                if (!parameterList.isEmpty()) result.append(", ");
            }
            result.append(parameterList).append(')');

            context.append("try {");
            context.append(returnType.getWrappedFunctionReturnValue(result.toString())).breakLine(";}");
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
                context.append("MTD__").append(name).append(" = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD_ADDRESS__").append(name).append(", ").append(getFunctionDescriptor(type)).breakLine(
                        switch (specifier.criticalState())
                        {
                            case NON_CRITICAL -> ");";
                            case CRITICAL_DISALLOW_HEAP -> ", Linker.Option.critical(false));";
                            case CRITICAL_ALLOW_HEAP -> ", Linker.Option.critical(true));";
                        });
            }
        }

        context.popControlFlow();
        context.breakLine('}');

        context.popControlFlow();
        context.breakLine('}');
    }

    public static void makeCallback(PrintingContext context, CallbackDeclaration callback) throws IOException
    {
        boolean redirect = callback.requiresRedirect();
        Type returnType = callback.descriptorType.returnType();
        if (callback.descriptorType.variadic())
        {
            throw new UnsupportedOperationException("Variadic functions are not supported.");
        }

        emitClassPrefix(context, callback);

        context.append("public interface ").breakLine(callback.name());
        context.breakLine('{');
        context.pushControlFlow();

        context.append("java.lang.foreign.FunctionDescriptor ").append(callback.descriptorName).append(" = ").append(getFunctionDescriptor(callback.descriptorType)).breakLine(';');
        context.append("java.lang.invoke.MethodHandle ").append(callback.stubName).append(" = jpgen.NativeTypes.initUpcallStub(").append(callback.descriptorName).append(", \"");
        if (redirect) context.append('_');
        context.append("invoke\", ").append(callback.name()).breakLine(".class);");

        context.breakLine();
        context.append(returnType.getWrappedFunctionReturnType()).append(" invoke(").append(
                callback.parameters.stream()
                        .map(parameter -> String.format("%s %s", parameter.type().getWrappedFunctionParameterType(), parameter.name()))
                        .collect(Collectors.joining(", "))
        ).breakLine(");");

        if (redirect)
        {
            context.breakLine();

            context.append("default ").append(returnType.getUnwrappedFunctionReturnType()).append(" _invoke(").append(
                    callback.parameters.stream()
                            .map(parameter -> String.format("%s %s", parameter.type().getUnwrappedFunctionParameterType(), parameter.name()))
                            .collect(Collectors.joining(", "))
            ).breakLine(")");
            context.breakLine('{');
            context.pushControlFlow();

            String result = String.format("this.invoke(%s)",
                    callback.parameters.stream()
                            .map(parameter -> parameter.type().getWrappedFunctionParameter(parameter.name()))
                            .collect(Collectors.joining(", "))
            );

            context.append(returnType.getUnwrappedFunctionReturnValue(result)).breakLine(';');

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
