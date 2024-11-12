package com.longshanzhiyu.Array.leetcode380;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution380Test {

    private RandomizedSet randomizedSet;

    @BeforeEach
    public void setUp() {
        randomizedSet = new RandomizedSet();
    }

    @Test
    public void testInsert() {
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.insert(1));
        assertTrue(randomizedSet.insert(2));
    }

}
