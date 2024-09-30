/*Belinda Copus
 * bunch of examples with String
 */

import java.util.Scanner;

public class TestString{

	public static void main(String[] args){

		//group1();  /***** Demonstrating creating strings and comparing them  ******/

		//group2();  /******** Demonstrating the String methods length, concat, and charAt methods***/

		group3();  /******** Demonstrating the empty String***/

	} //end main

	public static void group1(){
		String str1;
		String str2;
		String str3 = "bla bla bla";
		String str99;

	/***** Demonstrating creating strings and comparing them  ******/
		str1 = "Hello World";
		str2 = new String("Hello World");

		str99 = str3.replace('a','A');
		System.out.println("**** " + str99);
		System.out.println(str3);

		System.out.println("str1= " + str1);
		System.out.println("str2= " + str2);

		if (str1 == str2)
			System.out.println("They reference the same object");
		else
			System.out.println("They look the same but are not the same!");

		if (str1.equals(str2)){
			System.out.println("Using the equals method.");
			System.out.println("\tEven though they are in different memory locations");
			System.out.println("\ttwo strings are the same string.");
		}
		else
		System.out.println("No Way are these the same.");
	}//end group1

	public static void group2(){
		String str1;
		String str2;
		String str3 = "bla bla bla";
		String str99;

		str1 = "Hello World";

		/******** Demonstrating the String methods length, concat, and charAt methods***/
		System.out.println("\nstr1 has " + str1.length() + " characters.");

		System.out.println("\nstr1 concated with str3= " + str1.concat(str3));
		String str4 = str1 + str3;
		System.out.println("\nstr1 short cut concat w/str3 = " + str4);

		System.out.println("\nThe character at position 6 of str1= " + str1.charAt(6));
		System.out.println();

	}


	public static void group3(){
		/******* One more thing ****/
		String str5= new String();
		System.out.println("This is the result of str5 = new String() ");
		System.out.println("str5=" + str5 + "***");
		System.out.println("\n\n");
	}

} // end class TestString