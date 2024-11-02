package fr.kenlek.jpgen;

import fr.kenlek.jpgen.data.RecordType;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public record ParseOptions(List<Path> headers, List<String> clangArgs, Hints hints)
{
    public record Hints(PathProvider pathProvider, ElementFilter filter, boolean skipConstants, String recordPointerName,
                        TypeResolver typeResolver)
    {
        public Hints(PathProvider pathProvider, ElementFilter filter, boolean skipConstants, TypeResolver typeResolver)
        {
            this(pathProvider, filter, skipConstants, RecordType.DEFAULT_POINTER_NAME, typeResolver);
        }

        public Hints(PathProvider pathProvider, ElementFilter filter, boolean skipConstants)
        {
            this(pathProvider, filter, skipConstants, TypeResolver.DUMMY);
        }
    }

    public static class Builder
    {
        public final List<Path> headers;
        public final List<String> clangArgs;
        public final Hints hints;

        public Builder(List<Path> headers, List<String> clangArgs, Hints hints)
        {
            this.headers = new ArrayList<>(headers);
            this.clangArgs = new ArrayList<>(clangArgs);
            this.hints = hints;
        }

        public Builder(Hints hints)
        {
            this.headers = new ArrayList<>();
            this.clangArgs = new ArrayList<>();
            this.hints = hints;
        }

        public Builder(ParseOptions options)
        {
            this(options.headers, options.clangArgs, options.hints);
        }

        public Builder addHeader(Path header)
        {
            this.headers.add(header);
            return this;
        }

        public Builder addArgument(String argument)
        {
            this.clangArgs.add(argument);
            return this;
        }

        public ParseOptions build()
        {
            return new ParseOptions(List.copyOf(this.headers), List.copyOf(this.clangArgs), this.hints);
        }
    }
}
