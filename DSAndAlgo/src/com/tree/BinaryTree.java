package com.tree;

import java.util.Stack;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root; 
    void preorder() 
    {
    	Stack<Node> s = new Stack<Node>();
		while (true) {
			// First print the root node and then add left node
			while (root != null) {
				System.out.print(root.data + " ");
				s.push(root);
				System.out.println("stack Size: "+s.size());
				root = root.left;
			}
			// check if Stack is emtpy, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack and go right to the tree
			root = s.pop();
			System.out.println("Pop element: "+ root.data);
			root = root.right;
		}
    } 
  
    public static void main(String args[]) 
    { 
  
        /* creating a binary tree and entering 
        the nodes */
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.preorder(); 
    } 
	
}
