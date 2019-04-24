package com.yyc.ctci.ch1.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yyc.ctci.ch1.G4G_Q1_slidingWindowMaximum;

public class G4G_Q1_slidingWindowMaximumTest {

	int[] array1 = {3,5,7,2,4,1,8,7,13,12,19};
	int[] array2 = {1,3,12,4,7,9,2,1,3,6,4,8};
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void slidingWindowMaximumTest1_1() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array1, 1);
		int[] ans = {3,5,7,2,4,1,8,7,13,12,19};
		assertTrue(Arrays.equals(max,ans));
	}
	
	@Test
	public void slidingWindowMaximumTest1_2() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array1, 2);
		int[] ans = {5,7,7,4,4,8,8,13,13,19};
		assertTrue(Arrays.equals(max,ans));
		
	}
	
	@Test
	public void slidingWindowMaximumTest1_3() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array1, 3);
		int[] ans = {7,7,7,4,8,8,13,13,19};
		assertTrue(Arrays.equals(max,ans));
	}
	
	@Test
	public void slidingWindowMaximumTest1_5() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array1, 5);
		int[] ans = {7,7,8,8,13,13,19};
		assertTrue(Arrays.equals(max,ans));
	}
	
	@Test
	public void slidingWindowMaximumTest2_1() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array2, 1);
		int[] ans = {1,3,12,4,7,9,2,1,3,6,4,8};
		assertTrue(Arrays.equals(max,ans));
	}
	
	@Test
	public void slidingWindowMaximumTest2_2() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array2, 2);
		int[] ans = {3,12,12,7,9,9,2,3,6,6,8};
		assertTrue(Arrays.equals(max,ans));
	}	

	@Test
	public void slidingWindowMaximumTest2_4() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array2, 4);
		int[] ans = {12,12,12,9,9,9,6,6,8};
		assertTrue(Arrays.equals(max,ans));
	}	
	
	@Test
	public void slidingWindowMaximumTest2_7() {
		int[] max = G4G_Q1_slidingWindowMaximum.slidingWinMax(array2, 7);
		int[] ans = {12,12,12,9,9,9};
		assertTrue(Arrays.equals(max,ans));
	}
}
