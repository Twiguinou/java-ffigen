package fr.kenlek.jpgen;

import fr.kenlek.jpgen.clang.CXCursor;
import fr.kenlek.jpgen.data.CanonicalPackage;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface LocationProvider
{
    CanonicalPackage getLocation(CXCursor cursor);

    record ModuleTree(Path path, CanonicalPackage location, List<ModuleTree> children)
    {
        public ModuleTree(Path path, CanonicalPackage location, ModuleTree... children)
        {
            this(path, location, List.of(children));
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
                                if (path.startsWith(candidate.path))
                                {
                                    parent = candidate;
                                    candidates.clear();
                                    candidates.addAll(parent.children);
                                }
                            }

                            return parent == null ? CanonicalPackage.EMPTY : parent.location;
                        })
                        .orElse(CanonicalPackage.EMPTY);
            }
        };
    }
}
