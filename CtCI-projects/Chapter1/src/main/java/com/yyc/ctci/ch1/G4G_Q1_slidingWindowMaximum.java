package com.yyc.ctci.ch1;

/**
 * Given an array and an integer k, find the maximum for each and every 
 * contiguous sub-array of size k.<br><br>
 * <b>See</b> <a href="https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/">https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/</a><br>
 * 
 * @author YYC
 *
 */
public class G4G_Q1_slidingWindowMaximum {
	
	public static int[] slidingWinMax(int[] array, int windowSize){
		int n = array.length;
		int s = windowSize;
		int[] maxs = new int[n-s+1];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n-s+1; i++){
			max = array[i];
			for(int j = 1; j < s; j++){
				if(array[i+j] > max){
					max = array[i+j];
				}
			}
			maxs[i] = max;
		}
		
		return maxs;
	}
}
