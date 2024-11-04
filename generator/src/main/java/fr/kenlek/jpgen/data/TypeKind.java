package fr.kenlek.jpgen.data;

/// Type kinds only serve as markers for code generation to know what kind of operations
/// can be safely performed on different types. A type is common if it does not provide
/// any particular function.
/// ### [isVoid][TypeKind#isVoid]
/// This one is self explanatory. For the sake of compatibility jpgen allows the user to
/// define its own void types. In most cases the [provided one][Type#VOID] is enough.
/// ### [isComposite][TypeKind#isComposite]
/// A composite type generates a leading [java.lang.foreign.SegmentAllocator] parameter in a downcall handle.
/// ### [isTranslatable][TypeKind#isTranslatable]
/// Translatable types generate a helper function in callbacks.
public record TypeKind(boolean isVoid, boolean isComposite, boolean isTranslatable)
{
    public static final TypeKind COMMON = new TypeKind(false, false, false);
    public static final TypeKind VOID = new TypeKind(true, false, false);
    public static final TypeKind COMPOSITE = new TypeKind(false, true, false);
    public static final TypeKind TRANSLATABLE = new TypeKind(false, false, true);

    public TypeKind
    {
        if (isVoid && (isComposite || isTranslatable))
        {
            throw new IllegalArgumentException("A void type kind may only contain the void flag.");
        }
    }
}
