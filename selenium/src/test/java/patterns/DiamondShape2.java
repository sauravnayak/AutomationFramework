package patterns;

import java.util.Scanner;

public class DiamondShape2 {
	
	
    
//              1 
//             2 2 
//            3 3 3 
//           4 4 4 4 
//          5 5 5 5 5 
//         6 6 6 6 6 6 
//        7 7 7 7 7 7 7 
//       8 8 8 8 8 8 8 8 

	public static void main(String[] args) {
		System.out.println("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int row=a;
		
		for(int i=0;i<=row;i++) {
			
			for(int j=0;j<row-i;j++) {
				
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++) {
				
				System.out.print(i+" ");
				
			}
			System.out.println("");
			
				
		}
		
		
		 
		sc.close();
	}

}
