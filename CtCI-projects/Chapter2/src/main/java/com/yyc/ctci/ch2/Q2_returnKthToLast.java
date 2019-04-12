package com.yyc.ctci.ch2;

import com.yyc.ctci.library.LinkedListNode;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * @author YYC
 *
 */
public class Q2_returnKthToLast {

	public static int returnKthToLast(com.yyc.ctci.library.LinkedListNode head, int k){

		LinkedListNode front = head;
		LinkedListNode back = front;
		
		for(int i = 1; i < k; i++){
			back = back.next;
		}
		
		while(back.next != null){
			front = front.next;
			back = back.next;
		}
		
		return front.data;
	}
}
