package com.bridgelabz.binarysearchtree;

public class BinaryTreeMain {
	public static void main(String[] args) {

        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.searchBST(60);
        int size = myBinaryTree.getSize();
        System.out.println("Size of binary tree is: "+size);
        System.out.println("Binary Tree is :");
        myBinaryTree.print();
    }

}
