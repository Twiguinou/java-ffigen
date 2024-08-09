package fr.kenlek.jpgen;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public record ParseOptions(List<Path> headers, List<String> clangArgs, Hints hints)
{
    public static final String DEFAULT_RECORD_POINTER_NAME = "ptr";
    public static final String DEFAULT_RECORD_LAYOUT_NAME = "gRecordLayout";

    public record Hints(LocationProvider locationProvider, ElementFilter filter, boolean skipConstants, String recordPointerName, String recordLayoutName)
    {
        public Hints(LocationProvider locationProvider, ElementFilter filter, boolean skipConstants)
        {
            this(locationProvider, filter, skipConstants, DEFAULT_RECORD_POINTER_NAME, DEFAULT_RECORD_LAYOUT_NAME);
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
