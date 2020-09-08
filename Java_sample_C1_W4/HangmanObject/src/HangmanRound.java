
public class HangmanRound {

	private String currentWord;
	private String showWord;
	private int scoreCount = 0;

	// the constructor
	public HangmanRound() {

	}

	public String getCurrentWord() {
		return currentWord;
	}

	public void setCurrentWord(String currentWord) {
		this.currentWord = currentWord;
	}

	public String getShowWord() {
		return showWord;
	}

	public void setShowWord(String showWord) {
		this.showWord = showWord;

	}

	public int getScoreCount() {
		return scoreCount;
	}

	public void addScoreCount() {
		this.scoreCount++;
	}

}
