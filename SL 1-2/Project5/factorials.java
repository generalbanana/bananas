import java.io.*;
import java.util.Scanner;

class factorials {
	public static void main(String args[]) {

		int num;
		int i,j,k;
		int[] array;	
		int result = 1;
		
		String[] factors;
		String printString = "";
	
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Number");
		num = in.nextInt();
		
		array = new int[num];
		factors = new String[num];
		
		for (i = 0; i < num; i++) {
			array[i] = i + 1;
		}
		for (j = 0; j < num; j++) {
			printString += " x " + (j + 1);
			factors[j] = printString;
			result = result * array[j];
			array[j] = result;
			//System.out.println(printString);
		}
		for (k = 0; k < num; k++) {
			factors[k] = factors[k].substring(3);
			System.out.println((k + 1) + "!" + " = " + factors[k] + " = " + array[k]);
		}
	}
}