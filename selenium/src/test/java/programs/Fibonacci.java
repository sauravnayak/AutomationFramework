package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing Fibonnacci series 
		// 0 1 1 2 3 5 8  13
		//int a=9;
		// 0 1  2 3 5 8 13 
		//0+0  0+1   1+1  1+2 2+3 
		ArrayList<Integer> arr= new ArrayList<Integer>(); 
		System.out.println("Enter No of Fibonacci series: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//int n=
		
			int prev=0;
			int next = 1;
			int sum=1;
			for (int i = 0; i < a; i++) {
				
				
				System.out.print(" "+sum);
				next=prev;//  1   1 2 3
				prev=sum ; //  1 2 3 5
				sum=next+prev; // 2 3 5 8
				
				
			}
			
		}
		
		
		/*
		 * System.out.println("Before Swapping a;"); for(int k:a ) {
		 * System.out.println(k);
		 * 
		 * }
		 * 
		 * System.out.println("Before Swapping b;"); for(int k:b ) {
		 * System.out.println(k);
		 * 
		 * } int [] c= new int[4]; for(int i=0;i<4;i++) {
		 * 
		 * c[i]=b[i]; b[i]=a[i]; a[i]=c[i]; }
		 * 
		 * 
		 * System.out.println("After Swapping a;"); for(int k:a ) {
		 * System.out.println(k);
		 * 
		 * }
		 * 
		 * System.out.println("After Swapping b;"); for(int k:b ) {
		 * System.out.println(k);
		 * 
		 * }
		 */
		
		

	

}
