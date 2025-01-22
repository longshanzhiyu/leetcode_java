package com.longshanzhiyu.base;

import java.util.HashMap;
import java.util.Map;

public class ListNodeUtils {

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // 创建头节点
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        // 遍历数组其余元素，创建链表节点
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static RandomNode generateLinkedList(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // 用于存储节点和索引的映射关系
        Map<Integer, RandomNode> nodeMap = new HashMap<>();

        // 第一次遍历：创建所有节点，并存储到 nodeMap 中
        for (int i = 0; i < arr.length; i++) {
            nodeMap.put(i, new RandomNode(arr[i][0]));
        }

        // 第二次遍历：设置 next 和 random 指针
        for (int i = 0; i < arr.length; i++) {
            RandomNode currentNode = nodeMap.get(i);

            // 设置 next 指针
            if (i < arr.length - 1) {
                currentNode.next = nodeMap.get(i + 1);
            }

            // 设置 random 指针
            int randomIndex = arr[i][1];
            if (randomIndex != -1) { // 假设 -1 表示 random 为 null
                currentNode.random = nodeMap.get(randomIndex);
            }
        }

        // 返回链表的头节点
        return nodeMap.get(0);
    }

    public static void printLinkedList(RandomNode head) {
        RandomNode current = head;
        while (current != null) {
            System.out.print("[" + current.val + ", ");
            if (current.random != null) {
                System.out.print(current.random.val);
            } else {
                System.out.print("null");
            }
            System.out.print("] -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
