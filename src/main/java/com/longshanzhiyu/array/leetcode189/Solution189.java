package com.longshanzhiyu.array.leetcode189;

public class Solution189 {

    // 方法一
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[(i + k) % n] = nums[i];
        }

        System.arraycopy(newArr, 0, nums, 0, n);
        return nums;
    }

    // 方法二
    public static int[] rotate2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int n = nums.length;
        k = k % n;
        int count = gcd(k, n);
        for (int start = 0; start < count; ++start) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
            } while (start != current);
        }
        return nums;
    }

    private static int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

}
