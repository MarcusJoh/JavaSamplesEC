import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {

	static String wordToGuess = "javaprogrammering";
	static char[] showWord;
	static int numberOfTries = 10, hangRound = 0;
	
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Character> usedLetters = new ArrayList<Character>(30);

	
	public static void main(String[] args) {

		boolean continueGame = true;
		
		setupGame(wordToGuess);

		while (continueGame) {

			String command = getCommand();

			switch (command) {
			case "s":
				int triesLeft = numberOfTries - hangRound;
				System.out.print("Så här ser det ut just nu: ");
				System.out.println(showWord);
				printHangman();
				System.out.println("Du har förbrukat " + hangRound + " försök.");
				System.out.println("Du har " + triesLeft + " försök kvar.");
				System.out.print("Du har använt dessa bokstäver: ");
				System.out.println(usedLetters);
				break;
			case "b":
				continueGame = guessLetter();
				break;
			case "o":
				continueGame = guessWord();
				break;
			default:
				System.out.println("Fel i menyvalet");
			}
			
			if (numberOfTries - hangRound <= 0) {
				
				System.out.println("Tyvärr så har du nu använt alla dina gissningar. Bättre lycka nästa gång!");
				continueGame = false;
			}
		}		
	}

	static void setupGame(String wordToGuess) {

		showWord = wordToGuess.toCharArray();

		for (int i = 0; i < wordToGuess.length(); i++) {

			showWord[i] = '_';
		}

		System.out.println("Välkommen till Hangman!");
		System.out.println("Ordet du ska gissa är " + showWord.length + " bokstäver långt.");
		System.out.println("Du har " + numberOfTries + " försök på dig. Lycka till!");
	}

	static String getCommand() {

		String command;

		while (true) {

			System.out.println("Ge ett kommando, s för status, b för att gissa bokstav och o för att gissa ordet.");

			command = readLetter();

			if ("sbo".contains(command)) {

				return command;
			}

		}
	}

	static boolean guessLetter() {

		System.out.println("Gissa bokstav: ");

		String letter = readLetter();
		char l = letter.charAt(0);
		
		if (usedLetters.contains(l)) {
			
			System.out.println("Du har redan använt bokstav " + letter + ".");
			System.out.print("Du har använt dessa bokstäver: ");
			System.out.println(usedLetters);
			return true;
			
		} else {
			
			usedLetters.add(l);
		}

		if (wordToGuess.contains(letter)) {

			for (int i = 0; i < showWord.length; i++) {

				if (wordToGuess.charAt(i) == l) {
					showWord[i] = l;
				}
			}

			System.out.println(new String(showWord));

			if (new String(showWord).equals(wordToGuess)) {

					win();
					return false;
			}
			
		} else {

				fail();
				return true;
		}
		
		return true;
	}

	static String readLetter() {

		String command = "";

		while (command == "") {

			command = reader.next().toLowerCase();

			if (command.length() != 1) {

				System.out.println("Vänligen ange bara en bokstav!");
				command = "";
				
			} else {

				char letter = command.charAt(0);
				
				if (!Character.isLetter(letter)) {

					System.out.println("Bara bokstäver tack!");
					command = "";
				}
			}
		}

		return command;
	}

	static boolean guessWord() {

		System.out.println("Gissa ord: ");

		String word = reader.next();

		if (word.equalsIgnoreCase(wordToGuess)) {

			win();
			return false;
			
		} else {

			fail();
			return true;
		}

	}
	
	static void win() {

		System.out.println("Du gissade rätt! Grattis till vinsten!");
		System.out.println("Du gissade fel " + hangRound + " gånger.");
	}
	
	static void fail() {

		hangRound++;
		printHangman();
		System.out.println("Tyvärr, det var fel.");
		System.out.println("Du har använt " + hangRound + " försök.");
	}
	
	static void printHangman() {
		
		String[] hangman = {
			"\n\n\n\n\n\n",			
			"\n\n\n\n\n\n/|\\",
			"\n |\n |\n |\n |\n |\n/|\\",
			" ____\n |\n |\n |\n |\n |\n/|\\",
			" ____\n |  |\n |\n |\n |\n |\n/|\\",
			" ____\n |  |\n |  o\n |\n |\n |\n/|\\",
			" ____\n |  |\n |  o\n |  |\n |\n |\n/|\\",
			" ____\n |  |\n |  o\n | /|\n |\n |\n/|\\",
			" ____\n |  |\n |  o\n | /|\\\n |\n |\n/|\\",
			" ____\n |  |\n |  o\n | /|\\\n | /\n |\n/|\\",
			" ____\n |  |\n |  o\n | /|\\\n | / \\\n |\n/|\\"
		};
		
		System.out.println(hangman[hangRound]);
		
	}
}
