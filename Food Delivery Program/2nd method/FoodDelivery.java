package oop.java;


//package food.delivery;
import java.util.Scanner;

class FoodDelivery {


    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Name of Resturant");
        String n = cin.nextLine();
        System.out.println("Enter Your Address");
        String address= cin.nextLine();
        System.out.println("Enter Your Name");
        String rep = cin.nextLine();
        System.out.println("Enter Weight");
        int w = cin.nextInt();

        OneDayFGDelivery obj3 = new OneDayFGDelivery(n,address,rep,w);
        HalfHourFGDelivery obj2 = new HalfHourFGDelivery(n,address,rep,w);
        FGDelivery obj1 = new FGDelivery(n,address,rep,w);

        System.out.println("Enter 1(Total cost) 2(Total cost on Half Hour Delivery) 3(Total cost on One Day Delivery)");
        int Chose= cin.nextInt();
        while (Chose<1 || Chose>3)
        {
            System.out.println("Choose (Total cost) 2(Total cost on Half Hour Delivery) 3(Total cost on One Day Delivery)");
            Chose=cin.nextInt();
        }

        if (Chose==1)
        {
            int GetCost = obj1.GetCost();
            System.out.println("Total = " + GetCost);
        }
        if(Chose==2)
        {
            int GetCost = obj2.GetCost();
            System.out.println("Total = " + GetCost);
        }
        else
        {
            int GetCost = obj3.GetCost();
            System.out.println("Total = " + GetCost );
        }
    }
}
class FGDelivery
{
    String Name="Resturant";
    String Address="Auto ban";
    String Recipient="X";
    int Weight=0;
    int per_pound=2;

    FGDelivery()
    {
    }

    FGDelivery(String Name,String Address,String Recipient,int W)
    {
        this.Name=Name;
        this.Address=Address;
        this.Recipient=Recipient;
        this.Weight=W;

    }

    public int GetCost ()
    {
        int Total = Weight * per_pound;
        return Total;

    }
}

class HalfHourFGDelivery extends FGDelivery
{
    int HalfHourCharge=10;

    public HalfHourFGDelivery() {
    }

    public HalfHourFGDelivery(String Name, String Address, String Recipient, int W) {
        super(Name, Address, Recipient, W);
    }


    public int GetCost ()
    {

        int Total = (Weight * per_pound) + HalfHourCharge;
        return Total;
    }
}


class OneDayFGDelivery extends FGDelivery
{
    int OneDayCharge=10;

    public OneDayFGDelivery() {
    }

    public OneDayFGDelivery(String Name, String Address, String Recipient, int W) {
        super(Name, Address, Recipient, W);
    }



    public int GetCost ()
    {

        int Total = (Weight * per_pound) + OneDayCharge;
        return Total;
    }
}
