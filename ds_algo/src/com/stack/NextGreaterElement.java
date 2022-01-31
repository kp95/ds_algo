package com.stack;

public class NextGreaterElement {
	StackUser<Integer> stack = new StackUser<Integer>();
	
	
	public void nextGreaterElement(int arr[]) {
		
		stack.push(arr[arr.length - 1]);
		System.err.print("-1 ");
		
		for(int i = arr.length - 2; i >= 0; i--) {
			
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
		
		NextGreaterElement g = new NextGreaterElement();
		g.nextGreaterElement(arr);
	}
}
