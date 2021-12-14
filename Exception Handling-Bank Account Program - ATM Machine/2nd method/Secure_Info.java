public class Secure_Info {
    private int atmpin=5262; //current pin code is 5262
    private int balance=50000; //Initially balance is 50k
    private int changecode,withdrawal,deposit,checkbal;

    public Secure_Info()
    {	}

    public int getbalance()  //getter //that returns the current balance  to main function
    {
        return balance;
    }

    public int getatmpin()  //getter //that returns the right pin code to main function
    {
        return atmpin;
    }
    public Secure_Info(int uipc) //uip=user inputted pin code
    {
        if(uipc!=atmpin)
        {
            System.out.println("----------------------------------------");
            System.out.println("Wrong pin code"); // Constructor that gets the pin code from user and verifies
            System.out.println("----------------------------------------"); 		// its correct or not

        }
        else if(uipc==atmpin)
        {
            System.out.println("****************************************");
            System.out.println("\t\tPin Code Verified");
            System.out.println("****************************************");
        }
    }

    public boolean withdraw(double amount) {
        if (balance < amount) return false; // method for withdraw
       else
        this.balance -= amount;
        return true;
    }
    public void deposit(double amount) {
        if (amount <= 0) return;           // method for deposit
        this.balance += amount;
    }

}
