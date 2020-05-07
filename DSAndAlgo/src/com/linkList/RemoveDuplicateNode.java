package com.linkList;

import java.util.HashSet;

import com.linkList.LinkedList.Node;

public class RemoveDuplicateNode {

	public LinkedList deleteDuplicates(LinkedList list) {
		/*
		 * Node curr = list.head; if (curr == null) { return null; } else { while (curr
		 * != null) { Node temp = curr; while (temp != null && temp.data == curr.data) {
		 * temp = temp.next; } curr.next = temp; curr = curr.next; } }
		 * 
		 * return list;
		 */
		
		HashSet<Object> hset=new HashSet<>();
		Node curr=list.head;
		Node prev=null;
		while(curr != null) {
			if(hset.contains(curr.data)) {
				prev.next=curr.next;
			}
			else {
				hset.add(curr.data);
				prev=curr;
			}
			
			curr=curr.next;
		}
		return list;
		
	}

	public static void main(String[] args) {

		RemoveDuplicateNode dupNode=new RemoveDuplicateNode();
		
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 5);
		list.insertAtEnd(list, 6);
		list.insertAtEnd(list, 8);
		list.insertAtEnd(list, 6);
		list.insertAtEnd(list, 7);
		list.insertAtEnd(list, 7);
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 8);

		list.print();
		
		dupNode.deleteDuplicates(list);
		
		System.out.println();
		list.print();
	}
}
