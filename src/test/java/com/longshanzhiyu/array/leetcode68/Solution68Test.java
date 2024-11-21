package com.longshanzhiyu.array.leetcode68;

import org.junit.jupiter.api.*;

import java.util.List;

public class Solution68Test {

    private Solution68 solution;

    @BeforeEach
    protected void setUp() throws Exception {
        solution = new Solution68();
    }

    @Test
    public void testCase1() {
        // Test Case 1
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        String[] expected = {"This    is    an", "example  of text", "justification.  "};

        List<String> result = solution.fullJustify(words, maxWidth);
        System.out.println(result);
        Assertions.assertArrayEquals(expected, result.toArray());
    }
}
