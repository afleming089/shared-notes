/* TestAnimal_6.java Demonstrates an array of objects */
/*  */
class Animal_6 {
	String name;
	int numOfLegs;
	boolean hungry;

	//no-arg constructor
	Animal_6(){
		name = "Dog";
		numOfLegs = 4;
		hungry = false;
	}

	//constructor
	Animal_6(String newName, int legs, boolean h){
		name = newName;
		numOfLegs = legs;
		hungry = h;
	}

	void eat(){
		hungry = false;
	}

	boolean isHungry() {
		if (hungry) {
			return true;
		}
		else {
			return false;
		}
	}

	void sleep(){
		System.out.println("ZZZZZZZZZ");
	}
}//end class Animal

public class TestAnimal_6 {
	public static void main(String[] args) {


		Animal_6[] myPets = new Animal_6[5];

		myPets[0] = new Animal_6("cat",4,true);
		myPets[1] = new Animal_6("chicken", 2, true);
		myPets[2] = new Animal_6("guinea pig", 4, true);
		myPets[3] = new Animal_6("turtle",4,true);
		myPets[4] = new Animal_6("snake",0,false);


		// print out all of the animal names and whether
		// they are hungry.
		System.out.println("My Pets.....");
		for (int i=0; i<5; i++){
			System.out.println("\t" + myPets[i].name
			                 + " hungry= " + myPets[i].isHungry());
		}
		System.out.println();

		//feed those that are hungry.
		System.out.println("It is meal time....");
		for (int i = 0; i < myPets.length; i++){
			if (myPets[i].isHungry()) {
				System.out.println("\t" + myPets[i].name + " is eating. ");
				myPets[i].eat();
			}
			else
			 	System.out.println("\t" + myPets[i].name + " is NOT hungry.");
		}
		System.out.println();

		//print out whether any of the pets is still hungry.
		System.out.println("Is everybody full???");
		for (int i=0; i<5; i++){
			System.out.println("\t" + myPets[i].name + " hungry= " + myPets[i].isHungry());
		}

		System.out.println("\n");
		//System.out.println("myPets[0] is " + myPets[0]);

	}// end main
}//end TestAnimal_6

