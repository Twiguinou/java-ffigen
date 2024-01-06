package jpgen;

import jpgen.data.EnumType;
import jpgen.data.RecordType;

import java.util.HashSet;
import java.util.Set;

public final class NameSolver
{
    private final Set<String> m_usedClassNames = new HashSet<>();
    private int m_unnamedRecordIndex = 0;
    private int m_unnamedEnumIndex = 0;

    public NameSolver() {}

    public void registerName(String name)
    {
        this.m_usedClassNames.add(name);
    }

    public String resolveEnum(EnumType enumType)
    {
        String name = enumType.name();
        if (name.isBlank())
        {
            do
            {
                name = STR."UnnamedEnum_\{this.m_unnamedEnumIndex++}";
            }
            while (this.m_usedClassNames.contains(name));
            this.registerName(name);
        }

        return enumType.name();
    }

    public String resolveRecord(RecordType recordType)
    {
        String name = recordType.name();
        if (name.isBlank())
        {
            do
            {
                name = STR."UnnamedRecord_\{this.m_unnamedRecordIndex++}";
            }
            while (this.m_usedClassNames.contains(name));

            this.registerName(name);
        }

        return recordType.name();
    }
}
