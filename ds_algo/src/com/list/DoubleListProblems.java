package com.list;

import java.util.LinkedList;
import java.util.List;

public class DoubleListProblems {

	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.add(5);
		list.add(10);
		list.add(30);
		list.add(7);
		
		//System.err.println(list.toString());
		
		//list.add(15,1);
		
		//System.err.println(list.toString());
		
		//list.remove(5);
		
		//System.err.println(list.toString());
		
		//reverseTraverseList(list.head);
		ListNode<Integer> head = reverse(list.head); 
		list.head = head;
		System.err.println(list.toString());
	}
	
	
	public static void reverseTraverseList(ListNode<Integer> head) {
		ListNode<Integer> ref = head;
		while(ref.next != null) {
			System.out.print(ref.data + ", ");
			ref = ref.next;
		}
		
		System.err.println();
		
		while(ref != null) {
			System.err.print(ref.data + " ");
			ref = ref.prev;
		}
		
	}
	
	//reverse a doubly linked list
	public static ListNode<Integer> reverse(ListNode<Integer> head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		ListNode<Integer> prev = null;
		ListNode<Integer> curr = head;
		
		while(curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			
			curr = curr.prev;
		}
		return prev.prev;
		
		
	} 
}
