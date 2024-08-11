package fr.kenlek.jpgen;

import org.apache.commons.lang3.SystemUtils;

public class NativeTypes
{
    public static boolean isP64()
    {
        return SystemUtils.IS_OS_WINDOWS;
    }
}
