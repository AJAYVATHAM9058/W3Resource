
//Write a java program to calculate average value of array elements
package w3Resource.com.arrayprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr3AvgValArr {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Enter length of the array : ");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = rn.nextInt(1000);
		}
		System.out.println("Array elements are : ");
		System.out.println(Arrays.toString(arr)+"\n");
		
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		float avg = sum / (float)n ;
		System.out.println("Sum of elements are : "+sum);
		System.out.println("Average of array elements : "+avg);
		
	}

}
