package com.longshanzhiyu.linklist.Solution141Test;

import com.longshanzhiyu.base.ListNode;
import com.longshanzhiyu.linklist.leetcode141.Solution141;
import org.junit.jupiter.api.*;

public class Solution141Test {

    private Solution141 solution;

    private ListNode head;
    private ListNode tail;

    @BeforeEach
    void setUp() {
        solution = new Solution141();
    }

    @Test
    void testCase1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Cycle from 4 to 2
        Assertions.assertTrue(solution.hasCycleII(head));
    }

}
