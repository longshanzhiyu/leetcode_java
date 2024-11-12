package com.longshanzhiyu.Array.leetcode121;

import com.longshanzhiyu.Array.leetcode121.Solution121;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution121Test {

    @Test
    public void testEmptyArray() {
        int[] prices = new int[]{};
        assertEquals(0, Solution121.maxProfit2(prices));
    }

    @Test
    public void testOneElementArray() {
        int[] prices = new int[]{1};
        assertEquals(0, Solution121.maxProfit2(prices));
    }

    @Test
    public void testFluctuatingPrices() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, Solution121.maxProfit2(prices));
    }

    // 122
    @Test
    public void testFluctuatingPrices2() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, Solution121.advanceMaxProfitIII(prices));
    }

    @Test
    public void testFluctuatingPrices3() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, Solution121.advanceMaxProfitIII(prices));
    }

    @Test
    public void testFluctuatingPrices4() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, Solution121.advanceMaxProfitIII(prices));
    }

}
