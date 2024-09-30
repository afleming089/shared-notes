//Class GameCharacter is an abstract class- it needs to be made abstract
// and have some abstract method signatures added...
//Class Sprite is a concrete child class of GameCharacter

class GameCharacter{
   //GameCharacter is an abstract class.

   private String name;   //name of the sprite.
   private double xPos;   //coordinates on the screen.
   private double yPos;
   private int powerLevel;  //value 0 - 100 indicating power, 100 is highest.

	protected  GameCharacter(){
   }

   protected GameCharacter(String name, double xPos, double yPos, int powerLevel){
	   this.name = name;
	   this.xPos = xPos;
	   this.yPos = yPos;
	   this.powerLevel = powerLevel;
   }

  public String getName(){  return name;   }
  public void setName(String name){ this.name = name;  }
  public double getXPos(){ return xPos;   }
  public void setXPos(double xPos){ this.xPos = xPos;  }
  public double getYPos(){  return yPos;  }
  public void setYPos(double yPos){ this.yPos = yPos;  }
  public int getPowerLevel(){   return powerLevel;   }
  public void setPowerLevel(int amount){   powerLevel += amount;   }



   public String toString(){
	   return name + "\nxpos= " + xPos + "\nypos= " + yPos;
   }

 //******************** code missing here declare abstract methods
 //     moveIt()  increasePower() decreasePower()

}//end class GameCharacter


//Sprite is a child class of GameCharacter
class Sprite  {
	private int powerRate;
	public static int numOfSprites;

	public Sprite(){
		//super("bob", 0, 0, 100);
		numOfSprites++;

	}

	public Sprite(String name){
		//super(name, 0, 0, 0);
		powerRate = 100;
		numOfSprites++;
	}

	public Sprite(String name, double x, double y, int powerLevel, int powerRate){
		//super(name, x, y, powerLevel);
		this.powerRate = powerRate;
		numOfSprites++;
	}


}//end class Sprite

public class AbstractClass_Practice{
	public static void main(String[] args){
		//create a Sprite with name Basil powerLevel 100 and
		//at position 0,0 by using the constructor that receives a string.


		//create a Sprite with name Navi, powerLevel 25 and
		//at position 50,75 and powerRate of 10, by using the construct that takes
		//five argurments.


        //Display information on each Sprite by invoking toString method


        //Display a message indicating which Sprite has more power.  Assume they do
		//never have equal power.


		//Add  power to Navi by using the increasePower method.



		//Change Basil position by invoking moveIt


		//PRINT OUT numOfSprites

 	}//end main
}//end class AbstractClass_Practice