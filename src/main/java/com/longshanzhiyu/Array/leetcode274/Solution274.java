package com.longshanzhiyu.Array.leetcode274;

import java.util.Arrays;

public class Solution274 {

    public static int hIndexI(int[] citations) {
        Arrays.sort(citations);
        int h = 0, i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h ++;
            i --;
        }
        return h;
    }

}
