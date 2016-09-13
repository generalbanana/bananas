import java.io.*;
import java.util.Random;

class flip {

  public static Random rand = new Random();

  public static void main (String args[]) {

    double[] flips = new double[100];
    int[] sixcount = new int[2];
    double counter = 0;
    int max = 1000000;

    for (int i = 0; i < max; i++) {
      flips = fill_array();
      if (prob_of_six_or_more(flips, sixcount) == true) {
        counter++;
      }
    }

    System.out.println("Percent Probability of Getting 6 or More Heads or Tail in a Row: " + counter / max * 100 + "%");

  }

  public static double[] fill_array () {
    double[] flips = new double[100];
    for (int j = 0; j < flips.length; j++) {
      flips[j] = rand.nextDouble();
    }
    return flips;
  }

  public static boolean prob_of_six_or_more (double[] flips, int[] counter) {
    boolean probability = false;
    for (int j = 0; j < 100; j++) {
      double result = flips[j];
      if (result <= .5) {
        counter[0] += 1;
        counter[1] = 0;
        if (counter[0] == 6 || counter[1] == 6) {
          probability = true;
          break;
        }
      } else {
        counter[1] += 1;
        counter[0] = 0;
        if (counter[0] == 6 || counter[1] == 6) {
          probability = true;
          break;
        }
      }
    }
    return probability;
  }
}
