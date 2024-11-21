package com.longshanzhiyu.array.leetcode14;

import org.junit.jupiter.api.*;

public class Solution14Test {

    private Solution14 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution14();
    }

    @Test
    public void testCase1() {
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";
        Assertions.assertEquals(expected, solution.longestCommonPrefixIV(strs));
    }

    @Test
    public void testCase2() {
        String[] strs = {"dog","racecar","car"};
        String expected = "";
        Assertions.assertEquals(expected, solution.longestCommonPrefixIV(strs));
    }

}
