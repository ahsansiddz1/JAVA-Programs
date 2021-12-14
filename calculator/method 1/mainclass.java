import java.util.Scanner;
 public class mainclass {
	public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int op;
    	char ch='y';
    	 System.out.println("******************************************************");
	    	 System.out.println("******************************************************");
    	   System.out.print("Choose  0 for Radians to degree conversion \n");
			System.out.print("Choose  1. degree to radian conversion\n");
			System.out.print("Choose	2. to compute sine of a number given in radian \n");
			System.out.print("Choose	3. to compute sine of a number given in degrees. \n");
			System.out.print("Choose	4. to compute cos of a number given in radians\n");
			System.out.print("Choose	5. to compute cos of a number given in degrees\n");
			System.out.print("Choose	6. to compute tangent of a given number given in degrees \n");
			System.out.print("Choose	7. to compute tangent of a given number given in degrees \n");
			System.out.println("Choose	8. to exit  from the program. ");
	    	System.out.println("******************************************************");
    		System.out.println("******************************************************");

  
		
    if(ch=='y' || ch=='Y')
    {
    
    do
    {    		System.out.println();
				System.out.println();

			   
  System.out.print("Choose Option:\t "); op=sc.nextInt();
  
System.out.print("Enter value : \t");
    		double 	a=sc.nextDouble(); 
			     
		
        trignometric_operations c=new trignometric_operations(a);
	         
    	
    	switch(op)
    	{
    		
    case 0 : System.out.println("You Choosed Radian to degree Conversion");
    	 System.out.println("Value in degree is : "+c.radtodeg() +" degree");
    			break;
        	
    case 1 : 	System.out.println("You Choosed Degree to Radian Conversion");
    				 System.out.println("Value in radian is : "+c.degtorad()+" radians");
    			break;
    
   case 2 : 	System.out.println("You Choosed Value of sin in Radian");
    	             System.out.println("Value of sin in radian is : "+ c.sininrad());
   			break;
   
   case 3 :    	System.out.println("You Choosed Value of sin in Degree");
				     System.out.println("Value of sin in degree is : "+ c.sinindeg());
			break;
	
   case 4 :		System.out.println("You Choosed Value of cos in Degree");
					 System.out.println("Value of cos in radian is : "+ c.cosinrad());
	break;
	
   case 5 :    System.out.println("You Choosed Value of cos in Radian");
 					 System.out.println("Value of cos in degree is : "+ c.cosindeg());
	break;
	
   case 6 :	   System.out.println("You Choosed Value of tan in Degree");
					System.out.println("Value of tan in radian is : "+ c.taninrad());
	break;
	 
	case 7 :   System.out.println("You Choosed Value of tan in Radian ");
					System.out.println("Value of sin in degree is : "+ c.tanindeg());
	break;
     
    	default :System.out.println("Invalid Input");
    	
    			
    	}
    	 
    	 System.out.println("Do you want to continue (y/n)");
    	 ch=sc.next().charAt (0);
    	 
    	  }while(ch!='n' && ch!='N');
    }
    	 } 
    	 }
   