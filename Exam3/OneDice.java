package Exam3;
import java.util.Random;
import java.util.Scanner;

public class OneDice extends Dice
{
	String hilo;
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	boolean guess; // This will be true if the user guesses high.
	int dice;
	int diceThrow;	
	
	public OneDice()
	{
	}
	
	public void Game()
	{
		while(true)
		{
			System.out.println("One dice will be thrown.");
			System.out.println("Please guess whether the throw will be Hi or Low by entering \"hi\" or \"lo\".");
			System.out.print("Or enter any other character: ");
			hilo = input.nextLine();
		
			if(hilo.equals("hi"))
			{
				guess = true;
			}
			else if(hilo.equals("lo"))
			{
				guess = false;
			}
			else
				break;
			
			diceThrow = rand.nextInt(6) + 1;
			this.addThrows();
			
			if (guess && (diceThrow >= 4))
			{
				System.out.println("\nYou are correct! The dice throw is too high. ");
			}
			else if(guess && (diceThrow < 4))
			{
				System.out.println("\n\nYou are incorrect. The dice throw is too low. ");
			}
			else if(!guess && (diceThrow >= 4))
			{
				System.out.println("\n\nYou are incorrect. The dice is throw is high. ");
			}
			else if(!guess && (diceThrow < 4))
			{
				System.out.println("\n\nYou are correct! The dice throw is too low. ");
			}
			else
				break;
		}
	}
	@Override
	public String toString()
	{
		return String.format(
			"%s: %d\n\n%s: %d\n\n%s",
			"The value of the dice is", diceThrow,
			"The number of the dice throws since the object was the objecty was instantiated is", this.getNumOfThrows(),
			"");
	}

}

	
			
