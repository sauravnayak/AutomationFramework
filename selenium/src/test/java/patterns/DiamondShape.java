package patterns;

import java.util.Scanner;

public class DiamondShape {
	
	
//	     *  
//	    * *  
//	   * * *  
//	  * * * *  
//	   * * *  
//	    * *  
//	     *  


	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int row=a;
		
		for(int i=0;i<row;i++) {
			
			for(int j=a-i;j>1;j--) {
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++)
			{System.out.print("* ");}
			System.out.println(" ");		
		}
		
		for (int i = a - 1; i > 0; i--) {

			for (int j = 1; j <=a-i; j++) {
				System.out.print(" ");

			}
			for (int j = i; j >=1; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		 
		sc.close();
	}

}
