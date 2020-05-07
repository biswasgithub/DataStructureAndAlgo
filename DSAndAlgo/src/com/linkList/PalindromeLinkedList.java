package com.linkList;

import java.util.Stack;

import com.linkList.LinkedList.Node;

public class PalindromeLinkedList {
	
	public static int isPalindrome(Node A) {
        
		
		boolean ispalin = false; 
		Node current = A;
		Stack<Integer> stack=new Stack<Integer>();
		
		while(current!=null) {
			stack.push(current.data);
			current = current.next;
		}
		
		while(A!=null) {
			int i =stack.pop();
			System.out.println("Stack vlaue: "+i  +" A.data: "+A.data);
			if(i==A.data) {
				ispalin=true;
			}
			else {
				 
				break;
			}
			A=A.next;
		}
		if(ispalin == true){
		    return 1;
		}
		else{
		    return 0;
		}
	
    }
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 6);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 1);
		//list.insertAtEnd(list, 2);
		//list.insertAtEnd(list, 1);
		list.print();
		
		System.out.println("\nIs palindrome: "+ isPalindrome(list.head));
	}

}
