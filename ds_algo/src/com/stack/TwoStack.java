package com.stack;

public class TwoStack {

	int arr[] = new int[5];
	
	int top1 = -1;
	
	int cap = arr.length;
	
	int top2 = cap;
	
	void push1(int data) {
		if(top1 < top2-1) {
			arr[++top1] = data;
		}
		else {
			System.err.println("!! OVERFLOW !!");
		}
	}
	
	int pop1() {
		if(top1<0) {
			System.err.println(" !! UNDERFLOW !!");
			return Integer.MAX_VALUE;
		}
		else {
			int data = arr[top1--];
			return data;
		}
	}
	
	void push2(int data) {
		if(top1 < top2 - 1) {
			arr[--top2] = data;
		}
		else {
			System.err.println("!! OVERFLOW !!");
		}
	}
	int pop2() {
		if(top2 == cap) {
			System.err.println(" !! UNDERFLOW !!");
			return Integer.MAX_VALUE;
		}
		else {
			return arr[top2++];
			//return data;
		}
	}
	
	public static void main(String[] args) {
		TwoStack st = new TwoStack();
		
		st.push1(10);
		st.push2(20);
		
		st.push1(30);
		st.push2(40);
		
		st.push2(0);
		//st.push2(0);
		System.err.println(st.pop2());
		System.err.println(st.pop2());
		System.err.println(st.pop2());
		
		System.err.println(st.pop1());
		System.err.println(st.pop1());
		System.err.println(st.pop1());
		
		
		
	}
}
