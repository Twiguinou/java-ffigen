package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.TypeKind;

/// General Java type reference hints.
public enum TypeReference implements Type.ProcessingHint
{
    /// A type representing the raw descriptor of a callback.
    CALLBACK_RAW,
    /// A type representing the translated descriptor of a callback.
    /// This value is not used if there is no single type marked as [translatable][TypeKind#isTranslatable].
    CALLBACK,
    FUNCTION,
    ENUM_CONSTANT
}
