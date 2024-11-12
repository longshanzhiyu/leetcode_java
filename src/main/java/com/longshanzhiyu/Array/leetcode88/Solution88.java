package com.longshanzhiyu.Array.leetcode88;

import java.util.Arrays;

public class Solution88 {

    public static void main(String[] args) {
//        int[] nums1 = {1};
//        int m = 1;
//        int[] nums2 = {};
//        int n = 0;
//
//        int[] expected = {1};
//        int[] result = merge1(nums1, m, nums2, n);
//        System.out.println(result.toString());

        int[] nums1 = {4, 5, 6, 0};
        int m = 4;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        int[] result = merge1(nums1, m, nums2, n);
        System.out.println(Arrays.toString(result));
    }

    // 方法一：直接合并后排序
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i !=n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

        return nums1;
    }

    // 方法二：双指针
    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            }
            else if (p2 == n) {
                cur = nums1[p1++];
            }
            else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            }
            else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }

        return sorted;
    }

}
