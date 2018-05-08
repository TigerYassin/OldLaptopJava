package com.company;

/*

OBJECTIVE:
to gain experience with binary search trees and gain exprience with building my own arraylist

1. Generate 100 random integer numbers ranging from 1 – 99.
2. Store these numbers in a data structure of your choice and display the data on the screen. DO NOT SORT THIS DATA STRUCTURE.
3. Now build a Binary Search Tree using this set of numbers. You MUST insert the values into the tree starting from the first element of your Data Structure and go sequentially.
4. After building the tree, use an infix recursive method to display the data on the screen.
5. To build the Binary Search Tree, you must create your own Linked List.

Data structer used in this application: the array datastructer. I also created my own Binary search tree for the sorting


 */

import java.util.Arrays;
import java.util.Random;

public class Main {

    //Set the random variable object
    static Random myRand = new Random();

    public static void main(String[] args) {

        int[] myInt = new int[100];
        //STEP 1 & 2        creating an array and populating it with the 100 random values
        for (int x = 0; x < myInt.length; x++) {
            myInt[x] = myRand.nextInt(99) + 1;
        }
        System.out.println(Arrays.toString(myInt));


        //STEP 3    Building my own binary search tree and using it to sort the array sequentially
        Node head = new Node(myInt[0]);


        for (int x = 1; x < myInt.length; x++){ //inserting numbers from array to the binary search tree
            head.insert(myInt[x]);
        }

        //STEP 4    Calling the infix recursive method to print the values from least to greatest
        head.printTree();



    }

}


/*
this class handles creating the binary search and adding new values to it
 */
    class Node{

        //initializing variables.
        //LeftNode and rightNode are objects from the class that it is in and are intially set to null
        int value;
        Node leftNode;
        Node rightNode;


        /*
        @params: int newVal
        @return: null

        inserts new nodes to the binary search tree with smaller values on the left and all other values on the right
        recursive method
         */
        protected void insert(int newVal){

            if (newVal < this.value){
                if (leftNode == null){
                    leftNode = new Node(newVal);
                }
                else {
                    leftNode.insert(newVal);
                }
            }
            else {
                if (rightNode == null){
                    rightNode = new Node(newVal);
                }
                else {
                    rightNode.insert(newVal);
                }
            }

        }


        //prints the values in the tree recursively starting following the inOrder structure: leftNode Parent rightNode
        protected void printTree(){
            if (this.leftNode != null){
                leftNode.printTree();
            }
            System.out.println(value);

            if (this.rightNode != null){
                rightNode.printTree();
            }
        }

        @Override
        public String toString(){
            return(String.valueOf(this.value));
        }


        //Constructor
        protected Node(int value){
            this.value = value;
        }
    }

