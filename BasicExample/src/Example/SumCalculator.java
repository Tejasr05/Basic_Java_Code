package Example;

import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) { // a,/b result=a+b
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number : ");
		int first = sc.nextInt();
		System.out.println("enter a second number : ");
		int second = sc.nextInt();
		int result = first + second;
		System.out.println("The final result is : " + result);
		sc.close();

	}

}
