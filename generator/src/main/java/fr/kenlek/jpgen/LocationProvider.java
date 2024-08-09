package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.data.CanonicalPackage;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public interface LocationProvider
{
    CanonicalPackage getLocation(CXCursor cursor);

    abstract class ModuleTree
    {
        public final CanonicalPackage location;
        public final List<ModuleTree> children;

        public ModuleTree(CanonicalPackage location, List<ModuleTree> children)
        {
            this.location = location;
            this.children = children;
        }

        public static ModuleTree of(CanonicalPackage location, List<ModuleTree> children)
        {
            return new ModuleTree(location, children)
            {
                @Override
                public boolean contains(Path path)
                {
                    return true;
                }

                @Override
                public String toString()
                {
                    return "empty";
                }
            };
        }

        public static ModuleTree of(List<ModuleTree> children)
        {
            return of(CanonicalPackage.EMPTY, children);
        }

        public static ModuleTree of(Path head, CanonicalPackage location, List<ModuleTree> children)
        {
            return new ModuleTree(location, children)
            {
                final Path source = SourceScopeScanner.resolvePath(head);

                @Override
                public boolean contains(Path path)
                {
                    return path.startsWith(this.source);
                }

                @Override
                public String toString()
                {
                    return head.toString();
                }
            };
        }

        public abstract boolean contains(Path path);
    }

    static LocationProvider of(ModuleTree tree)
    {
        return cursor ->
        {
            try (Arena arena = Arena.ofConfined())
            {
                return ClangUtils.getCursorFilePath(arena, cursor)
                        .map(path ->
                        {
                            @Nullable ModuleTree parent = null;
                            List<ModuleTree> candidates = new LinkedList<>();
                            candidates.add(tree);
                            while (!candidates.isEmpty())
                            {
                                ModuleTree candidate = candidates.removeFirst();
                                if (candidate.contains(path))
                                {
                                    candidates.clear();
                                    candidates.addAll(candidate.children);
                                    parent = candidate;
                                }
                            }

                            return parent == null ? CanonicalPackage.EMPTY : parent.location;
                        })
                        .orElse(CanonicalPackage.EMPTY);
            }
        };
    }
}
