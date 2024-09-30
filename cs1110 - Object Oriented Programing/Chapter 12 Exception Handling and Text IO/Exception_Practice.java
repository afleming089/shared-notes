// Exception Practice
//The constructor for NewLoan will throw an
//IllegalArgumentException if any of the arguments are negative.

//In the main, a Try block around any code that will invoke the constructors.
//Add a Catch for IllegalArgumentException
//Add a Catch for InputMismatch exception -
//        takes care of user entering wrong type of input.

//Finally, add a catch for Exception to catch anything!

import java.util.*;

public class Exception_Practice {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

	  //put the three instantiations for NewLoan in
	  //a try-block.
	  NewLoan d;
	  System.out.println("Please enter interest rate: ");

            double interestRate = input.nextDouble();

            NewLoan a = new NewLoan(interestRate, 30, 100000);
            System.out.println("Created loan a\n");

            NewLoan b = new NewLoan(1, 3, 3);
            System.out.println("Created loan b\n");

            NewLoan c = new NewLoan(7.5, 30, 20000);
            System.out.println("Created loan c\n");

            d = null;
            System.out.println(d.getNumOfYears());

      //catch IllegalArgumentException and print out something helpful.

      // catch InputMismatchException and print out something helpful.


      //catch Exception and print out something helpful.



    System.out.println("End of program");
  }
}//Exception_Practice

class NewLoan {
  private double annualInterestRate;
  private int numOfYears;
  private double loanAmount;

  /** Default constructor */
  public NewLoan() {
    this(7.5, 30, 100000);
  }

  /** Construct a NewLoan with specified annual interest rate,
      number of years and loan amount
    */
  public NewLoan(double annualInterestRate, int numOfYears,
    double loanAmount) {

    setAnnualInterestRate(annualInterestRate);
    setNumOfYears(numOfYears);
    setLoanAmount(loanAmount);
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
	 //add code to detect if numOfYears is illegalargument &throw exception
    if (annualInterestRate <= 0)
      throw new IllegalArgumentException("Annual interestrate must be positive");
    this.annualInterestRate = annualInterestRate;
  }

  /** Return numOfYears */
  public int getNumOfYears() {
    return numOfYears;
  }

  /** Set a new numOfYears */
  public void setNumOfYears(int numOfYears) throws IllegalArgumentException {
     //add code to detect if numOfYears is illegalargument &throw exception
     if (numOfYears <= 0)
        throw new IllegalArgumentException("Number of years must be positive.");
    this.numOfYears = numOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
    //add to code to detect if numOfYears is illegal argument & throw exception
     if (loanAmount <= 0)
        throw new IllegalArgumentException("Loan amount must be positive.");
    this.loanAmount = loanAmount;
  }

  /** Find monthly payment */
  public double monthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    return loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
  }

  /** Find total payment */
  public double totalPayment() {
    return monthlyPayment() * numOfYears * 12;
  }
}
