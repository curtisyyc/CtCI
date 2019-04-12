package com.yyc.ctci.ch2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.yyc.ctci.library.LinkedListNode;

/**
 * Write code to remove duplicates from an unsorted linked list.<br><br>
 * <b>FOLLOW UP</b><br>
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author YYC
 *
 */
public class Q1_removeDups {

	public static LinkedList<String> removeDups(LinkedList<String> list){
		LinkedList<String> result = new LinkedList<String>();
		Set<String> set = new HashSet<String>();

		for(String s:list){
			if(set.contains(s)){
				continue;
			}else{
				set.add(s);
				result.add(s);
			}
		}
		
//		System.out.printf("input [");
//		for(String s:list){
//			System.out.printf("%s, ", s);
//		}
//		System.out.printf("]\n");
//		System.out.printf("output[");
//		for(String s:result){
//			System.out.printf("%s, ",s);
//		}
//		System.out.printf("]\n********\n");
		
		return result;
	}
	
	public static void removeDupsWithBuffer(LinkedListNode n){
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while(n != null){
			if(set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	
	public static void removeDupsWithoutBuffer(LinkedListNode n){
		LinkedListNode current = n;
		while(current != null){
			LinkedListNode runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
}
