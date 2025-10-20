@SuppressWarnings("requires-transitive-automatic")
module fr.kenlek.jpgen.generator
{
    requires transitive java.logging;
    requires transitive java.compiler;

    requires fr.kenlek.jpgen.api;
    requires transitive fr.kenlek.jpgen.clang;
    requires transitive com.palantir.javapoet;

    exports fr.kenlek.jpgen.generator;
    exports fr.kenlek.jpgen.generator.data;
    exports fr.kenlek.jpgen.generator.data.features;
}
