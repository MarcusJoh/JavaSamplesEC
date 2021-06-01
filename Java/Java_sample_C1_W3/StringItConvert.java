
public class StringItConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int thisisNowINT = toInteger("1");

		System.out.println("Number: "+thisisNowINT);

		String thisisNowString = toString(123);

		System.out.println("String: "+thisisNowString);

		
		
		
		
		
		
		//System.out.println(toInteger("1"));
		//System.out.println(toString(123));

	}

	public static int toInteger(String inttoString) {
		int returnVal = 0;
		try {
			returnVal = Integer.parseInt(inttoString);

		} catch (NumberFormatException e) {
			System.out.println("Not a number");
		}
		return returnVal;

	}

	public static String toString(int StringtoInt) {

		return String.valueOf(StringtoInt);

	}

}
