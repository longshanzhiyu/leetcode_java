package com.longshanzhiyu.Array.leetcode126;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution126 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
        int result = majorityElement4(nums);
        System.out.println(result);
    }

    // 方法五
    public static int majorityElement5(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate == null ? -1 : candidate;
    }


    // 方法四

    public static int majorityElement4(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    // 方法三
    public static int majorityElement3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Random random = new Random();

        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(random, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    private static int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private static int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                count ++;
            }
        }
        return count;
    }

    // 方法二
    public static int majorityElement2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        return nums.length % 2 == 0 ? nums[nums.length / 2 - 1] : nums[nums.length / 2];
    }

    // 方法一
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        if (majorityEntry == null) {
            return -1;
        }
        return majorityEntry.getKey();
    }

    private static Map<Integer, Integer> countNums(int[] nums)  {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
    }
}
