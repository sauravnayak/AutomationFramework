package programs;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=a;
		
		System.out.println("The reverse of number"+ num+ "is :"+ reverse(num));
		 
		sc.close();
	}
	
	public static int reverse(int n) {
		int rem=0;
		int sum=0;
		while(n>0) {
			 rem=n%10;
			 sum=sum*10+rem;
			 n=n/10;
			
		}
		return sum;
		

	}

}
