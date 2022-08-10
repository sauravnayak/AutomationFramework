package patterns;

import java.util.Scanner;

public class NumberPattern5 {
	
	
	// 1
	// 2 1
	// 3 2 1
	// 4 3 2 1
	// 5 4 3 2 1
	// 6 5 4 3 2 1
	// 7 6 5 4 3 2 1
	// 8 7 6 5 4 3 2 1

	
	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			
			for(int j=0;j<i;j++) {
				int count=i-j;
				System.out.print(" "+count);
				count--;
				
			}
			System.out.println("");
		}
		sc.close();

	}

}
