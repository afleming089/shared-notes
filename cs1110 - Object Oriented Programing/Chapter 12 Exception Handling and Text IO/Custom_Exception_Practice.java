//This program models riders of a rollercoaster.
// A rider must be at least 42 inches tall to ride the
// coaster.
// Class Rollercoaster_Rider will detect and throw an exception,
// InvalidHeightException.
//.TO-DO
//COMPLETE class InvalidHeightException
//ADD detection and throw of InvalidHeighException in class Rollercoaster_Rider
//ADD exception handling to the main to catch the exception
// Belinda Copus 10/26/2018

public class Custom_Exception_Practice {
    public static void main(String[] args) {

        //you need to declare and instantiate two Rollercoaster_Rider objects.
        //To determine where to place the try-block, think about how/where
        //the exception is generate. You want to surround the code that could
        //generate the exceptions with a try-block.
        try {
            Rollercoaster_Rider kid1 = new Rollercoaster_Rider(123, 54);

            Rollercoaster_Rider kid2 = new Rollercoaster_Rider(345, 41);
            System.out.println(kid1.getIdNumber());
        }
        catch (InvalidHeightException ex){
            System.out.println(ex);
            System.out.println(ex.getHeight());
            System.out.println(ex.getMessage());
        }



        //catch the InvalidHeightException and print out
        // the exception. And
        //Add another print statement that just prints the height
        //property of the InvalidHeightException object.

    }// end main

}// Custom_Exception_Practice


class Rollercoaster_Rider {

  private int height;
  private long idNumber;

  public Rollercoaster_Rider(long idNumber, int height) throws InvalidHeightException {
	   //determine if height is 42 or larger, otherwise
	   //throw exception
    if (height >= 42) {
        this.height = height;
        this.idNumber = idNumber;
    }
    else throw new InvalidHeightException(height);

  }

  public long getIdNumber() {
    return this.idNumber;
  }

  public String toString(){
	  return "\nid: " + idNumber + " \nheight: " + height;
  }
}//end Rollercoaster_Rider


/****InvalidHeightException This is a custom exception class  ***/
class InvalidHeightException extends Exception{
    //property to save the "bad" height
    private int height;

    public InvalidHeightException(int height){
        //call parent class construct
        super("Height restriction of 42 inches, rider is " + height + " inches.");
        this.height = height;
    }

    public int getHeight(){ return height; }
}
