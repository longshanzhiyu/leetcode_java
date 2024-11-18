package com.longshanzhiyu.Array.leetcode150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution150Test {

    private Solution150 solution;
    private String[] inputs;
    private int[] numRows;
    private String[] expectedOutputs;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution150();
        inputs = new String[]{
                "PAYPALISHIRING",
                "PAYPALISHIRING",
                "PAYPALISHIRING",
                "",
                "A",
                "PAYPALISHIRING",
                "PAYPALISHIRING",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        };
        numRows = new int[]{3, 1, 20, 3, 1, 2, 4, 5};
        expectedOutputs = new String[]{
                "PAHNAPLSIIGYIR",
                "PAYPALISHIRING",
                "PAYPALISHIRING",
                "",
                "A",
                "PYAIHRNAPLSIIG",
                "PINALSIGYAHRPI",
                "AIQYBHJPRXZCGKOSWDFLNTVEMU"
        };
    }

    @Test
    public void test() {
        for (int i = 0; i < inputs.length; i++) {
            String result = solution.convertII(inputs[i], numRows[i]);
            if (result.equals(expectedOutputs[i])) {
                System.out.println("Test case " + (i + 1) + " passed!");
            } else {
                System.out.println("Test case " + (i + 1) + " failed. Expected: " + expectedOutputs[i] + ", but got: " + result);
            }
        }
    }
}
