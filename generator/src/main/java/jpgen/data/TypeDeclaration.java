package jpgen.data;

import javax.annotation.Nullable;
import java.lang.foreign.ValueLayout;
import java.lang.reflect.Type;
import java.util.function.Function;

public interface TypeDeclaration
{
    TypeDeclaration UNKNOWN = new TypeDeclaration()
    {
        @Override public String spelling()
        {
            return "__unknown__?";
        }
        @Override public String toString()
        {
            return this.spelling();
        }
    };

    interface Primitive<T> extends TypeDeclaration
    {
        Type type();

        @Nullable ValueLayout layout();

        String format(T value);

        @Override
        default String spelling()
        {
            return this.type().getTypeName();
        }
    }

    private static <T> Primitive<T> makePrimitive(Type type, @Nullable ValueLayout layout, Function<T, String> formatter)
    {
        return new Primitive<>()
        {
            @Override public Type type()
            {
                return type;
            }
            @Override public @Nullable ValueLayout layout()
            {
                return layout;
            }
            @Override public String format(T value)
            {
                return formatter.apply(value);
            }
            @Override public String toString()
            {
                return this.spelling();
            }
        };
    }

    record IntegerPrimitive(Type type, ValueLayout layout, Function<Long, String> formatter) implements Primitive<Long>
    {
        @Override
        public String format(Long value)
        {
            return this.formatter.apply(value);
        }

        @Override
        public String toString()
        {
            return this.spelling();
        }
    }

    Primitive<Void> VOID = makePrimitive(void.class, null, v -> "");
    IntegerPrimitive BOOL = new IntegerPrimitive(boolean.class, ValueLayout.JAVA_BOOLEAN, v -> Boolean.toString(v != 0L));
    IntegerPrimitive BYTE = new IntegerPrimitive(byte.class, ValueLayout.JAVA_BYTE, v -> Byte.toString(v.byteValue()));
    IntegerPrimitive CHAR = new IntegerPrimitive(char.class, ValueLayout.JAVA_CHAR, v -> Character.toString((char)v.byteValue()));
    IntegerPrimitive SHORT = new IntegerPrimitive(short.class, ValueLayout.JAVA_SHORT, v -> Short.toString(v.shortValue()));
    IntegerPrimitive INT = new IntegerPrimitive(int.class, ValueLayout.JAVA_INT, v -> Integer.toString(v.intValue()));
    IntegerPrimitive LONG = new IntegerPrimitive(long.class, ValueLayout.JAVA_LONG, v -> Long.toString(v));
    Primitive<Float> FLOAT = makePrimitive(float.class, ValueLayout.JAVA_FLOAT, v -> Float.toString(v));
    Primitive<Double> DOUBLE = makePrimitive(double.class, ValueLayout.JAVA_DOUBLE, v -> Double.toString(v));

    String spelling();

    record Pointer(TypeReference underlying) implements TypeDeclaration
    {
        @Override
        public String spelling()
        {
            return STR."Pointer->\{this.underlying}";
        }
    }

    record Array(TypeReference underlying, long length) implements TypeDeclaration
    {
        @Override
        public String spelling()
        {
            return STR."Array[length=\{this.length},\{this.underlying}]";
        }
    }
}
