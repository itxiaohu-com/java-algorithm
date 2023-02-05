package com.itxiaohu.algorithm.tree.binary;

/**
 * 二叉树
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class Node {

    public Node(Object data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // 数据
    private Object data;
    // 左子节点
    private Node left;
    // 右子节点
    private Node right;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{data=" + data + "}";
    }

}
