package com.list;

public class DoublyLinkedList<T> {
	
	ListNode<T> head;
	int length;
	
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}
	
	public void add(T data) {
		ListNode<T> temp = new ListNode<>(data);
		if(head == null) {
			head = temp;
			length++;
			return;
		}
		 ListNode<T> ref = head;
		 
		 while(ref.next != null) {
			 ref = ref.next;
		 }
		 
		 //ListNode<T> prev = ref.prev;
		
		 temp.prev = ref;
		 ref.next = temp;
		 
		 length++;
	}
	public void add(T data, int pos) {
		if(pos <= 0 || pos == length + 1) {
			System.err.println("Invalid Position");
			return;
		}
		
		if(pos == 1) {
			ListNode<T> temp = new ListNode<>(data);
			temp.next = head;
			head.prev = temp;
			
			head = temp;
		}
		else {
			ListNode<T> prev = null;
			ListNode<T> ref = head;
			
			while(pos -1 > 0) {
				prev = ref;
				ref = ref.next;
				pos--;
			}
			
			ListNode<T> temp = new ListNode<T>(data);
			
			prev.next = temp;
			temp.prev = prev;
			
			
			temp.next = ref;
			ref.prev = temp;
			
			
		}
		length++;
		
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
	
	public void remove(T key) {
		 // Temporary node for traversal
        ListNode<T> ref = head;
        String val = String.valueOf(key);
        
        boolean exists = false;
        
        if(String.valueOf(ref.data).equals(val)) {
        	//delete first node
        	head = head.next;
        	head.prev = null;
        	exists = true;
        }
        else {
        	//traverse list to find node
        	while(ref.next != null) {
        		
        		if(String.valueOf(ref.data).equals(val)){
        			//found node to delete
        			ListNode<T> prev = ref.prev;
        			ListNode<T> next = ref.next;
        			
        			prev.next = next;
        			next.prev = ref.prev;
        			
        			exists = true;
        			break;
        		}
        		ref = ref.next;
        	}
        	if (exists == false && String.valueOf(ref.data).equals(
                    val)) {
                // If found , last node is skipped over
        		ListNode<T> prev = ref.prev;
        		prev.next = null;
                exists = true;
            }
        	 if (exists) {
                 length--;
             }
             else {
                 System.out.println(
                     "Given Value is not present in linked list");
             }
        
        
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
