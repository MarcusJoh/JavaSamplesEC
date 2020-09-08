import java.util.Scanner;

public class Hangmanlogic {


	private static String word = "Hyponeurikostiskadiafragmakontravibrationer";
	private static String hideWord = "___________________________________________";
	private static int count = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (hideWord.contains("_")&&count < 7  ) {
			System.out.println("Guess a letter");
			System.out.println(hideWord);
			String guess = reader.next();
			hang(guess);
		}
	} 

	public static void hang(String guess) {
		String testString = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				testString += guess.charAt(0);
			} else if (hideWord.charAt(i) != '_') {
				testString += word.charAt(i);
			} else {
				testString += "_";
			}
		}

		if (hideWord.equals(testString)) {
			count++;
			System.out.println("wrong!");
		} else {
			hideWord = testString;
		}
		if (hideWord.equals(word)) {
			System.out.println("You win");
		}
	}

	
}