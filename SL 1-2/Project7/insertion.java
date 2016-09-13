import	java.util.Scanner;
import	java.util.Random;

class insertion {
	public static void main(String []args) {

		int i, j, n, swap;

		n = 20;

		int array[] = new int[n];
		Random rand = new Random(100);

		System.out.println("List of 20 Random Numbers Between 1-100")

		for (j = 0; j< n; j++)
					array[j] =rand.nextInt(100);
			System.out.println(array[j]);
