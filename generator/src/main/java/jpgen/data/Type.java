package jpgen.data;

import jpgen.PrintingContext;

import java.io.IOException;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Optional;

import static java.lang.foreign.ValueLayout.*;

public interface Type
{
    /**
     * This method is only useful when computing offsets for record types.
     * @return A memory layout representing this type, if possible.
     */
    Optional<? extends MemoryLayout> layout();

    default Type discover()
    {
        return this;
    }

    default Type flatten()
    {
        return this;
    }

    /**
     * Helper method for generating member accesses in a record declaration. By default this method has no effect.
     * @param context The output which is to be appended to.
     * @param name A name belonging to the current member.
     * @param layout A string referencing the member's layout.
     * @param offset A string referencing the member's offset.
     * @param data The record's pointer.
     * @throws IOException If an error is encountered while performing writes.
     */
    void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException;

    /**
     * Helper method for generating array accesses in a record declaration.
     * @param context The output which is to be appended to.
     * @param name The name belonging to the current member.
     * @param array The array's memory segment string.
     */
    void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException;

    String getWrappedFunctionParameterType();

    String getWrappedFunctionParameter(String name);

    String getUnwrappedFunctionParameterType();

    String getUnwrappedFunctionParameter(String name);

    String getWrappedFunctionReturnType();

    String getWrappedFunctionReturnValue(String data);

    String getUnwrappedFunctionReturnType();

    String getUnwrappedFunctionReturnValue(String data);

    String getFunctionLayoutInstance();

    default String getFunctionDescriptor(String parameterList)
    {
        if (parameterList.isEmpty())
        {
            return String.format("java.lang.foreign.FunctionDescriptor.of(%s)", this.getFunctionLayoutInstance());
        }

        return String.format("java.lang.foreign.FunctionDescriptor.of(%s, %s)", this.getFunctionLayoutInstance(), parameterList);
    }

    default String getEnumConstantType()
    {
        throw new UnsupportedOperationException();
    }

    default String getWrappedEnumConstant(long value)
    {
        return Long.toString(value);
    }

    String getRecordMemberLayoutType();

    String getRecordMemberLayoutInstance();

    Type VOID = new Type()
    {
        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return Optional.empty();
        }

        @Override public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) {throw new UnsupportedOperationException();}
        @Override public void writeArrayAccessors(PrintingContext context, String name, String array) {throw new UnsupportedOperationException();}
        @Override public String getWrappedFunctionParameterType() {throw new UnsupportedOperationException();}
        @Override public String getWrappedFunctionParameter(String name) {throw new UnsupportedOperationException();}
        @Override public String getUnwrappedFunctionParameterType() {throw new UnsupportedOperationException();}
        @Override public String getUnwrappedFunctionParameter(String name) {throw new UnsupportedOperationException();}
        @Override public String getFunctionLayoutInstance() {throw new UnsupportedOperationException();}
        @Override public String getRecordMemberLayoutType() {throw new UnsupportedOperationException();}
        @Override public String getRecordMemberLayoutInstance() {throw new UnsupportedOperationException();}

        @Override
        public String getWrappedFunctionReturnType()
        {
            return "void";
        }

        @Override
        public String getWrappedFunctionReturnValue(String data)
        {
            return data;
        }

        @Override
        public String getUnwrappedFunctionReturnType()
        {
            return "void";
        }

        @Override
        public String getUnwrappedFunctionReturnValue(String data)
        {
            return data;
        }

        @Override
        public String getFunctionDescriptor(String parameterList)
        {
            return String.format("java.lang.foreign.FunctionDescriptor.ofVoid(%s)", parameterList);
        }
    };

    class ValueBased implements Type
    {
        private final ValueLayout m_layout;
        private final String m_layoutField;
        private final String m_layoutClass;
        private final String m_javaType;

        public ValueBased(ValueLayout layout, String layoutField, String layoutClass, String javaType)
        {
            this.m_layout = layout;
            this.m_layoutField = layoutField;
            this.m_layoutClass = layoutClass;
            this.m_javaType = javaType;
        }

        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return Optional.of(this.m_layout);
        }

        @Override
        public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
        {
            context.breakLine();
            context.append("public ").append(this.m_javaType).append(' ').append(name).append("() {return ").append(data).append(".get(").append(layout).append(", ").append(offset).breakLine(");}");
            context.append("public void ").append(name).append('(').append(this.m_javaType).append(" value) {").append(data).append(".set(").append(layout).append(", ").append(offset).breakLine(", value);}");
            context.append("public java.lang.foreign.MemorySegment $").append(name).append("() {return ").append(data).append(".asSlice(").append(offset).append(", ").append(layout).breakLine(");}");
        }

        @Override
        public String toString()
        {
            return String.format("ValueType[layout=%s]", this.m_layout);
        }

        @Override
        public void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
        {
            context.append("public ").append(this.m_javaType).append(' ').append(name).append("(int index) {return ").append(array).append(".getAtIndex(").append(this.m_layoutField).breakLine(", index);}");
            context.append("public void ").append(name).append("(int index, ").append(this.m_javaType).append(" value) {").append(array).append(".setAtIndex(").append(this.m_layoutField).breakLine(", index, value);}");
        }

        @Override
        public String getWrappedFunctionParameterType()
        {
            return this.m_javaType;
        }

        @Override
        public String getWrappedFunctionParameter(String name)
        {
            return name;
        }

        @Override
        public String getUnwrappedFunctionParameterType()
        {
            return this.m_javaType;
        }

        @Override
        public String getUnwrappedFunctionParameter(String name)
        {
            return name;
        }

        @Override
        public String getWrappedFunctionReturnType()
        {
            return this.m_javaType;
        }

        @Override
        public String getWrappedFunctionReturnValue(String data)
        {
            return String.format("return (%s)%s", this.m_javaType, data);
        }

        @Override
        public String getUnwrappedFunctionReturnType()
        {
            return this.m_javaType;
        }

        @Override
        public String getUnwrappedFunctionReturnValue(String data)
        {
            return String.format("return %s", data);
        }

        @Override
        public String getFunctionLayoutInstance()
        {
            return this.m_layoutField;
        }

        @Override
        public String getRecordMemberLayoutType()
        {
            return this.m_layoutClass;
        }

        @Override
        public String getRecordMemberLayoutInstance()
        {
            return this.m_layoutField;
        }
    }

    ValueBased BOOLEAN = new ValueBased(JAVA_BOOLEAN, "java.lang.foreign.ValueLayout.JAVA_BOOLEAN", "java.lang.foreign.ValueLayout.OfBoolean", "boolean");
    ValueBased BYTE = new ValueBased(JAVA_BYTE, "java.lang.foreign.ValueLayout.JAVA_BYTE", "java.lang.foreign.ValueLayout.OfByte", "byte");
    ValueBased CHARACTER = new ValueBased(JAVA_CHAR, "java.lang.foreign.ValueLayout.JAVA_CHAR", "java.lang.foreign.ValueLayout.OfChar", "char");
    ValueBased SHORT = new ValueBased(JAVA_SHORT, "java.lang.foreign.ValueLayout.JAVA_SHORT", "java.lang.foreign.ValueLayout.OfShort", "short");
    ValueBased INTEGER = new ValueBased(JAVA_INT, "java.lang.foreign.ValueLayout.JAVA_INT", "java.lang.foreign.ValueLayout.OfInt", "int")
    {
        @Override
        public String getEnumConstantType()
        {
            return "int";
        }
    };
    ValueBased LONG = new ValueBased(JAVA_LONG, "java.lang.foreign.ValueLayout.JAVA_LONG", "java.lang.foreign.ValueLayout.OfLong", "long")
    {
        @Override
        public String getEnumConstantType()
        {
            return "long";
        }
    };
    ValueBased FLOAT = new ValueBased(JAVA_FLOAT, "java.lang.foreign.ValueLayout.JAVA_FLOAT", "java.lang.foreign.ValueLayout.OfFloat", "float");
    ValueBased DOUBLE = new ValueBased(JAVA_DOUBLE, "java.lang.foreign.ValueLayout.JAVA_DOUBLE", "java.lang.foreign.ValueLayout.OfDouble", "double");

    class Pointer extends ValueBased
    {
        public final Type referencedType;

        public Pointer(Type referencedType)
        {
            super(ADDRESS, "jpgen.NativeTypes.UNBOUNDED_POINTER", "java.lang.foreign.AddressLayout", "java.lang.foreign.MemorySegment");
            this.referencedType = referencedType;
        }

        @Override
        public String toString()
        {
            // Infinite recursion workaround
            return "Pointer";
        }
    }

    record Array(Type elementType, long length) implements Type
    {
        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return Optional.of(MemoryLayout.sequenceLayout(this.length, this.elementType.layout().orElseThrow()));
        }

        @Override
        public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
        {
            context.breakLine();
            context.append("public java.lang.foreign.MemorySegment ").append(name).append("() {return ").append(data).append(".asSlice(").append(offset).append(", ").append(layout).breakLine(");}");
            this.elementType.writeArrayAccessors(context, name, String.format("this.%s()", name));
        }

        @Override public void writeArrayAccessors(PrintingContext context, String name, String array) {}

        @Override
        public String getWrappedFunctionParameterType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public String getWrappedFunctionParameter(String name)
        {
            return name;
        }

        @Override
        public String getUnwrappedFunctionParameterType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public String getUnwrappedFunctionParameter(String name)
        {
            return name;
        }

        @Override
        public String getWrappedFunctionReturnType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public String getWrappedFunctionReturnValue(String data)
        {
            return String.format("return (java.lang.foreign.MemorySegment)%s", data);
        }

        @Override
        public String getUnwrappedFunctionReturnType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public String getUnwrappedFunctionReturnValue(String data)
        {
            return String.format("return %s", data);
        }

        @Override
        public String getFunctionLayoutInstance()
        {
            return "jpgen.NativeTypes.UNBOUNDED_POINTER";
        }

        @Override
        public String getRecordMemberLayoutType()
        {
            return "java.lang.foreign.SequenceLayout";
        }

        @Override
        public String getRecordMemberLayoutInstance()
        {
            return String.format("java.lang.foreign.MemoryLayout.sequenceLayout(%d, %s)", this.length, this.elementType.getRecordMemberLayoutInstance());
        }
    }

    interface Delegated extends Type
    {
        Type underlyingType();

        // This is extremely painful to look at
        @Override default Optional<? extends MemoryLayout> layout() {return this.underlyingType().layout();}
        @Override default void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException {this.underlyingType().writeAccessors(context, name, layout, offset, data);}
        @Override default void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException {this.underlyingType().writeArrayAccessors(context, name, array);}
        @Override default Type flatten() {return this.underlyingType().flatten();}
        @Override default String getWrappedFunctionParameterType() {return this.underlyingType().getWrappedFunctionParameterType();}
        @Override default String getWrappedFunctionParameter(String name) {return this.underlyingType().getWrappedFunctionParameter(name);}
        @Override default String getUnwrappedFunctionParameterType() {return this.underlyingType().getUnwrappedFunctionParameterType();}
        @Override default String getUnwrappedFunctionParameter(String name) {return this.underlyingType().getUnwrappedFunctionParameter(name);}
        @Override default String getWrappedFunctionReturnType() {return this.underlyingType().getWrappedFunctionReturnType();}
        @Override default String getWrappedFunctionReturnValue(String data) {return this.underlyingType().getWrappedFunctionReturnValue(data);}
        @Override default String getUnwrappedFunctionReturnType() {return this.underlyingType().getUnwrappedFunctionReturnType();}
        @Override default String getUnwrappedFunctionReturnValue(String data) {return this.underlyingType().getUnwrappedFunctionReturnValue(data);}
        @Override default String getFunctionLayoutInstance() {return this.underlyingType().getFunctionLayoutInstance();}
        @Override default String getFunctionDescriptor(String parameterList) {return this.underlyingType().getFunctionDescriptor(parameterList);}
        @Override default String getEnumConstantType() {return this.underlyingType().getEnumConstantType();}
        @Override default String getWrappedEnumConstant(long value) {return this.underlyingType().getWrappedEnumConstant(value);}
        @Override default String getRecordMemberLayoutType() {return this.underlyingType().getRecordMemberLayoutType();}
        @Override default String getRecordMemberLayoutInstance() {return this.underlyingType().getRecordMemberLayoutInstance();}
    }

    record Alias(Type underlyingType, String identifier) implements Delegated
    {
        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return this.underlyingType.layout().map(layout -> layout.withName(this.identifier));
        }

        @Override
        public String toString()
        {
            return String.format("Alias[%s, type=%s]", this.identifier, this.underlyingType);
        }
    }
}
