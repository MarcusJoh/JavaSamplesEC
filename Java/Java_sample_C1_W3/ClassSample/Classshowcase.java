
public class Classshowcase {

	public static void main(String[] args) {

		exampleClass.printEmployee();

		System.out.println(exampleClass.designation);
		

		exampleClass.empDesignation("teacher");

		int Age = exampleClass.empAge(5);

		exampleClass.printEmployee();

	
		
		
		
		// System.out.println(exampleClass.salary);
		
		
		/*
		 * public means that the method will be visible from classes in other packages.
		 * 
		 * static means that the method is not attached to a specific instance, and it
		 * has no "this". It is more or less a function.
		 * 
		 * void is the return type. It means "this method returns nothing".
		 */
		
		
		
		
		
		/* Object creation */
		voidexampleClass myPuppy = new voidexampleClass("tommy");

		/* Call class method to set puppy's age */
		myPuppy.setAge(2);

		/* Call another class method to get puppy's age */
		myPuppy.getAge();

		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myPuppy.puppyAge);

	}

}