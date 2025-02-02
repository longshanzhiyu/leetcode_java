package com.longshanzhiyu.tree.leetcode105;

import com.longshanzhiyu.base.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution105 {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int preLen = preorder.length;
        int inLen = inorder.length;
        if (preLen != inLen) {
            return null;
        }

        // 构造哈希映射，帮助我们快速定位根节点
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < inLen; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, 0, preLen - 1, indexMap, 0, inLen - 1);
    }

    private TreeNode myBuildTree(int[] preorder, int preLeft, int preRight,
                                 Map<Integer, Integer> map, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }

        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int pIndex = map.get(rootVal);
        root.left = myBuildTree(preorder, preLeft + 1, pIndex - inLeft + preLeft, map, inLeft, pIndex -1);
        root.right = myBuildTree(preorder, pIndex - inLeft + preLeft + 1, preRight, map, pIndex + 1, inRight);
        return root;
    }
}
