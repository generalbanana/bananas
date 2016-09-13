import java.io.*;
import java.util.Scanner;
import java.util.Random;

//Conrad Dinse
//Period 7

class pattern {
	public static void main (String args[]){
	
	int size;
	int i,j,k=0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of lines you want the pattern to be");
	
	size = in.nextInt();


		for(j=size+1; j>0; j--){

			String segment = j + "  ";
			String layer = "";
			k++;
			
			for(i = 1; i < k; i++) {
			layer +=segment;
			}
			System.out.println(layer);
		}
		
	}
}