package com.yyc.ctci.ch1;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data stuctures?
 * 
 * @author YYC
 *
 */
public class Q1_isUnique {

	public static boolean isUnique(String s){
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		int i;
		for(i = 0; i < s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				return false;
			}
			else{
				map.put(s.charAt(i),1);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.printf("hasUniqueChar(abcdeeee) = %s\n",isUnique("abcdeeee"));
		System.out.printf("hasUniqueChar(abcdeeee) = %s\n",isUnique("abcdefgh"));
	}

}
