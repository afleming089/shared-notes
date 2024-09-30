import java.util.Date;
import java.util.Random;

public class VariousJavaClasses{

   public static void main(String[] args){
     //Demonstrating using the Date class.
	Date todaysDate = new Date();
	System.out.println(todaysDate.toString());
	System.out.println(todaysDate);
	System.out.println();


	//Demonstrating the Random Class
	Random random1 = new Random(20);
	System.out.print("From random1: ");
	for (int i = 0; i < 10; i++)
	  System.out.print(random1.nextInt(1000) + " ");

	Random random2 = new Random(20);
	System.out.print("\nFrom random2: ");
	for (int i = 0; i < 10; i++)
	  System.out.print(random2.nextInt(1000) + " ");

	System.out.println();


   }

}