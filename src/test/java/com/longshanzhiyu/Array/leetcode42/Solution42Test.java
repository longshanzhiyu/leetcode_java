package com.longshanzhiyu.Array.leetcode42;

import org.junit.jupiter.api.*;

public class Solution42Test {

    private static Solution42 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution42();
    }

    @Test
    public void testCase1() {
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,5};
        int expected = 9;
        Assertions.assertEquals(expected, solution.trapIII(heights));
    }

    @Test
    public void testCase2() {
        int[] heights = new int[]{4,2,0,3,2,5};
        int expected = 9;
        Assertions.assertEquals(expected, solution.trapIII(heights));
    }
}
