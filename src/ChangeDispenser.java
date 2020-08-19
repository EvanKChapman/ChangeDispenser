import java.util.Scanner;

public class ChangeDispenser {


	public static void main(String[] args) {
		
		// Adding a scanner to receive input from user
		
		Scanner scanner = new Scanner(System.in);
		
		// Ask the user to enter a change amount from 1 - 99
		
		System.out.println("Enter a change amount from 1 - 99: ");
		
		// store the user's input in the integer variable change
		int change = scanner.nextInt();
		
		
		// create an integer variable for quarters, dimes, nickels, and pennies
		
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		// the integer quarters is assigned the user's input number for change divided by 25 
		// in the second line, we are assigning change to equal the current change amount modulus 25
		// (how much is remaining after we divide the change amount by 25)
		
		quarters = change / 25;
		change = change % 25;
		
		// the integer dimes is assigned the current change amount (remaining after we divided by 25)
		//  divided by 10
		// in the second line, we are assigning change's current amount to it's current amount
		// (what was remaining after we divided by 25) 
		// modulus 10 (how much is remaining after we divide the change amount by 10)
		
		dimes = change / 10;
		change = change % 10;
		
		// the integer nickels is assigned the current change amount (remaining after we divided by 10)
		//  divided by 5
		// in the second line, we are assigning change's current amount to it's current amount
		// (what was remaining after we divided by 10)
		// modulus 5 (how much is remaining after we divide the change amount by 5)
		
		nickels = change / 5;
		change = change % 5;
		
		// the integer pennies is assigned the current change amount (remaining after we divided by 5)
		// divided by 1
		// in the second line, we are assigning change's current amount to it's current amount 
		// (what was remaining after we divided by 5)
		// modulus 1 (how much is remaining after we divide the change amount by 1)
		
		pennies = change / 1;
		change = change % 1;
		
		// Finally we are printing out how much of each coin we will get back. 
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);	
		
		scanner.close();
	}
}

