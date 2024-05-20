package jpgen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ParallelIterator<A, B> extends Iterator<ParallelIterator.Element<A, B>>
{
    record Element<A, B>(A a, B b) {}

    static <A, B> ParallelIterator<A, B> of(Iterator<A> iteratorA, Iterator<B> iteratorB)
    {
        return new ParallelIterator<>()
        {
            @Override
            public boolean hasNext()
            {
                return iteratorA.hasNext() && iteratorB.hasNext();
            }

            @Override
            public Element<A, B> next()
            {
                if (!this.hasNext())
                {
                    throw new NoSuchElementException();
                }

                return new Element<>(iteratorA.next(), iteratorB.next());
            }
        };
    }
}
