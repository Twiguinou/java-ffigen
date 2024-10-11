package fr.kenlek.jpgen.data;

public sealed interface ProcessingHint permits
        LayoutReferenceHint, TypeOperationHint, TypeLocationHint, EnumConstantHint
{}
