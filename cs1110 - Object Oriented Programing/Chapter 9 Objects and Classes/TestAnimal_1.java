/* TestAnimal_1.java Demonstrates the no-arg constructor. */

class Animal_1 {
	String name;
	int numOfLegs;
	boolean hungry;

	Animal_1(){
		name = "Dog";
		numOfLegs = 4;
		hungry = false;
		System.out.println("Just created an animal." + " I am a " + name + "!");
	}

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
}//end class Animal_1


public class TestAnimal_1 {
	public static void main(String[] args) {

		Animal_1 bob = new Animal_1(); //creating and instance of Animal

		Animal_1 sue;
		sue = new Animal_1();

	}//end main
}//end TestAnimal_1

