package com.stack;

public class PreviousGreaterElement {

	StackUser<Integer> stack = new StackUser<Integer>();
	
	
	public void previousGreaterElement(int arr[]) {
		
		stack.push(arr[0]);
		System.err.print("-1 ");
		
		for(int i = 1; i<arr.length; i++) {
			
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				System.err.print("-1 ");
			}
			else {
				System.err.print(stack.peek() + " " );
			}
			
			stack.push(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {13,15,12,14,16,8,6,4,10,30};
		
		PreviousGreaterElement p = new PreviousGreaterElement();
		p.previousGreaterElement(arr);
	}
	
}
