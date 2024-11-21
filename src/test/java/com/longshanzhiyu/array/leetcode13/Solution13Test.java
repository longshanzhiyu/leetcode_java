package com.longshanzhiyu.array.leetcode13;

import org.junit.jupiter.api.*;

public class Solution13Test {

    private Solution13 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution13();
    }

    @Test
    public void testCase1() {
        String s = "III";
        int expected = 3;
        Assertions.assertEquals(expected, solution.romanToInt(s));
    }

    @Test
    public void testCase2() {
        String s = "IV";
        int expected = 4;
        Assertions.assertEquals(expected, solution.romanToInt(s));
    }

}
