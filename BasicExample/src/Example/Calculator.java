package Example;

import java.util.Scanner;

public class Calculator { // using switch statement

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a first number : ");
		double first = sc.nextDouble();
		System.out.println("enter a second number : ");
		double second = sc.nextDouble();

		System.out.println("Enter the operator (+.-.*,/) : ");
		char operator = sc.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = first + second;
			System.out.println("you select add(+) operator..");
			System.out.println("THE RESULT OF " + first + "+" + second + "=" + result);
			break;
		case '-':
			result = first - second;
			System.out.println("you select - operator..");
			System.out.println("THE RESULT OF " + first + "-" + second + "=" + result);
			break;
		case '*':
			result = first * second;
			System.out.println("you select * operator..");
			System.out.println("THE RESULT OF " + first + "*" + second + "=" + result);
			break;
		case '/':
			if (second == 0) {
				System.out.println("error : cannot be divided by zero!");
				return;
			}
			result = first / second;
			System.out.println("you select / operator..");
			System.out.println("THE RESULT OF " + first + "/" + second + "=" + result);
			break;
		default:
			System.out.println("invalid operator");
			return;
		}
		System.out.println();

		// System.out.println("The result is :" + result);
		sc.close();

	}

}
