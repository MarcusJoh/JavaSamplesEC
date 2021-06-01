package enumAbstractAndInterface;

public class StartsFromhere {

	public static void main(String[] args) {
		// enum
		enumForStaticVal dir = enumForStaticVal.WEST;
		System.out.println(dir);

		// Abstract
		// call class that can reach Car
		Car currentCar = new runTest();
		currentCar.run();
		
		
		// Abstract
		// call class that can reach Car
		interfaceToAbstract interFace = new getTheInterface();
		interFace.print();


	}

}

//Normal class that can reach Car
class runTest extends Car {
	public void run() {
		System.out.println("Vroom");
	}
}

//Normal class can use interfaceToAbstract
class getTheInterface implements interfaceToAbstract {
	public void print() {
		System.out.println("Hello world");
	}
}
