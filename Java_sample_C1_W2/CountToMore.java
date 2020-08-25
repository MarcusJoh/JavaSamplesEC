
public class CountTo {
    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);

    System.out.print("Type the first number: ");
    int first = Integer.parseInt( reader.nextLine() );

    System.out.print("Type the second number: ");
    int second = Integer.parseInt( reader.nextLine() );
       
      count(first,second);
      
    }
    
     static void count(int from, int to) {
    	 
    	 for (int i = from; i < to; i++) {
    		  System.out.println(i);
    		}

        
    }
}