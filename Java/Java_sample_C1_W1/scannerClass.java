package test1234;

import java.util.Scanner;
public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader =new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = reader.nextLine();
		System.out.print("What is your age? ");
	    int input =Integer.parseInt(reader.nextLine());
		
		System.out.println(input);
		
		
		
		
		
		//reader.close();
		
		
		
		
	}

}
