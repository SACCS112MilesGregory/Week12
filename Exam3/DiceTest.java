package Exam3;

import java.util.Scanner;

public class DiceTest // Test the OneDice, TwoDice, and ThreeDice programs.
{
	public static void main(String[] args) 
	{
		System.out.println("Let's place dice!");
		Scanner input = new Scanner(System.in);
		String hilo;
		int dice; // Create variable for user's selection.
		int ans;
		
		// Create variable to be instantiated later.
		Dice myDice;
		
		while(true)
		{
			System.out.println("How many dice would you like to use? Enter 1, 2, or 3: ");
			dice = input.nextInt();
			
			while(dice != 1 && dice != 2 && dice != 3)
			{
				System.out.print("\nInvalid input. Please enter 1, 2, or 3: ");
				dice = input.nextInt();
				break;
			}
			System.out.println("\n");
			
			// Validate the user's selection of the number of dice.
			if(dice == 1)
			{
				myDice = new OneDice(); // instantiate OneDice object.
			}
			else if(dice == 2)
			{
				myDice = new TwoDice(); // Instantiate TwoDice object.
			}
			else
			{
				myDice = new ThreeDice(); // Instantiate ThreeDice object.
			}
			myDice.Game(); // Will go to the appropriate dice file
			               // depending on the user's selection.
			
			System.out.println("\n\nWould you like to change the number of dice? If yes, please enter 1.");
			System.out.print("To exit, enter any other character: ");
			ans = input.nextInt();
			
			if(ans != 1)
			{
				break;
			}
		}
		// get Dice data.
		System.out.printf("\n%s", myDice.toString());
	}
}
