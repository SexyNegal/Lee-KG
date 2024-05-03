public class CurrentAccount extends Account{
    double overdraftLimit;

    // constructor
    public CurrentAccount(int accountId,String accountholder_name,double balance,double overdraftLimit){
        super(accountId,accountholder_name,balance);
        this.overdraftLimit = overdraftLimit;
    }

    //setter and getter for over draft limit
    public double getoverdraftLimit(double overdraftLimit){
        return this.overdraftLimit =overdraftLimit;
    }

    public void setoverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
      if(getbalance() > amount){
        balance -= amount;
        System.out.println("Your Card Balance is" + balance);
      }

      if(getbalance() < amount){
        System.out.println("get out");
      }
    }

}
