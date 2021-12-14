class Bankacct {

   private int acctNum;
   private double balance;

   public Bankacct() {   
      // By default, numeric attributes are initialised to 0
   }

   public Bankacct(int aNum, double bal) {
      acctNum = aNum;
      balance = bal;
   }

   public int getAcctNum() {   
      return acctNum;
   }

   public double getBalance() {   
      return balance;
   }
   public void deposit(double amount)  throws
                        lessthanzerodeposit{
      if(amount>0)
      {
      	balance += amount;
      }
      else{
      	 throw new lessthanzerodeposit ("Deposit Unsuccessful \nPlease Enter Amount greater than zero");
      }
      
   }
   
   public void withdraw(double amount) throws
                        NotEnoughFundException {   
      if (balance >= amount) {
         balance -= amount;
      } else {
         double needs = amount - balance;
         throw new NotEnoughFundException(
                   "Withdrawal Unsuccessful", needs);
      }
   }

} // class BankAcct
