import java.io.*;
import java.lang.Math;

class interesttable {
  public static void main(String[] args) {

    double loan = 270000;
    double rate = 0.037 / 12;
    double periods = 360;
    double remaining;
    double payment;
    double paid = 0;
    double principal;

    payment = findpayment(loan, rate, periods);

    System.out.println("Month   Amount Left   Principal   Total Paid");

    for (int i = 1; i <= 360; i++) {
      remaining = rounding(loan * (Math.pow(rate + 1, i)) - payment * ((Math.pow(rate + 1, i) - 1) / rate));
      paid += payment;
      paid = rounding(paid);
      principal = rounding(loan - remaining);
      System.out.println(format(i, remaining, paid, principal));
    }
  }
  public static double findpayment (double loan, double c, double periods) {
    double payment = rounding(loan * c * Math.pow(c + 1, periods) / (Math.pow(c + 1, periods) - 1));
    return payment;
  }
  public static double rounding (double value) {
    double rounded = Math.round(value * 100.0) / 100.0;
    return rounded;
  }
  public static String format (int i, double remaining, double paid, double principal) {
    String table = "";
    table += i + "      ";
    String swap = Double.toString(remaining);
    int space = 9 - swap.length();
    for (int j = 0; j < space; j++) {
      table += " ";
    }
    table += swap;
    swap = Double.toString(principal);
    space = 3;
    for (int j = 0; j < space; j++) {
      table += " ";
    }
    table += swap;
    swap = Double.toString(paid);
    space = 3;
    for (int j = 0; j < space; j++) {
      table += " ";
    }
    table += swap;
    return table;
  }
}
