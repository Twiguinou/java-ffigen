package jpgen.data;

import java.util.Optional;

public interface Declaration<T extends Declaration<T>> extends TypeManifold
{
    Optional<String> name();

    T withName(String name);
}
