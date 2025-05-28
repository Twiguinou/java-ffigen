package fr.kenlek.jpgen.generator.data2.features;

import fr.kenlek.jpgen.generator.data2.JavaPath;

public class GetLayout implements TypeFeature<String>
{
    //TODO
    public static class ForRecord extends GetLayout
    {
        public ForRecord(JavaPath layoutsClass)
        {
            super(layoutsClass);
        }
    }

    public final JavaPath layoutsClass;

    public GetLayout(JavaPath layoutsClass)
    {
        this.layoutsClass = layoutsClass;
    }
}
