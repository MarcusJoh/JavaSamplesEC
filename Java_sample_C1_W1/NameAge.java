import java.util.Scanner;


public class NameAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = reader.nextLine();   

        System.out.print("How old? ");
        int age = 0;
		try {
		   age = Integer.parseInt(reader.nextLine());
		}
		catch (NumberFormatException e)
		{
		   age = 0;
		}

        System.out.println("Your name is: " + name + ",  are " + age + " years old, nice to meet you!");
    }
}