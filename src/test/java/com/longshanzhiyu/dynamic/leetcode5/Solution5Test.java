package com.longshanzhiyu.dynamic.leetcode5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution5Test {

    private Solution5 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution5();
    }

    @Test
    void testCase1() {
        String s = "babad";
        String expected = "bab";
        Assertions.assertEquals(expected, solution.longestPalindrome(s));
    }
}
