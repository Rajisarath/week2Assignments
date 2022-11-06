package week2.day4ass3;
/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

public class Palindrome {
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		//int length=str.length();
		char[] result=str.toCharArray();
		
		for(int i=result.length-1;i>=0;i--) {
			   rev+=result[i];
		}
			   System.out.println(rev);
				if(str.equalsIgnoreCase(rev)) {
					System.out.println(str + " : Palindrome");
					
				}
				else 
				{
					System.out.println(str+"not a Palindrome");
				}
				
			}
			
		}
	


