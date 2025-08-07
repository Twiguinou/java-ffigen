module fr.kenlek.jpgen.generator
{
    requires transitive java.logging;
    requires java.compiler;

    requires static transitive org.jspecify;
    requires fr.kenlek.jpgen.api;
    requires transitive fr.kenlek.jpgen.clang;

    exports fr.kenlek.jpgen.generator;
    exports fr.kenlek.jpgen.generator.data;
    exports fr.kenlek.jpgen.generator.data.features;
    exports fr.kenlek.jpgen.generator.util;
}
