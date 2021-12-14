package oop.java;
import java.util.Scanner;

import static java.lang.System.exit;

public class InterfaceCalculatorMain {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

    char ch ;

    do {
        //Menu
        System.out.println("Choose 1 for radian to Degree");
        System.out.println("Choose 2 for degree to radian");
        System.out.println("Choose 3 for value of sinθ in degree");
        System.out.println("Choose 4 for value of sinθ in radian");
        System.out.println("Choose 5 for value of cosθ in degree");
        System.out.println("Choose 6 for value of cosθ in radian");
        System.out.println("Choose 7 for value of tanθ in degree");
        System.out.println("Choose 8 for value of tanθ in radian");
        System.out.println("Choose 0 to exit");
        System.out.println();
        System.out.println("-------------------------------------");

        System.out.print("Enter Option  : ");
        int option = sc.nextInt();
        double value = 0;

        if (option >= 1 && option <= 2) //for rad to deg or deg to rad
        {
            System.out.print("Enter value : ");
            value = sc.nextDouble();
        }
       else if (option >= 3 && option <= 8) //for trignometric values
        {
            System.out.print("Enter angle : ");
            value = sc.nextDouble();
        }
         else {
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.println("\t \t Please choose an option from mainmenu");
            System.out.println();
            System.out.println("-------------------------------------");
        }
        CalculatorinInterface a = new calculation(value);

        switch (option) {
            case 1:
                a.radtodeg();
                System.out.println("value in degree : " + a);
                break;

            case 2:
                a.degtorad();
                System.out.println("value in radian : " + a);
                break;
            case 3:
                a.sinindeg();
                System.out.println("sine in degree : " + a);
                break;

            case 4 :
                a.sininrad();
                System.out.println("sine in radian : " + a);
                break;
            case 5 :
                a.cosindeg();
                System.out.println("cos in degree : " + a);
                break;

            case 6 :
                a.cosinrad();
                System.out.println("value in degree : " + a);
                break;
            case 7 :
                a.tanindeg();
                System.out.println("tan in degree : " + a);
                break;

            case 8 :
                a.taninrad();
                System.out.println("tan in radian : " + a);
                break;

            case 0:
                System.out.println("Thank you ");
                exit(0);
                break;

            default:
                System.out.println("Select any option from menu ");

                System.out.println("Choose 1 for radian to Degree");
                System.out.println("Choose 2 for degree to radian");
                System.out.println("Choose 3 for value of sinθ in radian");
                System.out.println("Choose 4 for value of sinθ in degree");
                System.out.println("Choose 5 for value of cosθ in radian");
                System.out.println("Choose 6 for value of cosθ in degree");
                System.out.println("Choose 7 for value of tanθ in degree");
                System.out.println("Choose 8 for value of tanθ in radian");
                System.out.println("Choose 0 to exit");

                System.out.println();
                System.out.println();

        } //switch closed

        System.out.println();
        System.out.println("-------------------------------------");

        System.out.println("Do you want to continue ? ");
        System.out.println("Choose : ");
        System.out.println("YES : y");
        System.out.println("NO : n");
        System.out.println();
        System.out.println("-------------------------------------");

        System.out.print("Enter Your choice : ");
        ch=sc.next().charAt(0);
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println();

    } while(ch!='n' && ch!='N');
    }
}

