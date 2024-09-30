/* TestAnimal_5.java Demonstrates accessing properties and methods */
/* Also, demonstrates passing by reference and passing by value   */
class Animal_5 {
	String name;
	int numOfLegs;
	boolean hungry;

	//no-arg constructor
	Animal_5(){
		name = "Dog";
		numOfLegs = 4;
		hungry = false;
		System.out.println("Just created an animal." + " I am a " + name + "!");
	}

	//constructor
	Animal_5(String newName, int legs, boolean h){
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
}//end class Animal

public class TestAnimal_5 {
	public static void main(String[] args) {
		Animal_5 cat = new Animal_5("Cat",4,true);


		System.out.println("Demonstrating properties and methods.");
		System.out.println("\tMy name is " + cat.name);
		System.out.println("\tI have " + cat.numOfLegs + " legs.");
		System.out.println("\tI am hungry " + cat.hungry);
		System.out.println();

		System.out.println("Calling the method catChange to change my name to monster");
		catChange(cat);

		System.out.println("\t*******After returning from catChange.****");
		System.out.println("\tMy name is " + cat.name);
		System.out.println("\tI have " + cat.numOfLegs + " legs.");
		System.out.println("\tI am hungry " + cat.hungry);

		//example with primitive type passed to method
		int x = 10;
		int y = 15;
		System.out.println();
		System.out.println("Before call to changeX--> x= " + x);
		changeX(x);
		System.out.println("After call to changeX--> x= " + x);

		System.out.println();
		System.out.println("Before call to changeY--> y= " + y);
		y = changeY(y);
		System.out.println("After call to changeY--> y= " + y);

		System.out.println();System.out.println();
	}//end main

	 public static void catChange(Animal_5 myAnimal){
		myAnimal.name = "monster";
	}

     //takes a variable and multiplies it by two. nothing is returned.
	 public static void changeX(int someX){
		someX = someX * 2;
	}

     //takes a variable and multiplies it by two. the new value is returned.
	 static int changeY (int someY) {
		someY = someY * 2;
		return someY;
	}

}//end TestAnimal_5

