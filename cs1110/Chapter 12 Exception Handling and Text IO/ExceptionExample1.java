//This program demonstrates NullPointerException

public class ExceptionExample1 {
  public static void main(String[] args) {
	  Account[] myAccounts = new Account[5];

	 myAccounts[0] = new Account(123,555);

      try {
		  System.out.println("Account 0: " + myAccounts[0].getBalance() + "\n");

		  System.out.println("Account 1: " + myAccounts[1].getBalance());
	  }
	  catch (NullPointerException ex){
		  System.out.println("No Account object exists.");
	  }

	  System.out.println("The end of the program");

  }//end main
}//end class ExceptionExample