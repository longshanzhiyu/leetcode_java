package com.longshanzhiyu.Array.leetcode134;

import org.junit.jupiter.api.*;

public class Solution134Test {

    private Solution134 solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution134();
    }

    @Test
    public void testCanReturn() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        Assertions.assertEquals(3, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanNotReturn() {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        Assertions.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }
}
