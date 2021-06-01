package parseInfo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class sampleParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "";

		try {
			content = new String(Files.readAllBytes(Paths.get("text.txt")), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(content);
	}

}
