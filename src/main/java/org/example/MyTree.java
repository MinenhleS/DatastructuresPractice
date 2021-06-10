package org.example;

public class MyTree {
    private MyTreeNode root;

    public MyTree(){
        root = null;
    }

    public void insert(int value){
        root =insert(root,value);
    }
    public MyTreeNode insert(MyTreeNode root, int value){
        if(root == null){
            root= new MyTreeNode();
            root.setData(value);
            root.setLeft(null);
            root.setRight(null);
        }else if(value < root.getData()){
            MyTreeNode leftSubTree = insert(root.getLeft(),value);
            root.setLeft(leftSubTree);
        } else if(value > root.getData()){
            MyTreeNode rightSubTree = insert(root.getRight(),value);
            root.setRight(rightSubTree);
        }

        return root;
    }
    public void delete(int value){
        root  = delete(root, value);
    }

    private MyTreeNode delete(MyTreeNode t, int value){
        if (t == null){
            return t;
        }else if (value < t.getData()){
            t.setLeft(delete(t.getLeft(),value));
        }else if(t.getData() > value){
            t.setRight(delete(t.getRight(), value));
        }
        return t;
    }
    public void find(int value){
        ;
    }
    public void preorder(){
        ;
    }
    public void inorder(){
        inorder(root);

    }
    //Print using LNR
    public void inorder(MyTreeNode root){
        if(root!= null) {
            inorder(root.getLeft());                //l
            System.out.println(root.getData());     //n
            inorder(root.getRight());               //r
        }
    }
    public void postorder(){
        ;
    }




}
