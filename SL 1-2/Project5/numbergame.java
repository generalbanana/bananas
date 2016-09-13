import java.io.*;
import java.util.Scanner;
import java.util.Random;

//Conrad Dinse
//Period 7

class numbergame {
	
	public static int num;
	public static int user = 1;
	public static int total = 0;
	
	public static void main (String args[]) {
		
		Random rand = new Random(1000);

		num = rand.nextInt(1000);
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("This is a number game, enter a number between 1 and 1000 (0 to Stop and -1 for the answer)");

	
		while (user != 0) {
							
		user = in.nextInt();
		
		total = total + 1;
		
			if (user > num) {
				System.out.println("Too High");
			}
			
			if (user < num) {
				System.out.println("Too Low");
			}
			
			if (user == -1) {
				System.out.println(num + " Number of Guesses: " + total);
				user = 0;
			}
			if (user == num) {
				System.out.println("You Win, Number of Guesses: " + total);
				user = 0;
			}
		}
	}	
}

