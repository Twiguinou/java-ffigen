package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.data.Declaration;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.List;

public interface PathProvider
{
    Declaration.JavaPath getPath(CXCursor cursor);

    record ModuleTree(@Nullable Path head, Declaration.JavaPath path, List<ModuleTree> children) implements PathProvider
    {
        public ModuleTree(@Nullable Path head, Declaration.JavaPath path, List<ModuleTree> children)
        {
            this.head = head != null ? SourceScopeScanner.resolvePath(head) : null;
            this.path = path;
            this.children = children;
        }

        public ModuleTree(Declaration.JavaPath path, List<ModuleTree> children)
        {
            this(null, path, children);
        }

        public ModuleTree(List<ModuleTree> children)
        {
            this(Declaration.EMPTY_PATH, children);
        }

        public boolean contains(Path filepath)
        {
            return this.head == null || filepath.startsWith(this.head);
        }

        private Declaration.JavaPath getPath(Path filepath)
        {
            return this.children.stream()
                    .filter(tree -> tree.contains(filepath))
                    .findFirst()
                    .map(tree -> tree.getPath(filepath))
                    .orElse(this.path);
        }

        @Override
        public Declaration.JavaPath getPath(CXCursor cursor)
        {
            try (Arena arena = Arena.ofConfined())
            {
                return ClangUtils.getCursorFilePath(arena, cursor)
                        .filter(this::contains)
                        .map(this::getPath)
                        .orElse(Declaration.EMPTY_PATH);
            }
        }
    }
}
