package com.yyc.ctci.ch2;

import com.yyc.ctci.library.LinkedListNode;

/**
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly
 * linked list, given only access to that node.
 * 
 * @author YYC
 *
 */
public class Q3_deleteMiddleNode {

	public static void deleteMiddleNode(LinkedListNode m){
		if(m == null || m.next == null){
			return;
		}
		m.data = m.next.data;
		m.next = m.next.next;
	}

}
