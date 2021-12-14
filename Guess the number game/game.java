import java.util.Scanner;
import java.util.Random;
class game{
	int compinput,userinput,guesses=0;
	game()
	{
				System.out.print("Guess the number game ");

		Random rand = new Random();
		compinput=rand.nextInt(100);
	}
	
	public void takeuserinput()
	{
			System.out.println();
			System.out.println();

		System.out.print("Enter input : ");
		Scanner sc=new Scanner(System.in);
		userinput=sc.nextInt();
	}
	
	boolean iscorrectnum()
	{
		if(userinput==compinput)
		{
			System.out.println("You guessed the number");
		System.out.println("You guessed the number in "+guesses+" attempts");
		return true;
			
		}
		
		else if(userinput<compinput)
		{
			System.out.println("Number is too low"); 
				guesses++;
			
		}
	
	
		else if(userinput>compinput)
		{
			System.out.println("Number is too high"); 
				guesses++;
			
		}
			return false;
	}
	
	public static void main(String args[]) {
    	game obj=new game();
    	boolean b=false;
    	while(!b)
    	{
    	
    	obj.takeuserinput();
    	b=obj.iscorrectnum();
    	System.out.print(b);
    	}
    }
}