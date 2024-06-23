package jpgen.data;

import jpgen.PrintingContext;

import java.io.IOException;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Iterator;
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

    String layoutClass();

    String layoutInstance();

    String nativeLayoutInstance();

    String javaType();

    String nativeType();

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

    default void writeReturnWrapping(Appendable context, String result) throws IOException
    {
        context.append("return (").append(this.javaType()).append(')').append(result);
    }

    default void writeReturnUnwrapping(Appendable output, String result) throws IOException
    {
        output.append("return ").append(result);
    }

    default void writeParameterWrapping(Appendable output, String parameter) throws IOException
    {
        output.append(parameter);
    }

    default void writeParameterUnwrapping(Appendable output, String parameter) throws IOException
    {
        output.append(parameter);
    }

    default void writeDescriptorFunction(Appendable output, Iterable<Type> parameterTypes) throws IOException
    {
        output.append("java.lang.foreign.FunctionDescriptor.of(").append(this.nativeLayoutInstance());
        for (Type parameter : parameterTypes)
        {
            output.append(", ").append(parameter.nativeLayoutInstance());
        }

        output.append(')');
    }

    Type VOID = new Type()
    {
        @Override
        public Optional<? extends MemoryLayout> layout()
        {
            return Optional.empty();
        }

        @Override public String layoutClass() {throw new UnsupportedOperationException();}
        @Override public String layoutInstance() {throw new UnsupportedOperationException();}
        @Override public String nativeLayoutInstance() {throw new UnsupportedOperationException();}

        @Override public String javaType()
        {
            return "void";
        }

        @Override public String nativeType()
        {
            return "void";
        }

        @Override public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) {throw new UnsupportedOperationException();}
        @Override public void writeArrayAccessors(PrintingContext context, String name, String array) {throw new UnsupportedOperationException();}

        @Override
        public void writeReturnWrapping(Appendable output, String result) throws IOException
        {
            output.append(result);
        }

        @Override
        public void writeReturnUnwrapping(Appendable output, String result) throws IOException
        {
            output.append(result);
        }

        @Override public void writeParameterWrapping(Appendable output, String parameter) {throw new UnsupportedOperationException();}
        @Override public void writeParameterUnwrapping(Appendable output, String parameter) {throw new UnsupportedOperationException();}

        @Override
        public void writeDescriptorFunction(Appendable output, Iterable<Type> parameterTypes) throws IOException
        {
            Iterator<Type> parameterIterator = parameterTypes.iterator();

            output.append("java.lang.foreign.FunctionDescriptor.ofVoid(");
            while (parameterIterator.hasNext())
            {
                output.append(parameterIterator.next().nativeLayoutInstance());
                if (parameterIterator.hasNext()) output.append(", ");
            }

            output.append(')');
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
        public String layoutClass()
        {
            return this.m_layoutClass;
        }

        @Override
        public String layoutInstance()
        {
            return this.m_layoutField;
        }

        @Override
        public String nativeLayoutInstance()
        {
            return this.m_layoutField;
        }

        @Override
        public String javaType()
        {
            return this.m_javaType;
        }

        @Override
        public String nativeType()
        {
            return this.m_javaType;
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
    }

    ValueBased BOOLEAN = new ValueBased(JAVA_BOOLEAN, "java.lang.foreign.ValueLayout.JAVA_BOOLEAN", "java.lang.foreign.ValueLayout.OfBoolean", "boolean");
    ValueBased BYTE = new ValueBased(JAVA_BYTE, "java.lang.foreign.ValueLayout.JAVA_BYTE", "java.lang.foreign.ValueLayout.OfByte", "byte");
    ValueBased CHARACTER = new ValueBased(JAVA_CHAR, "java.lang.foreign.ValueLayout.JAVA_CHAR", "java.lang.foreign.ValueLayout.OfChar", "char");
    ValueBased SHORT = new ValueBased(JAVA_SHORT, "java.lang.foreign.ValueLayout.JAVA_SHORT", "java.lang.foreign.ValueLayout.OfShort", "short");
    ValueBased INTEGER = new ValueBased(JAVA_INT, "java.lang.foreign.ValueLayout.JAVA_INT", "java.lang.foreign.ValueLayout.OfInt", "int");
    ValueBased LONG = new ValueBased(JAVA_LONG, "java.lang.foreign.ValueLayout.JAVA_LONG", "java.lang.foreign.ValueLayout.OfLong", "long");
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
        public String layoutClass()
        {
            return "java.lang.foreign.SequenceLayout";
        }

        @Override
        public String layoutInstance()
        {
            return String.format("java.lang.foreign.MemoryLayout.sequenceLayout(%d, %s)", this.length, this.elementType.layoutInstance());
        }

        @Override
        public String nativeLayoutInstance()
        {
            return "jpgen.NativeTypes.UNBOUNDED_POINTER";
        }

        @Override
        public String javaType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public String nativeType()
        {
            return "java.lang.foreign.MemorySegment";
        }

        @Override
        public void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
        {
            context.breakLine();
            context.append("public java.lang.foreign.MemorySegment ").append(name).append("() {return ").append(data).append(".asSlice(").append(offset).append(", ").append(layout).breakLine(");}");
            this.elementType.writeArrayAccessors(context, name, String.format("this.%s()", name));
        }

        @Override public void writeArrayAccessors(PrintingContext context, String name, String array) {}
    }

    interface Delegated extends Type
    {
        Type underlyingType();

        @Override
        default Optional<? extends MemoryLayout> layout()
        {
            return this.underlyingType().layout();
        }

        @Override
        default String layoutClass()
        {
            return this.underlyingType().layoutClass();
        }

        @Override
        default String layoutInstance()
        {
            return this.underlyingType().layoutInstance();
        }

        @Override
        default String nativeLayoutInstance()
        {
            return this.underlyingType().nativeLayoutInstance();
        }

        @Override
        default String javaType()
        {
            return this.underlyingType().javaType();
        }

        @Override
        default String nativeType()
        {
            return this.underlyingType().nativeType();
        }

        @Override
        default void writeAccessors(PrintingContext context, String name, String layout, String offset, String data) throws IOException
        {
            this.underlyingType().writeAccessors(context, name, layout, offset, data);
        }

        @Override
        default void writeArrayAccessors(PrintingContext context, String name, String array) throws IOException
        {
            this.underlyingType().writeArrayAccessors(context, name, array);
        }

        @Override
        default void writeReturnWrapping(Appendable output, String result) throws IOException
        {
            this.underlyingType().writeReturnWrapping(output, result);
        }

        @Override
        default void writeReturnUnwrapping(Appendable output, String result) throws IOException
        {
            this.underlyingType().writeReturnWrapping(output, result);
        }

        @Override
        default void writeParameterWrapping(Appendable output, String parameter) throws IOException
        {
            this.underlyingType().writeParameterWrapping(output, parameter);
        }

        @Override
        default void writeParameterUnwrapping(Appendable output, String parameter) throws IOException
        {
            this.underlyingType().writeParameterUnwrapping(output, parameter);
        }

        @Override
        default void writeDescriptorFunction(Appendable output, Iterable<Type> parameterTypes) throws IOException
        {
            this.underlyingType().writeDescriptorFunction(output, parameterTypes);
        }

        @Override
        default Type flatten()
        {
            return this.underlyingType().flatten();
        }
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
