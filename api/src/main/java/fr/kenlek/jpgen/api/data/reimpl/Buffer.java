package fr.kenlek.jpgen.api.data.reimpl;

import fr.kenlek.jpgen.api.Addressable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface Buffer<T> extends Addressable, List<T>, RandomAccess
{
    long length();

    T get(long index);

    void set(long index, T value);

    @Override
    default int size()
    {
        if (this.length() > Integer.MAX_VALUE)
        {
            throw new IllegalStateException("This buffer length " + this.length() + " does not fit inside an integer.");
        }

        return (int) this.length();
    }

    @Override
    default boolean isEmpty()
    {
        return this.length() == 0;
    }

    @Override
    default boolean contains(Object o)
    {
        return this.indexOf(o) >= 0;
    }

    @Override
    Iterator<T> iterator();

    @Override
    Object[] toArray();

    @Override
    <T1> T1[] toArray(T1[] a);

    @Override
    default boolean add(T t)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean remove(Object o)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    boolean containsAll(Collection<?> c);

    @Override
    default boolean addAll(Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean addAll(int index, Collection<? extends T> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    default void replaceAll(UnaryOperator<T> operator)
    {
        List.super.replaceAll(operator);
    }

    @Override
    default void sort(Comparator<? super T> c)
    {
        List.super.sort(c);
    }

    @Override
    default void clear()
    {
        throw new UnsupportedOperationException();
    }

    @Override
    T get(int index);

    @Override
    T set(int index, T element);

    @Override
    void add(int index, T element);

    @Override
    T remove(int index);

    @Override
    int indexOf(Object o);

    @Override
    int lastIndexOf(Object o);

    @Override
    ListIterator<T> listIterator();

    @Override
    ListIterator<T> listIterator(int index);

    @Override
    List<T> subList(int fromIndex, int toIndex);

    @Override
    default Spliterator<T> spliterator()
    {
        return List.super.spliterator();
    }

    @Override
    default void addFirst(T t)
    {
        List.super.addFirst(t);
    }

    @Override
    default void addLast(T t)
    {
        List.super.addLast(t);
    }

    @Override
    default T getFirst()
    {
        return List.super.getFirst();
    }

    @Override
    default T getLast()
    {
        return List.super.getLast();
    }

    @Override
    default T removeFirst()
    {
        return List.super.removeFirst();
    }

    @Override
    default T removeLast()
    {
        return List.super.removeLast();
    }

    @Override
    default List<T> reversed()
    {
        return List.super.reversed();
    }

    @Override
    default <T1> T1[] toArray(IntFunction<T1[]> generator)
    {
        return List.super.toArray(generator);
    }

    @Override
    default boolean removeIf(Predicate<? super T> filter)
    {
        return List.super.removeIf(filter);
    }

    @Override
    default Stream<T> stream()
    {
        return List.super.stream();
    }

    @Override
    default Stream<T> parallelStream()
    {
        return List.super.parallelStream();
    }

    @Override
    default void forEach(Consumer<? super T> action)
    {
        List.super.forEach(action);
    }
}
