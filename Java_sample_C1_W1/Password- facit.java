import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String password = "qwerty";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter pass");
		while (true) {
			String pass = scan.nextLine();
			if (pass.equals("quit")) {
				System.out.println("Get out");
				break;
			} else if (pass.equals(password)) {
				System.out.println("Password correct ");
				break;
			} else {
				System.out.println("Wrong pass");
				
				Pass(password);
			}

		}

		
	}

	static void Pass(String pass) {

		String s = pass;
		System.out.println("The hint is: ");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'm')
				c += 10;
			else if (c >= 'A' && c <= 'M')
				c += 10;
			else if (c >= 'n' && c <= 'z')
				c -= 10;
			else if (c >= 'N' && c <= 'Z')
				c -= 10;
			
			System.out.print(c);
		}
		System.out.println();
	}
}
