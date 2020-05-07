package com.linkList;

public class IntersectionNode {
	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public Node getIntersectionNode(Node a, Node b) {
		Node current1 = a;
		Node current2 = b;

		int count1 = 0;
		int count2 = 0;

		while (current1 != null) {
			count1++;
			current1 = current1.next;
		}

		while (current2 != null) {
			count2++;
			current2 = current2.next;
		}

		System.out.println(count1 +"  "+count2);
		
		int d = 0;
		if (count1 > count2) {
			d = count1 - count2;
			for (int i = 0; i < d; i++) { 
	            if (a == null) { 
	                return null; 
	            } 
	            a = a.next; 
	        } 

		} else {
			d = count2 - count1;
			for (int i = 0; i < d; i++) { 
	            if (b == null) { 
	                return null; 
	            } 
	            b = b.next; 
	        } 
		}

		Node resultNode = null;

		while (a != null && b != null) {

			if (a.data == b.data) {
				System.out.println("Matched Node: "+a.data);
				resultNode = a;
				break;
			} else {
				a = a.next;
				b = b.next;
			}
		}
		return resultNode;
	}

	public static void main(String[] args) {
		
		IntersectionNode list=new IntersectionNode();
		
		list.head1 = new Node(3); 
        list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
		
        list.head2 = new Node(10); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(30); 
        
        System.out.println("The node of intersection is " + list.getIntersectionNode(head1, head2).data);
		
	}

}
