
/*
 write a java program to convert decimal number to hexadecimal numeber
*/
package w3Resource.com.arrayprograms;

import java.util.Random;

public class decToHex {

	public static void decTohex(int n) {
		int rem;
		String hexDec= "";
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0) {
			rem = n%16;
			hexDec = ch[rem] + hexDec; 
			n = n/16;
		}
		System.out.println(hexDec);
	} 
	
	public static void main(String[] args) {
		Random rn = new Random();
		int n = rn.nextInt(1000);
		System.out.println("Given Integer : " +n);
		decTohex(n);
	}
}
