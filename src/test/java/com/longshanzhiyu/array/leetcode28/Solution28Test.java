package com.longshanzhiyu.array.leetcode28;

import org.junit.jupiter.api.*;

public class Solution28Test {

    private Solution28 solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution28();
    }

    @Test
    public void testCase1() {
        String haystack = "sadbutsad", needle = "sad";
        int expect = 0;
        Assertions.assertEquals(expect, solution.strStrII(haystack, needle));
    }

    @Test
    public void testCase2() {
        String haystack = "leetcode", needle = "leeto";
        int expect = -1;
        Assertions.assertEquals(expect, solution.strStrII(haystack, needle));
    }

    @Test
    public void testCase3() {
        String haystack = "abaabababca", needle = "ababc";
        int expect = 5;
        Assertions.assertEquals(expect, solution.strStrII(haystack, needle));
    }
}
