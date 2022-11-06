package week2.day4ass3;

import java.util.Arrays;

//Here is the input
		//int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
		
public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		int length=arr.length;
		int sumofarr=(length*(length+1))/2;
		int sum=0;
		System.out.println("arry length" + length);
		
		for(int i=0;i<=length-2;i++) {
			sum+=arr[i];
		}
		int missnum = sumofarr-sum;
		System.out.println("MissingElement" + missnum);
		
		
		

	}

}
