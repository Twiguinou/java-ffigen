package jpgen.codegen.poet;

public record ClassLocation(String canonicalPackage, String name)
{
    public ClassLocation(Class<?> clazz)
    {
        this(clazz.isPrimitive() ? "" : clazz.getPackageName(), resolveCanonicalName(clazz));
    }

    private static String resolveCanonicalName(Class<?> clazz)
    {
        if (clazz.getEnclosingClass() != null)
        {
            return STR."\{resolveCanonicalName(clazz.getEnclosingClass())}.\{clazz.getSimpleName()}";
        }

        return clazz.getSimpleName();
    }

    public String classpath()
    {
        if (this.canonicalPackage.isBlank())
        {
            return this.name;
        }

        return STR."\{this.canonicalPackage}.\{this.name}";
    }
}
