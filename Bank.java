public class Bank {

    private Account []accounts;
    
        public Bank(int a ){
            accounts=new Account[a];
        }
        
    //create saving account
        
        public void createSavingsAccount(int accountId, String accountHolderName, double balance, double interestRate) {
            SavingsAccount savingsAccount = new SavingsAccount(accountId, accountHolderName, balance, interestRate);
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i] == null) {
                    accounts[i] =  savingsAccount;
                    System.out.println("Account ID   : " + accountId);
                    System.out.println("Account Name : " + accountHolderName);
                    System.out.println("Balance      : " + balance);
                    System.out.println("------------------------------------");
                    break; 
                }
            }
        }
    //create current account    
        public void createCurrentAccount(int accountId, String accountHolderName, double balance, double overdraftLimit){
            CurrentAccount currentAccount=new CurrentAccount( accountId,  accountHolderName, balance, overdraftLimit);
            for(int j=0; j<accounts.length; j++){
                if (accounts[j]==null){
                accounts[j] = currentAccount;
                System.out.println("Account ID   : " + accountId);
                System.out.println("Account Name : " + accountHolderName);
                System.out.println("Balance      : " + balance);
                System.out.println("-------------------------------------------------");
                break;   
                } 
              }
        }

        //deposit
    
    
        public void deposit(int accountId, double amount) {
        //     boolean b= false;
            
        //     for (int i = 0; i < accounts.length; i++) {
        //         if (accounts[i] != null && accounts[i].getaccountId() == accountId) {
        //             b=true;
        //             accounts[i].deposit(amount);
        //         }
                            
        //     }
        //     if(b == false){
        //     System.out.println("Where is your accounts");
        //     }
        // }
        for(int s = 0; s< accounts.length; s++){
            if(accounts[s] != null && accounts[s].getaccountId() == accountId){
                 accounts[s].deposit(amount);
                 return;
            }
        }System.out.println("Cannot Deposit From Your Account");

        }




        //withdraw
        
    
        public void withdraw(int accountId, double amount){
           for(int i=0; i<accounts.length; i++){
            if ( accounts[i] != null && accounts[i].getaccountId()==accountId) {
                accounts[i].withdraw(amount);
                return;
            }
           }
           System.out.println("Account not found");
        }
    
    
        public void displayBalance(int accountId){
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i] != null && accounts[i].getaccountId() == accountId) {
                    accounts[i].displayBalance();
                }else{
                    System.out.println(
                        "No blance to display"
                    );
                }
            }
        }
    
    }
    