package com.itxiaohu.algorithm.tree;

import com.itxiaohu.algorithm.tree.binary.Node;
import org.junit.Before;
import org.junit.Test;

/**
 * 二叉树遍历测试
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class BinaryTreeTraversalTest {

    private Node node1;

    /**
     * 测试数据准备
     */
    @Before
    public void before(){
        Node node8 = new Node("8", null, null);
        Node node9 = new Node("9", null, null);

        Node node4 = new Node("4", null, null);
        Node node5 = new Node("5", node8, node9);
        Node node6 = new Node("6", null, null);
        Node node7 = new Node("7", null, null);

        Node node2 = new Node("2", node4, node5);
        Node node3 = new Node("3", node6, node7);

        node1 = new Node("1", node2, node3);
    }

    /**
     * 测试递归方式前序遍历
     */
    @Test
    public void testPreOrderByRecursion() {
        BinaryTreeTraversal.preOrderByRecursion(node1);
    }

    /**
     * 测试递归方式中序遍历
     */
    @Test
    public void testInOrderByRecursion() {
        BinaryTreeTraversal.inOrderByRecursion(node1);
    }

    /**
     * 测试递归方式后序遍历
     */
    @Test
    public void testPostOrderByRecursion() {
        BinaryTreeTraversal.postOrderByRecursion(node1);
    }

    /**
     * 测试栈方式前序遍历
     */
    @Test
    public void testPreOrderByStack() {
        BinaryTreeTraversal.preOrderByStack(node1);
    }

    /**
     * 测试栈方式中序遍历
     */
    @Test
    public void testInOrderByStack() {
        BinaryTreeTraversal.inOrderByStack(node1);
    }

    /**
     * 测试栈方式后序遍历
     */
    @Test
    public void testPostOrderUByStack() {
        BinaryTreeTraversal.postOrderByStack(node1);
    }

}
