package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.generator.data.JavaPath;

import java.io.IOException;
import java.io.Writer;

public interface FileWriterFactory
{
    Writer create(JavaPath path) throws IOException;
}
