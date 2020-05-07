package com.stack;

import java.util.LinkedList;
import java.util.Queue;

class Stack{
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>(); 
    int curr_size; 
  
    public Stack() 
    { 
        curr_size = 0; 
    } 
    
    public void push(int data) {
    	q1.add(data);
    	curr_size++;
    }
    
    public int remove() {
    	if(q1.isEmpty()) {
    		System.out.println("\nStack is Empty\n");
    		return 0;
    	}
    	
    	while(q1.size() != 1) {
    		q2.add(q1.peek());
    		q1.remove();
    	}

    	int x=q1.remove();
    	curr_size--;
    	
    	// swap the names of two queues 
        Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q;
        
        return x;
    }
    
    public int peek() {
    	if(q1.isEmpty()) {
    		System.out.println("\nStack is Empty\n");
    		return 0;
    	}
    	
    	while(q1.size() != 1) {
    		q2.add(q1.peek());
    		q1.remove();
    	}

    	int x=q1.peek();
    	q1.remove();
    	
    	q2.add(x);
    	
    	// swap the names of two queues 
        Queue<Integer> q = q1; 
        q1 = q2; 
        q2 = q;
        
        return x;
    }
    
}

public class StackImplByQueue {
	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		System.out.println("Peek: "+stack.peek());
		System.out.println("Remove: "+stack.remove());
		System.out.println("Remove: "+stack.remove());
		System.out.println("Peek: "+stack.peek());
	}
}
