package com.queue;

import com.stack.StackUser;

public class ReverseQueue {

	QueueUser que = new QueueUser(6);
	StackUser<Integer> stk = new StackUser<Integer>();
	
	public void reverseQueue() {
		
		
		
		que.enqueue(5);
		que.enqueue(11);
		que.enqueue(7);
		que.enqueue(8);
		que.enqueue(9);
		que.enqueue(10);
		
		while(!que.isEmpty()) {
			stk.push(que.dequeue());
		}
		
		while(!stk.isEmpty()) {
			System.err.print(stk.pop() + " ");
		}
	}
	
	public static void main(String[] args) {
		ReverseQueue rq = new ReverseQueue();
		rq.reverseQueue();
	}
}
