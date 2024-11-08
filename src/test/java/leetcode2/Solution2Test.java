package leetcode2;

import com.longshanzhiyu.leetcode2.ListNode;
import com.longshanzhiyu.leetcode2.Solution2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Solution2Test {

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode expected = Solution2.addTwoNumbers(l1, l2);

        assertEquals(7, expected.val);
        assertEquals(0, expected.next.val);
        assertEquals(1, expected.next.next.val);
        assertEquals(1, expected.next.next.next.val);
        assertNull(expected.next.next.next.next);
    }

    @Test
    public void testAddTwoNumbersWithDifferentLengths() {
        // 创建链表 l1: 1 -> 8
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);

        // 创建链表 l2: 0
        ListNode l2 = new ListNode(0);

        // 计算结果
        ListNode result = Solution2.addTwoNumbers(l1, l2);

        // 验证结果链表: 1 -> 8
        assertEquals(1, result.val);
        assertEquals(8, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    public void addTwoNumbers2() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode expected = Solution2.addTwoNumbersByReverse(l1, l2);

        assertEquals(7, expected.val);
        assertEquals(0, expected.next.val);
        assertEquals(1, expected.next.next.val);
        assertEquals(1, expected.next.next.next.val);
        assertNull(expected.next.next.next.next);
    }
}
