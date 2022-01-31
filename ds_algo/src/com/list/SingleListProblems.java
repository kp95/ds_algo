package com.list;

public class SingleListProblems {

	public static void main(String[] args) {
		SingleLinkedList<Integer> list = new SingleLinkedList<>();
		
		list.add(5);
		list.add(10);
		list.add(30);
		list.add(7);
		
		System.err.println(list.toString);
		
		
		list.add(15,1);
		
		System.err.println(list.toString());
		
		list.remove(5);
		
		System.err.println(list.toString());
	}
}
