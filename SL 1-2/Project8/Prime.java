import java.io.*;
import java.util.Scanner;

class prime {
	public static void main(String args[]) {

    int a;
    boolean prime = true;

    System.out.println("Enter an Integer");
		Scanner in = new Scanner(System.in);

    a = in.nextInt();

    prime = findprime(a);

    System.out.println("Is the Number a Prime Number: " +prime);
	}
  public static boolean findprime (int a){
    boolean prime = true;
    for (int i = 2; i < a; i++){
      if (a % i == 0){
        prime = false;
      }
    }
  return prime;
  }
}
