package com.longshanzhiyu.array.leetcode26;

import org.junit.Test;

import java.util.Arrays;

import static com.longshanzhiyu.array.leetcode26.Solution26.removeDuplicates;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Solution26Test {

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedLength = 5;
        int[] expectedNums = {0, 1, 2, 3, 4};

        int resultLength = removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, resultLength));
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        int[] expectedNums = {1, 2, 3, 4, 5};

        int resultLength = Solution26.removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, resultLength));
    }

    @Test
    public void testRemoveDuplicatesWithAllDuplicates() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedLength = 1;
        int[] expectedNums = {1};

        int resultLength = removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, resultLength));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyArray() {
        int[] nums = {};
        int expectedLength = 0;
        int[] expectedNums = {};

        int resultLength = removeDuplicates(nums);

        assertEquals(expectedLength, resultLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, resultLength));
    }

    // leetcode 27 的测试用例
    @Test
    public void testRemoveDuplicatesWithTwoDuplicates() {
        int[] nums = {1, 1};
        int expectedLength = 2;
        int[] expectedNums = {1, 1};

        int resultLength = Solution26.removeDuplicates2(nums);

        assertEquals(expectedLength, resultLength);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, resultLength));
    }
}
