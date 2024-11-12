package com.longshanzhiyu.Array.leetcode55;

import com.longshanzhiyu.Array.leetcode55.Solution55;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution55Test {

    @Test
    public void testCanJumpToEnd() {
        assertTrue(Solution55.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void testCannotJumpToEnd() {
        assertFalse(Solution55.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void testSingleElementArray() {
        assertTrue(Solution55.canJump(new int[]{0}));
    }

    @Test
    public void testAllZeros() {
        assertFalse(Solution55.canJump(new int[]{0, 0, 0, 0}));
    }


    // leetcode 45
    @Test
    public void testCanJumpToEndFor45() {
        assertEquals(2, Solution55.jumpStepsII(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void testCannotJumpToEndFor45() {
        assertEquals(0, Solution55.jumpStepsII(new int[]{3, 2, 1, 0, 4}));
    }
}
