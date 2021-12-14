import java.util.Scanner;
import java.util.Random;

class guess{
	Random rand=new Random();
	Scanner sc=new Scanner (System.in);
 private int compnum,usernum;
 private	int guesses=0;
//-------------------------------------------------------------------		
	//Taking random num from computer
//-------------------------------------------------------------------	
	public guess()
	{
	    compnum=rand.nextInt(100)+1; //Constructor
	}
	
//-------------------------------------------------------------------	
	
	//Taking a number from user //setter
//-------------------------------------------------------------------	

	public void takeuserinput(int usernum)
	{				this.usernum=usernum;
					guesses++;	
	}
	
//-------------------------------------------------------------------	
	
	//checking user num is equal to conmpnum or not
//-------------------------------------------------------------------	

	public void iscorrectnum()
	{
		while(usernum!=compnum)
		{
	
	  if(usernum<compnum && usernum>0)
			{
				System.out.println("Your number is less than computer number");
			
				guesses++;
				System.out.print("Enter number again : ");
				usernum=sc.nextInt();	
			}
			
		else if(usernum>compnum &&usernum<=100)
			{
				System.out.println("Your number is greater than computer number");
			 
			     guesses++;
			     
			   	System.out.print("Enter number again : ");
	               usernum=sc.nextInt();
			}
			else if(usernum>100 || usernum<=0)
			{
			System.out.println("Enter number between 1 to 100");
			 
			     guesses++;
			     
			   	System.out.print("Enter number again : ");
	               usernum=sc.nextInt();
			}
		}
	}
//-------------------------------------------------------------------	

		//Counting Guesses
//-------------------------------------------------------------------	
		public void countguesses()
		{
			if(guesses>=0 && guesses<=5)
			{
				System.out.println("Woah !! Your guesses the right number in " + guesses +"times");
			}
			else if(guesses>5 && guesses<10)
			{
				System.out.println("Brilliant !! Your guesses the right number in only " + guesses +"times");

			}
					else if(guesses>10 && guesses<15)
			{
				System.out.println("Good !! Your guesses the right number in  " + guesses +"times");

			}
			else if(guesses>15)
			{
			
			System.out.println(" Your guesses the right number in  " + guesses +"times");
			System.out.println("You need more concentration");
		}
		} 
//--------------------------------------------------------------------------------------------------	

	}
class driver{
	public static void main(String args[]) {
		int usernum;
    	guess obj=new guess();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Please Enter a number between 1 to 100"); 
				usernum=sc.nextInt();	
			
    	obj.takeuserinput(usernum);
    	obj.iscorrectnum();
    	obj.countguesses();
    }
}