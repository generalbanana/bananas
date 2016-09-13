import java.io.*;
import java.lang.Math;

class interesttable2 {
  public static void main(String[] args) {

    double loan;
    double rate;
    double periods;
    double remaining;
    double remaining2;
    double payment;
    double paid;
    double principal;

    loan = 270000;
    rate = 0.037/12;
    periods = 360;
    remaining = 1;
    paid = 0;

    payment = findpayment(loan, rate, periods);
    System.out.println("Month   Amount Left   Prinicpal   Total Paid");

    for (int i = 1; i <= 360; i++) {
      if(remaining <= 0){
        continue;
      }
      if (i == 1) {
        remaining = loan * (rate + 1) - rate * (((Math.pow(rate + 1, 1)) - 1) / rate);
        remaining2 = remaining;
      } else {
        remaining2 = remaining * (Math.pow(rate + 1, 1)) - payment * ((Math.pow(rate + 1, 1) - 1) / rate);
      }
      remaining = rounding(remaining);
      remaining2 = rounding(remaining2);
      paid += payment;
      paid = rounding(paid);
      principal = rounding(loan - remaining);
      if (i % 12 == 0 && remaining > 0) {
        remaining2 -= payment;
        remaining -= payment;
        remaining2 = rounding(remaining2);
        remaining = rounding(remaining);

        paid += payment;
        paid = rounding(paid);

        principal = loan - payment;
        principal = rounding(principal);
      }
      System.out.println(format(i, remaining2, paid, principal));
      remaining = remaining2;
    }
  }
  public static double findpayment(double loan, double rate, double periods) {
    double payment = loan * rate * Math.pow(rate + 1, periods) / (Math.pow(rate + 1, periods) - 1);
    payment = rounding(payment);
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
