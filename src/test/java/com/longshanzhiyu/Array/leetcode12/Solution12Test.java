package com.longshanzhiyu.Array.leetcode12;

import org.junit.jupiter.api.*;

public class Solution12Test {

    private Solution12 solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution12();
    }

    @Test
    public void testCase1() {
        int num = 3749;
        String expected = "MMMDCCXLIX";
        Assertions.assertEquals(expected, solution.intToRomanII(num));
    }

    @Test
    public void testCase2() {
        int num = 58;
        String expected = "LVIII";
        Assertions.assertEquals(expected, solution.intToRomanI(num));
    }

    @Test
    public void testCase3() {
        int num = 1994;
        String expected = "MCMXCIV";
        Assertions.assertEquals(expected, solution.intToRomanII(num));
    }

}
