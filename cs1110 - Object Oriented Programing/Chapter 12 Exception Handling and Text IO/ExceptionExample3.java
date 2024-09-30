//This program reads in an integer and calls method
//sillyMethod(int x). If x is not even, an IllegalArgumentException
//is thrown and the main will handle the exception.

import java.util.Scanner;

public class ExceptionExample3 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter an integer: ");
	  int number = input.nextInt();
	  try {
		  sillyMethod(number);
	  }
	  catch (IllegalArgumentException ex){
		  System.out.println(ex.getMessage());

	  }

	 System.out.println("Made it to the end");
  }//end main

	public static void sillyMethod(int x){
	  if (x%2 ==1)
		  throw new IllegalArgumentException("number must be even");
	  else
		  System.out.println(x);
	}
}//end class ExceptionExample