package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Declaration;
import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;

public record RecordLocation(Declaration.JavaPath layoutsClass, RecordType.Decl record, int index)
        implements Type.InputLocation
{
    public record Array(Declaration.JavaPath layoutsClass, String name) implements Type.InputLocation {}

    public RecordType.Member member()
    {
        return this.record().members.get(this.index);
    }

    public Declaration.JavaPath layoutData()
    {
        return this.layoutsClass().child(this.record.symbolicName());
    }

    public String pointer()
    {
        return "this.".concat(this.record().pointerName);
    }
}
