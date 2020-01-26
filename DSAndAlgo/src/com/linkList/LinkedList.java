package com.linkList;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public LinkedList insertAtEnd(LinkedList list, int data) {

		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
		}

		else {
			Node curr_node = head;
			while (curr_node.next != null) {
				curr_node = curr_node.next;
			}
			curr_node.next = new_node;
		}

		return list;
	}

	public LinkedList insertAtFront(LinkedList list, int data) {

		Node curr_node = head;

		if (curr_node != null) {
			Node new_node = new Node(data);
			new_node.next = curr_node;
			head = new_node;
		}

		return list;
	}

	public LinkedList insertAfterNode(LinkedList list, int data, int new_data) {

		Node curr_node = head;
		if (list.head == null) {
			return null;
		}

		else {
			Node new_node = new Node(new_data);
			
			while (curr_node != null && curr_node.data != data) {
				curr_node = curr_node.next;
			}
			
			if(curr_node != null) {
			new_node.next = curr_node.next;
			curr_node.next = new_node;
			}
			else {
				System.out.println("Node "+data +" not found");
			}
		}
		
		return list;
	}

	
	public LinkedList insertAtPosition(LinkedList list, int position, int data) {
		
		if(head == null) {
			return null;
		}
		Node prev_node=head;
		Node curr_node=head;
		int count=1;
		
		if(count==position) {
			Node new_node=new Node(data);
			new_node.next=curr_node;
			head=new_node;
		}
		
		else {

			while(curr_node != null && count != position) {
				prev_node = curr_node;
				curr_node=curr_node.next;
				count++;
			}
			Node new_node=new Node(data);
			new_node.next=curr_node;
			prev_node.next=new_node;
		}
		
		return list;
	}
	
	public void print() {
		Node curr_node = head;

		while (curr_node != null) {
			System.out.print(curr_node.data + "->");
			curr_node = curr_node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = list.insertAtEnd(list, 1);
		list = list.insertAtEnd(list, 2);
		list = list.insertAtEnd(list, 3);
		list = list.insertAtEnd(list, 4);
		list = list.insertAtEnd(list, 5);
		System.out.print("Print LinkedList:  ");
		list.print();

		System.out.print("\nInsert At beginning:  ");
		list = list.insertAtFront(list, 20);
		list.print();

		int data=20;
		System.out.print("\nInsert after node "+data+":  ");
		list = list.insertAfterNode(list, data, 30);
		list.print();
		
		int position=4;
		int data1=50;
		System.out.print("\nInsert node "+position+"th position :  ");
		list = list.insertAtPosition(list, position,data1);
		list.print();
	}
}
