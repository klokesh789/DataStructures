package com.bridgelabz.binarysearchtree;

public class BinaryTreeMain {
	public static void main(String[] args) {

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        System.out.println("Binary Tree is :");
        myBinaryTree.print();
    }

}
