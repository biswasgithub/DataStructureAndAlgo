package com.queue;

import java.util.Stack;

class Queue2{
	
	int front;
	
	 Stack<Integer> s1 = new Stack<Integer>();  
	 Stack<Integer> s2 = new Stack<Integer>();
	
	public void enqueue(int data) {
		if(s1.isEmpty()) {
			front=data;
		}
		s1.push(data);
		System.out.println("Push in statck: "+ data);
	}
	
	public int dequeue() {
		int x;
		if (s1.isEmpty() && s2.isEmpty()) { 
            System.out.println("Q is empty"); 
            System.exit(0); 
        } 
			
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		x=s2.pop();
		front=s2.peek();
		return x;
	}
	
	// Get the front element.
	public int peek() {
	    if (!s2.isEmpty()) {
	            return s2.peek();
	    }
	    return front;
	}
}

public class QImplByStack {

	public static void main(String[] args) {
		Queue2 q=new Queue2();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println("Peek: "+ q.peek());
		System.out.println("Front: "+ q.front);
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Front: "+ q.front);
		
		System.out.println("Peek: "+ q.peek());
	}
	
}
