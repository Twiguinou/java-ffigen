package jpgen;

import java.util.HashSet;
import java.util.Set;

public final class NameSolver
{
    private final Set<String> m_usedClassNames = new HashSet<>();
    private int m_unnamedRecordIndex = 0;
    private int m_unnamedEnumIndex = 0;

    public NameSolver() {}
}
