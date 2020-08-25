import java.util.Scanner;

public class AllHellos {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       
        greet();

        System.out.println("and some more");
        greet();
        greet();
        greet();
    }

    // self-written methods
     static void greet() {
        System.out.println("Hello there!");
    }
}