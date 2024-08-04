package fr.akshir.jpgen.data;

import java.util.Optional;

public interface CanonicalPackage
{
    CanonicalPackage EMPTY = Optional::empty;

    Optional<String> get();

    default boolean isPrefix(CanonicalPackage other)
    {
        Optional<String> pkg = this.get();
        if (pkg.isEmpty()) return true;
        Optional<String> otherPkg = other.get();
        return otherPkg.isPresent() && otherPkg.get().startsWith(pkg.get());
    }

    static CanonicalPackage of(String packageString)
    {
        return packageString.isEmpty() ? EMPTY : () -> Optional.of(packageString);
    }
}
