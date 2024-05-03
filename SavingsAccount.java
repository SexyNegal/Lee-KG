import java.util.Scanner;

public class SavingsAccount extends Account {
    double interestRate;
    Scanner scan = new Scanner(System.in);
    //constructor
    public SavingsAccount(int accountId,String accountholder_name,double balance,double interestRate){
        super(accountId,accountholder_name,balance);
        this.interestRate = interestRate;
    }
    // getter and setter -> interest rate
    public double getinterestRate(){
        return interestRate;
    }
    public void setinterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    // Calculation of Interestrate blah blah
    public double calculateInterestrate(){
        return getbalance() * (interestRate/100);
    }

}   