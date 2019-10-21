package ru.sherb.combination;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author maksim
 * @since 21.10.2019
 */
public class RangeIteratorTest {

    @Test
    public void iterateWithRange() {
        Iterator<List<Integer>> iterator = Combinations.newPermutationsIteratorInRange(asList(0, 1), 2, 3);
        List<List<Integer>> expected = asList(
                asList(0, 0),
                asList(0, 1),
                asList(1, 0),
                asList(1, 1),
                asList(0, 0, 0),
                asList(0, 0, 1),
                asList(0, 1, 0),
                asList(0, 1, 1),
                asList(1, 0, 0),
                asList(1, 0, 1),
                asList(1, 1, 0),
                asList(1, 1, 1)
        );

        List<List<Integer>> actual = new ArrayList<>();
        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }

        assertEquals(expected, actual);
    }
}