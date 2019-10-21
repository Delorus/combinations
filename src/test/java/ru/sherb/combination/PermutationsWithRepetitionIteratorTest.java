package ru.sherb.combination;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author maksim
 * @since 17.10.2019
 */
public class PermutationsWithRepetitionIteratorTest {

    @Test
    public void returnInitialValueFromDic() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 1, 1, 1), actual);
    }

    @Test
    public void next() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 1, 1, 2), actual);
    }

    @Test
    public void next2() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 1, 2, 1), actual);
    }

    @Test
    public void next3() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 1, 2, 2), actual);
    }

    @Test
    public void next4() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 2, 1, 1), actual);
    }

    @Test
    public void next5() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 2, 1, 2), actual);
    }

    @Test
    public void next6() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 2, 2, 1), actual);
    }

    @Test
    public void next7() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(1, 2, 2, 2), actual);
    }

    @Test
    public void next8() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 1, 1, 1), actual);
    }

    @Test
    public void next9() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 1, 1, 2), actual);
    }

    @Test
    public void next10() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 1, 2, 1), actual);
    }

    @Test
    public void next11() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 1, 2, 2), actual);
    }

    @Test
    public void next12() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 2, 1, 1), actual);
    }

    @Test
    public void next13() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 2, 1, 2), actual);
    }

    @Test
    public void next14() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 2, 2, 1), actual);
    }

    @Test
    public void next15() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        List<Integer> actual = iterator.next();

        assertEquals(Arrays.asList(2, 2, 2, 2), actual);
    }

    @Test
    public void stopAfterFullCombinations() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        boolean hasNext = iterator.hasNext();

        assertFalse(hasNext);
    }

    @Test
    public void checkContract() {
        Iterator<List<Integer>> iterator = new PermutationsWithRepetitionIterator<>(Arrays.asList(1, 2), 3);

        List<Integer> next = Collections.emptyList();
        while (iterator.hasNext()) {
            next = iterator.next();
        }

        assertEquals(Arrays.asList(2, 2, 2), next);
    }
}