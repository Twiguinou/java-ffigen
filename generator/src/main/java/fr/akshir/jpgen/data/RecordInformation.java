package fr.akshir.jpgen.data;

public record RecordInformation(CanonicalPackage location, String name, String pointerName, String layoutName)
{
    public String javaType()
    {
        return this.location.get()
                .map(pkg -> String.format("%s.%s", pkg, this.name))
                .orElse(this.name);
    }

    public String layoutInstance()
    {
        return String.format("%s.%s", this.javaType(), this.layoutName);
    }
}
