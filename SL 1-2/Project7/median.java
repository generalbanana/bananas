import	java.util.Scanner;
import	java.util.Random;

class median {
	public static void main(String []args) {

		int i, j, n, swap;

		n = 13;

		int array[] = new int[n];
		Scanner in = new Scanner(System.in);

		System.out.println("Enter 13 Numbers");

		for (j = 0; j< n; j++)
			array[j] =in.nextInt();
		  System.out.print(array[j]);

		for (j = 0; j < n; j++)
			System.out.print(array[j]);

    System.out.println("Median Entry of Array");

		for (j=7; j<8; j++){
			array[j] = array[j-6];
			System.out.println(array[j]);
		}
	}
}
