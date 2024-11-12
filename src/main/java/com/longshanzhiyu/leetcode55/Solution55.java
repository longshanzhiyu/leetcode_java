package com.longshanzhiyu.leetcode55;

public class Solution55 {

    public static boolean canJump(int[] nums) {
        int n = nums.length, rigthmost = 0;
        for (int i = 0; i < n; i++) {
            if (i <= rigthmost) {
                rigthmost = Math.max(rigthmost, nums[i] + i);
                if (rigthmost >= n - 1) {
                    return true;
                }
            }
        }

        return false;
    }

    // leetcode 45
    public static int jumpSteps(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
            if (position == nums.length - 1) {
                break;
            }
        }
        return steps;
    }

    public static int jumpStepsII(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        if (end < length - 1) {
            return 0;
        }
        return steps;
    }

}
