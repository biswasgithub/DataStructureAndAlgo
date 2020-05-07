package com.queue;

class Queue1 {

	QNode front, rear;

	static class QNode {
		int data;
		QNode nextNode;

		QNode(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	Queue1() {
		this.front = this.rear = null;
	}

	public void enqueue(int data) {
		QNode newNode = new QNode(data);
		if (front == null) {
			front = rear = newNode;
		}

		else {
			rear.nextNode = newNode;
			rear = newNode;
		}
	}

	public void dequeue() {
		if (front == rear) {
			System.out.println("\nQueue is Empty\n");
			return;
		}

		QNode temp = front.nextNode;
		this.front = temp;

		if (front == null) {
			rear = null;
		}
	}

	public void displayQueue() {
		if (rear == null) {
			System.out.println("\n Queue Is Empty\n");
		}

		QNode temp = front;

		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.nextNode;
		}
	}
}

public class QueueImplByLinkedList {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.displayQueue();
		System.out.println();
		q.dequeue();
		q.displayQueue();
		
		System.out.println("\nQueue Front : " + q.front.data); 
        System.out.println("\nQueue Rear : " + q.rear.data); 
	}
}
