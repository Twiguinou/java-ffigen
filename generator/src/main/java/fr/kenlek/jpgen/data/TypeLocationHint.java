package fr.kenlek.jpgen.data;

/// General Java type reference hints.
public enum TypeLocationHint implements ProcessingHint
{
    /// A type representing the raw descriptor of a callback.
    CALLBACK_RAW,
    /// A type representing the translated descriptor of a callback.
    /// This value is not used if there is no single type marked as [translatable][TypeKind#translatable()]
    CALLBACK,
    FUNCTION,
    ENUM_CONSTANT
}
