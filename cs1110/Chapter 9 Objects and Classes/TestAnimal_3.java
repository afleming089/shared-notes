/* TestAnimal_3.java   Example using the default constructor.  */

class Animal_3 {
	String name = "Dog";
	int numOfLegs;   //= 4;
	boolean hungry;  // = false;

   // NO explicit constructor here....

	void eat(){
		System.out.println("I am eating.");
	}

	boolean isHungry() {
		if (hungry) {
			System.out.println("I am hungry.");
			return true;
		}
		else {
			System.out.println("I am not hungry.");
			return false;
		}
	}

	void sleep(){
		System.out.println("ZZZZZZZZZ");
	}
}//end class Animal


public class TestAnimal_3 {
	public static void main(String[] args) {
		Animal_3 animal123;

		animal123 = new Animal_3();
		System.out.println("My name is " + animal123.name);
		System.out.println("Legs  " + animal123.numOfLegs);
		System.out.println("Hungry " + animal123.hungry);


	}//end main
}//end TestAnimal_3

