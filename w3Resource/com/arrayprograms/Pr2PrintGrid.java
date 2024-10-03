
/*
 Write a Java program to print the following grid. 

 */

package w3Resource.com.arrayprograms;

public class Pr2PrintGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[10][15];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
