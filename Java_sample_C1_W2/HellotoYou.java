import java.util.Scanner;

public class HellotoYou {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       
        greet("Moe");

        System.out.println("and some more");
        greet("Larry");
        greet("Curly");
       
    }

    // self-written methods
     static void greet(String name) {
        System.out.println("Hello there!" + name);
    }
}