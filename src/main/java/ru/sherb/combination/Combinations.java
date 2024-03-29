package ru.sherb.combination;

import java.util.Iterator;
import java.util.List;

/**
 * @author maksim
 * @since 17.10.2019
 */
public class Combinations {
    private Combinations() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static <T> Iterator<List<T>> newPermutationsIterator(List<T> dictionary, int size) {
        return new PermutationsWithRepetitionIterator<>(dictionary, size);
    }

    public static <T> Iterator<List<T>> newPermutationsIteratorInRange(List<T> dictionary, int from, int to) {
        return new RangeIterator<>(from, to, size ->
                new PermutationsWithRepetitionIterator<>(dictionary, size));
    }
}
