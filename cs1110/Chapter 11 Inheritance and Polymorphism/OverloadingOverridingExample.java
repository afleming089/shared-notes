public class OverloadingOverridingExample{
	public static void main(String[] args){
		 //Demonstrating overloading
		System.out.println("Demonstrating overloading");
		 A a = new A();
		 a.p(10);
		 a.p(10.0);

		 System.out.println();

		 //Demonstrating overriding
		 System.out.println("Demonstrating overriding");
		 D myD = new D();
		 myD.p(10);
		 myD.p(10.0);

	} //end main
}//end class OverloadingOverridingExample

class B {
  public void p(double i) {
	System.out.println(i * 2);
  }
}

class A extends B {
  // This method overriding the method in B
  public void p(double i) {
	  System.out.println(i);
  }
}


class  C{
  public void p(double i) {
    System.out.println(i * 2);
  }
}

class D extends C {
  // This method overloading the method in C
  public void p(int i) {
    System.out.println(i);
  }
}


