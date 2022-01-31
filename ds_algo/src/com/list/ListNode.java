package com.list;

public class ListNode<T> {
	T data;
	ListNode<T> next;
	ListNode<T> prev;
	
	public ListNode(T data) {
		super();
		this.data = data;
		this.next = null;
		this.prev = null;
	}

	public ListNode(T data, ListNode<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	
	
	
	
}
