package com.linkList;

import com.linkList.LinkedList.Node;

public class PaireWiseSwap {

	public LinkedList swap(LinkedList list) {

		Node curr = list.head;

		if (curr == null) {
			return null;
		}

		while (curr != null && curr.next != null) {

			int tempData = curr.data;
			curr.data = curr.next.data;
			curr.next.data = tempData;

			curr = curr.next.next;
		}

		return list;
	}

	public LinkedList swapNode(LinkedList list) {

		if (list.head == null && list.head.next == null) {
			return null;
		}

		Node prev = list.head;
		Node curr = list.head.next;

		list.head = curr;

		while (true) {
			Node currNext = curr.next;
			curr.next = prev;

			if (currNext == null || currNext.next == null) {
				prev.next=currNext;
				break;
			}
			prev.next=currNext.next;  // if confusion lets watch https://www.youtube.com/watch?v=jiLloHVmLDc
			prev=currNext;
			curr=prev.next;
		}
		return list;
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
		list.print();

		PaireWiseSwap tempList = new PaireWiseSwap();
		//System.out.println("\nPair Wise Swap elements using iterate:  ");
		//tempList.swap(list);
		//list.print();

		System.out.println("\nPair Wise Swap node using iterate:  ");
		tempList.swapNode(list);
		list.print();
	}
}
