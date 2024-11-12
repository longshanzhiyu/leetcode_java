package com.longshanzhiyu.Array.leetcode189;

import com.longshanzhiyu.Array.leetcode189.Solution189;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution189Test {

    @Test
    public void testRotate_case_1() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        int[] result = Solution189.rotate(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_2() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 5;
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_3() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 7;
        int[] expected = {4, 5, 1, 2, 3};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_4() {
        int[] nums = new int[]{};
        int k = 3;
        int[] expected = {};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_5() {
        int[] nums = new int[]{1};
        int k = 0;
        int[] expected = {1};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_6() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int k = 0;
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_7() {
        int[] nums = new int[]{-1, -100, 3, 9};
        int k = 2;
        int[] expected = {3, 9, -1, -100};
        int[] result = Solution189.rotate2(nums, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testRotate_case_8() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i + 1;
        }
        int k = 9999;
        int[] expected = new int[10000];
        expected[0] = 2;
        expected[9999] = 1;
        for (int i = 1; i < 9999; i++) {
            expected[i] = i + 2;
        }
        assertArrayEquals(expected, Solution189.rotate2(nums, k));
    }
}
