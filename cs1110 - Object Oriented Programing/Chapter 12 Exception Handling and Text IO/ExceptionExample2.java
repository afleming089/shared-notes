//This program reads in two integers and displays
//their product.  If a value that is not an integer is
//entered, an InputMismatchException is generated.
//and the program gracefully terminates

import java.util.Scanner;
import java.util.*;

public class ExceptionExample2 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int[] array = new int[3];
	  System.out.print("Enter two integer: ");
     try {
		 System.out.println(array[4]);
		 int n1 = input.nextInt();
		 int n2 = input.nextInt();
		 System.out.println("The product is " + (n1 * n2));
	 }
	 catch (InputMismatchException ex){
		 System.out.println("you must enter an integer");
	 }
	 catch (ArrayIndexOutOfBoundsException ex){
		 System.out.println("Index was out of bounds.");
	 }

	  System.out.println("Made it to the end");
  }//end main
}//end class ExceptionExample