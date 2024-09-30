/* TestAnimal4.java Demonstrates accessing properties and methods */

class Animal_4 {
	String name;
	int numOfLegs;
	boolean hungry;

	//no-arg constructor
	Animal_4(){
		name = "Dog";
		numOfLegs = 4;
		hungry = false;
		System.out.println("Just created an animal." + " I am a " + name + "!");

		//this("Dog", 4, false);
	}

	//constructor
	Animal_4(String newName, int legs, boolean h){
		name = newName;
		numOfLegs = legs;
		hungry = h;
		System.out.println("Just created an animal." + " I am a " + name + "!");
	}

	void eat(){
		System.out.println("I am eating.");
		sleep();
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

public class TestAnimal_4 {
	public static void main(String[] args) {


        Animal_4 zebra = new Animal_4();
		System.out.println("\nDemonstrating properties and methods.");
		System.out.println("My name is " + zebra.name);
		System.out.println("I have " + zebra.numOfLegs + " legs.");
		System.out.println("I am hungry " + zebra.hungry);

		Animal_4 cat = new Animal_4("Cat",4,true);
		Animal_4 chicken = new Animal_4("Chicken",2,true);
		Animal_4 worm = new Animal_4("Worm",0,false);

		System.out.println("\nDemonstrating properties and methods.");
		System.out.println("My name is " + cat.name);
		System.out.println("I have " + cat.numOfLegs + " legs.");
		System.out.println("I am hungry " + cat.hungry);

		System.out.println("\nDemonstrating if statement");
		System.out.println("Cat is hungry = " + cat.isHungry());
		if (cat.isHungry()){
			System.out.println("eating now!");
			cat.eat();
		}
		System.out.println("\nDemonstrating calling a method.");
		cat.sleep();
	}//end main
}//end TestAnimal_4

