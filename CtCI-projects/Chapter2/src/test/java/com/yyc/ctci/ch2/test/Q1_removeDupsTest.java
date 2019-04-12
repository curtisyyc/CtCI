package com.yyc.ctci.ch2.test;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch2.Q1_removeDups;
import com.yyc.ctci.library.LinkedListNode;

public class Q1_removeDupsTest {

	LinkedList<String> list1;
	LinkedList<String> list2;
	
	LinkedList<String> list1RemoveDups;
	LinkedList<String> list2RemoveDups;
	
	LinkedListNode first; //AssortedMethods.randomLinkedList(1000, 0, 2);
	LinkedListNode head;
	LinkedListNode second;
	LinkedListNode refHead;
	LinkedListNode refTail;
	
	@Before
	public void setUp() throws Exception {
		
		list1 = new LinkedList<String>();
		list2 = new LinkedList<String>();
		list1RemoveDups = new LinkedList<String>();
		list2RemoveDups = new LinkedList<String>();
		first = new LinkedListNode(0, null, null);
		head = first;
		second = first;
		refHead = new LinkedListNode(0, null, null);
		refTail = new LinkedListNode(1, null, null);
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("b");
		list1.add("d");
		
		list1RemoveDups.add("a");
		list1RemoveDups.add("b");
		list1RemoveDups.add("c");
		list1RemoveDups.add("d");
		
		list2.add("c");
		list2.add("v");
		list2.add("b");
		list2.add("n");
		list2.add("b");	
		
		list2RemoveDups.add("c");
		list2RemoveDups.add("v");
		list2RemoveDups.add("b");
		list2RemoveDups.add("n");
		

		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		
		refHead.setNext(refTail);
//		refTail.setPrevious(refHead);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void removeDupsTest() {
		assertTrue(list1RemoveDups.equals(Q1_removeDups.removeDups(list1)));
		assertTrue(list2RemoveDups.equals(Q1_removeDups.removeDups(list2)));
	}
	
	@Test
	public void removeDupsWithBufferTest(){
//		System.out.println(head.printForward());
		Q1_removeDups.removeDupsWithBuffer(head);
//		System.out.println(head.printForward());
//		System.out.println(refHead.printForward());
		assertTrue(head.equals(refHead));
	}
	
	@Test
	public void removeDupsWithoutBufferTest(){
//		System.out.println(head.printForward());
		Q1_removeDups.removeDupsWithoutBuffer(head);
//		System.out.println(head.printForward());
//		System.out.println(refHead.printForward());
		assertTrue(head.equals(refHead));
	}

}
