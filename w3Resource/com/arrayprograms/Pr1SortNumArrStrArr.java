
/*
 1. Write a Java program to sort a numeric array and a string array.
*/
package w3Resource.com.arrayprograms;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr1SortNumArrStrArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		Random rn = new Random();
		
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(100);
		}
		
		System.out.println("Original Numeric Array : ");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Numeric Array : ");
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = new String[n];
		System.out.println("Enter Strings for array ");
		
		for(int i=0;i<n;i++) {
			arr1[i] = sc.next();
		}
		
		System.out.println("Original String Array ");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("After sorting the array ");
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	
}
