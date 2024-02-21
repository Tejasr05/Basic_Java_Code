package Example;

import java.util.Scanner;

public class NamePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a row..");
		int row=sc.nextInt();
		
		for(int i=0;i<=row;i--) {
			//i=0,0<=5;0++
			for(int j=1;j<=i;j--) {
			System.out.print("");
			
		    }
			for(int j=1;j<=row-i;j++) {
				System.out.print("T"+" ");
			}
			System.out.println(" ");
	}

}}
