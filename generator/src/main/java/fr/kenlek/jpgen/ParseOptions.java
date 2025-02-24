package fr.kenlek.jpgen;

import fr.kenlek.jpgen.data.RecordType;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public record ParseOptions(List<Path> headers, List<String> clangArgs, PathProvider pathProvider,
                           ElementFilter elementFilter, boolean skipConstants, String recordPointerName,
                           PreTypeResolver preTypeResolver, PostTypeResolver postTypeResolver,
                           Supplier<? extends NameResolver> nameResolvers)
{
    public static class Builder
    {
        public final List<Path> headers;
        public final List<String> clangArgs;
        public PathProvider pathProvider;
        public ElementFilter elementFilter;
        public boolean skipConstants;
        public String recordPointerName;
        public PreTypeResolver preTypeResolver;
        public PostTypeResolver postTypeResolver;
        public Supplier<? extends NameResolver> nameResolvers;

        public Builder(ParseOptions options)
        {
            this.headers = new ArrayList<>(options.headers());
            this.clangArgs = new ArrayList<>(options.clangArgs());
            this.pathProvider = options.pathProvider();
            this.elementFilter = options.elementFilter();
            this.skipConstants = options.skipConstants();
            this.recordPointerName = options.recordPointerName();
            this.preTypeResolver = options.preTypeResolver();
            this.postTypeResolver = options.postTypeResolver();
            this.nameResolvers = options.nameResolvers();
        }

        public Builder()
        {
            this.headers = new ArrayList<>();
            this.clangArgs = new ArrayList<>();
            this.pathProvider = PathProvider.DUMMY;
            this.elementFilter = ElementFilter.ALL_PARSE;
            this.skipConstants = true;
            this.recordPointerName = RecordType.DEFAULT_POINTER_NAME;
            this.preTypeResolver = PreTypeResolver.DUMMY;
            this.postTypeResolver = PostTypeResolver.DUMMY;
            this.nameResolvers = NameResolver::new;
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

        public Builder pathProvider(PathProvider pathProvider)
        {
            this.pathProvider = pathProvider;
            return this;
        }

        public Builder elementFilter(ElementFilter elementFilter)
        {
            this.elementFilter = elementFilter;
            return this;
        }

        public Builder skipConstants(boolean skipConstants)
        {
            this.skipConstants = skipConstants;
            return this;
        }

        public Builder recordPointerName(String recordPointerName)
        {
            this.recordPointerName = recordPointerName;
            return this;
        }

        public Builder preTypeResolver(PreTypeResolver preTypeResolver)
        {
            this.preTypeResolver = preTypeResolver;
            return this;
        }

        public Builder postTypeResolver(PostTypeResolver postTypeResolver)
        {
            this.postTypeResolver = postTypeResolver;
            return this;
        }

        public Builder nameResolvers(Supplier<? extends NameResolver> nameResolvers)
        {
            this.nameResolvers = nameResolvers;
            return this;
        }

        public ParseOptions build()
        {
            return new ParseOptions(
                List.copyOf(this.headers), List.copyOf(this.clangArgs),
                this.pathProvider, this.elementFilter, this.skipConstants,
                this.recordPointerName, this.preTypeResolver, this.postTypeResolver,
                this.nameResolvers
            );
        }
    }
}
