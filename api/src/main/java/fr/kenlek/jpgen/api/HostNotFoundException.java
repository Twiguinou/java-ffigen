package fr.kenlek.jpgen.api;

/// An exception used when a host specific operation cannot occur because such
/// host is not found for the current platform.
public class HostNotFoundException extends RuntimeException
{
    /// Construct a simple exception for when a host is not found.
    public HostNotFoundException()
    {
        super();
    }
}
