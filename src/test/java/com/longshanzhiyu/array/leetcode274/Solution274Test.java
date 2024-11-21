package com.longshanzhiyu.array.leetcode274;

import org.junit.Test;

import static com.longshanzhiyu.array.leetcode274.Solution274.hIndexI;
import static org.junit.Assert.assertEquals;

public class Solution274Test {

    @Test
    public void testHIndexBasic() {
        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, hIndexI(citations));
    }

    @Test
    public void testHIndexAllSame() {
        int[] citations = {4, 4, 4, 4};
        assertEquals(4, hIndexI(citations));
    }

    @Test
    public void testHIndexSinglePaper() {
        int[] citations = {1};
        assertEquals(1, hIndexI(citations));
    }

    @Test
    public void testHIndexLargeCitations() {
        int[] citations = {100, 200, 300, 400};
        assertEquals(4, hIndexI(citations));
    }

    @Test
    public void testHIndexMixedCitations() {
        int[] citations = {1, 7, 9, 4};
        assertEquals(3, hIndexI(citations));
    }

    @Test
    public void testHIndexDescendingOrder() {
        int[] citations = {5, 4, 3, 2, 1};
        assertEquals(3, hIndexI(citations));
    }

    @Test
    public void testHIndexAscendingOrder() {
        int[] citations = {1, 2, 3, 4, 5};
        assertEquals(3, hIndexI(citations));
    }

    @Test
    public void testHIndexWithZero() {
        int[] citations = {0, 1, 3, 5, 6};
        assertEquals(3, hIndexI(citations));
    }

    @Test
    public void testHIndexWithLargeNumbers() {
        int[] citations = {1000, 2000, 3000, 4000, 5000};
        assertEquals(5, hIndexI(citations));
    }

    @Test
    public void testHIndexWithDuplicates() {
        int[] citations = {1, 1, 2, 2, 3};
        assertEquals(2, hIndexI(citations));
    }

    @Test
    public void testHIndexWithSingleZero() {
        int[] citations = {0};
        assertEquals(0, hIndexI(citations));
    }

    @Test
    public void testHIndexWithSingleNonZero() {
        int[] citations = {10};
        assertEquals(1, hIndexI(citations));
    }

    @Test
    public void testHIndexWithEmptyArray() {
        int[] citations = {};
        assertEquals(0, hIndexI(citations));
    }
}
