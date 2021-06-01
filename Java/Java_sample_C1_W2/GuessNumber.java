import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		 int theNumber = genRandom();
		//int theNumber = 5;
		int numberofGuesses = 0;
		int currentGuess = 0;

		boolean newGuess = false;
		boolean gameON = true;
		while (gameON) {
			System.out.print("Test a number: ");
			while (!newGuess) {
				try {
					currentGuess = Integer.parseInt(reader.nextLine());
					newGuess = true;

				} catch (NumberFormatException e) {
					System.out.println("Not a number");
				}

			}
			while (newGuess) {
				if (testGuess(theNumber, currentGuess) == 1) {

					System.out.println("You win");
					gameON = false;
					newGuess = false;
				} else if (testGuess(theNumber, currentGuess) == 2) {
					System.out.println("Your guess is greater then the number");
					numberofGuesses++;
					newGuess = false;
				} else if (testGuess(theNumber, currentGuess) == 3) {
					System.out.println("Your guess is lesser then the number");
					numberofGuesses++;
					newGuess = false;
				}
			}

			System.out.println("Your are on guess:" + numberofGuesses);

		}
		System.out.println("Game over");

	}

	public static int testGuess(int guess, int number) {

		int guessState = 0;
		if (guess == number) {
			guessState = 1;

		} else {
			if (guess < number) {
				guessState = 2;

			} else {
				guessState = 3;

			}
		}
		return guessState;
	}

	public static int genRandom() {
		return new Random().nextInt(100);
	}

}
