package arreysAndmore;

public class ArreysSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arreys

		int arreyofInts[] = { 33, 3, 4, 5 };// declaration, instantiation and initialization
		// printing array

		for (int i = 0; i < arreyofInts.length; i++) {
			System.out.println("normal loop" + arreyofInts[i]);
		}

		for (int i : arreyofInts) {
			System.out.println("quick loop" + i);
		}

		sendArrey(arreyofInts);

		int arreyInts[] = getArrey();

		int soloInt = arreyInts[0]; // grab the first pos value
		System.out.println("solo val from Int" + soloInt);

		// int anotherInt =arreyInts[10]; // grab the first pos value
		// System.out.println(anotherInt);

		// change content in an arrey
		int[] x = { 2, 3, 4, 4, -5, 4, 6, 2 };
		System.out.println("change content" + x[6]);
		x[6] = 5;

		System.out.println("change content" + x[6]);

		// CollectionsSample.collectionRun();
		HashSetsample.HashSetRun();

	}

	static void sendArrey(int arr[]) {
		int min = arr[0];
		for (int i : arr) {
			System.out.println("Inside a metod" + i);

		}

	}

	static int[] getArrey() {
		return new int[] { 5, 3, 53, 94, 40 };
	}

}
