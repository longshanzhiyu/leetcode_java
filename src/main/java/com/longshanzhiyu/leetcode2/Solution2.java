package com.longshanzhiyu.leetcode2;

public class Solution2 {
    public static void main(String[] args) {

        int[] nums1 = {3, 0, 5};
        int[] nums2 = {7, 9, 2, 1};

        ListNode l1 = buildList(nums1);
        ListNode l2 = buildList(nums2);

        ListNode l3 = addTwoNumbers(l1, l2);
        printList(l3);

        ListNode l4 = addTwoNumbersByReverse(l1, l2);
        printList(l3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            if (head == null) {
                head = tail = new ListNode(carry % 10);
            }
            else {
                tail.next = new ListNode(carry % 10);
                tail = tail.next;
            }
            carry /= 10;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head;
    }

    public static ListNode buildList(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode head = new ListNode(nums[0]);
        ListNode tail = head;
        for (int i = 1; i < nums.length; i++) {
            tail.next = new ListNode(nums[i]);
            tail = tail.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode addTwoNumbersByReverse(ListNode l1, ListNode l2) {
        //是否进位
        int t = 0;
        return add(l1, l2, t);
    }

    public static ListNode add(ListNode l1, ListNode l2, int t) {
        if (l1 == null && l2 == null){
//            if (t != 0){
//                //算到最后一位发生了进位
//                return new ListNode(t);
//            }
//            return null;

            return t != 0 ? new ListNode(t) : null;
        }

        int count = t;
        count += (l1 != null) ? l1.val : 0;
//        if (l1 != null){
//            count += l1.val;
//        }

        count += (l2 != null) ? l2.val : 0;
//        if (l2 != null){
//            count += l2.val;
//        }

//        if (count == 10){
//            t = 1;
//            count = 0;
//        } else if (count > 10){
//            t = 1;
//            count = count - 10;
//        }else {
//            t = 0;
//        }

        t = count / 10;
        count = count % 10;

        ListNode newNode = new ListNode(count);
        //递归调用
        newNode.next = add(l1 == null ? null : l1.next, l2 == null ? null : l2.next, t);
        return newNode;
    }
}
