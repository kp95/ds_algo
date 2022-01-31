package com.stack;

public class BalancedParanthesis {
	
	public static void main(String[] args) {
		System.err.println(isBalanced("{()}[]"));
	}
	
	public static boolean isBalanced(String str) {
		
		StackUser<Character> stack = new StackUser<>();
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[' ) {
				stack.push(str.charAt(i));
			}
			else {
				if(!stack.isEmpty()) {
					if(matching(str.charAt(i), stack.pop())) {
						//nothing to do
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}	
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean matching(char out, char inp) {
		if(inp == '{' && out == '}') {
			return true;
		}
		else if(inp == '(' && out == ')') {
			return true;
		}
		else if(inp == '[' && out == ']') {
			return true;
		}
		else {
			return false;
		}
	}

}
