import java.util.Scanner;

public class Hangmanlogic {

//	private static String word = "Hyponeurikostiskadiafragmakontravibrationer";
//	private static String hideWord = "___________________________________________";
// 	private static int count = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		HangmanRound aRound = new HangmanRound();

		runGame(aRound, reader);

		HangmanRound aRoundtwo = new HangmanRound();

		runGame(aRoundtwo, reader);

		reader.close();

	}

	private static void runGame(HangmanRound aRound, Scanner reader) {

		StaticWordselection.setWord(aRound);

		while (aRound.getShowWord().contains("_") && aRound.getScoreCount() < StaticWordselection.getMaxScore()) {
			System.out.println("Guess a letter");
			System.out.println(aRound.getShowWord());
			String guess = reader.next();
			hang(guess, aRound);
		}
		System.out.println("Game over");

	}

	public static void hang(String guess, HangmanRound currentRound) {
		String testString = "";
		for (int i = 0; i < currentRound.getCurrentWord().length(); i++) {
			if (currentRound.getCurrentWord().charAt(i) == guess.charAt(0)) {

				testString += guess.charAt(0);
			} else if (currentRound.getShowWord().charAt(i) != '_') {

				testString += currentRound.getCurrentWord().charAt(i);
			} else {
				testString += "_";
			}
		}

		if (currentRound.getShowWord().equals(testString)) {
			currentRound.addScoreCount();
			System.out.println("wrong!");
		} else {
			currentRound.setShowWord(testString);
		}
		if (currentRound.getShowWord().equals(currentRound.getCurrentWord())) {
			System.out.println("You win");
		}
	}

}