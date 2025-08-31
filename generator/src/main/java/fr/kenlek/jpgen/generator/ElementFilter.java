package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.LibClang;

public interface ElementFilter
{
    boolean test(LibClang clang, CXCursor cursor);
}
