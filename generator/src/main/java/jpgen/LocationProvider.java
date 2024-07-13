package jpgen;

import jpgen.clang.CXCursor;
import jpgen.data.CanonicalPackage;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface LocationProvider
{
    CanonicalPackage getLocation(CXCursor cursor);

    interface ModuleTree
    {
        Path path();

        CanonicalPackage location();

        Iterable<ModuleTree> children();

        static ModuleTree of(Path path, CanonicalPackage location, ModuleTree... children)
        {
            List<ModuleTree> childrenlist = List.of(children);
            return new ModuleTree()
            {
                @Override
                public Path path()
                {
                    return path;
                }

                @Override
                public CanonicalPackage location()
                {
                    return location;
                }

                @Override
                public Iterable<ModuleTree> children()
                {
                    return childrenlist;
                }
            };
        }
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
                            List<ModuleTree> candidates = new ArrayList<>();
                            candidates.add(tree);
                            while (!candidates.isEmpty())
                            {
                                ModuleTree candidate = candidates.removeLast();
                                if (path.startsWith(candidate.path()))
                                {
                                    parent = candidate;
                                    candidates.clear();
                                    parent.children().forEach(candidates::add);
                                }
                            }

                            return parent == null ? CanonicalPackage.EMPTY : parent.location();
                        })
                        .orElse(CanonicalPackage.EMPTY);
            }
        };
    }
}
