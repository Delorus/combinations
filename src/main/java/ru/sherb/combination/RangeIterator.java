package ru.sherb.combination;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author maksim
 * @since 21.10.2019
 */
final class RangeIterator<T> implements Iterator<List<T>> {

    @FunctionalInterface
    public interface IteratorGenerator<T> {
        Iterator<List<T>> generate(int size);
    }

    private final IteratorGenerator<T> generator;
    private final int maxSize;

    private Iterator<List<T>> currentIter;
    private int currentSize;

    RangeIterator(int from, int to, IteratorGenerator<T> generator) {
        this.generator = generator;
        this.currentSize = from;
        this.maxSize = to;

        this.currentIter = generator.generate(currentSize);
    }

    @Override
    public boolean hasNext() {
        return currentIter.hasNext();
    }

    @Override
    public List<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        List<T> next = currentIter.next();
        if (!currentIter.hasNext() && currentSize < maxSize) {
            this.currentSize++;
            this.currentIter = this.generator.generate(currentSize);
        }

        return next;
    }
}
