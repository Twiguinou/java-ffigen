package fr.kenlek.jpgen.data.features;

import fr.kenlek.jpgen.data.Feature;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.path.JavaPath;

public sealed class GetLayout implements Feature
        permits GetLayout.ForDescriptor, GetLayout.ForPhysical, GetLayout.ForRecord
{
    public static final class ForDescriptor extends GetLayout
    {
        public ForDescriptor(JavaPath layoutsClass)
        {
            super(layoutsClass);
        }
    }

    public static final class ForPhysical extends GetLayout
    {
        public ForPhysical(JavaPath layoutsClass)
        {
            super(layoutsClass);
        }
    }

    public static final class ForRecord extends GetLayout
    {
        public final RecordType.Member member;

        public ForRecord(JavaPath layoutsClass, RecordType.Member member)
        {
            super(layoutsClass);
            this.member = member;
        }

        @Override
        public String processLayout(String layout)
        {
            return this.member.name()
                    .map(name -> String.format("%s.withName(\"%s\")", layout, name))
                    .orElseGet(() -> layout.concat(".withoutName()"));
        }
    }

    public final JavaPath layoutsClass;

    protected GetLayout(JavaPath layoutsClass)
    {
        this.layoutsClass = layoutsClass;
    }

    public String processLayout(String layout)
    {
        return layout;
    }

    public String processLayout(JavaPath layoutReference)
    {
        return this.processLayout(layoutReference.toString());
    }
}
