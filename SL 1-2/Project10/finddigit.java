import java.io.*;
import java.util.Scanner;

class finddigit {
	public static void main(String args[]) {

    int ar[] = new int[12];
    int evens = 0;
    int odds = 0;
    int result = 0;

    System.out.println("Enter the 12 digits of the Code:");
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < 12; i++){
      ar[i] = in.nextInt();
    }

    for (int i = 0; i < 12; i++){
			if (ar[i] == -1){
				ar[i] = 0;
			}	else if (i % 2 == 0){
        evens += ar[i];
      } else if (i % 2 != 0) {
        odds += ar[i];
      }
    }

		result = ((odds * 3) + evens)%10;
		while (result >= 10) {
			result -= 10;
		}
		
		System.out.println("Your Missing Digit is: " + result);

	}
}
