package week2.day4ass3;
/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */

public class FindIntersection {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		int length=a.length;
		int length1=b.length;
		for(int i=0;i<=length-1;i++){
			for(int j = 0;j<=length1-1;j++) {
				if(a[i]==b[j]) {
					System.out.println("both arrays matched" + a[i]);
				}
				
			}
			
		}

	}

}