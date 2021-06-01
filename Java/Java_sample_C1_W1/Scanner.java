import java.util.Scanner;
public class Scanner {
	
    public static void main(String[] args) {
    	
    	Scanner reader = new Scanner(System.in);

    	System.out.print("Give number? ");
    	String number = reader.nextLine();
    	
    	
    	int realNumber;
    	try {
    		realNumber = Integer.parseInt(number);
    	}
    	catch (NumberFormatException e)
    	{
    		realNumber = 0;
    	}
    	
    	
    	if (realNumber == 11) {
    	    System.out.println("Yes! :)");
    	} else {
    	    System.out.println("Nope :(");
    	}
    	
    }
    
}