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
				System.out.print("S� h�r ser det ut just nu: ");
				System.out.println(showWord);
				printHangman();
				System.out.println("Du har f�rbrukat " + hangRound + " f�rs�k.");
				System.out.println("Du har " + triesLeft + " f�rs�k kvar.");
				System.out.print("Du har anv�nt dessa bokst�ver: ");
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
				
				System.out.println("Tyv�rr s� har du nu anv�nt alla dina gissningar. B�ttre lycka n�sta g�ng!");
				continueGame = false;
			}
		}		
	}

	static void setupGame(String wordToGuess) {

		showWord = wordToGuess.toCharArray();

		for (int i = 0; i < wordToGuess.length(); i++) {

			showWord[i] = '_';
		}

		System.out.println("V�lkommen till Hangman!");
		System.out.println("Ordet du ska gissa �r " + showWord.length + " bokst�ver l�ngt.");
		System.out.println("Du har " + numberOfTries + " f�rs�k p� dig. Lycka till!");
	}

	static String getCommand() {

		String command;

		while (true) {

			System.out.println("Ge ett kommando, s f�r status, b f�r att gissa bokstav och o f�r att gissa ordet.");

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
			
			System.out.println("Du har redan anv�nt bokstav " + letter + ".");
			System.out.print("Du har anv�nt dessa bokst�ver: ");
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

				System.out.println("V�nligen ange bara en bokstav!");
				command = "";
				
			} else {

				char letter = command.charAt(0);
				
				if (!Character.isLetter(letter)) {

					System.out.println("Bara bokst�ver tack!");
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

		System.out.println("Du gissade r�tt! Grattis till vinsten!");
		System.out.println("Du gissade fel " + hangRound + " g�nger.");
	}
	
	static void fail() {

		hangRound++;
		printHangman();
		System.out.println("Tyv�rr, det var fel.");
		System.out.println("Du har anv�nt " + hangRound + " f�rs�k.");
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
