package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.Type;

public record EnumConstantHint(long value) implements Type.ProcessingHint {}
