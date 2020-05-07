package com.stack;

class Stack1{
	SNode top;
	
	static class SNode{
		int data;
		SNode next;
		
		SNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void push(int data) {
		SNode newNode=new SNode(data);
		
		if(top==null) {
			top=newNode;
		}
		
		else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	public int pop() {
		int data;
		if(top==null) {
			System.out.println("\nStack is Empty\n");
			return 0;
		}
		
		else {
			data=top.data;
			top=top.next;
		}
		
		return data;
	}
}

public class StackImplByLinkedList {

	public static void main(String[] args) {
		Stack1 s=new Stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Top element: "+ s.top.data);
		System.out.println("Deleted element: "+ s.pop());
		System.out.println("Deleted element: "+ s.pop());
		System.out.println("Top element: "+ s.top.data);
	}
}
