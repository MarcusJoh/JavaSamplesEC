package testCase;

import java.util.ArrayList;
import java.util.Collections;

public class timeTooTest {

	public static boolean aNumber(String numberCheck) {
		boolean IsNumber = false;
		try {
			Integer.parseInt(numberCheck);
			IsNumber = true;

		} catch (NumberFormatException e) {
			IsNumber = false;
		}
		return IsNumber;

	}

	public static String palindrome(String text) {
		ArrayList<Character> word = new ArrayList<>();
		for (char c : text.toCharArray()) {
			word.add(c);
		}
		Collections.reverse(word);

		StringBuilder builder = new StringBuilder(word.size());
		for (Character ch : word) {
			builder.append(ch);
		}
		return builder.toString();

	}

	public static String isEmpty(String value) {
		if (value == null) {

			return null;
		}
		return value;

	}

}
