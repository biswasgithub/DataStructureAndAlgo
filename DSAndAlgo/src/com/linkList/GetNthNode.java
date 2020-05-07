package com.linkList;

import com.linkList.LinkedList.Node;

public class GetNthNode {

	public int getNthNode(Node head, int index) {

		Node curr_node = head;
		int data;
		int count = 0;
		if (curr_node == null) {
			return 0;
		}

		else {
			while (curr_node != null && count != index) {
				curr_node = curr_node.next;
				count++;
			}
			data = curr_node.data;
			return data;
		}
	}

	public int getNthNodeRecursive(Node head, int index) {
		
		if(head == null) {
			return 0;
		}		
		if(index==0)
			return head.data;
		return getNthNodeRecursive(head.next, index-1);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		list.print();
		GetNthNode getNode = new GetNthNode();
		int index = 3;
		System.out.println("\n"+index + "th node: " + getNode.getNthNode(list.head, index));
		
		System.out.println(index + "th node Recursive way: " + getNode.getNthNodeRecursive(list.head, index));
		
	}
}
