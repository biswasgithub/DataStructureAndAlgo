package com.linkList;

import com.linkList.LinkedList.Node;

public class LinkedListDeleteOperation {

	public LinkedList deleteLast(LinkedList list) {
		
		if(list.head == null) {
			return null;
		}
		
		else {
			Node curr_node=list.head;
			while(curr_node.next.next != null) {
				curr_node= curr_node.next;
			}
			curr_node.next=null;
		}
		
		return list;
	}
	
	
	public LinkedList deleteFirst(LinkedList list) {
		
		if(list.head != null) {
			list.head=list.head.next;
		}
		
		return list;
	}
	
	public LinkedList deleteAnyNode(LinkedList list, int data) {
		

		
		if(list.head == null) {
			return null;
		}
		
		Node curr_node=list.head;
		Node prev_node=list.head;
		
		if(curr_node != null && curr_node.data == data) {
			list.head=curr_node.next;
		}
		
		else {
	
			while(curr_node != null && curr_node.data != data) {
				prev_node=curr_node;
				curr_node=curr_node.next;
			}
			
			if(curr_node != null) {
				//delete given node
				prev_node.next=curr_node.next; 
				// delete after node of given node
				//curr_node.next=curr_node.next.next;
				
			}
			
			else {
				System.out.println(data+ " node not found");
			}
			
		}
		
		return list;
	}
	
	public LinkedList deleteAtPosition(LinkedList list, int position) {
		
		if(list.head == null) {
			return null;
		}
		
		int count=1;
		
		if(list.head != null && count==position) {
			list.head=list.head.next;
		}
		
		else {
			Node curr_node=list.head;
			Node prev_node=curr_node;
			while(curr_node != null && count != position) {
				prev_node=curr_node;
				curr_node = curr_node.next;
				count++;
			}
			prev_node.next=curr_node.next;
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		list = list.insertAtEnd(list, 20);
		list = list.insertAtEnd(list, 1);
		list = list.insertAtEnd(list, 2);
		list = list.insertAtEnd(list, 3);
		list = list.insertAtEnd(list, 30);
		list = list.insertAtEnd(list, 4);
		list = list.insertAtEnd(list, 5);
		list = list.insertAtEnd(list, 50);
		list.print();
		
		LinkedListDeleteOperation deleteList=new LinkedListDeleteOperation();
		
		
		System.out.println("\nDelete last node: ");
		list=deleteList.deleteLast(list);
		list.print();
		
		System.out.println("\nDelete first node: ");
		list=deleteList.deleteFirst(list);
		list.print();
		
		// delete given node or after node of given node
		int data=30;
		System.out.println("\nDelete "+data +" node: ");
		list=deleteList.deleteAnyNode(list, data);
		list.print();
		
		int position=5;
		System.out.println("\nDelete "+position +" position node: ");
		list=deleteList.deleteAtPosition(list, position);
		list.print();
	}
}
