package com.yyc.ctci.ch1;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * @author YYC
 */
public class Q2_checkPermutation {

	public static boolean isPermutation(String s1, String s2){
		// assume charaters are in standard ansii base
		if(s1.length() != s2.length()){
			return false;
		}
		int[] charCnt = new int[128];
		int i;
		for(i = 0; i < s1.length(); i++){
			charCnt[(int)s1.charAt(i)]++;
		}
		for(i = 0; i < s2.length(); i++){
			charCnt[(int)s2.charAt(i)]--;
		}
		for(i = 0; i < 128; i++){
			if(charCnt[i] != 0){
				return false;
			}
		}
		return true;
	}
	
}
