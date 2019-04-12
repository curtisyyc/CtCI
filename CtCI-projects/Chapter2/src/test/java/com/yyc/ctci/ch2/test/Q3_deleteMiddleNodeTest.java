package com.yyc.ctci.ch2.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch2.Q3_deleteMiddleNode;
import com.yyc.ctci.library.LinkedListNode;

public class Q3_deleteMiddleNodeTest {

	LinkedListNode first; 
	LinkedListNode head;
	LinkedListNode second;
	LinkedListNode m,n;
	
	@Before
	public void setUp() throws Exception {
		first = new LinkedListNode(0,null,null);
		head = first;
		for(int i = 1 ; i < 10; i++){
			second = new LinkedListNode(i,null,null);
			first.setNext(second);
			first = second;
		}
		m = head.next.next.next; //m.data = 3
		n = head.next.next.next.next.next.next; //n.data = 6
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void deleteMiddleNodeTest(){
		Q3_deleteMiddleNode.deleteMiddleNode(m);
		System.out.println(head.printForward());
		assertEquals("0->1->2->4->5->6->7->8->9",head.printForward());
		Q3_deleteMiddleNode.deleteMiddleNode(n);
		System.out.println(head.printForward());
		assertEquals("0->1->2->4->5->7->8->9",head.printForward());
	}
	
}
