import java.io.*;
import java.util.Scanner;

class perfectnum {
	public static void main(String args[]) {

    System.out.println("Perfect numbers from 1 to 1000");

    for (int i = 1; i <= 1000; i++) {
    PerfNum(i);
    }
  }

  public static void PerfNum(int num) {

		int sum = 0;

    for(int j = 1; j < num; j++) {
      if ((num % j) ==0) {
        sum = sum + j;
      }
    }

    if(sum==num) {
      System.out.println(num + " is a perfect number");
    }
  }
}
