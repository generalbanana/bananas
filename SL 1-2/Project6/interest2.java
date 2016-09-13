import java.io.*;
import java.util.Scanner;

class interest2 {
	public static void main(String args[]) {
	
		double a,b,c;
		double lmao;
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("The Starting Amount of Money");
		a = in.nextDouble();
		lmao = a;
		System.out.println("The Interest Rate in Percent");
		b = in.nextDouble();
		System.out.println("Deposit a set amount of money for every month:");
		c = in.nextDouble();
	
	
		b = b/100;
	
		for(int i = 1; i <= (30) ; i ++){
			a = (a * (1 + b) + 12*c) ;
		}
		for(int i = 1; i <= (30); i ++){
		lmao = lmao * (1 + b);
	}
	System.out.println("Amount after 30 years: " + (Math.round(a+12*c)) + " Without the Monthly Deposit: " + Math.round(lmao)) ;
	}
}