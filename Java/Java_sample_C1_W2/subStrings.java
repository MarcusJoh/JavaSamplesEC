
public class subStrings {

	public static void main(String[] args) {
		String word = "program";
		
		
		char a= word.charAt(0);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(word.length());
		
		for (int i = 0 ; i != word.length() ; i++) {
		    char c = word.charAt(i);
		    System.out.print (c);
		} System.out.println ();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(word.substring(1));

		System.out.println(word.substring(1, 3));

		
		int index = word.indexOf("gram");

		System.out.println(index);
        System.out.println(word.substring(index));

	}

}
