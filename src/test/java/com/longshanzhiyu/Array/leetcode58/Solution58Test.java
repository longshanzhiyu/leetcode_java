package com.longshanzhiyu.Array.leetcode58;

import org.junit.jupiter.api.*;

public class Solution58Test {

    private Solution58 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution58();
    }

    @Test
    public void testCase1() {
        String s = "Hello World";
        int expected = 5;
        Assertions.assertEquals(expected, solution.lengthOfLastWord(s));
    }

    @Test
    public void testCase2() {
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        Assertions.assertEquals(expected, solution.lengthOfLastWord(s));
    }

    @Test
    public void testCase3() {
        String s = "luffy is still joyboy";
        int expected = 6;
        Assertions.assertEquals(expected, solution.lengthOfLastWord(s));
    }
}
