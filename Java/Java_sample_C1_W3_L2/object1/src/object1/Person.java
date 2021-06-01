package object1;

public class Person {
	private String name;
	private int age;

	// the constructor
	public Person(String initialName) {
		this.age = 0;
		this.name = initialName;
	}

	public void printPerson() {
		System.out.println(this.name + ", age " + this.age + " years");
	}

	public void Bday() {
		this.age++;

	}

	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}

		return true;
	}

	
	
//	public String toString() {
//		return this.name;
//	}
	

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
