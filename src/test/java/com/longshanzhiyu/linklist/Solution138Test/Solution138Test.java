package com.longshanzhiyu.linklist.Solution138Test;

import com.longshanzhiyu.base.RandomNode;
import com.longshanzhiyu.linklist.leetcode138.Solution138;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.longshanzhiyu.base.ListNodeUtils.generateLinkedList;
import static com.longshanzhiyu.base.ListNodeUtils.printLinkedList;

public class Solution138Test {

    private Solution138 solution;



    @BeforeEach
    void setUp() {
        solution = new Solution138();
    }

    @Test
    void testCase1() {
        int[][] arr1 = {
                {7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}
        };
        RandomNode head1 = generateLinkedList(arr1);
        printLinkedList(head1);

        RandomNode res1 = solution.copyRandomList(head1);
        printLinkedList(res1);

        // 测试用例 2
        int[][] arr2 = {
                {1, 1}, {2, 0}
        };
        RandomNode head2 = generateLinkedList(arr2);
        printLinkedList(head2);

        RandomNode res2 = solution.copyRandomList(head2);
        printLinkedList(res2);

        // 测试用例 3
        int[][] arr3 = {
                {3, -1}, {5, 0}, {4, 1}
        };
        RandomNode head3 = generateLinkedList(arr3);
        printLinkedList(head3);

        RandomNode res3 = solution.copyRandomList(head3);
        printLinkedList(res3);
    }


}
