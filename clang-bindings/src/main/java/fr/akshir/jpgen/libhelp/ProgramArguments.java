package fr.akshir.jpgen.libhelp;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ProgramArguments
{
    private final Map<String, String[]> m_registeredArgs = new HashMap<>();

    public ProgramArguments(String[] args)
    {
        for (String arg : args)
        {
            if (arg.length() < 3 || !arg.startsWith("--")) continue;

            String[] splitted = arg.substring(2).split("=");
            if (splitted.length != 2) continue;

            this.m_registeredArgs.putIfAbsent(splitted[0], splitted[1].split(","));
        }
    }

    public Optional<String> getArgValueIndexed(String arg, int index)
    {
        String[] values = this.m_registeredArgs.get(arg);
        if (values != null && index >= 0 && index < values.length)
        {
            return Optional.of(values[index]);
        }

        return Optional.empty();
    }

    public Optional<String[]> getArgValues(String arg)
    {
        return Optional.ofNullable(this.m_registeredArgs.get(arg));
    }
}
