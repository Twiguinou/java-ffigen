package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.data.CanonicalPackage;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.List;

public interface LocationProvider
{
    CanonicalPackage getLocation(CXCursor cursor);

    record ModuleTree(@Nullable Path head, CanonicalPackage location, List<ModuleTree> children) implements LocationProvider
    {
        public ModuleTree(@Nullable Path head, CanonicalPackage location, List<ModuleTree> children)
        {
            this.head = head != null ? SourceScopeScanner.resolvePath(head) : null;
            this.location = location;
            this.children = children;
        }

        public ModuleTree(@Nullable Path head, CanonicalPackage location, ModuleTree... children)
        {
            this(head, location, List.of(children));
        }

        public ModuleTree(CanonicalPackage location, List<ModuleTree> children)
        {
            this(null, location, children);
        }

        public ModuleTree(CanonicalPackage location, ModuleTree... children)
        {
            this(location, List.of(children));
        }

        public ModuleTree(List<ModuleTree> children)
        {
            this(CanonicalPackage.EMPTY, children);
        }

        public ModuleTree(ModuleTree... children)
        {
            this(List.of(children));
        }

        public boolean contains(Path path)
        {
            return this.head == null || path.startsWith(this.head);
        }

        private CanonicalPackage getLocation(Path filepath)
        {
            return this.children.stream()
                    .filter(tree -> tree.contains(filepath))
                    .findFirst()
                    .map(tree -> tree.getLocation(filepath))
                    .orElse(this.location);
        }

        @Override
        public CanonicalPackage getLocation(CXCursor cursor)
        {
            try (Arena arena = Arena.ofConfined())
            {
                return ClangUtils.getCursorFilePath(arena, cursor)
                        .filter(this::contains)
                        .map(this::getLocation)
                        .orElse(CanonicalPackage.EMPTY);
            }
        }
    }
}
