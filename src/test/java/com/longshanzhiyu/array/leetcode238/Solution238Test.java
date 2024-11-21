package com.longshanzhiyu.array.leetcode238;

import org.junit.Test;

import static com.longshanzhiyu.array.leetcode238.Solution238.productExceptSelfI;
import static com.longshanzhiyu.array.leetcode238.Solution238.productExceptSelfII;
import static org.junit.Assert.assertArrayEquals;

public class Solution238Test {

    @Test
    public void testProductExceptSelfBasic() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productExceptSelfI(nums));
    }

    @Test
    public void testProductExceptSelfWithZero() {
        int[] nums = {1, 0, 3, 4};
        int[] expected = {0, 12, 0, 0};
        assertArrayEquals(expected, productExceptSelfII(nums));
    }
}
