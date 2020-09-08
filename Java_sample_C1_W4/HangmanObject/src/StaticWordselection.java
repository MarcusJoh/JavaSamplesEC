import java.util.Random;

public class StaticWordselection {

	private static String[] word = { "Hyponeurikostiskadiafragmakontravibrationer", "Java" };
	private static String[] hideWord = { "___________________________________________", "____" };
	private static int maxScore = 7;

	public static void setWord(HangmanRound aRound) {
		int random = genRandom();
		aRound.setCurrentWord(word[random]);
		aRound.setShowWord(hideWord[random]);
		
		
	}


	

	public static int genRandom() {
		return new Random().nextInt(word.length);
	}




	public static int getMaxScore() {
		return maxScore;
	}




	





}
