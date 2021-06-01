package object1;

public class Main {

	public static void main(String[] args) {

		Person dennis = new Person("Dennis");
		Person susanne = new Person("Susanne");
		Person nikola = new Person("Nikola");

		dennis.printPerson();
		susanne.printPerson();
		nikola.printPerson();

		susanne.Bday();

		susanne.printPerson();

		int i = 0;
		while (i < 30) {
			nikola.Bday();
			i++;
		}

		if (nikola.isAdult()) {
			System.out.print("adult: ");
			nikola.printPerson();
		} else {
			System.out.print("minor: ");
			nikola.printPerson();
		}

		Person marcus = new Person("Marcus");
		marcus.Bday();

		System.out.println("");

		if (marcus.isAdult()) {
			System.out.print("adult: ");
			marcus.printPerson();
		} else {
			System.out.print("minor: ");
			marcus.printPerson();
		}

		String Name = dennis.toString();
		System.out.println("The name was " + Name);
		Name = dennis.getName();
		System.out.println("The name was " + Name);

		System.out.println("The name was " + dennis);

		if (CanDrink(dennis)){
			
			System.out.println(dennis+" can drink");
		}

		// ready-made objects

//        ArrayList<String> countries = new ArrayList<String>();
//
//        countries.add("Danmark ");
//        countries.add("Germany");
//        countries.add("Norway");
//

//	Scanner reader = new Scanner(System.in);

	}

	public static boolean CanDrink(Person NewPerson) {

		if (NewPerson.getAge() <= 21) {
			return true;

		} else {
			return false;
		}

	}
}
