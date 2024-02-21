package Example;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("enter a row: ");// 5
		int row = sc.nextInt();
		System.out.println();

		for (int i = 0; i <= row; i++) { // i=0, 0<=5, 0++
			for (int j = 1; j <= i; j++) { // j=1,1<=0, j++

				System.out.print(" ");
			}
			for (int j = 1; j <= row - i; j++) { // j=1,1<=5-0,j++
				System.out.print("*" + " ");

			}
			System.out.println(" ");
		}

	}
}
