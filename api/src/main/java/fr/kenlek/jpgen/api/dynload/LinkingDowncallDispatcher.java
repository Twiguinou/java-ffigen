package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

public class LinkingDowncallDispatcher extends Dispatcher implements DowncallDispatcher
{
    protected final SymbolLookup m_lookup;

    public LinkingDowncallDispatcher(Linker linker, SymbolLookup lookup)
    {
        super(linker);
        this.m_lookup = lookup;
    }

    public LinkingDowncallDispatcher(SymbolLookup lookup)
    {
        this(SYSTEM_LINKER, lookup);
    }

    protected MemorySegment findSymbolAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.m_lookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Could not resolve function address for symbols: " + symbols));
    }

    protected MemorySegment findSymbolAddress(Method method)
    {
        List<String> symbols = new ArrayList<>(1);

        Redirect redirect = method.getAnnotation(Redirect.class);
        if (redirect != null)
        {
            symbols.addAll(Arrays.asList(redirect.value()));
        }

        if (redirect == null || redirect.fallback())
        {
            Redirect.Generic generic = method.getDeclaringClass().getAnnotation(Redirect.Generic.class);
            boolean foundCase = false;
            if (generic != null)
            {
                for (Redirect.Case path : generic.value())
                {
                    if (!method.getName().matches(path.matching()))
                    {
                        continue;
                    }

                    symbols.add(path.replaceAll()
                        ? method.getName().replaceAll(path.regex(), path.value())
                        : method.getName().replaceFirst(path.regex(), path.value())
                    );
                    foundCase = true;
                    if (!generic.greedy())
                    {
                        break;
                    }
                }
            }

            if (!foundCase || generic.fallback())
            {
                symbols.add(method.getName());
            }
        }

        return this.findSymbolAddress(symbols);
    }

    @Override
    public MethodHandle dispatch(Method method)
    {
        if (method.isAnnotationPresent(Variable.class))
        {
            return MethodHandles.constant(MemorySegment.class, this.findSymbolAddress(method));
        }

        Linker.Option[] options = resolveLinkerOptions(method).toArray(Linker.Option[]::new);
        FunctionDescriptor descriptor = this.resolveFunctionDescriptor(method);

        if (method.isAnnotationPresent(Unbound.class))
        {
            return this.m_linker.downcallHandle(descriptor, options);
        }

        return this.m_linker.downcallHandle(this.findSymbolAddress(method), descriptor, options);
    }
}
