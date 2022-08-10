package patterns;

import java.util.Scanner;

public class NumberPattern2 {
	
	
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10
	// 11 12 13 14 15
	// 16 17 18 19 20 21
	// 22 23 24 25 26 27 28

	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int loop=1;
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" "+ loop);
				loop++;
			}
			System.out.println("");
		}
		sc.close();

	}

}
