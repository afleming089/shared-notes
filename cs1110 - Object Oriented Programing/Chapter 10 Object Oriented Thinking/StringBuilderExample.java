public class StringBuilderExample {
  public static void main(String[] args) {

	 // group1();  //just the basics

	  //group2();  // with digits

	 //group3();  // capacity, length, append method

	 group4();   //Insert, Delete, Reverse, setCharAt

   }  //end main

   public static void group1(){

	  StringBuilder myStringBuilder = new StringBuilder("hello");
	  myStringBuilder.append("ABCDE");
	  System.out.println("myStringBuilder = " + myStringBuilder);
	  System.out.println("char at position 5 is " + myStringBuilder.charAt(5));

   }

   public static void group2(){
   	  StringBuilder mydigitStringBuilder = new StringBuilder();
   	  StringBuilder myStringBuilder = new StringBuilder();

   	   /*** Creating and building myStringBuilder    ****/
   	  mydigitStringBuilder.append(456);
	  System.out.println("the digit string is " + mydigitStringBuilder);
  }


  public static void group3(){
  	  StringBuilder myStringBuilder = new StringBuilder();

  	  System.out.println("The length of myStringBuilder initially is "
  	  						+ myStringBuilder.length()
  	                       + " characters long. capacity=" + myStringBuilder.capacity());


  	  myStringBuilder.append("Welcome");

  	  myStringBuilder.append(' ');

  	  myStringBuilder.append("to");

  	  myStringBuilder.append(' ');

  	  myStringBuilder.append("Java");

  	  System.out.println("myStringBuilder is " + myStringBuilder.toString());
  	  System.out.println("myStringBuilder is now " + myStringBuilder.length()
  	                      + " characters long.");
  	  System.out.println("Printing myStringBuilder without calling toString()  " +
			                    myStringBuilder);
  	  System.out.println("The length of myStringBuilder initially is "
  	  						+ myStringBuilder.length()
  	                       + " characters long. capacity=" + myStringBuilder.capacity());
	   myStringBuilder.append("ZZZZZZZZ");
	     	  System.out.println("The length of myStringBuilder initially is "
	     	  						+ myStringBuilder.length()
  	                       + " characters long. capacity=" + myStringBuilder.capacity());
	  System.out.println("\n\n***************************************\n\n");
  }


  public static void group4(){
	  StringBuilder myStringBuilder = new StringBuilder();
	  System.out.println("myStringBuilder.capacity() = " + myStringBuilder.capacity());

	  myStringBuilder.append("Welcome to Java");
      System.out.println("myStringBuilder.capacity() = " + myStringBuilder.capacity());

  /*  Insert, Delete, Reverse, setCharAt            */
	  myStringBuilder.insert(11, "HTML and ");

	  System.out.println("myStringBuilder is  " + myStringBuilder.toString());
      System.out.println("*******");

	  myStringBuilder.delete(8,11);
	  System.out.println("\nmyStringBuilder.delete(8,11) is  " + myStringBuilder.toString());

	  System.out.println("\nmyStringBuilder.reverse() is " + myStringBuilder.reverse());
	  System.out.println("After reverse myStringBuilder is " + myStringBuilder.toString());
	  System.out.println("char at 5 " + myStringBuilder.charAt(5));

	  myStringBuilder.reverse();   //turn our string back around. It's hard to read
	  							  // backwards.
      System.out.println("**************************");
	  myStringBuilder.setCharAt(0,'w');
	  System.out.println("myStringBuilder.setCharAt(0,'w') is " + myStringBuilder);
	  System.out.println("\n\n");

	  System.out.println("myStringBuilder.capacity() = " + myStringBuilder.capacity());
	  System.out.println("myStringBuilder.charAt(5)= " + myStringBuilder.charAt(5));
	  System.out.println("myStringBuilder.length()= " + myStringBuilder.length());

  }

  public static void group5(){
  	   String s = "Happy Friday";
  	   char c = s.charAt(4);

  	   //test if uppercase
	  boolean b = Character.isUpperCase(c);

	  //convert to uppercase
	  c = Character.toUpperCase(c);
  }
} //end StringBuilderExample


