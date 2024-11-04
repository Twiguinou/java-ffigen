package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Type;

/// General Java type reference hints.
public enum TypeReference implements Type.ProcessingHint
{
    CALLBACK_RAW_RETURN,
    CALLBACK_RAW_PARAMETER,
    CALLBACK_RETURN,
    CALLBACK_PARAMETER,
    FUNCTION_RETURN,
    FUNCTION_PARAMETER,
    ENUM_CONSTANT;

    public boolean isRawCallback()
    {
        return this == CALLBACK_RAW_RETURN || this == CALLBACK_RAW_PARAMETER;
    }

    public boolean isCallback()
    {
        return this == CALLBACK_RETURN || this == CALLBACK_PARAMETER;
    }

    public boolean isFunction()
    {
        return this == FUNCTION_RETURN || this == FUNCTION_PARAMETER;
    }

    public boolean isMethod()
    {
        return this.isRawCallback() || this.isCallback() || this.isFunction();
    }
}
