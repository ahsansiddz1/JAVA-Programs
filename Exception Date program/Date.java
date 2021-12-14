import java.util.Scanner;
//import java.util.package;
import java.util.InputMismatchException;

class Date {
	int date,month,year;
	Scanner sc=new Scanner(System.in);

 //--------------------------------Getting Date----------------------------------
	public void setDate() throws InputMismatchException
			{
				 	boolean validdate=false;
	do{
			System.out.print("Enter Date : ");     date=sc.nextInt();
			try {  // ---try block open
			
		if(date<1 || date>31)
		{
					validdate=false;
			throw new Dateoutofbound("Enter a Date from 1 to 31");
		}
		else validdate=true;
				 	} // --try block close
	
	catch(Dateoutofbound dob)
	{
							System.out.println("**********************");
								System.out.println("error : Invalid Date");
										System.out.println("**********************");

			System.out.println(dob.getMessage());
				System.out.println();
	}		

 	} while(validdate!=true);
			}


//----------------------------------------Getting Month --------------------------------
	public void setMonth() throws InputMismatchException
			{
boolean validmonth=false;
	do{		
		 	try{  // ---try block open
				System.out.print("Enter Month : ");     month=sc.nextInt();
				 	
		if(month<1 || month>12)
		{
					validmonth=false;
			throw new MonthOutOfBound("Enter a Month from 1 to 12");
		}
		else validmonth=true;
				 	} // ---try block close
	catch(MonthOutOfBound mob)
	{
							System.out.println("**********************");
								System.out.println("error : Invalid Month");
									System.out.println("**********************");

			System.out.println(mob.getMessage());
				System.out.println();
	}		

 	} while(validmonth!=true);
			} 
//---------------------------------Getting Year-------------------------------------			
		public void setyear() 
		{
					boolean validyear=false;
		
 while(validyear==false)
 {
 

			
		  System.out.print("\nEnter Year : ");    year=sc.nextInt();	    	
			    String str =Integer.toString(year);
			    				 int count=str.length ();
			    				 
			    				 
			    				 
			    		/*				 System.out.print(count);
			    				 
	    	for(int i=0; i<str.length(); i++)
			    	{
			    		if(!Character.isDigit(str.charAt(i))) 
			    		{
			    				    		validyear=false;

			    		throw  new InvalidYearException("Invalid Year");
			    	
			    		}
			    		else	
			    	
			    			validyear=true;
			    	}
			    	*/
			    		if(count!=4)
			    	{
			    				validyear=false;
			    				try{
			    			
			    		throw new InvalidYearException("Invalid Year");	
			                     	}
			                  	 catch(InvalidYearException iye)
										{
											System.out.println("**********************");
												System.out.println(" \t " +iye.getMessage());
													System.out.println("**********************");
										}
							    		
			    	}
			    	else validyear=true;
			    

		
		
			}
	
}
public void getdate()
	{
							System.out.println("------------------------------------------------------");
				System.out.println("You Entered the date is : " +date+" : " +month+" : "+year);
							System.out.println("------------------------------------------------------");
	} 
 }

class driver{

	public static void main(String args[]) {
    	
    	Date d=new Date();

    	d.setDate(); d.setMonth(); d.setyear();
			d.getdate();
   		 }
    	}  