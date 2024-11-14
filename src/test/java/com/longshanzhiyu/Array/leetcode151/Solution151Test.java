package com.longshanzhiyu.Array.leetcode151;

import org.junit.jupiter.api.*;

public class Solution151Test {
    private Solution151 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution151();
    }

    @Test
    public void testCase1() {
        String s = "the sky is blue";
        String expected = "blue is sky the";
        Assertions.assertEquals(expected, solution.reverseWordsIII(s));
    }

    @Test
    public void testCase2() {
        String s = "a good   example ";
        String expected = "example good a";
        Assertions.assertEquals(expected, solution.reverseWordsIII(s));
    }

}
