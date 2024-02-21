package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner is advanced version of BufferedReader
		
		String name;
		System.out.println("Enter a name : ");
		try {
			name = br.readLine();
			System.out.println("The name is: " + name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("error" + e.getMessage());
		}

	}

}
