package ru.sherb.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author maksim
 * @since 17.10.2019
 */
final class PermutationsWithRepetitionIterator<T> implements Iterator<List<T>> {

    private final List<T> dictionary;
    private final int size;
    private final long max;

    private long position;

    PermutationsWithRepetitionIterator(List<T> dictionary, int size) {
        this.dictionary = dictionary;
        this.size = size;
        this.max = (long) Math.pow(dictionary.size(), size);

        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < max;
    }

    @Override
    public List<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        List<T> result = new ArrayList<>();
        long k = position;
        for (int i = size - 1; i >= 0; i--) {
            double rank = Math.pow(dictionary.size(), i);
            result.add(dictionary.get((int) (k / rank)));
            k %= rank;
        }

        position++;
        return result;
    }
}
