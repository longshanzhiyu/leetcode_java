package com.longshanzhiyu.Array.leetcode126;

import com.longshanzhiyu.Array.leetcode126.Solution126;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution126Test {

    @Test
    public void testMajorityElement_NormalCase1() {
        int[] nums = new int[]{3, 2, 3};
        int expected = 3;
        int result = Solution126.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElement_NormalCase3() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        int result = Solution126.majorityElement5(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElement_BoundaryCase1() {
        int[] nums = {1};
        int expected = 1;
        int result = Solution126.majorityElement5(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElement_BoundaryCase2() {
        int[] nums = {1, 1, 2, 2, 2, 1};
        int expected = 1;
        int result = Solution126.majorityElement2(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElement_BoundaryCase3() {
        int[] nums = {1, 2, 3, 3, 3, 3, 2, 1};
        int expected = 3;
        int result = Solution126.majorityElement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMajorityElement_ExceptionCase() {
        int[] nums = {};
        int expected = -1;
        int result = Solution126.majorityElement3(nums);
        assertEquals(expected, result);
    }
}
