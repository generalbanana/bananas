import java.io.*;
import java.util.Scanner;

class reverser {
	public static void main(String args[]) {

	int a, reversed;

	Scanner in = new Scanner(System.in);
	System.out.println("Enter Integer to be Reversed");

	a = in.nextInt();

	reversed = reverseInt(a);

	System.out.println("Reversed Number: " + reversed);

  }

	public static int reverseInt(int input)	{
	    long reversedNum = 0;
	    long a = input;

	    while (a != 0) {
	        reversedNum = reversedNum * 10 + a % 10;
	        a = a / 10;
	    }

	    return (int)reversedNum;
	}

}
