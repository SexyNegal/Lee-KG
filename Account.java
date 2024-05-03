public class Account {
    // Attributes
       protected int accountId;
      protected String accountholder_name;
      protected double balance;

    
    //Constructor
    public Account(int accountId,String accountholder_name,double balance){
        this.accountId = accountId;
        this.accountholder_name = accountholder_name;
        this.balance = balance;
    }



    //getter and setter -> accountId
    public int getaccountId(){
        return accountId;
    }
    public void setaccountId(int accountId){
        this.accountId = accountId;
    }

    //getter and setter -> accound_holdername
    public String getaccountholder_name(){
        return accountholder_name;
    }
    public void setaccountholder_name(String accountholder_name){
        this.accountholder_name = accountholder_name;
    }

    //getter and setter -> balance
    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }
    // deposit method blah blah blah blah_------------
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("Br Ty Lo Chin Nay Tr Lal Brr Ma Ma Shi Boo");
        }
    }

    public void displayBalance(){
        System.out.println(
            "Your Account ID" + accountId +
            "Your Account Holder Name" + accountholder_name + 
            "Your Balance" + balance
        );
    }


}
