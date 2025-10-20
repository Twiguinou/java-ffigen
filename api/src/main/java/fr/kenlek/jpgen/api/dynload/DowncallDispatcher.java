package fr.kenlek.jpgen.api.dynload;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

public interface DowncallDispatcher
{
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
