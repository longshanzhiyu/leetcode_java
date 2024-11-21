package com.longshanzhiyu.array.leetcode135;

import org.junit.jupiter.api.*;

public class Solution135Test {

    private Solution135 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution135();
    }

    @Test
    public void testCase1() {
        int[] rating = {1, 0, 2};
        int expected = 5;
        Assertions.assertEquals(expected, solution.candyII(rating));
    }

    @Test
    public void testCase2() {
        int[] rating = {1, 2, 2};
        int expected = 4;
        Assertions.assertEquals(expected, solution.candyII(rating));
    }

    @Test
    public void testCase3() {
        int[] rating = {5, 4, 3, 1, 2};
        int expected = 12;
        Assertions.assertEquals(expected, solution.candyII(rating));
    }

    @Test
    public void testCase4() {
        int[] rating = {3, 3, 3, 3, 3};
        int expected = 5;
        Assertions.assertEquals(expected, solution.candyII(rating));
    }

}
