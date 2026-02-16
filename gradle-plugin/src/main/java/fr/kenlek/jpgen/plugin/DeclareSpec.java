package fr.kenlek.jpgen.plugin;

import fr.kenlek.jpgen.generator.ParseResults;
import fr.kenlek.jpgen.generator.data.Declaration;
import java.util.List;

public interface DeclareSpec
{
    ParseResults results();

    List<Declaration> declarations();

    DeclareSpec include(Declaration... declarations);

    DeclareSpec include(Iterable<? extends Declaration> declarations);
}
