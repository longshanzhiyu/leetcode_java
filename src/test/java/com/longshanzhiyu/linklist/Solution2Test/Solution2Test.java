package com.longshanzhiyu.linklist.Solution2Test;

import com.longshanzhiyu.base.ListNode;
import com.longshanzhiyu.linklist.leetcode2.Solution2;

public class Solution2Test {

    private final static Solution2 solution = new Solution2();

    public static void main(String[] args) {

        // 测试用例 1
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 7 -> 0 -> 8

        // 测试用例 2
        l1 = null;
        l2 = new ListNode(1, new ListNode(8));
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 1 -> 8

        // 测试用例 3
        l1 = new ListNode(9, new ListNode(9));
        l2 = new ListNode(1);
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 0 -> 0 -> 1

        // 测试用例 4
        l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        l2 = new ListNode(1);
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 0 -> 0 -> 0 -> 1

        // 测试用例 5
        l1 = null;
        l2 = null;
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: null

        // 测试用例 6
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 0

        // 测试用例 7
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // 预期输出: 8 -> 9 -> 9 -> 9 -> 0 -> 1
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
