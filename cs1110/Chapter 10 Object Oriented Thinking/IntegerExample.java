  /* Belinda Copus
   * Examples to demonstrate the wrapper class Integer.
   */

  public class IntegerExample{
  	public static void main(String args[]) {

       int a = 5;
	   Integer myInt1 = new Integer("5");
	   Integer myInt2 = new Integer(5);
	   Integer myInt3 = new Integer(a);

	   System.out.println("int1= " + myInt1 + " int2 = " + myInt2 + " int3 = " + myInt3);

       //valueOf method
	   int myInt4 = Integer.valueOf(myInt2);
	   System.out.println("valueOf myInt4= " + myInt4 + "  Binary valueOf 11="
	                       + Integer.valueOf("11",2));
       System.out.println("\n\n\n");

	   //compareTo method
	   System.out.println("myInt2 compareTo myInt3 = " + myInt2.compareTo(myInt3));

	    //another way to use the static method valueOf
	    int myInt5 = Integer.valueOf("11",8);  //octal  9
	    System.out.println("11 in base 8 is " + myInt5);

        Integer myInt6 = Integer.valueOf(32);
        System.out.println("myInt6 is " + myInt6);


        System.out.println("The largest integer on this machine is " + Integer.MAX_VALUE);

        Integer biggest = Integer.MAX_VALUE;
        Byte biggestByte = Byte.MAX_VALUE;
        System.out.println("The largest byte is " + biggestByte);

        byte x = biggest.byteValue();
        System.out.println("x=" + x);

		System.out.println("\n\n\n");
        Integer numX = new Integer(255);
        System.out.println("Float value for numX is " + numX.floatValue());

        System.out.println("Demonstrating parseInt " + Integer.parseInt("99999"));

		System.out.println("max byte = " + Byte.MAX_VALUE);

        System.out.println("\n\n\n");
		//using parseInt
	    int num =Integer.parseInt("9");
	    int b = Integer.parseInt("444",16);

	    System.out.println(num);
	    System.out.println(b);

	}
 }