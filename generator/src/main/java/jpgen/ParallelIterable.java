package jpgen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ParallelIterable<A, B> extends Iterable<ParallelIterable.Element<A, B>>
{
    record Element<A, B>(A a, B b) {}

    static <A, B> ParallelIterable<A, B> of(Iterable<A> iterableA, Iterable<B> iterableB)
    {
        return () -> new Iterator<>()
        {
            final Iterator<A> iteratorA = iterableA.iterator();
            final Iterator<B> iteratorB = iterableB.iterator();
            @Override
            public boolean hasNext()
            {
                return iteratorA.hasNext() && iteratorB.hasNext();
            }

            @Override
            public Element<A, B> next()
            {
                if (!this.hasNext()) throw new NoSuchElementException();
                return new Element<>(iteratorA.next(), iteratorB.next());
            }
        };
    }
}
