package jpgen.data;

import java.util.Optional;

public sealed interface Declaration<T extends Declaration<T>> extends TypeManifold
        permits EnumType, FunctionType.Declaration, FunctionType.Callback, RecordType
{
    Optional<String> name();

    T withName(String name);
}
