import java.util.Scanner;

public class BankAccount_Program {
    public static void main(String args[]) {
        int pin,verifiedpin; int count=0;
        System.out.print("Hint : Pin code is '5262'\n");
        Scanner sc=new Scanner(System.in);
        Secure_Info ob=new Secure_Info(); // non paramaterize constructor
        verifiedpin=ob.getatmpin();    // storing the right pin code in verified pin


        System.out.print("Please insert your 4 digit atm pin : "); //gettting pin code from user
        pin=sc.nextInt();

        do{
            if(pin!=verifiedpin)
            {
                System.out.println("----------------------------------------");

                System.out.println("You Entered wrong pin code !"); //getting the pin code from user 3 times if its wrong
                System.out.print("Enter pin again : ");
                pin=sc.nextInt();
                System.out.println("----------------------------------------");
                count++;
            }
            else
                count=3;
        }while(count!=3);

        Secure_Info obj=new Secure_Info(pin); // calling one parameter constructor 

        if(pin!=verifiedpin) //if still user giving wrong pin then it shows this message
        {
            System.out.println("We find something suspecious !!You Enter wrong pin code many time !! please try again after 5 mins ");
        }
        else if(pin==verifiedpin) //
        {
            System.out.println("----------------------------------------");
            System.out.println("For Checking your current Balance : Press 1\nFor Withdrawal : Press2\nFor Deposit : Press 3");
            System.out.println("----------------------------------------\n");
            int i;
            System.out.println("***********************************");

            System.out.print("Enter input : ");
            i=sc.nextInt();
            while(i<1 || i>3)
            {
                System.out.println("***********************************");
                System.out.println("Choose from given options");
                System.out.println("***********************************");

                System.out.println("For Checking your current Balance : Press 1\nFor Withdrawal : Press2\nFor Deposit : Press 3");
                System.out.println("***********************************");
                System.out.print("Enter input : ");

                i=sc.nextInt();
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
            }
            if(i==1)
            {

                System.out.print("Your Current Balance is : " +	obj.getbalance());

                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
            }
            else if(i==2)
            {

                double amount;
                System.out.print("Enter How much amount do u want to withdraw : ");
                amount=sc.nextDouble();
                obj.withdraw(amount);
                System.out.println("You withdrawal : "+amount+" rupees");
                System.out.println("Your New Balance : " +obj.getbalance() +" rupees");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
            }
            else if(i==3)
            {
                double amount;
                System.out.print("Enter How much amount do u want to Deposit : ");
                amount=sc.nextDouble();
                obj.deposit(amount);
                System.out.println("You Deposit : "+amount+" rupees");
                System.out.println("Your New Balance : " +obj.getbalance() +" rupees");
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
            }


        }
    }
}
