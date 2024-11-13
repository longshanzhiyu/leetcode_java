package com.longshanzhiyu.Array.leetcode380;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RandomizedSetTest {
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

    @Test
    public void testRemove() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.remove(3));
        assertTrue(randomizedSet.remove(2));
    }

    @Test
    public void testGetRandom() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        int randomValue = randomizedSet.getRandom();
        assertTrue(randomValue == 1 || randomValue == 2 || randomValue == 3);
    }

    @Test
    public void testInsertAndRemove() {
        assertTrue(randomizedSet.insert(1));
        assertTrue(randomizedSet.insert(2));
        assertTrue(randomizedSet.remove(1));
        assertTrue(randomizedSet.insert(3));
        assertTrue(randomizedSet.remove(2));
        assertEquals(3, randomizedSet.getRandom());
    }

    @Test
    public void testEmptySet() {
        assertFalse(randomizedSet.remove(1));
        assertEquals(-1, randomizedSet.getRandom()); // Assuming getRandom returns 0 when the set is empty
    }

    @Test
    public void testMultipleOperations() {
        assertTrue(randomizedSet.insert(1));
        assertTrue(randomizedSet.insert(2));
        assertTrue(randomizedSet.remove(1));
        assertTrue(randomizedSet.insert(3));
        assertTrue(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(4));
        assertTrue(randomizedSet.remove(3));
        assertEquals(4, randomizedSet.getRandom());
    }

    @Test
    public void testLargeSet() {
        for (int i = 0; i < 1000; i++) {
            assertTrue(randomizedSet.insert(i));
        }
        for (int i = 0; i < 1000; i++) {
            assertTrue(randomizedSet.remove(i));
        }
        assertFalse(randomizedSet.remove(0));
    }

    @Test
    public void testRandomness() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < 1000; i++) {
            int randomValue = randomizedSet.getRandom();
            if (randomValue == 1) count1++;
            if (randomValue == 2) count2++;
            if (randomValue == 3) count3++;
        }
        assertTrue(count1 > 300 && count1 < 400);
        assertTrue(count2 > 300 && count2 < 400);
        assertTrue(count3 > 300 && count3 < 400);
    }

}
