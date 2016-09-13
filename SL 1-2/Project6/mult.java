import java.io.*;
import java.util.Scanner;

class mult {
	public static void main(String args[]) {
	
		int x = 0;
		int y = 0;
		int i,j;
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Rows:");
		x = in.nextInt();
		System.out.println("Enter Columns:");
		y = in.nextInt();
	
		for (i = 1; i <= x; i++){
			for(j = 1; j <= y; j++){
				System.out.print("\t" + (i * j));
			}
		}
	}
}