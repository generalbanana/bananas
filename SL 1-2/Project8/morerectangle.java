import java.io.*;
import java.util.Scanner;

class morerectangle {
	public static void main(String args[]) {

    int w,h;
    String digit;
    String rect;

    Scanner in = new Scanner(System.in);
    System.out.println("Enter Width then Height then Character");

    w = in.nextInt();
    h = in.nextInt();
    digit = in.next();

    rect = makeRectangle(w,h,digit);

  }

  public static String makeRectangle (int w, int l, String digit){

    String line = "";
    String inside = "";

		for(int i = 0; i<w; i++){
			System.out.print(digit);
		}
		System.out.print("\n");
		int space = w -2;
		for (int j = 0; j < space; j++){
			inside += digit;
		}
		for (int k = 0; k < l -2; k++){
			System.out.println(digit + inside + digit);
		}
		for(int i = 0; i<w; i++){
			System.out.print(digit);
		}
		return inside;
  }
}
