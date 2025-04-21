package fr.kenlek.jpgen.generator;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.clang.ClangUtils;
import fr.kenlek.jpgen.generator.data.path.JavaPath;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.List;

public interface PathProvider
{
    PathProvider DUMMY = _ -> JavaPath.EMPTY;

    JavaPath getPath(CXCursor cursor);

    record ModuleTree(@Nullable Path head, JavaPath path, List<ModuleTree> children) implements PathProvider
    {
        public ModuleTree(@Nullable Path head, JavaPath path, List<ModuleTree> children)
        {
            this.head = head != null ? SourceScopeScanner.resolvePath(head) : null;
            this.path = path;
            this.children = children;
        }

        public ModuleTree(JavaPath path, List<ModuleTree> children)
        {
            this(null, path, children);
        }

        public ModuleTree(List<ModuleTree> children)
        {
            this(JavaPath.EMPTY, children);
        }

        public boolean contains(Path filepath)
        {
            return this.head == null || filepath.startsWith(this.head);
        }

        private JavaPath getPath(Path filepath)
        {
            return this.children.stream()
                .filter(tree -> tree.contains(filepath))
                .findFirst()
                .map(tree -> tree.getPath(filepath))
                .orElse(this.path);
        }

        @Override
        public JavaPath getPath(CXCursor cursor)
        {
            try (Arena arena = Arena.ofConfined())
            {
                return ClangUtils.getCursorFilePath(arena, cursor)
                    .filter(this::contains)
                    .map(this::getPath)
                    .orElse(JavaPath.EMPTY);
            }
        }
    }
}
