package com.linkList;

import com.linkList.LinkedList.Node;

public class LinkedListLength {

	public int getLength(Node head) {
		
		if(head == null) {
			return 0;
		}		
		return 1+ getLength(head.next);
		
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 5);
		
		list.print();
		
		LinkedListLength listLength=new LinkedListLength();
		System.out.println("\nLength: "+ listLength.getLength(list.head));
	}
}
