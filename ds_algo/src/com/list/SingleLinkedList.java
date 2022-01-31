package com.list;

public class SingleLinkedList<T> {
	
	ListNode<T> head;
	int length = 0;
	String toString ="";
	boolean remove = false;
	
	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}
	
	//add new node
	void add(T data) {
		
		ListNode<T> temp = new ListNode<T>(data);
		
		if(head == null) {
			head = temp;
		}
		else {
			
			ListNode<T> temp1 = head;
			
			while(temp1.next != null) {
				temp1 = temp1.next;
			}
			
			temp1.next = temp;
			length++;
		}
		if(toString.isEmpty() || toString.isBlank()) {
			toString = "[" + String.valueOf(data) +"]";
		}
		else {
			toString += ", [" + String.valueOf(data) +"]";;
		}
	}
	void add(T data, int pos) {
		
		if(pos <= 0 || pos > length + 1) {
			return ;
		}
		
		if(pos == 1) {
			ListNode<T> temp = new ListNode<>(data);
			
			temp.next = head;
			head = temp;
		}
		else {
			ListNode<T> temp = head;
			ListNode<T> prev = null;
			
			while(pos - 1 > 0) {
				prev = temp;
				temp = temp.next;
				pos--;
			}
			
			prev.next = new ListNode<T>(data);
			prev.next.next = temp;
		}
		length++;
		if(toString.isEmpty() || toString.isBlank()) {
			toString = "[" + String.valueOf(data) +"]";
		}
		else {
			toString += ", [" + String.valueOf(data) +"]";;
		}
	}
	void clear()
    {
		this.head = null;
        this.length = 0;
    }
	public int getSize() {
		return this.length;
	}
	boolean empty()
    {
        if (head == null) {
            return true;
        }
        return false;
    }
	void remove(T key) {
		ListNode<T> prev = new ListNode<>(null);
		// Dummy node pointing to head node
        prev.next = head;
        
        // Next node that points ahead of current node
        ListNode<T> next = head.next;
 
        // Temporary node for traversal
        ListNode<T> temp = head;
 
        // Boolean value that checks whether value to be
        // deleted exists or not
        boolean exists = false;
        
        if (head.data == key) {
            head = head.next;
            exists = true;
        }
        while(temp.next != null) {
        	
        	if(String.valueOf(temp.data).equals(String.valueOf(key))) {
        		prev.next = next;
        		exists = true;
        		break;
        	}
        	prev = temp;
        	temp = temp.next;
            next = temp.next;
        }
        //Comparing the last node with the given key value
        if (exists == false && String.valueOf(temp.data).equals(
                String.valueOf(key))) {
            // If found , last node is skipped over
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
            remove=true;
        }
        else {
 
            // Print statement
            System.out.println(
                "Given Value is not present in linked list");
        }
	}
	public String toString()
    {
 
        String S = "{ ";
 
        ListNode<T> X = head;
 
        if (X == null)
            return S + " }";
 
        while (X.next != null) {
            S += String.valueOf(X.data) + " , ";
            X = X.next;
        }
 
        S += String.valueOf(X.data);
        return S + " }";
    }
}
