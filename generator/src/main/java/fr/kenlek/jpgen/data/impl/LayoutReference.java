package fr.kenlek.jpgen.data.impl;

import fr.kenlek.jpgen.data.RecordType;
import fr.kenlek.jpgen.data.Type;
import fr.kenlek.jpgen.data.path.JavaPath;

import static fr.kenlek.jpgen.data.CodeUtils.*;

public sealed interface LayoutReference extends Type.ProcessingHint permits
        LayoutReference.Descriptor, LayoutReference.Physical, LayoutReference.RecordElement
{
    record Descriptor(JavaPath layoutsClass) implements LayoutReference {}

    record Physical(JavaPath layoutsClass) implements LayoutReference {}

    record RecordElement(JavaPath layoutsClass, RecordType record, int index) implements LayoutReference
    {
        public RecordType.Member member()
        {
            return this.record().members.get(this.index());
        }

        @Override
        public String processLayout(String layout)
        {
            RecordType.Member member = this.member();
            String namedLayout = member.name()
                    .map(name -> String.format("%s.withName(\"%s\")", layout, name))
                    .orElseGet(() -> layout.concat(".withoutName()"));

            return switch (member)
            {
                case RecordType.Field _ -> String.format("new %s.Field(%s)", MEMBER, namedLayout);
                case RecordType.Bitfield(_, _, long width) -> String.format("new %s.Bitfield(%s, %d)", MEMBER, namedLayout, width);
            };
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
