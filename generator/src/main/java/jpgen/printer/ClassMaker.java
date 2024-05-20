package jpgen.printer;

import jpgen.ParallelIterator;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.Type;

import java.io.IOException;
import java.util.*;

public abstract class ClassMaker
{
    private final Settings m_settings;

    public ClassMaker(Settings settings)
    {
        this.m_settings = settings;
    }

    private static Type flattenType(Type type)
    {
        if (type instanceof Type.Alias(Type underlying, _))
        {
            return flattenType(underlying);
        }

        return type;
    }

    private static boolean callbackRequiresRedirect(FunctionType functionType)
    {
        if (flattenType(functionType.returnType()) instanceof RecordType)
        {
            return true;
        }

        for (Type parameterType : functionType.parameterTypes())
        {
            if (flattenType(parameterType) instanceof RecordType)
            {
                return true;
            }
        }

        return false;
    }

    private static String getRecordTypeLayoutClass(RecordType recordType)
    {
        return recordType.kind == RecordType.Kind.UNION ? "java.lang.foreign.UnionLayout" : "java.lang.foreign.StructLayout";
    }

    private static String getTypeLayoutClass(Type type)
    {
        return switch (type)
        {
            case Type.ValueType valueType -> valueType.layoutClass.getCanonicalName();
            case EnumType enumType -> getTypeLayoutClass(enumType.integralType);
            case RecordType recordType -> getRecordTypeLayoutClass(recordType);
            case Type.Array _ -> "java.lang.foreign.SequenceLayout";
            case Type.Pointer _ -> "java.lang.foreign.AddressLayout";
            case Type.Alias(Type underlyingType, _) -> getTypeLayoutClass(underlyingType);
            default -> throw new RuntimeException(String.format("Could not resolve type layout: %s", type));
        };
    }

    private static String getNativeType(Type type)
    {
        return switch (type)
        {
            case Type.ValueType valueType -> valueType.javaType;
            case EnumType enumType -> getNativeType(enumType.integralType);
            case Type.Pointer _, Type.Array _, RecordType _ -> "java.lang.foreign.MemorySegment";
            case Type.Void _ -> "void";
            case Type.Alias(Type underlyingType, _) -> getNativeType(underlyingType);
            default -> throw new RuntimeException(String.format("Could not resolve native type: %s", type));
        };
    }

    private static String selectExclusiveName(String[] names, String start)
    {
        Set<String> blacklist = new HashSet<>(List.of(names));

        String sel = start;
        while (blacklist.contains(sel))
        {
            sel = String.format("_%s", sel);
        }

        return sel;
    }

    public abstract String getRecordTypeName(RecordType recordType);

    private String getTypeLayoutInstance(Type type)
    {
        return switch (type)
        {
            case Type.ValueType valueType -> String.format("java.lang.foreign.ValueLayout.JAVA_%s", valueType.javaType.toUpperCase());
            case Type.Alias(Type underlyingType, _) -> this.getTypeLayoutInstance(underlyingType);
            case Type.Pointer _ -> "jpgen.NativeTypes.UNBOUNDED_POINTER";
            case Type.Array(Type elementType, long length) -> String.format("java.lang.foreign.MemoryLayout.sequenceLayout(%d, %s)", length, this.getTypeLayoutInstance(elementType));
            case EnumType enumType -> this.getTypeLayoutInstance(enumType.integralType);
            case RecordType recordType when this.m_settings.javaPackage().isEmpty() -> String.format("%s.%s", this.getRecordTypeName(recordType), this.m_settings.recordLayoutName());
            case RecordType recordType -> String.format("%s.%s.%s", this.m_settings.javaPackage(), this.getRecordTypeName(recordType), this.m_settings.recordLayoutName());
            default -> throw new RuntimeException(String.format("Could not resolve type layout: %s", type));
        };
    }

    private String getNativeTypeLayoutInstance(Type type)
    {
        return switch (type)
        {
            case Type.ValueType _, Type.Pointer _, EnumType _, RecordType _ -> this.getTypeLayoutInstance(type);
            case Type.Alias(Type underlyingType, _) -> this.getNativeTypeLayoutInstance(underlyingType);
            case Type.Array _ -> "jpgen.NativeTypes.UNBOUNDED_POINTER";
            default -> throw new RuntimeException(String.format("Could not resolve type layout: %s", type));
        };
    }

    private String getJavaType(Type type)
    {
        return switch (type)
        {
            case Type.ValueType valueType -> valueType.javaType;
            case EnumType enumType -> this.getJavaType(enumType.integralType);
            case RecordType recordType when this.m_settings.javaPackage().isEmpty() -> this.getRecordTypeName(recordType);
            case RecordType recordType -> String.format("%s.%s", this.m_settings.javaPackage(), this.getRecordTypeName(recordType));
            case Type.Alias(Type underlyingType, _) -> this.getJavaType(underlyingType);
            case Type.Pointer _, Type.Array _ -> "java.lang.foreign.MemorySegment";
            case Type.Void _ -> "void";
            default -> throw new RuntimeException(String.format("Could not resolve java type: %s", type));
        };
    }

    private boolean emitClassPrefix(PrintingContext context) throws IOException
    {
        String path = this.m_settings.javaPackage();
        if (!path.isEmpty())
        {
            context.append("package ").append(path).breakLine(';');
            return true;
        }

        return false;
    }

    public void makeEnum(PrintingContext context, EnumType.Decl declaration) throws IOException
    {
        if (this.emitClassPrefix(context))
        {
            context.breakLine();
        }

        context.append("public final class ").breakLine(declaration.name());
        context.append("{private ").append(declaration.name()).breakLine("() {}");

        context.breakLine();
        context.pushControlFlow();
        for (EnumType.Constant constant : declaration.constants)
        {
            context.append("public static final ").append(declaration.integralType.javaType).append(' ').append(constant.name())
                    .append(" = ").append(Long.toString(constant.value())).breakLine(';');
        }
        context.popControlFlow();

        context.breakLine('}');
    }

    public void makeRecord(PrintingContext context, RecordType.Decl declaration) throws IOException
    {
        if (this.emitClassPrefix(context))
        {
            context.breakLine();
        }

        String pointerName = this.m_settings.recordPointerName();
        String layoutName = this.m_settings.recordLayoutName();

        context.append("public record ").append(declaration.name()).append("(java.lang.foreign.MemorySegment ").append(pointerName).breakLine(')');
        context.breakLine('{');
        context.pushControlFlow();

        long offset = 0;
        for (RecordType.Member member : declaration.members)
        {
            if (member instanceof RecordType.Field(Type type, String name))
            {
                context.append("public static final ").append(getTypeLayoutClass(type)).append(" LAYOUT__").append(name).append(" = ").append(this.getTypeLayoutInstance(type)).breakLine(';');
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

        context.breakLine();
        context.append("public static final ").append(getRecordTypeLayoutClass(declaration)).append(' ').append(layoutName)
                .append(" = java.lang.foreign.MemoryLayout.").append(declaration.kind == RecordType.Kind.UNION ? "unionLayout" : "structLayout").breakLine('(');
        context.pushControlFlow().pushControlFlow();
        for (int i = 0; i < declaration.members.length; i++)
        {
            if (declaration.members[i] instanceof RecordType.Field(_, String name))
            {
                context.append("LAYOUT__").append(name);
            }
            else if (declaration.members[i] instanceof RecordType.Padding(long size))
            {
                context.append("java.lang.foreign.MemoryLayout.paddingLayout(").append(Long.toString(size)).append(')');
            }
            else if (declaration.members[i] instanceof RecordType.Bitfield)
            {
                throw new UnsupportedOperationException("Bitfields are not supported.");
            }

            if (i == declaration.members.length - 1) context.breakLine();
            else context.breakLine(',');
        }
        context.popControlFlow().popControlFlow();
        context.append(").withAlignment(").append(Long.toString(declaration.alignment)).append(").withName(").append(declaration.name()).breakLine(");");

        context.breakLine();
        context.append("public ").append(declaration.name()).breakLine("(java.lang.foreign.SegmentAllocator allocator)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("this(allocator.allocate(").append(layoutName).breakLine("));");
        context.popControlFlow();
        context.breakLine('}');

        context.breakLine();
        context.append("public static ").append(declaration.name()).breakLine(" getAtIndex(java.lang.foreign.MemorySegment buffer, int index)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("return new ").append(declaration.name()).append("(buffer.asSlice(index * ").append(layoutName).append("byteSize(), ").append(layoutName).breakLine("));");
        context.popControlFlow();
        context.breakLine('}');

        context.breakLine();
        context.append("public static void setAtIndex(java.lang.foreign.MemorySegment buffer, int index, ").append(declaration.name()).breakLine(" value)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("java.lang.foreign.MemorySegment.copy(value.").append(pointerName).append(", 0, this.").append(pointerName).append(", 0, ").append(layoutName).breakLine(".byteSize());");
        context.popControlFlow();
        context.breakLine('}');

        for (RecordType.Member member : declaration.members)
        {
            if (member instanceof RecordType.Field(Type type, String name))
            {
                switch (flattenType(type))
                {
                    case Type.ValueType _, Type.Pointer _, EnumType _ ->
                    {
                        context.breakLine();
                        String javaType = this.getJavaType(type);

                        context.append("public ").append(javaType).append(' ').append(name).append("() {return this.").append(pointerName).append(".get(LAYOUT__").append(name).append(", OFFSET__").append(name).breakLine(");}");
                        context.append("public void ").append(name).append('(').append(javaType).append(" value) {this.").append(pointerName).append(".set(LAYOUT__").append(name).append(", OFFSET__").append(name).breakLine(", value);}");
                        context.append("public java.lang.foreign.MemorySegment $").append(name).append("() {return this.").append(pointerName).append(".asSlice(OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(");}");
                    }
                    case Type.Array(Type elementType, _) ->
                    {
                        context.breakLine();
                        context.append("public java.lang.foreign.MemorySegment ").append(name).append("() {return this.").append(pointerName).append(".asSlice(OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(");}");

                        Type flattenedElementType = flattenType(elementType);
                        if (flattenedElementType instanceof RecordType recordType)
                        {
                            String recordClass = this.getJavaType(recordType);
                            context.append("public ").append(recordClass).append(' ').append(name).append("(int index) {return ").append(recordClass).append(".getAtIndex(this.").append(name).breakLine("(), index):}");
                            context.append("public void ").append(name).append("(int index, java.util.function.Consumer<").append(recordClass).append("> consumer) {consumer.accept(this.").append(name).breakLine("(index));}");
                            context.append("public void ").append(name).append("(int index, ").append(recordClass).append(" value) {").append(recordClass).append(".setAtIndex(this.").append(name).breakLine("(), index, value);}");
                        }
                        else if (!(flattenedElementType instanceof Type.Array))
                        {
                            String javaType = this.getJavaType(elementType);
                            String elementLayout = this.getTypeLayoutInstance(elementType);

                            context.append("public ").append(javaType).append(' ').append(name).append("(int index) {return this.").append(name).append("().getAtIndex(").append(elementLayout).breakLine(", index);}");
                            context.append("public void ").append(name).append("(int index, ").append(javaType).append(" value) {this.").append(name).append("().setAtIndex(").append(elementLayout).breakLine(", index, value);}");
                        }
                    }
                    case RecordType recordType ->
                    {
                        context.breakLine();
                        String recordClass = this.getJavaType(recordType);

                        context.append("public ").append(recordClass).append(' ').append(name).append("() {return new ").append(recordClass).append("(this.").append(pointerName).append(".asSlice(OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine("));}");
                        context.append("public void ").append(name).append("(java.util.function.Consumer<").append(recordClass).append("> consumer)").append(" {consumer.accept(this.").append(name).breakLine("());}");
                        context.append("public void ").append(name).append('(').append(recordClass).append(" value) {java.lang.foreign.MemorySegment.copy(value.").append(pointerName).append("(), 0, this.").append(pointerName).append(", OFFSET__").append(name).append(", LAYOUT__").append(name).breakLine(".byteSize());}");
                    }
                    default -> {}
                }
            }
        }

        context.popControlFlow();
        context.breakLine('}');
    }

    private PrintingContext appendDescriptor(PrintingContext context, FunctionType function) throws IOException
    {
        context.append("java.lang.foreign.FunctionDescriptor.of");
        if (function.returnType() == Type.VOID) context.append("Void(");
        else context.append('(').append(this.getNativeTypeLayoutInstance(function.returnType()));

        Iterator<Type> parameterIterator = function.parameterTypes().iterator();

        if (parameterIterator.hasNext())
        {
            if (function.returnType() != Type.VOID)
            {
                context.append(", ").append(this.getNativeTypeLayoutInstance(parameterIterator.next()));
            }

            while (parameterIterator.hasNext())
            {
                context.append(", ").append(this.getNativeTypeLayoutInstance(parameterIterator.next()));
            }
        }

        return context.append(')');
    }

    public void makeCallback(PrintingContext context, CallbackDescriptor descriptor) throws IOException
    {
        if (this.emitClassPrefix(context))
        {
            context.breakLine();
        }

        boolean redirect = callbackRequiresRedirect(descriptor.type());

        context.append("public interface ").breakLine(descriptor.name());
        context.breakLine('{');
        context.pushControlFlow();

        this.appendDescriptor(context.append("java.lang.foreign.FunctionDescriptor ").append(this.m_settings.callbackDescriptorName()).append(" = "), descriptor.type()).breakLine(';');
        context.append("java.lang.invoke.MethodHandle ").append(this.m_settings.callbackStubName()).append(" = jpgen.NativeTypes.initUpcallStub(").append(this.m_settings.callbackDescriptorName()).append(", \"invoke\", ").append(descriptor.name()).breakLine(".class);");

        ParallelIterator<Type, String> parameterIterator;

        parameterIterator = descriptor.parameterIterator();
        context.breakLine();
        context.append(this.getJavaType(descriptor.type().returnType())).append(" invoke(");
        if (parameterIterator.hasNext())
        {
            while (true)
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                context.append(this.getJavaType(parameter.a())).append(' ').append(parameter.b());
                if (!parameterIterator.hasNext())
                {
                    break;
                }
                else
                {
                    context.append(", ");
                }
            }
        }
        context.breakLine(");");

        if (redirect)
        {
            context.breakLine();

            parameterIterator = descriptor.parameterIterator();
            context.append("default ").append(getNativeType(descriptor.type().returnType())).append(" invoke(");
            if (parameterIterator.hasNext())
            {
                while (true)
                {
                    ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                    context.append(getNativeType(parameter.a())).append(' ').append(parameter.b());
                    if (!parameterIterator.hasNext())
                    {
                        break;
                    }
                    else
                    {
                        context.append(", ");
                    }
                }
            }
            context.breakLine(')');
            context.breakLine('{');
            context.pushControlFlow();

            if (descriptor.type().returnType() != Type.VOID) context.append("return ");
            context.append("this.invoke(");
            parameterIterator = descriptor.parameterIterator();
            if (parameterIterator.hasNext())
            {
                while (true)
                {
                    ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                    boolean translate = flattenType(parameter.a()) instanceof RecordType;

                    if (translate) context.append("new ").append(this.getJavaType(parameter.a())).append('(');
                    context.append(parameter.b());
                    if (translate) context.append(')');

                    if (!parameterIterator.hasNext())
                    {
                        break;
                    }
                    else
                    {
                        context.append(", ");
                    }
                }
            }
            context.append(')');

            if (flattenType(descriptor.type().returnType()) instanceof RecordType)
            {
                context.append('.').append(this.m_settings.recordPointerName()).append("()");
            }
            context.breakLine(';');

            context.popControlFlow();
            context.breakLine('}');
        }

        context.breakLine();
        context.breakLine("default java.lang.foreign.MemorySegment makeHandle(java.lang.foreign.Arena arena)");
        context.breakLine('{');
        context.pushControlFlow();
        context.append("return jpgen.NativeTypes.SYSTEM_LINKER.upcallStub(").append(this.m_settings.callbackStubName()).append(".bindTo(this), ").append(this.m_settings.callbackDescriptorName()).breakLine(", arena);");
        context.popControlFlow();
        context.breakLine('}');

        context.popControlFlow();
        context.breakLine('}');
    }

    public void makeHeader(PrintingContext context, String className, Iterable<FunctionSpecifier> functions) throws IOException
    {
        if (this.emitClassPrefix(context))
        {
            context.breakLine();
        }

        context.append("public final class ").breakLine(className);
        context.append("{private ").append(className).breakLine("() {}");
        context.pushControlFlow();

        context.breakLine();
        for (FunctionSpecifier spec : functions)
        {
            if (spec.getFunctionHandle(spec.function().parameterNames.toArray(String[]::new)).isEmpty())
            {
                context.append("public static final java.lang.foreign.MemorySegment MTD_ADDRESS__").append(spec.function().name()).breakLine(';');
                context.append("public static final java.lang.invoke.MethodHandle MTD__").append(spec.function().name()).breakLine(';');
            }
        }

        for (FunctionSpecifier spec : functions)
        {
            context.breakLine();

            FunctionType desc = spec.function().descriptorType;
            boolean needsAllocator = flattenType(desc.returnType()) instanceof RecordType;

            ParallelIterator<Type, String> parameterIterator;

            String[] mappedTypesStrings = new String[desc.parameterTypes().size()];
            String[] mappedNames = new String[spec.function().parameterNames.size()];
            parameterIterator = ParallelIterator.of(desc.parameterTypes().iterator(), spec.function().parameterNames.iterator());
            for (int i = 0; parameterIterator.hasNext(); i++)
            {
                ParallelIterator.Element<Type, String> parameter = parameterIterator.next();
                mappedNames[i] = spec.getParameterName(i).orElse(parameter.b());
                mappedTypesStrings[i] = spec.getParameterType(i).orElse(this.getJavaType(parameter.a()));
            }

            for (int i = 0; i < mappedNames.length; i++)
            {
                if (mappedNames[i].isEmpty())
                {
                    mappedNames[i] = selectExclusiveName(mappedNames, String.format("arg%d", i));
                }
            }

            String allocatorName = selectExclusiveName(mappedNames, "allocator");
            String exceptionName = selectExclusiveName(mappedNames, "t");

            context.append("public static ").append(this.getJavaType(desc.returnType())).append(' ').append(spec.function().name()).append('(');
            if (needsAllocator) context.append("java.lang.foreign.SegmentAllocator ").append(allocatorName);

            if (mappedNames.length > 0)
            {
                if (needsAllocator) context.append(", ");
                for (int i = 0; i < mappedNames.length; i++)
                {
                    context.append(mappedTypesStrings[i]).append(' ').append(mappedNames[i]);

                    if (i < mappedNames.length - 1)
                    {
                        context.append(", ");
                    }
                }
            }

            context.breakLine(')');
            context.breakLine('{');
            context.pushControlFlow();

            context.append("try {");
            if (desc.returnType() != Type.VOID) context.append("return ");
            if (needsAllocator) context.append("new ").append(this.getJavaType(desc.returnType())).append('(');
            if (desc.returnType() != Type.VOID) context.append('(').append(getNativeType(desc.returnType())).append(')');

            String handle = spec.getFunctionHandle(mappedNames).orElseGet(() -> String.format("MTD__%s", spec.function().name()));
            context.append(handle).append(".invokeExact(");

            if (needsAllocator) context.append(allocatorName);
            if (mappedNames.length > 0)
            {
                Iterator<Type> typeIterator = desc.parameterTypes().iterator();
                if (needsAllocator) context.append(", ");
                for (int i = 0; i < mappedNames.length; i++)
                {
                    Type parameterType = typeIterator.next();
                    final int parameterIndex = i;
                    String unwrapped = spec.unwrapParameter(parameterIndex, mappedNames[parameterIndex]).orElseGet(() ->
                    {
                        if (flattenType(parameterType) instanceof RecordType)
                        {
                            return String.format("%s.%s()", mappedNames[parameterIndex], this.m_settings.recordPointerName());
                        }

                        return mappedNames[parameterIndex];
                    });

                    context.append(unwrapped);

                    if (i < mappedNames.length - 1)
                    {
                        context.append(", ");
                    }
                }
            }

            context.append(')');
            if (needsAllocator) context.append(')');
            context.breakLine(";}");

            context.append("catch (java.lang.Throwable ").append(exceptionName).append(") {throw new java.lang.AssertionError(").append(exceptionName).breakLine(");}");
            context.popControlFlow();
            context.breakLine('}');
        }

        context.breakLine();
        context.breakLine("static");
        context.breakLine('{');
        context.pushControlFlow();
        context.breakLine("java.lang.foreign.SymbolLookup lookup = name -> java.lang.foreign.SymbolLookup.loaderLookup().find(name).or(() -> jpgen.NativeTypes.SYSTEM_LINKER.defaultLookup().find(name));");

        context.breakLine();
        for (FunctionSpecifier spec : functions)
        {
            if (spec.getFunctionHandle(spec.function().parameterNames.toArray(String[]::new)).isEmpty())
            {
                context.append("MTD_ADDRESS__").append(spec.function().name()).append(" = lookup.find(\"").append(spec.function().name()).breakLine("\").orElseThrow();");
                this.appendDescriptor(context.append("MTD__").append(spec.function().name()).append(" = jpgen.NativeTypes.SYSTEM_LINKER.downcallHandle(MTD__").append(spec.function().name()).append(", "), spec.function().descriptorType).breakLine(");");
            }
        }

        context.popControlFlow();
        context.breakLine('}');

        context.popControlFlow();
        context.breakLine('}');
    }
}
