package patterns;

import java.util.Scanner;

public class NumberPattern1 {
	
	
	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5
	// 1 2 3 4 5 6
	// 1 2 3 4 5 6 7

	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" "+ j);
			}
			System.out.println("");
		}
		sc.close();
	}

}
