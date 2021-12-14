import java.util.Scanner;
import java.util.Random;
class game{
	public static void main(String[] args)
	{
	
	int comp_input,user_input;
	char choice;
	final int ROCK=1,PAPER=2,SCISSOR=3;
	  Scanner sc=new Scanner(System.in); // for user input
	 Random rand = new Random(); //instance of random class //for comp input
      int items = 3;  //generate random values from 1-3
       int compwinscounter=0,userwinscounter=0,ties=0,round=1;
      
       System.out.println("------------------------");
       System.out.println("ROCK PAPER SCISSOR GAME");
       System.out.println("------------------------");
	
		System.out.println(" For choosing ROCK : PRESS 1 \n For choosing PAPER : PRESS 2\n For choosing SCISSOR : Press 3\n\n");
       do{
       	System.out.println("Round " + round);
       	
       	System.out.print("Enter your choice : ");
     		  	user_input=sc.nextInt(); 		// user input
       	comp_input = rand.nextInt(items)+1; //comp input
   
    //-----------------------------------------------------------  	
       	if(user_input==ROCK)
       	{
       		if(comp_input==ROCK)
       		{
       			    	System.out.println("Computer chooses : " + comp_input);

       			System.out.println("Game Ties\n");
       			ties++;
       		}
       			else if(comp_input==PAPER)
       		{
       			    	System.out.println("Computer chooses : " + comp_input);

       			System.out.println("Computer Wins \n");
       			compwinscounter++;
       		}
       			else if(comp_input==SCISSOR)
       		{
       			    	System.out.println("Computer chooses : " + comp_input);

       			System.out.println("You Wins\n");
       			userwinscounter++;
       		}
       	}
     //-----------------------------------------------------------  	
       		if(user_input==PAPER)
       	{
       		if(comp_input==ROCK)
       		{
       		System.out.println("You Wins\n");
       			userwinscounter++;
       			
       		}
       			else if(comp_input==PAPER)
       		{
       		System.out.println("Game Ties\n");
       			ties++;
       			
       		}
       			else if(comp_input==SCISSOR)
       		{
			System.out.println("Computer Wins \n");
       			compwinscounter++;
       		}
       	}
//---------------------------------------------------------
	if(user_input==SCISSOR)
       	{
       		if(comp_input==ROCK)
       		{
			System.out.println("Computer Wins \n");
       			compwinscounter++;      			
       		
       		}
       			else if(comp_input==PAPER)
       		{
       				System.out.println("You Wins\n");
       			userwinscounter++;
       			
       		}
       			else if(comp_input==SCISSOR)
       		{
			System.out.println("Game Ties\n");
       			ties++;
       		}
       	}
       	if(user_input<=0 || user_input>=4)
       	{
       		System.out.println("Invalid Input \n Please choose from 1 to 3");
       	}
       	
       	System.out.println("Do u want to play again ? (y/n)");
       	choice=sc.next().charAt(0);
       	round++;
       }
       while(choice!='N' && choice!='n') ;//while closed
       
       //---------------------------------------------------------------------------------
       						//calculating results
       //---------    --------------          -----------------   ------------------     -----
       if(userwinscounter>compwinscounter)
       {
       	System.out.println("You wins this game");
       }
       else if (userwinscounter<compwinscounter)
       {
       	       	System.out.println("Computer wins this game");
       }
       else        	System.out.println("Game is tie between u and computer");
       
              	System.out.println("------------------");
              	System.out.println("------------------");
              	System.out.println("-----Results------");
              	System.out.println("------------------");
              	System.out.println("------------------");
 	System.out.println("You wins " + userwinscounter + " times ");
 	System.out.println("Computer wins " + compwinscounter + " times ");



       System.out.println("Thanks For Playing");
       
      
}
}