package jpgen.codegen;

public record HeaderInformation(String name, String packageName, String linkerName, String symbolTableName)
{/*
    public String classpath()
    {
        return STR."\{this.packageName}.\{this.name}";
    }

    public String linkerClasspath()
    {
        return STR."\{this.classpath()}.\{this.linkerName}";
    }*/
}
