package com.longshanzhiyu.linklist.Solution21Test;

import com.longshanzhiyu.base.ListNode;
import com.longshanzhiyu.base.ListNodeUtils;
import com.longshanzhiyu.linklist.leetcode21.Solution21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution21Test {

    private Solution21 solution;

    private ListNode l1;
    private ListNode l2;

    @BeforeEach
    void setUp() {
        solution = new Solution21();
    }

    @Test
    void testCase1() {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode l1 = ListNodeUtils.createLinkedList(arr1);
        ListNode l2 = ListNodeUtils.createLinkedList(arr2);
        ListNode l3 = solution.mergeTwoLists(l1, l2);
        ListNodeUtils.printList(l3);
    }
}
