import java.util.Scanner;
import java.util.Random;
class guess{
	private int a,b;
	private int guesses=0;
	public void setuser(int a)
	{
		this.a=a;
	}
		public void setcomp(int b)
	{
		this.b=b;
	}
	public void guessing()
	{
	 guesses++;
		if(a==b)
		{
			
				System.out.println("Awesome !! You guesses correct ")	;
				System.out.println("Total guesses : " + guesses + " times");
		}
		else if(a<=0 || a>10)
		{
			System.out.println("Invalid Number \nPlease choose a number from 1 to 10");
			guesses--;
		}
			else
	System.out.println("You guess wrong number");
		  
	}
	public int getcom()
	{
		return b;
	}
	
}

	class driver{
		public static void main(String args[]) {
	    	int usernum,compnum;
	    	Scanner sc=new Scanner(System.in);
	    	Random rd=new Random();
	    		guess obj=new guess();
	    	do{
	    	
	    	System.out.print("Enter a number : (from 1 to 10)");
	    	usernum=sc.nextInt();
	    	compnum=rd.nextInt(10)+1;
	    	
	    
	    	obj.setuser(usernum);
	    	obj.setcomp(compnum);
	    System.out.println("Computer Number : "+obj.getcom());

	    	obj.guessing();
	    	}
	    	while(usernum!=compnum);
	    	
	    	
	    }
	}