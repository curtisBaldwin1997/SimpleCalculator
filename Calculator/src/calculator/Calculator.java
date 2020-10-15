package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		Calculations calculator = new Calculations();
		
		System.out.println("Welcome to the calculator");
		while(true){
		
		System.out.println("Please enter two numbers");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println("What calculation would you like to perform?" +"\n" + "Press (1) for addition (2) for subbtraction , (3) for divivision, (4) for multiplication");
		int response = scanner.nextInt();
		
		if(response == 1) {
			int result = calculator.addition(num1, num2);
			System.out.println(result);
			
		} else if(response == 2) {
			int result = calculator.subtraction(num1, num2);
			System.out.println(result);
		} else if (response == 3) {
			double result = calculator.division(num1, num2);
			System.out.println(result);
			
		} else if(response == 4) {
			int result = calculator.multiplication(num1, num2);
			System.out.println(result);
		}
		scanner.nextLine();	
		System.out.println("Would you like to make another calculation? (Y) or (N)");
		String choice = scanner.nextLine();
		if(choice.equals("N")) {
			break;
		}
		}
		
		
		
	}

}
