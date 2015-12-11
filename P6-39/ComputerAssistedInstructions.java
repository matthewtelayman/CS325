//Matt Layman
//Exercise 6.39: CProgram generates single-digit multiplication problems
import java.util.Random;

public class ComputerAssistedInstructions {
	private static final Random randomNumbers = new Random();
	private static final int ADDITION = 1;
	private static final int SUBTRACTION = 2;
	private static final int MULTIPLICATION = 3;
	private static final int DIVISION = 4;
	private static final int RANDOM = 5;

	private int answer; // the correct answer
	private int questionsAnswered; // number of question answered
	private int correctAnswers; // number of correct answers
	private int difficulty; // the question difficulty
	int operationType; // the arithmetic operations to use

	// constructor initializes the difficulty level
	public ComputerAssistedInstructions(int difficultyLevel, int operation) {
		if (difficultyLevel > 0)
			difficulty = difficultyLevel;
		else {
			System.out.println("Difficutly level must be greater than 0");
			System.out.println("Setting difficulty level to 1");
			difficulty = 1;
		} // end else

		if (operation >= ADDITION && operation <= RANDOM)
			operationType = operation;
		else {
			System.out.println("operation type level must be in the range 1-5");
			System.out.println("Defaulting to addition questions");
			operationType = ADDITION;
		} // end else
	} // end constructor

	// prints a new question and stores the corresponding answer
	public void createQuestion() {
		// determine the range of values
		int startRange = (int) Math.pow(10, difficulty - 1);
		int endRange = (int) Math.pow(10, difficulty);

		// allow 0 to start the range for single-digit numbers
		if (startRange == 1)
			startRange = 0;
		// get two random numbers from 0 up to range
		int number1 = getRandomNumberInRange(startRange, endRange);
		int number2 = getRandomNumberInRange(startRange, endRange);

		// generate the appropriate answer and operation
		int operation = operationType; // the operation number
		String opString = ""; // string corresponding to the operation

		if (operation == RANDOM) // random operation
			operation = 1 + randomNumbers.nextInt(4);
		switch (operation) {
		case ADDITION:
			opString = "+";
			answer = number1 + number2;
			break;
		case SUBTRACTION:
			// don't use negatives
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			} // end if

			opString = "-";
			answer = number1 - number2;
			break;
		case MULTIPLICATION:
			opString = "*";
			answer = number1 * number2;
			break;
		case DIVISION:
			if (number2 == 0)
				number2 = 1;
			opString = "/";
			answer = number1 / number2;
			break;
		}// end switch

		System.out
				.printf("How much is %d %s %d?\n", number1, opString, number2);
	} // end method createQuestion

	// pick random number in the range start to end - 1
	public int getRandomNumberInRange(int start, int end) {
		int number;

		do {
			number = randomNumbers.nextInt(end);
		} while (number < start);
		return number;
	} // end method getRandomNumberinRange

	// checks if the user answered correctly
	public void checkResponse(int guess) {
		++questionsAnswered;

		if (guess != answer)
			System.out.println(createResponse(false));
		else {
			++correctAnswers;
			System.out.printf("%s\n\n", createResponse(true));

			if (questionsAnswered < 10)
				createQuestion();
		} // end else

		if (questionsAnswered >= 10) {
			double percentage = calculatePercentage();

			System.out.printf("\nYou scored %.0f%%\n", percentage * 100);
			if (percentage < 0.75)
				System.out.println("Please ask your instructor for extra help");
			// start over
			System.out.println();
			correctAnswers = 0;
			questionsAnswered = 0;
			createQuestion();
		} // end if
	} // end method checkResponse

	// create a new response
	public String createResponse(boolean correct) {
		if (correct)
			switch (randomNumbers.nextInt(4)) {
			case 0:
				return ("very good!");
			case 1:
				return ("Excellent!");
			case 2:
				return ("Nice work!");
			case 3:
				return ("Keep up the good work!");
			} // end switch

		// otherwise, assume incorrect
		switch (randomNumbers.nextInt(4)) {
		case 0:
			return ("No. Please try again.");
		case 1:
			return ("Wrong. Try once more.");
		case 2:
			return ("Don't give up!");
		case 3:
		default:
			return ("No. Keep trying");
		} // end switch
	} // end method createResponse

	// determine how the user is faring
	public double calculatePercentage() {
		return (double) correctAnswers / questionsAnswered;
	} // end method calculatePercentage
} // end class ComputerAssistedINstructions
