public class driver {

   public static void main(String[] args) {

      Bankacct acc = new Bankacct(1234, 0.0);
      
      System.out.println("Current balance: $" +
                         acc.getBalance());
try{

      System.out.println("Depositing $200...");
      acc.deposit(200.0);
      
      System.out.println("Depositing $-200...");
      acc.deposit(-200.0);
}
catch(lessthanzerodeposit l)
{
          System.out.println(l.getMessage());
}
      System.out.println("Current balance: $" +
                         acc.getBalance());
 try {
         System.out.println("Withdrawing $150...");
         acc.withdraw(150.0);
         System.out.println("Withdrawing $100...");
         acc.withdraw(100.0);
      }
      catch (NotEnoughFundException e) {
          System.out.println(e.getMessage());
          System.out.println("Your account is short of $" + 
                             e.getAmount());
      }
      finally {
         System.out.println("Current balance: $" + 
                            acc.getBalance());
      }
   } // main

} // class TestBankAcct
