package jpgen.data;

import java.util.Optional;

public interface Declaration
{
    String name();

    Optional<String> canonicalPackage();
}
