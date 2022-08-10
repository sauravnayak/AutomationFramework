package programs;

import java.util.Scanner;

public class GreatestofThreeNumberUsingTertinaryOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		System.out.println("Enter Third Number : ");
		int c=sc.nextInt();
		
		int temp;int biggest;
		
		temp=a>b?a:b;
		biggest=c>temp?c:temp;
		System.out.println("Highest Number: "+ biggest);
		sc.close();
	
}
	
	

}
