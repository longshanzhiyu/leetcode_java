package com.longshanzhiyu.Array.leetcode88;

import com.longshanzhiyu.Array.leetcode88.Solution88;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution88Test {

    @Test
    public void testMerge() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int m = 3, n = 3;

        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] res = Solution88.merge1(num1, m, num2, n);

        assertArrayEquals(expected, res);
    }

    @Test
    public void testMergeWithEmptyNums2() {
        int[] num1 = {1};
        int[] num2 = {};
        int m = 1, n = 0;

        int[] expected = {1};
        int[] res = Solution88.merge1(num1, m, num2, n);

        assertArrayEquals(expected, res);
    }

    @Test
    public void testMergeWithEmptyNums1() {
        int[] num1 = {0, 0, 0};
        int[] num2 = {1, 2, 3};
        int m = 0, n = 3;
        int[] expected = {1, 2, 3};
        int[] res = Solution88.merge1(num1, m, num2, n);
        assertArrayEquals(expected, res);
    }

    @Test
    public void testMergeWithDifferentLengths() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        System.out.println(nums1.length);
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = Solution88.merge(nums1, m, nums2, n);

        assertArrayEquals(expected, result);
    }
}
