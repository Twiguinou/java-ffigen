package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public interface DowncallDispatcher
{
    DowncallDispatcher DEFAULT = new LinkingDowncallDispatcher(SYSTEM_LINKER.defaultLookup());

    static DowncallDispatcher and(DowncallDispatcher dispatcher, DowncallTransformer transformer)
    {
        return method -> transformer.transform(method, dispatcher.dispatch(method));
    }

    MethodHandle dispatch(Method method);

    default DowncallDispatcher and(DowncallTransformer transformer)
    {
        return and(this, transformer);
    }
}
