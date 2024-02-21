package Example;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter a rows ");
		int row=sc.nextInt();
		
			for(int i=row;i>=0;i--)
			{
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=row-i;j++) {
					System.out.print("*"+" ");
				}
				System.out.println(" ");
				
			
		}
		

	}

}
