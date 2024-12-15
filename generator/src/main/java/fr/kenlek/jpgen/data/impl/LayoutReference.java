package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

public sealed interface LayoutReference extends Type.ProcessingHint permits LayoutReference.Descriptor, LayoutReference.Physical, LayoutReference.RecordElement
{
    record Descriptor(JavaPath layoutsClass) implements LayoutReference {}

    record Physical(JavaPath layoutsClass) implements LayoutReference {}

    record RecordElement(JavaPath layoutsClass, RecordType record, RecordType.Member member) implements LayoutReference
    {
        @Override
        public String processLayout(String layout)
        {
            RecordType.Member member = this.member();
            return member.name()
                    .map(name -> String.format("%s.withName(\"%s\")", layout, name))
                    .orElseGet(() -> layout.concat(".withoutName()"));
        }
    }

    JavaPath layoutsClass();

    default String processLayout(String layout)
    {
        return layout;
    }

    default String processLayout(JavaPath layout)
    {
        return this.processLayout(layout.toString());
    }
}
