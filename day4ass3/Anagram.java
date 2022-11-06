package week2.day4ass3;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */



public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		if(text1.length()!=text2.length()){
			System.out.println("not Anagram ");
		}else {
			System.out.println("Anagram");
		}
		char[] chars=text1.toCharArray();
		char[] chars1=text2.toCharArray();
		
		Arrays.sort(chars);
		Arrays.sort(chars1);
		if(Arrays.equals(chars,chars1)) {
			System.out.println("arrays has same value");
			
		}else {
			System.out.println("arrays are not same value");
		}
		
	   
	    

	}

}

