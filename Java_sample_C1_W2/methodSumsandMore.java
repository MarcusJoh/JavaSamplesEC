import java.util.Arrays;

public class methodSumsandMore  {

	public static void main(String[] args) {
		
		 System.out.println("least: "+least(123,456,3546));
		 System.out.println("greatest: "+greatest(385,1,444));
		 System.out.println("sum: "+sum(385,444,444));
	    
	}

	public static int least(int number1, int number2, int number3) {


		int a[]={number1,number2,number3}; 
		Arrays.sort(a);
	  
	

	    return a[0];
	}
	public static int greatest(int number1, int number2, int number3) {

		
		int a[]={number1,number2,number3}; 
		Arrays.sort(a);
	  
	

	    return a[2];
	}
	public static int sum(int number1, int number2, int number3) {

	    int sum = number1 + number2 + number3;
	    

	    return sum;
	}
}




