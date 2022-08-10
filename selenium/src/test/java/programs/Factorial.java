package programs;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		int sum=1;
		while(n>=1) {
			sum=sum*n;
			n--;
		}
		return sum;

	}

	public static void main(String[] args) {
		
		System.out.println("Enter Number for which you want factorial: ");
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt();
		System.out.println("Factorial of "+a+" is "+factorial(a));
		sc.close();
		

	}

}
