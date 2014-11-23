package Exam3;
import java.util.Random;
import java.util.Scanner;


public class TwoDice extends Dice
{
	String hilo;
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	boolean guess; // This will be true if the user guesses high.
	int diceThrow;

	public TwoDice() // constructor
	{
	}
	
	public void Game()
	{
		while(true)
		{
			System.out.println("Two dice will be thrown.");
			System.out.println("Please guess if the throw will be Hi or Low be entering \"hi\" or \"lo\".");
			System.out.print("Or enter any other character to exit: ");
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
			{
				break;
			}
			
			diceThrow = rand.nextInt(11) + 2;
			this.addThrows();
			this.addThrows();
			
			if(guess && (diceThrow >= 7))
			{
				System.out.println("\n\nYou are correct! The throw of the two dice is too high.");
			}
			else if(guess && (diceThrow < 7))
			{
				System.out.println("\n\nYou are incorrect. The throw of the two dice is too low.");
			}
			else if(!guess && (diceThrow >= 7))
			{
				System.out.println("\n\nYou are incorrect. The throw of the two dice is too high.");
			}
			else if(!guess && (diceThrow < 7))
			{
				System.out.println("\n\nYou are correct! The throw of the two dice is too low.");
			}
			else
				break;
		}
	} // end Game method
	
	@Override
	public String toString()
	{
		return String.format(
			"%s: %d\n\n%s %d\n\n%s",
			"The value of the dice is", diceThrow,
			"The number of throws during the life of the dices.", this.getNumOfThrows(),
			"");
	}
}
