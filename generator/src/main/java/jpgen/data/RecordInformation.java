package jpgen.data;

public record RecordInformation(String canonicalPackage, String name, String pointerName, String layoutName)
{
    public String javaType()
    {
        StringBuilder path = new StringBuilder();
        path.append(this.canonicalPackage);
        if (!this.canonicalPackage.isEmpty()) path.append('.');

        path.append(this.name);

        return path.toString();
    }

    public String layoutInstance()
    {
        return String.format("%s.%s", this.javaType(), this.layoutName);
    }
}
