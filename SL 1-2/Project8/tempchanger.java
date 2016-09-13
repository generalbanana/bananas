import java.io.*;
import java.util.Scanner;

class tempchanger {
	public static void main(String args[]) {

    double temp;
    double convert;
    int count = 1000000;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter Your Temperature in Farenheit");

    temp = in.nextDouble();

    temp = celcius(temp);

    System.out.println("Your Temperature in Celsius: " + temp);

    for(int i = 0; i < count; i++){
      temp = farenheit(temp);
      temp = celcius(temp);
    }

    temp = farenheit(temp);

    System.out.println("The original Temperature after Being Converted a Million Times in Farenheit: " + temp);

    }

  public static double celcius (double temp){
    temp = temp - 32;
    temp = temp / 1.8;
    return temp;
  }

  public static double farenheit (double temp){
    temp = temp * 1.8;
    temp = temp + 32;
    return temp;
  }
}
