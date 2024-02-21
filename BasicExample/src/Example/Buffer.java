package Example;

import java.io.BufferedReader; //  it allows us to read lines of text from a character input stream
import java.io.IOException;
import java.io.InputStreamReader;// it converts bytes of input into characters

public class Buffer { // buffer is the class name

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// buffer reader in java is a class that allows you to reas character from input
	
		    System.out.println("enter your input : ");
		
			String input = br.readLine();
			System.out.println("you entered : " + input);
			br.close();
		} catch (IOException e) {
			System.err.println("error reading input: " + e.getMessage());
		
		}

	}

}
