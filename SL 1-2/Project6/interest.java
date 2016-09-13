import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class interest {
	public static void main(String args[]) {
	
	double a,b;
	
	Scanner in = new Scanner(System.in);
	System.out.println("The Starting Amount of Money");
	a = in.nextDouble();
	System.out.println("The Interest Rate in Percent");
	b = in.nextDouble();
	
	b = b/100;
	
	for(int i = 1; i <= 30; i ++){
		a = a * (1 + b);
		System.out.println("Year: "+i+ " Amount in Account ($): "+a);
	}
	}
}
