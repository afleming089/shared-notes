import java.util.ArrayList;

public class LoanProblem {
    static double findBiggestMonthlyPayment(ArrayList<Loan> loans) {
        double biggestPayment = 0;

        for (Loan loan : loans) {
            if (loan.getMonthlyPayment() > biggestPayment)
                biggestPayment = loan.getMonthlyPayment();
        }

        return biggestPayment;
    }

    static double sumLoans(ArrayList<Loan> loans) {
        double total = 0;

        for (Loan loan : loans) {
            total += loan.getLoanAmount();
        }

        return total;
    }

    public static void main(String[] args) {
        ArrayList<Loan> loans = new ArrayList<Loan>();

        loans.add(new Loan(3.5, 30, 126745));
        loans.add(new Loan(10.45, 4, 35643));
        loans.add(new Loan(4.7, 1, 3367));
        loans.add(new Loan(20.125, 3, 12321));

        System.out.println("Biggest monthly payment " + findBiggestMonthlyPayment(loans));
        System.out.println("Total amount of all loans " + sumLoans(loans));

    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /**
     * Construct a loan with specified annual interest rate,
     * number of years, and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears,
            double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Set a newloanAmount */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
