package fr.kenlek.jpgen.generator.data.features;

import fr.kenlek.jpgen.generator.data.JavaPath;
import fr.kenlek.jpgen.generator.data.RecordType;

public sealed class PrintMember implements TypeFeature.Write
    permits PrintMember.Plain, PrintMember.Array
{
    public static final class Plain extends PrintMember
    {
        public final RecordType.Member member;

        public Plain(JavaPath layoutsClass, RecordType.Member member)
        {
            super(layoutsClass);
            this.member = member;
        }
    }

    public static final class Array extends PrintMember
    {
        public final String name;

        public Array(JavaPath layoutsClass, String name)
        {
            super(layoutsClass);
            this.name = name;
        }
    }

    public final JavaPath layoutsClass;

    protected PrintMember(JavaPath layoutsClass)
    {
        this.layoutsClass = layoutsClass;
    }
}
