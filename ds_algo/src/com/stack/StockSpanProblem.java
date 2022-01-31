package com.stack;

public class StockSpanProblem {
	StackUser<Integer> stack = new StackUser<Integer>();
	
	public void stockSpan(int arr[]) {
		stack.push(0);
		System.err.print("1 ");
		for(int i = 1; i<arr.length; i++) {
			while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				//if stack is empty,arr[i] is greater than all element till index
				System.err.print(i+1 + " ");
			}
			else {
				System.err.print(i-stack.peek() + " ");
			}
			stack.push(i);
		}
	}
	
	public static void main(String[] args) {
		StockSpanProblem stock = new StockSpanProblem();
		
		int arr[] = new int[] {13,15,12,14,16,8,6,4,10,30};
		stock.stockSpan(arr);
	}
	
}
