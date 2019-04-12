package com.yyc.ctci.ch2.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch2.Q2_returnKthToLast;
import com.yyc.ctci.library.LinkedListNode;

public class Q2_returnKthToLastTest {

	LinkedListNode first; 
	LinkedListNode head;
	LinkedListNode second;
	LinkedListNode refHead;
	LinkedListNode refTail;
	
	@Before
	public void setUp() throws Exception {
		first = new LinkedListNode(0,null,null);
		head = first;
		for(int i = 1 ; i < 10; i++){
			second = new LinkedListNode(i,null,null);
			first.setNext(second);
			first = second;
		}
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void return4thToLastTest() {
		System.out.println(head.printForward());
		assertEquals(6,Q2_returnKthToLast.returnKthToLast(head, 4));
//		fail("not yet implement");
	}
	
	@Test
	public void return1thToLastTest() {
		System.out.println(head.printForward());
		assertEquals(9,Q2_returnKthToLast.returnKthToLast(head, 1));
//		fail("not yet implement");
	}
	
	@Test
	public void return10thToLastTest() {
		System.out.println(head.printForward());
		assertEquals(0,Q2_returnKthToLast.returnKthToLast(head, 10));
//		fail("not yet implement");
	}
}
