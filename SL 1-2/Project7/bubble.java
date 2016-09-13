import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

//Conrad Dinse
//Period 7

class pi {
	public static void main (String args[]){
	
		int n,a,b,c, sum;
		
		n = 20;
		
		int array [] = new int [n]; 
		
		Random rand = new Random(100);
		
		for (int j = 0; j <=array.length; j++){
			
			a = rand.nextInt(100);
			array[j] = a;
			if (j==20){
			System.out.println("List of Random Numbers: " + array[j]);
			break;
		}}
	

		
}}