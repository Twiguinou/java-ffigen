package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXType;

import java.util.Arrays;

import static fr.kenlek.jpgen.clang.Index_h.*;
import static fr.kenlek.jpgen.ClangUtils.*;

public record TypeKey(CXType internal)
{
    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof TypeKey(CXType type) && getBoolean(clang_equalTypes(this.internal, type));
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(new long[] {
            this.internal.data(0).address(),
            this.internal.data(1).address()
        });
    }
}
