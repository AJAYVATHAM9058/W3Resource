//Write a java program to test if array contains specific value

package w3Resource.com.arrayprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr5findNum {

	public static boolean contains(int arr[],int num) {
		
		for(int n : arr) {
			if(n == num) return true;
		}
		
		return false;
	}
	
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
		
		System.out.println("Enter num to find : ");
		int num = sc.nextInt();
		
		if(contains(arr,num)) System.out.println(num+" is Present");
		else System.out.println("Not Present");
		
	}
	
}
