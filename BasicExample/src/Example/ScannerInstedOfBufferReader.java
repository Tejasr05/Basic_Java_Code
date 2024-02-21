package Example;

import java.util.Scanner;

public class ScannerInstedOfBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name : ");
		String name=sc.nextLine();
		System.out.println("The entered name is : "+name);

	}

}
