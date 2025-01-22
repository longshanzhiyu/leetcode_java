package com.longshanzhiyu.linklist.leetcode138;

import com.longshanzhiyu.base.RandomNode;

import java.util.HashMap;
import java.util.Map;

public class Solution138 {
    Map<RandomNode, RandomNode> cacheNode = new HashMap<RandomNode, RandomNode>();


    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return null;
        }

        if (!cacheNode.containsKey(head)) {
            RandomNode headNew = new RandomNode(head.val);
            cacheNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cacheNode.get(head);
    }

}
