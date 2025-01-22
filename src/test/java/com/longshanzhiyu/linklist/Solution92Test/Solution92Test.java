package com.longshanzhiyu.linklist.Solution92Test;

import com.longshanzhiyu.base.ListNode;
import com.longshanzhiyu.base.ListNodeUtils;
import com.longshanzhiyu.linklist.leetcode92.Solution92;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution92Test {

    private Solution92 solution;



    @BeforeEach
    void setUp() {
        solution = new Solution92();
    }

    @Test
    void testCase1() {
        int[] arr1 = {1, 2, 3, 4, 5};
        ListNode l1 = ListNodeUtils.createLinkedList(arr1);
        ListNodeUtils.printList(l1);

        ListNode res1 = solution.reverseBetween(l1, 2, 4);
        ListNodeUtils.printList(res1);
    }

}
