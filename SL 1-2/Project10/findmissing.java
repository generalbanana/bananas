import java.io.*;
import java.util.Scanner;

class findmissing {
	public static void main(String args[]) {

    int ar[] = new int[11];
    int evens = 0;
    int odds = 0;
    int result;

    System.out.println("Enter the First 11 digits of the Code:");
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 11; i++){
      ar[i] = in.nextInt();
    }

    for (int i = 0; i < 11; i++){
      if (ar[i] % 2 == 0){
        evens += ar[i];
      } else {
        odds += ar[i];
      }
    }

    result = ((odds*3) + evens)%10;
		result = 10-result;
		System.out.println("Your Missing Digit is: " + result);

	}
}
