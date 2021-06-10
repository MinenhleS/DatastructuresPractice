package org.example;

public class MyTreeNode {
    private int data;
    private MyTreeNode left;
    private MyTreeNode right;

    public void setData(int value) {
        data = value;
    }

    public void setLeft(MyTreeNode l) {
        left = l;
    }

    public void setRight(MyTreeNode r) {
        right = r;
    }

    public int getData() {
        return data;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public MyTreeNode getRight() {
        return right;
    }
}
