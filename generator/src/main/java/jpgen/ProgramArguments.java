package jpgen;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ProgramArguments
{
    private final Map<String, String[]> m_registeredArgs = new HashMap<>();

    public ProgramArguments(final String[] args)
    {
        for (String arg : args)
        {
            if (arg.length() <= 2 || arg.charAt(0) != '-' || arg.charAt(1) != '-')
            {
                continue;
            }

            String[] splitted = arg.substring(2).split("=", 2);
            this.m_registeredArgs.putIfAbsent(splitted[0], splitted[1].split(","));
        }
    }

    public boolean containsArgument(final String arg_s)
    {
        return this.m_registeredArgs.containsKey(arg_s);
    }

    public int getNumValuesOfArg(final String arg_s)
    {
        final String[] args = this.m_registeredArgs.get(arg_s);
        return args == null ? -1 : args.length;
    }

    public <T> Optional<T> getArgValueIndexed(final String arg_s, int index, Function<String, T> cnv)
    {
        if (index >= 0)
        {
            final String[] args = this.m_registeredArgs.get(arg_s);
            if (args != null && index < args.length)
            {
                return Optional.of(cnv.apply(args[index]));
            }
        }

        return Optional.empty();
    }

    public <T> T[] getArgValues(final String arg_s, T[] dest, Function<String, T> cnv)
    {
        final String[] args = this.m_registeredArgs.get(arg_s);
        if (args != null)
        {
            for (int i = Math.min(args.length, dest.length) - 1; i >= 0; i--)
            {
                dest[i] = cnv.apply(args[i]);
            }
        }

        return dest;
    }
}
