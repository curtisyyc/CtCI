package com.yyc.ctci.ch3.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch3.Q1_threeInOne;
import com.yyc.ctci.library.AssortedMethods;

public class Q1_threeInOneTest {

	Q1_threeInOne stacks;
	
	@Before
	public void setUp() throws Exception {
		stacks = new Q1_threeInOne(3);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void threeInOneTest() {
		
		try {
			stacks.pop(2);
			
		} catch (Exception e) {
			System.out.print(e.toString());
			printStacks(stacks);
		}
		
		stacks.push(0, 10);
		printStacks(stacks);
		
		stacks.push(0, 11);
		printStacks(stacks);
		
		stacks.push(0, 12);
		printStacks(stacks);
		
		try {
			stacks.push(0, 13);
			
		} catch (Exception e) {
			System.out.print(e.toString());
			printStacks(stacks);
		}
		
		stacks.push(2, 31);
		printStacks(stacks);
		
		stacks.push(1, 21);
		printStacks(stacks);
		
		stacks.push(2, 32);
		printStacks(stacks);
		
		stacks.pop(2);
		printStacks(stacks);
		
		stacks.pop(0);
		printStacks(stacks);
		
		stacks.pop(1);
		printStacks(stacks);
		
	}
	
	private static void printStacks(Q1_threeInOne stacks) {
		System.out.println(AssortedMethods.arrayToString(stacks.getValues()));
	}
}
