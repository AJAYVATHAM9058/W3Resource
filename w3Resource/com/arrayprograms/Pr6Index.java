
//Write a java program to find index of an element of an array
package w3Resource.com.arrayprograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pr6Index {

	public static int retIndex(int[]arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i])
				return i;
		}	
		return -1;
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
		
		System.out.println("Enter number to find index");
		int num = sc.nextInt();
		int index = retIndex(arr,num);
		if(index<0) {
			System.out.println("Not Present");
		}
		else System.out.println("Present at "+index +" Index");
	}
}
