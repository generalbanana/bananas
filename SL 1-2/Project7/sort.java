import java.util.Scanner;
import java.util.Random;
 
class sort {
	public static void main(String []args) {
  
  int n, j, i, swap;
    Scanner in = new Scanner(System.in);
 
    n = 20;
 
    int array[] = new int[n];
	Random rand = new Random(100); 
  
 
    for (j = 0; j < n; j++) 
      array[j] =rand.nextInt(100);
	  System.out.println("20 random integers: ");
	  
    for (j = 0; j < n; j++) 
		System.out.println(array[j]);
	
    for (j = 0; j < ( n - 1 ); j++) {
      for (i = 0; i < n - j - 1; i++) {
        if (array[i] > array[i+1]) 
        {
		  swap = array[i];
			  array[i]   = array[i+1];
			  array[i+1] = swap;
        }
	  }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (j = 0; j < n; j++) 
      System.out.println(array[j]);
  }
}