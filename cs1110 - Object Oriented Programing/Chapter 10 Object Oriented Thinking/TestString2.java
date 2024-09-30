/*Belinda Copus
 * Examples with String and Character
 */

import java.util.Scanner;

public class TestString2{
	public static void main(String[] args){
		String str1;
		String str2;
		String str3 = "bla bla bla";



		//group4();    /***** examples from pages 340-344   ****/

		//group5();    /** toLowerCase, toUpperCase, trim, replace, replaceFirst, replaceAll, split   **/

		//group6();    // demonstrate split method, must use array to print out all of substrings   **/

		//group7();   /** indexOf, lastIndexOf    **/

		group8();  /********* Character    A Wrapper class  pg. 351******/

	} //end main

	public static void group4(){
		/***** examples from pages 340-344   ****/
	   String myString = "Pepperoni Pizza";


		/** length()  **/
		System.out.println("myString is " + myString.length() + " characters long.");
		     /** output is 15 **/

		/** substring   **/
		System.out.println("The string myString = "  + myString);
		System.out.println("myString.substring(4) " + myString.substring(4));
						/*** prints "eroni Pizza"  ***/

		System.out.println("myString.substring(4,8) " + myString.substring(4,8));
						/*** prints "eron" ***/

	}//end group4

	public static void group5(){
		String newString;
		/** toLowerCase, toUpperCase, trim, replace, replaceFirst, replaceAll, split   **/

	   String myString = "Pepperoni Pizza";
	   System.out.println();
	   System.out.println("myString.toLowerCase() = " + myString.toLowerCase());
				/*** prints out "pepperoni pizza" ****/


	   //myString = myString.toLowerCase();
	   System.out.println("myString is = " +  myString);
				/*** prints out "Pepperoni Pizza"  myString isn't changed, immutable  **/

	   System.out.println("myString.toUpperCase() = " + myString.toUpperCase());
				/*** prints out "PEPPERONI PIZZA"  **/

	   System.out.println("myString is = " + myString);
				/*** prints out "Pepporoni Pizza" myString isn't changed, immutable  **/

	   System.out.println("myString.replace('p','t') = " + myString.replace('p','t'));
				/*** prints out "Petteroni Pizza"  ***/ /* *****/

		System.out.println("myString is = " + myString);
				/** prints out "Pepperoni Pizza" myString isn't changed, immutable  **/

	   System.out.println();
	   newString = myString.replace('p','t');
	   System.out.println("newString is =" + newString);
		/** prints out "Petteroni Pizza"   **/

 	   System.out.println("myString is =" + myString);
		/** prints out "Pepperoni Pizza" myString isn't changed, immutable   **/

		//update myString to a new string...contents
		myString = myString.replace('p','t');
		System.out.println("myString is =" + myString);

	}//end group 5

	public static void group6(){

		// demonstrate split method, must use array to print out all of substrings   **/
	   String myString = "Pepperoni Pizza";

	   String[] tokens = myString.split("p");
	   for (int i=0; i<tokens.length; i++){
			System.out.print("tokens[" + i + "] = " + tokens[i] + "  ");
	   }

	   System.out.println("\n****" + "Java is Fun.".matches("J.*va.*"));
      /** output token0 = p token1 = pp	token2= roni Pizza  **/

	   System.out.println(); System.out.println();
   }


   public static void group7(){

     /** indexOf, lastIndexOf    **/
      String myString = "Pepperoni Pizza";

      System.out.println("myString.indexOf('o') = " + myString.indexOf('o'));
   		/** output 6 **/

      System.out.println("myString.lastIndexOf('z') = " + myString.lastIndexOf('z'));
   		/** last z is at 13 **/

      System.out.println(); System.out.println();
  }//end group7

  public static void group8(){


	 /********* Character    A Wrapper class  pg. 351******/

	/** create the Character object  **/
	 Character myCharacter = new Character('t');  //construct for an object of type Character

	 String myDigitString = "12345";
	 String aString = "Hello";

	/** Character methods charValue, isDigit, isLetter, toUpperCase, isUpperCase   **/
	System.out.println("myCharacter is= " + myCharacter);
	System.out.println("Character.isDigit(myDigitString.charAt(3)) = " +
						Character.isDigit(myDigitString.charAt(3)));
					/** prints out true  **/

	System.out.println("myCharacter.isLetter(myDigitString.charAt(3)) = " +
						myCharacter.isLetter(myDigitString.charAt(3)));
					/*** prints out false   ***/

	System.out.println("myCharacter is lowercase " + Character.isLowerCase(myCharacter));  //display true
	System.out.println("Is H capitalized? " + Character.isUpperCase(aString.charAt(0)));  //display true

	System.out.println();

	/** Lets check and see if a password meets the requirements of being all letters
		and digits.  **/
	String myPassword = "AB12cd$";
	boolean legalPassword = true;
	for (int i=0; i< myPassword.length(); i++){
    	 if (!Character.isLetterOrDigit(myPassword.charAt(i)))
     		legalPassword = false;
	}
	if (legalPassword)
		System.out.println("The password " + myPassword + " is legal.");
	else
		System.out.println("The password " + myPassword + " is not legal.");
	}//end group8


} // end class TestString