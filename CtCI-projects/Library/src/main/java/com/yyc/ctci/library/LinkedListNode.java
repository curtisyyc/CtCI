package com.yyc.ctci.library;

public class LinkedListNode {
	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode last;
	public int data;
	public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
		data = d;
		setNext(n);
		setPrevious(p);
	}
	
	public LinkedListNode(int d) {
		data = d;
	}	
	
	public LinkedListNode() { }

	public void setNext(LinkedListNode n) {
		next = n;
		if (this == last) {
			last = n;
		}
		if (n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}
	
	public void setPrevious(LinkedListNode p) {
		prev = p;
		if (p != null && p.next != this) {
			p.setNext(this);
		}
	}	
	
	public String printForward() {
		if (next != null) {
			return data + "->" + next.printForward();
		} else {
			return ((Integer) data).toString();
		}
	}
	
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if (next != null) {
			next2 = next.clone();
		}
		LinkedListNode head2 = new LinkedListNode(data, next2, null);
		return head2;
	}
	
	public boolean equals(LinkedListNode other) {
		
		if(this == other){
			return true;
		}
		
		if(other == null) {
			return false;
		}
		
		LinkedListNode thisOne = this;
		while (thisOne.next != null){
			
			if (other.next == null){
				return false;
			}
			if (thisOne.data != other.data){
				return false;
			}
			thisOne = thisOne.next;
			other = other.next;
		}
		if(other.next != null){
			return false;
		}
		return true;
	}
}
