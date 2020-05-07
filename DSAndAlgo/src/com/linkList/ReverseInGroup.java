package com.linkList;

import com.linkList.LinkedList.Node;

public class ReverseInGroup {
	
	public static Node reverseList(Node A, int B) {
		
		Node current=A;
		Node prev=null;
		Node next=null;
		int count=0;
		
		while(count<B && current !=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next !=null) {
			System.out.println("\nA.data: "+ A.data +"  current.data: "+ current.data  +"  next.data: "+ next.data);
			A.next=reverseList(next, B);
		}
		
		return prev;
    }
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 5);
		list.insertAtEnd(list, 6);
		list.insertAtEnd(list, 7);
		list.insertAtEnd(list, 8);
		list.print();
		
		list.head=reverseList(list.head,2);
		System.out.println("\nAfter reverse: ");
		
		list.print();
		
		
	}
}
