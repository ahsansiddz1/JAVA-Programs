import java.util.Scanner;
class recursion{
	public int factorial(int n)
	{
	
		if(n==1 || n==0)
		{
			return 1;
		}
		else 
			
			return n*factorial(n-1);
		
	}
	
}
class driver{
	public static void main(String args[]) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number whose factorial do  u want : ");
		a=sc.nextInt();
		recursion r=new recursion();
	//	r.factorial(a);
		System.out.println("Factorial of " + a + " is " + r.factorial(a));
		
    	
    }
}