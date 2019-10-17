package ru.sherb.combination;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author maksim
 * @since 17.10.2019
 */
public class PermutationsWithRepetitionIteratorTest {

    @Test
    public void returnInitialValueFromDic() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        var actual = iterator.next();

        assertEquals(List.of(1, 1, 1, 1), actual);
    }

    @Test
    public void next() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 1, 1, 2), actual);
    }

    @Test
    public void next2() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 1, 2, 1), actual);
    }

    @Test
    public void next3() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 1, 2, 2), actual);
    }

    @Test
    public void next4() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 2, 1, 1), actual);
    }

    @Test
    public void next5() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 2, 1, 2), actual);
    }

    @Test
    public void next6() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 2, 2, 1), actual);
    }

    @Test
    public void next7() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(1, 2, 2, 2), actual);
    }

    @Test
    public void next8() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(2, 1, 1, 1), actual);
    }

    @Test
    public void next9() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        var actual = iterator.next();

        assertEquals(List.of(2, 1, 1, 2), actual);
    }

    @Test
    public void next10() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 1, 2, 1), actual);
    }

    @Test
    public void next11() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 1, 2, 2), actual);
    }

    @Test
    public void next12() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 2, 1, 1), actual);
    }

    @Test
    public void next13() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 2, 1, 2), actual);
    }

    @Test
    public void next14() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 2, 2, 1), actual);
    }

    @Test
    public void next15() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var actual = iterator.next();

        assertEquals(List.of(2, 2, 2, 2), actual);
    }

    @Test
    public void stopAfterFullCombinations() {
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 4);

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
        var iterator = new PermutationsWithRepetitionIterator<>(List.of(1, 2), 3);

        List<Integer> next = Collections.emptyList();
        while (iterator.hasNext()) {
            next = iterator.next();
        }

        assertEquals(List.of(2, 2, 2), next);
    }
}