package ru.sherb.combination;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author maksim
 * @since 17.10.2019
 */
final class PermutationsWithRepetitionIterator<T> implements Iterator<List<T>> {

    private final Iterable<T> dictionary;
    private final int size;

    private List<T> lastCombination;
    private List<Iterator<T>> iterators;
    private int position;

    public PermutationsWithRepetitionIterator(Iterable<T> dictionary, int size) {
        this.dictionary = dictionary;
        this.size = size;

        this.iterators = new ArrayList<>(size);
        this.lastCombination = new ArrayList<>(size);

        this.position = 0;

        while (lastCombination.size() != size) {
            Iterator<T> iter = dictionary.iterator();
            iterators.add(iter);
            lastCombination.add(iter.next());
        }
        position = lastCombination.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position != size - 1 || iterators.stream().anyMatch(Iterator::hasNext);
    }

    private boolean first = true;

    @Override
    public List<T> next() {
        if (first) {
            first = false;
            return lastCombination;
        }

        if (position != size - 1) {
            shiftToSize();
            return lastCombination;
        }

        Iterator<T> iter = iterators.get(position);
        while (!iter.hasNext()) {
            Iterator<T> newIter = dictionary.iterator();
            lastCombination.set(position, newIter.next());
            iterators.set(position, newIter);

            position--;
            iter = iterators.get(position);
        }

        lastCombination.set(position, iter.next());

        return List.copyOf(lastCombination);
    }

    private void shiftToSize() {
        position++;
        for (; position < size - 1; position++) {
            Iterator<T> iter = dictionary.iterator();
            iterators.set(position, iter);
            lastCombination.set(position, iter.next());
        }
        lastCombination.set(position, iterators.get(position).next());
    }

}
