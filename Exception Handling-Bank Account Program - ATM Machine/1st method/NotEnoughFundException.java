public class NotEnoughFundException extends Exception {

   private double amount;

   public NotEnoughFundException(String s, double amount) {
      super(s);
      this.amount = amount;
   }

   public double getAmount() {
      return amount;
   }
}
