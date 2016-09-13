import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

//Conrad Dinse
//Period 7

class picture {
	public static void main (String args[]){
	



	String line = "";
	String inside = "";
	
	int j,i;
	int w,l;
	int space;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the width then height of your rectangle");
	
	w = in.nextInt();
	l = in.nextInt();


	for(i = 0; i<w; i++){
		System.out.print("*");
	}
	System.out.print("\n");
	space =Math.round(w/2);
	for (j = 0; j < space; j++){
		inside += "0*";
	}
	space = Math.round(l/2);
	for (int k = 0; k < space; k++){
		System.out.println ("*" + inside);
		for(i = 0; i<w; i++){
			System.out.print("*");
		}
		System.out.println("");
	}
	}
}