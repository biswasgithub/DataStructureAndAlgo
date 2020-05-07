package com.linkList;

import com.linkList.LinkedList.Node;

public class SearchNode {
	
public boolean search(Node head, int data) {
		
		if(head==null) {
			return false;
		}
		
		if(head.data==data) {
			return true;
		}
		return search(head.next,data);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		
		SearchNode searchNode=new SearchNode();
		int data=10;
		System.out.println(searchNode.search(list.head, data));
	}
}
