package fr.kenlek.jpgen.data;

public record TypeOperationHint(Kind kind, String element) implements ProcessingHint
{
    public enum Kind
    {
        WRAPPING,
        UNWRAPPING
    }

    public String cast(String type)
    {
        if (this.kind == Kind.UNWRAPPING) return this.element;

        return String.format("(%s)%s", type, this.element);
    }
}
