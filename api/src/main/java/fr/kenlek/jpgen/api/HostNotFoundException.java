package fr.kenlek.jpgen.api;

/// An exception used when a host specific operation cannot occur because such
/// host is not found for the current platform.
@SuppressWarnings("serial")
public class HostNotFoundException extends RuntimeException
{
    /// Construct a simple exception for when a host is not found.
    public HostNotFoundException()
    {
        super();
    }
}
