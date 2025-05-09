package fr.kenlek.jpgen.api.benchmarks;

import fr.kenlek.jpgen.api.dynload.Critical;
import fr.kenlek.jpgen.api.dynload.Redirect;
import fr.kenlek.jpgen.api.dynload.Unbound;

import java.lang.foreign.MemorySegment;

public interface Stdlib
{
    int abs(int value);

    @Redirect("abs") @Critical
    int abs_critical(int value);

    @Redirect("abs") @Unbound
    int abs_unbound(MemorySegment address, int value);

    @Redirect("abs") @Unbound @Critical
    int abs_unbound_critical(MemorySegment address, int value);
}
