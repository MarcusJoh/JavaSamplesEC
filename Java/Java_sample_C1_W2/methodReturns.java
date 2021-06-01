import java.util.Scanner;

public class methodReturns  {

	 public static void main(String[] args) {
		    Scanner reader = new Scanner(System.in);

		    System.out.print("Type the first number: ");
		    int first = Integer.parseInt( reader.nextLine() );

		    System.out.print("Type the second number: ");
		    int second = Integer.parseInt( reader.nextLine() );

		    System.out.print("Total: " + sum(first,second) );
		}

		
	 public static int sum(int first, int second) {
		    return first + second;
		}
	
}





