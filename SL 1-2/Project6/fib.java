import java.io.*;
import java.util.Scanner;

class fib {
	public static void main(String args[]) {
	
	int n,j,swap;
	int fib1 = 1;
	int fib2 = 0;
	
	System.out.println("Enter n Number of  Fib Sequence")	;
	Scanner in = new Scanner(System.in);
	n = in.nextInt();

	System.out.print("0" + "\t" + "1" + "\t");
	
	for (j = 0; j <= n - 3; j++){
		swap = fib2;
		fib2 = fib1;
		fib1 = fib2 + swap;
		System.out.print(fib1 + "\t");
	}
	
	System.out.println("The Value of n is: " + fib1);
	
	}
}