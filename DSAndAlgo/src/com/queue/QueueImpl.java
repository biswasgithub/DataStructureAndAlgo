package com.queue;

class Queue{
	
	int front,rear,size;
	int capacity;
	int queue[];
	
	Queue(int capacity){
		this.front=this.rear=0;
		this.capacity=capacity;
		queue=new int[capacity];
	}
	
	
	public void queueEnqueue(int x) {
		if(capacity==rear) {
			System.out.println("\nQueue is Full\n");
		}
		
		else {
			queue[rear]=x;
			rear++;
		}
	}
	
	public void queueDequeue() {
		
		int x=0;
		if(front == rear) {
			System.out.println("\nQueue is Empty\n");
		}
		
		else {
			//x=queue[rear];
			for(int i=0; i<rear-1; i++) {
				queue[i]=queue[i+1];
			}
			
			if(rear<capacity) {
				queue[rear]=0;
			}
			rear--;
		}
	}
	
	public void queueDisplay() {
		int x=0;
		if(front == rear) {
			System.out.println("\nQueue is Empty\n");
		}
		
		for(int i=0; i<rear-1; i++) {
			//x=queue[i];
			System.out.printf(" %d <-- ", queue[i]);
		}
	}
	
	public void queueFront() {
		if(front == rear) {
			System.out.println("\nQueue is Empty\n");
		}
		System.out.println("\nFront element: "+ queue[front]);
	}
}

public class QueueImpl {

	public static void main(String[] args) {
		// Create a queue of capacity 4 
        Queue q = new Queue(4); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        // inserting elements in the queue 
        q.queueEnqueue(20); 
        q.queueEnqueue(30); 
        q.queueEnqueue(40); 
        q.queueEnqueue(50); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        // insert element in the queue 
        q.queueEnqueue(60); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        q.queueDequeue(); 
        q.queueDequeue(); 
        System.out.printf("\n\nafter two node deletion\n\n"); 
  
        // print Queue elements 
        q.queueDisplay(); 
  
        // print front of the queue 
        q.queueFront(); 
	}
}
