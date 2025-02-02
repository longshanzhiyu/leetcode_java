package com.longshanzhiyu.base;

public class TreeUtils {

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); // 访问根节点
        preOrder(root.left); // 递归遍历左子树
        preOrder(root.right); // 递归遍历右子树
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left); // 递归遍历左子树
        System.out.print(root.val + " "); // 访问根节点
        inOrder(root.right); // 递归遍历右子树
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left); // 递归遍历左子树
        postOrder(root.right); // 递归遍历右子树
        System.out.print(root.val + " "); // 访问根节点
    }
}
