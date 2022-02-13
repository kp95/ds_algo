package com.stack;

import java.util.ArrayList;

public class StackUser<T> {
	
	ArrayList<T> stack = new ArrayList<T>();
	
	
	public void push(T data) {
		stack.add(data);
	}
	
	public T pop() {
		if(stack.size() == 0) {
			System.err.println("UnderFlow");
			return null;
		}
		
		T res = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return res;
	}

	public T peek() {
		T res = stack.get(stack.size()-1);
		return res;
	}
	
	public int size() {
		return stack.size();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
}
