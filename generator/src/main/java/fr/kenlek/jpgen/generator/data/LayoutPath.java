package fr.kenlek.jpgen.generator.data;

import com.palantir.javapoet.CodeBlock;
import java.lang.foreign.MemoryLayout;

public final class LayoutPath
{
    private sealed interface Element permits GroupElement, SequenceElement
    {
        CodeBlock emit();
    }

    private record GroupElement(long index) implements Element
    {
        @Override
        public CodeBlock emit()
        {
            return CodeBlock.of("$T.groupElement($LL)", MemoryLayout.PathElement.class, this.index());
        }
    }

    private record SequenceElement(long index) implements Element
    {
        @Override
        public CodeBlock emit()
        {
            return CodeBlock.of("$T.sequenceElement($LL)", MemoryLayout.PathElement.class, this.index());
        }
    }

    private final Element m_element;
    private final LayoutPath m_next;

    private LayoutPath(Element element, LayoutPath next)
    {
        this.m_element = element;
        this.m_next = next;
    }

    public static LayoutPath group(long index)
    {
        return new LayoutPath(new GroupElement(index), null);
    }

    public static LayoutPath sequence(long index)
    {
        return new LayoutPath(new GroupElement(index), null);
    }

    public LayoutPath with(LayoutPath path)
    {
        return this.m_next == null ? new LayoutPath(this.m_element, path) : this.m_next.with(path);
    }

    public CodeBlock emit()
    {
        CodeBlock code = this.m_element.emit();
        return this.m_next == null ? code : CodeBlock.of("$L, $L", code, this.m_next.emit());
    }
}
