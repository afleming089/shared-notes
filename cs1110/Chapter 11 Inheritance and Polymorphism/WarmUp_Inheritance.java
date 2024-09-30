// WarmUp_Inheritance is practice on inheritance.
// Look at the inheritance first.  Vehicle <--- Car.

//In Car, follow the comments. Create the two constructors
//and override the toString method.

//Nochanges needed in Class Vehicle or in the main.


class Vehicle {

   String color;
   int speed;

   public Vehicle(String color, int speed){
	   this.color = color;
	   this.speed = speed;
   }

   public String toString() {
      return "Color : " + color + "\nSpeed : " + speed ;
   }
}  //end class vehicle


// A subclass which EXTENDS vehicle
/*class Car  {
   int numDoors;
   String  brakes;

   public Car(int numDoors, String brakes, String color, int speed){
       //make a call to the parent class constructor and
       //send the parameters, color and speed.

       //alternatively, set up the properties numDoors and brakes.

   }

   	//practice with overloading.
   	//add a constructor that we don't know the the color
   	//and it will default to blue.
   	public Car(int numDoors, String brakes, int speed){

	}

   //practice with overriding.
   //override toString to  make use of the
   //toString in the parent class and to add
   //in the information from the properties
   //numDoors and brakes.

   //@Override tells the compiler to check that toString is in
   //the parent so that it can be overrriden.





}//end class Car */


public class WarmUp_Inheritance {
   public static void main(String args[]) {
	   //create a Car object with 2 doors, anti-lock brakes
	   //red in color and top speed of 215.


      //print out the information about sporty
      //by calling the toString method.


   }
}//WarmUp_Inheritance