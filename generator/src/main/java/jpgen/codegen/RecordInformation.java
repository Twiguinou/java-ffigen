package jpgen.codegen;

public record RecordInformation(String name, String packageName, String layoutName, String segmentField)
{/*
    public String classpath()
    {
        return STR."\{this.packageName}.\{this.name}";
    }

    public String layoutClasspath()
    {
        return STR."\{this.classpath()}.\{layoutName}";
    }*/
}
