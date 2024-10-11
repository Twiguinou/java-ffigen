package fr.kenlek.jpgen.data;

public sealed interface LayoutReferenceHint extends ProcessingHint permits
        LayoutReferenceHint.Descriptor, LayoutReferenceHint.Physical, LayoutReferenceHint.RecordElement
{
    record Descriptor(Declaration.JavaPath layoutsClass) implements LayoutReferenceHint
    {
        public Descriptor()
        {
            this(Declaration.EMPTY_PATH);
        }
    }

    record Physical(Declaration.JavaPath layoutsClass) implements LayoutReferenceHint
    {
        public Physical()
        {
            this(Declaration.EMPTY_PATH);
        }
    }

    record RecordElement(Declaration.JavaPath layoutsClass, RecordType record, int index)
            implements LayoutReferenceHint
    {
        public RecordElement(RecordType record, int index)
        {
            this(Declaration.EMPTY_PATH, record, index);
        }

        public RecordType.Member member()
        {
            return this.record.members.get(this.index);
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
                case RecordType.Field _ -> String.format("new fr.kenlek.jpgen.Member.Field(%s)", namedLayout);
                case RecordType.Bitfield(_, _, long width) ->
                        String.format("new fr.kenlek.jpgen.Member.Bitfield(%s, %d)", namedLayout, width);
            };
        }
    }

    Declaration.JavaPath layoutsClass();

    default String processLayout(String layout)
    {
        return layout;
    }

    default String processLayout(Declaration.JavaPath layout)
    {
        return this.processLayout(layout.toString());
    }
}
