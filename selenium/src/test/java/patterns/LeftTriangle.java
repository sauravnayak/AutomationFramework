package patterns;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//3
		for(int i=0;i<a;i++) {
			
			for(int j=0;j<a-i-1;j++) {
				
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
			sc.close();
		}

	}

}
