package patterns;

import java.util.Scanner;

public class NumberPattern3 {
	
	
	// 1
	// 2 2
	// 3 3 3
	// 4 4 4 4
	// 5 5 5 5 5
	// 6 6 6 6 6 6
	// 7 7 7 7 7 7 7
	// 8 8 8 8 8 8 8 8
	// 9 9 9 9 9 9 9 9 9


	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" "+i);
				
			}
			System.out.println("");
		}
		sc.close();

	}

}
