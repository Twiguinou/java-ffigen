package benchmarks;

import fr.kenlek.jpgen.api.dynload.*;
import java.lang.foreign.MemorySegment;

public interface Stdlib
{
    int abs(int value);

    @Redirect("abs") @Critical
    int abs_critical(int value);

    @Redirect("abs") @Unbound
    int abs_unbound(@Ignore MemorySegment address, int value);

    @Redirect("abs") @Unbound @Critical
    int abs_unbound_critical(@Ignore MemorySegment address, int value);
}
