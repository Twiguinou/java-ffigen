package fr.kenlek.jpgen.data;

public sealed interface WriteLocation
        permits WriteLocation.RecordAccess, WriteLocation.ArrayRecordAccess, WriteLocation.Static
{
    record RecordAccess(Declaration.JavaPath layoutsClass, RecordType.Decl record, int index)
            implements WriteLocation
    {
        public RecordType.Member member()
        {
            return this.record.members.get(this.index);
        }

        public Declaration.JavaPath layoutData()
        {
            return this.layoutsClass.child(this.record.m_symbolicName);
        }

        public String pointer()
        {
            return "this.".concat(this.record.pointerName);
        }
    }

    record ArrayRecordAccess(Declaration.JavaPath layoutsClass, String name)
            implements WriteLocation {}

    enum Static implements WriteLocation
    {
        LAYOUTS_CLASS
    }
}
