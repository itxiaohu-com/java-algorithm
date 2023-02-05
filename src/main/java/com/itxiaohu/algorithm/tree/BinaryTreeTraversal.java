package com.itxiaohu.algorithm.tree;

import com.itxiaohu.algorithm.tree.binary.Node;

import java.util.Stack;

/**
 * 二叉树遍历
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class BinaryTreeTraversal {

    /**
     * 递归方式前序遍历
     */
    public static void preOrderByRecursion(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node);
        preOrderByRecursion(node.getLeft());
        preOrderByRecursion(node.getRight());
    }

    /**
     * 递归方式中序遍历
     */
    public static void inOrderByRecursion(Node node) {
        if(node == null) {
            return;
        }
        inOrderByRecursion(node.getLeft());
        System.out.println(node);
        inOrderByRecursion(node.getRight());
    }

    /**
     * 递归方式后序遍历
     */
    public static void postOrderByRecursion(Node node) {
        if(node == null) {
            return;
        }
        postOrderByRecursion(node.getLeft());
        postOrderByRecursion(node.getRight());
        System.out.println(node);
    }

    /**
     * 栈方式前序遍历
     */
    public static void preOrderByStack(Node head) {
        if(head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);

        while(!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node);
            if(node.getRight() != null) {
                stack.push(node.getRight());
            }
            if(node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    /**
     * 栈方式中序遍历
     */
    public static void inOrderByStack(Node head) {
        if(head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();

        Node node = head;

        while (!stack.isEmpty() || node != null) {
            if(node != null) {
                stack.push(node);
                node = node.getLeft();
            }else {
                node = stack.pop();
                System.out.println(node);
                node = node.getRight();
            }
        }

    }

    /**
     * 栈方式后序遍历
     */
    public static void postOrderByStack(Node head) {
        if(head == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(head);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if(node.getLeft() != null) {
                stack1.push(node.getLeft());
            }

            if(node.getRight() != null) {
                stack1.push(node.getRight());
            }
        }

        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }

}
