import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

//Conrad Dinse
//Period 7

class pi {
	public static void main (String args[]){
	
		double x,y;
		double guess;
		double ayylmao = 0;
		double throwsin = 0;
	
			Random rand = new Random();
		
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Number of Dart Throws:");
		
			guess = in.nextInt();
		
			for(int i = 1; i <= guess; i ++ ){
		
				x = rand.nextDouble();
				y = rand.nextDouble();
			
				ayylmao = Math.sqrt((x*x) + (y*y));
		
				if ( ayylmao<=1){
					throwsin++;
				}
			}
			System.out.println("Pi is equal to: " + ((throwsin*4) / guess));
	}
}	