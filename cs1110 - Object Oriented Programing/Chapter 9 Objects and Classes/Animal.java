//package edu.ucmo.copus;
//Class Animal

class Animal {

	String name;
	int numOfLegs;
	boolean hungry;

	void eat() {
		System.out.println("I am eating.");
	}

	boolean isHungry() {
		if (hungry) {
			System.out.println("I am hungry.");
			return true;
		} else {
			System.out.println("I am not hungry.");
			return false;
		}
	}

	void sleep() {
		System.out.println("ZZZZZZZZZ");
	}

}// end class Animal
