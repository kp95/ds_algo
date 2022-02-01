package com.queue;

public class QueueUser {
	
	int front, size, rear;
	int capacity;
	int arr[];
	
	
	public QueueUser(int capacaity) {
		this.capacity = capacaity;
		arr = new int[capacaity];
		front = this.size = 0;
		rear = capacaity - 1;
	}
	
	
	boolean isFull() {
		return this.size == capacity;
	}
	boolean isEmpty() {
		return this.size == 0;
	}
	
	void enqueue(int data) {
		if(!isFull()) {
			this.rear = (this.rear + 1) % this.capacity;
			this.arr[this.rear] = data;
			this.size++;
			System.out.println("Item Qnqueud ");
		}
	}
	
	int dequeue() {
		if(this.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int item = this.arr[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size--;
		return item;
	}
	int front() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return this.arr[this.front];
	}
	int rear() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return this.arr[this.rear];
	}
	
	public static void main(String[] args) {
		QueueUser que = new QueueUser(5);
		que.enqueue(5);
		que.enqueue(25);
		que.enqueue(15);
		que.enqueue(55);
		que.enqueue(65);
		
		while(!que.isEmpty()) {
			System.err.print(que.dequeue() + " ");
		}
	}
	
}
