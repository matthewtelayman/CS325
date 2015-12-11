//Matt Layman - ComputerAssistedInstructionTest.java
import java.util.Scanner;

public class ComputerAssistedInstructionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int difficultyLevel; // 1=single-digit numbers, 2=two-digit numbers,
								// etc.
		int operationType; // 1=addition, 2=subtraction, 3=multiplication,
							// 4=division, 5=random

		System.out.println("NOTE: All operations use integer arithmetic.\n");

		// prompts the user to enter a grade level
		System.out
				.print("Enter the difficulty level (1=single digits, 2=two digits, etc.): ");
		difficultyLevel = input.nextInt();

		// prompts the user to enter an operation type
		do {
			System.out.println("\n1 = addition");
			System.out.println("2 = subtraction");
			System.out.println("3 = multiplcation");
			System.out.println("4 = division");
			System.out.println("5 = mixed operations");
			System.out.println("Enter the operation (1 to 5): ");
			operationType = input.nextInt();
		} while ((operationType < 1) || (operationType > 5));

		ComputerAssistedInstructions application = new ComputerAssistedInstructions(
				difficultyLevel, operationType);

		int guess; // the user's guess
		application.createQuestion(); // display the first question
		System.out.print("Enter your answer (-1 to exit): ");
		guess = input.nextInt();

		while (guess != -1) {
			application.checkResponse(guess);

			System.out.print("Enter your answer (-1 to exit): ");
			guess = input.nextInt();
		} // end while
	} // end main
} // end class ComputerAssistedInstructionTest
