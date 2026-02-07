/**
 * Homework#1 W1 D2 – Unit Tests
 * Tests for MergeSortedArrays
 */

import static org.junit.Assert.*;
import org.junit.Test;

public class MergeSortedArraysTest {

    @Test
    public void testNormalMerge() {
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = MergeSortedArrays.merge(A, B);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEmptyArrayCase() {
        int[] A = {};
        int[] B = {1, 2, 3};

        int[] expected = {1, 2, 3};
        int[] actual = MergeSortedArrays.merge(A, B);

        assertArrayEquals(expected, actual);
    }
}
