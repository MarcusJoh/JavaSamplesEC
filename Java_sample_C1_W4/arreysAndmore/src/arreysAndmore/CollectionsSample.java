package arreysAndmore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsSample {

	/*
	 * 
	 * List are colletions of dataset List <data-type> list1= new ArrayList();
	 * List<data-type> list2 = new LinkedList(); List <data-type> list3 = new
	 * Vector(); List <data-type> list4 = new Stack();
	 */

	List<Integer> list1 = new ArrayList();
	List<String> list2 = new LinkedList();
	List<Character> list3 = new Vector();
	List<Double> list4 = new Stack();

	public static void collectionRun() {

		System.out.println("ArrayList over here");

		ArrayList<String> wordList = new ArrayList<String>();

		wordList.add("First");
		wordList.add("Second");

		wordList.add("Anthony");
		wordList.add("Bart");
		wordList.add("Paul");
		wordList.add("John");
		wordList.add("Martin");
		wordList.add("Matt");

		System.out.println("the number of entries " + wordList.size());

		System.out.println("first in the list " + wordList.get(0));
		System.out.println("third in the list " + wordList.get(2));

		if (wordList.contains("Bart")) {
			System.out.println("Bart is in the list");
		} else {
			System.out.println("Bart is not in list");
		}

		int place = 0;
		System.out.println(wordList.get(place));
		place++;
		System.out.println(wordList.get(place));
		place++;
		System.out.println(wordList.get(place));
		place++;
		System.out.println(wordList.get(place));

		// for-each

		for (String word : wordList) {
			System.out.println(word);
		}

		// print(wordList);

		// Collections.sort(wordList);

		// print(wordList);

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(4);
		numbers.add(8);

		// tries to remove the number from the index 4, does not work as expected!
		numbers.remove(4);

		// this removes the number 4 from the list
		numbers.remove(Integer.valueOf(4));

		ArrayList<Double> doubles = new ArrayList<Double>();
		ArrayList<Character> characters = new ArrayList<Character>();

		ArrayList<Integer> numbersfromMethod = addNumbersToList(3, 5, 2);

		// Generics aka declare everything
		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(1000); // works fine

		
		//list1.add("marcus"); // compile time error;

		List list2 = new ArrayList();

		list2.add(1000);
		list2.add("marcus"); // works but is not generic as all item in the collection are not the same

	}

	public static void print(ArrayList<String> printed) {
		for (String word : printed) {
			System.out.println(word);
		}
	}

	public static ArrayList<Integer> addNumbersToList(int num1, int num2, int num3) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(num1);
		list.add(num2);
		list.add(num3);

		return list;
	}

}
