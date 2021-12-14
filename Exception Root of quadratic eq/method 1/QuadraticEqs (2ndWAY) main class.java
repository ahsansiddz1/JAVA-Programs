import java.util.Scanner;

public class QuadraticEq
{
	Scanner sc = new Scanner (System.in);
	double a,b,c;
	
	public QuadraticEq()
	{
		System.out.println("Enter values for A, B, and C : ");
	
System.out.print("A = "); a=sc.nextInt();
if(a==0)
	{
		do
		{
				try
				{
					throw new InfiniteValueException(a);
				}
			
			
			catch (InfiniteValueException ive)
			{
				System.out.println("Solution :: Enter a Value which is not equals to 0");
			}
			finally{
				System.out.print("A = ");
			a = sc.nextDouble();
			}
		}
	
		while (a==0);
			System.out.print("B = ");  b = sc.nextDouble();
			System.out.print("C = ");   c = sc.nextDouble();
			System.out.println();
	}
}void setAbc()
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void calculatediscriminant()
	{
		double root1;
		double root2;
		
		double discriminant=(b*b)-4*a*c;
		double sqrt=Math.sqrt(discriminant);
		
		if (discriminant > 0)
		{
			root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			root2 = (-b - Math.sqrt(discriminant))/ (2 * a);
			
			System.out.println("\nRoots are Real");
			System.out.printf("\nroot1: " + root1);
			System.out.printf("\nroot2: " + root2);
		}
		
		else if(discriminant<0)
		{
			System.out.println("\nDISCRIMINANT IS NEGATIVE, THEREFORE THERE ARE NO REAL ROOTS.");
			double realPart = -b / (2 *a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
			System.out.format("\nroot1 = %.2f+%.2fi \nroot2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
		}
		
		else if (discriminant == 0)
		{
			System.out.println("Roots are equal ,real and rational ");
			System.out.println("Root is :: "+(-b + sqrt)/(2*a));
		}
	}
}

class SolQuadratic{
	public static void main (String [] args)
	{
		System.out.println("This program will print a solution of an equation");
		System.out.println("of the form A(x)^2 + Bx + C = 0, where A, B, and");
		System.out.println("C are values that you enter.");
		
		QuadraticEq qt = new QuadraticEq();
		
		qt.setAbc();
		
		try
		{
			qt.calculatediscriminant();
		}
		
		catch (ImaginaryRootException e2)
		{
			System.out.println(e2.getMessage());
			
		}
	}
}