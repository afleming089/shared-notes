/* TestAnimal_2.java  Demonstrates the argument constructor. */

class Animal_2 {
	String name;
	int numOfLegs;
	boolean hungry;


	//no-arg constructor
	Animal_2(){
		name = "Dog";
		numOfLegs = 4;
		hungry = false;
		System.out.println("Just created an animal." + " I am a " + name + "!");
	}

	//constructor
	Animal_2(String newName, int legs, boolean h){
		name = newName;
		numOfLegs = legs;
		hungry = h;
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
}//end class Animal_2


public class TestAnimal_2 {
	public static void main(String[] args) {
		Animal_2 myAnimal;

		myAnimal = new Animal_2();

		System.out.println("name = " + myAnimal.name);
		System.out.println("numOfLegs = " + myAnimal.numOfLegs);
		System.out.println("hungry= " + myAnimal.hungry);
        System.out.println();

		Animal_2 cat = new Animal_2("Cat",4,false);


		System.out.println("name = " + cat.name);
		System.out.println("numOfLegs = " + cat.numOfLegs);
		System.out.println("hungry= " + cat.hungry);
        System.out.println();

		Animal_2 chicken = new Animal_2("Chicken",2,true);
		Animal_2 worm = new Animal_2("Worm",0,false);

		System.out.println("The chicken has num legs: " + chicken.numOfLegs);


	}//end main
}//end TestAnimal_2

