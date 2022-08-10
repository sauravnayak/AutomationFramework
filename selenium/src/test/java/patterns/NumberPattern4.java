package patterns;

import java.util.Scanner;

public class NumberPattern4 {
	
	
	// 8
	// 8 7
	// 8 7 6
	// 8 7 6 5
	// 8 7 6 5 4
	// 8 7 6 5 4 3
	// 8 7 6 5 4 3 2
	// 8 7 6 5 4 3 2 1


	
	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i <= a; i++) {

			for (int j = 0; j < i; j++) {
				int count = a - j;
				System.out.print(" " + count);
				count--;

			}
			System.out.println("");
		}
		sc.close();

	}
	 
	
	

}
