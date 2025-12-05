package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {

		System.out.println("Enter choice 0:Rock 1:Paper 2:Scissor");
		Scanner choice=new Scanner(System.in);
		int userChoice=choice.nextInt();
		if (userChoice<0 || userChoice>2) {
			System.out.println("Invalid choice. Please enter numbers between 0 and 2.");
		}

			else {
				System.out.println("User choice is "+userChoice);

			}
		
		int sysChoice=new Random().nextInt(3);
		System.out.println("Computer choice is "+sysChoice);
		
		//Declaring Winner
		if((userChoice==0 && sysChoice==2) || (userChoice==2 && sysChoice==1) ||(userChoice==1 && sysChoice==0))
		{
			System.out.println("Congratulation!! You win");
		}
		else if(userChoice==sysChoice)
		{
			System.out.println("It is a draw");
			
		}
		else
		{
			System.out.println("Computer is the winner");
		}

		choice.close();
	}

}
