package com.yyc.ctci.ch1;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given
 * the "true" length of the string. (Note: If implementing in Java, please use a character array
 * so that you can perform this operation in place.)
 * 
 * @author YYC
 *
 */
public class Q3_URLify {

	public static String urlify(String s, int length){
		StringBuilder sb = new StringBuilder();
		int i;
		for(i = 0; i < length; i++){
			char c = s.charAt(i);
			if(' ' == c){
				sb.append("%20");
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	
}
