import java.io.*;
import java.util.Scanner;

class primefactor {
    public static void main(String[] args) {

      int a;
      boolean prime;
      String factoring;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      a = in.nextInt();

      prime = findprime(a);
      factoring = factor(prime, a);

      System.out.println("Prime Factors of The Number: " + factoring);

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

    public static String factor(boolean prime, int input) {
        String factor = "";

        if (prime == true) {
            factor = "1 * " + String.valueOf(input);
        } else {
            for (int i = 2; i <= input; i++) {
                while (input % i == 0) {
                    input = input / i;
                    factor += " * " + String.valueOf(i);
                }
            }
            factor = factor.substring(3,factor.length());
        }
        return factor;

    }
}
