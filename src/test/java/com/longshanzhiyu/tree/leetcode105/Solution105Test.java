package com.longshanzhiyu.tree.leetcode105;

import com.longshanzhiyu.base.TreeNode;
import com.longshanzhiyu.base.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution105Test {

    private Solution105 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution105();
    }

    @Test
    void testCase1() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode res = solution.buildTree(preorder, inorder);
        TreeUtils.preOrder(res);
        System.out.println("\n");
        TreeUtils.inOrder(res);
        System.out.println("\n");
        TreeUtils.postOrder(res);
    }
}
