package oop.java;
import java.util.Scanner;
//------------------------------------------------------------
//------------------------------------------------------------
                //InfinitevalueException
//------------------------------------------------------------
//------------------------------------------------------------
class InfinitevalueException extends RuntimeException
    {
        InfinitevalueException(double a)
        {
            System.out.println(a+" is invalid \n error :: Something " +
                    "divide by zero equals infinite value");
        }
    }


//------------------------------------------------------------
//------------------------------------------------------------
                    //Main Class
//------------------------------------------------------------
//------------------------------------------------------------
class ImaginaryRootException extends RuntimeException
        {
            ImaginaryRootException(String img)
            {
                super(img);
            }

        }

//------------------------------------------------------------
//------------------------------------------------------------

class RootsOfQuadraticEq
{
    Scanner sc=new Scanner(System.in);
    double a,b,c;

    public RootsOfQuadraticEq()	{

        System.out.println("Enter values for A, B, and C:");
        boolean doagain=true;

        while(doagain)
        {

            try{
                System.out.print("A = ");  a = sc.nextDouble();
                if(a==0)
                {
                    //	doagain=false;
                    throw new InfinitevalueException(a);
                }
                else
                {
                    doagain=false;
                }
            }
            catch(InfinitevalueException ive)
            {
                System.out.println("Solution :: Enter a Value which is not equals to 0");
            }
        }//end of while

        System.out.print("B = ");  b = sc.nextDouble();
        System.out.print("C = ");   c = sc.nextDouble();
        System.out.println();
    }



    public void calculatediscriminant() //throws ImaginaryRootException
    {
        double firstroot;double secondroot;

        double discriminant=(b*b)-4*a*c;
        double sqrt=Math.sqrt(discriminant);

        if(discriminant>0)
        {
            firstroot = (-b + sqrt)/(2*a); 	 secondroot = (-b - sqrt)/(2*a);

            if( ((sqrt - Math.floor(sqrt)) == 0)) //nested if
            {  System.out.println("Roots are real,distinct and rational");}

            else if( ((sqrt - Math.floor(sqrt)) != 0)) //nested
            {	System.out.println("Roots are real,equal and irrational"); }

            System.out.println("Roots are :: "+ firstroot +" and "+secondroot); //displaying roots
        }

        else if(discriminant == 0)
        {
            System.out.println("Roots are equal ,real and rational ");
            System.out.println("Root is :: "+(-b + sqrt)/(2*a));
        }

        else if(discriminant<0)
        {
            System.out.println("\t \t \t   ___________");
            System.out.println("Root 1 :: "+"-"+b+"+"+"V "+b*b+"-"+4*a*c+" i");
            System.out.println("\t\t\t -------------");
            System.out.println("\t \t \t \t  "+2*a);
            System.out.println();

            System.out.println("\t \t \t  \t ___________");
            System.out.println("Roots 2 :: "+"-"+b+"-"+"V"+b*b+"-"+4*a*c+" i");
            System.out.println("\t \t \t  -------------");
            System.out.println("\t \t \t \t  " + 2*a);

            throw new ImaginaryRootException("Roots are imaginary");

        }        }	 	}


//------------------------------------------------------------
//------------------------------------------------------------
//------------------------------------------------------------
             //Main Class
//------------------------------------------------------------
//------------------------------------------------------------
//------------------------------------------------------------
class QuadraticEquationUsingException{  //Main Class

    public static void main(String[] args) {

        System.out.println("This program will print a solution of an equation");
        System.out.println("of the form A(x)^2 + Bx + C = 0, where A, B, and");
        System.out.println("C are values that you enter.");

        RootsOfQuadraticEq ob=new RootsOfQuadraticEq();

        try{

            ob.calculatediscriminant();
        }

        catch(ImaginaryRootException e2)
        {
            System.out.println(e2.getMessage());
        }
    }
}



