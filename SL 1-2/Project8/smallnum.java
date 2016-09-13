import java.io.*;
import java.util.Scanner;

class smallnum {
	public static void main(String args[]) {

	  int a,b,c;
		int currentsmallest;

		System.out.println("Enter 3 Integers");
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		currentsmallest = findsmallest(a,b,c);

		System.out.println("The Smallest Number is: " + currentsmallest);
	  }
	public static int findsmallest (int a, int b, int c) {
			int smallest = 0;
			if(a < b){
				if(a < c){
					smallest = a;
				}
			} else if(c < b){
				if(c < a){
					smallest = c;
				}
			} else if(b < a){
				if(b < c){
					smallest = b;
				}
			}
			return smallest;
		}
	}
