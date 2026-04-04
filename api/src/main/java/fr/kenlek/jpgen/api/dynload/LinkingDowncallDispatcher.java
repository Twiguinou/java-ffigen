package fr.kenlek.jpgen.api.dynload;

import module java.base;

import static fr.kenlek.jpgen.api.ForeignUtils.SYSTEM_LINKER;

/// A simple implementation of [DowncallDispatcher].
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

    /// Finds the first symbol that successfully resolves to a native function pointer.
    /// @param symbols A list of symbols
    /// @return The first address that could successfully get resolved by this dispatcher's lookup.
    /// @throws IllegalArgumentException If none could be found.
    protected MemorySegment findSymbolAddress(List<String> symbols)
    {
        return symbols.stream()
            .map(this.m_lookup::find)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Could not resolve function address for symbols: " + symbols));
    }

    /// Finds the address of the symbolic name associated with the given Java method.
    /// The order of precedence for all information we have with the method is:
    /// - If the method is annotated with [Redirect], we perform searches on all given values.
    /// - If the method was not annotated with [Redirect], or that the [Redirect#fallback] attribute
    /// is set to `true`. We then attempt to find a matching [Redirect.Case] if a [Redirect.Generic]
    /// annotation is present at the level above.
    /// - Ultimately, given the conditions mentioned above, and that [Redirect.Generic#fallback] is enabled,
    /// we use the method's name.
    /// @param method A Java method.
    /// @return MemorySegment The associated function pointer, if any could be found.
    /// @throws IllegalArgumentException If no function pointer could be found.
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

    /// Creates a downcall [MethodHandle] with the information provided by the given method.
    ///
    /// There are a few paths taken by this method depending on the available annotations:
    /// - If the method is annotated with [Variable], we simply make a method handle that
    /// always returns attempt the function pointer found by [#findSymbolAddress(Method)].
    /// - If the method is annotated with [Unbound], a leading [MemorySegment] parameter
    /// is inserted, as specified by [Linker#downcallHandle(FunctionDescriptor, Linker.Option...)].
    /// - And finally if none of the above paths was taken, we return a simple downcall.
    /// @param method A Java method.
    /// @return A method handle, not necessarily compatible with the given method.
    /// @throws IllegalArgumentException If any property was not successfully resolved.
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
