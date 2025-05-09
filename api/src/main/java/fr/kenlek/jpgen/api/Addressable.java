package fr.kenlek.jpgen.api;

import java.lang.foreign.MemorySegment;

public interface Addressable
{
    MemorySegment pointer();
}
