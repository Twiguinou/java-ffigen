package inheritance;

import fr.kenlek.jpgen.api.dynload.LinkingDowncallDispatcher;
import fr.kenlek.jpgen.api.dynload.NativeProxies;

import java.lang.reflect.InvocationTargetException;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public final class InheritanceTest
{private InheritanceTest() {}

    public static void main(String... args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        LibC libc = NativeProxies.implement(LibC.class, new LinkingDowncallDispatcher(SYSTEM_LINKER.defaultLookup()))
            .getDeclaredConstructor(String.class)
            .newInstance("hello");
        System.out.println(libc.someVariable);
        System.out.println(libc.abs(-1));
    }
}
