
package com.company;
//this application is a homemade arraylist that is in the structure of a binary tree meaning that each node has two
//nodes underneath it, a left child node and a right child node





public class Node{


    public static void main(String[] args) {
        myNode selectedNode = new myNode(12);
        myNode selectedNode1L = new myNode(3);
        myNode selectedNode1R = new myNode(13);

        selectedNode.setLeft(selectedNode1L);
        selectedNode.setRight(selectedNode1R);

        myNode selectedNode2LL = new myNode(15);
        myNode selectedNode2LR = new myNode(23);

        selectedNode1L.setLeft(selectedNode2LL);
        selectedNode1L.setRight(selectedNode2LR);

        System.out.println(selectedNode1L.toObject());



    }
}


class myNode {


    myNode left, right;

    int num;

    public myNode(int n){
        left = null;
        right = null;
        num = n;
    }

    public myNode getLeft() {
        return left;
    }

    public void setLeft(myNode left) {
        this.left = left;
    }

    public myNode getRight() {
        return right;
    }

    public void setRight(myNode right) {
        this.right = right;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public Object toObject() {
        return this.num;
    }

}


class BST{

    Node root;

    public BST(){};

}

