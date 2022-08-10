package programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
			
			System.out.println("Enter Number for which you want Check Armstrong: ");
			Scanner sc=new Scanner(System.in); 
			int a=sc.nextInt();
			System.out.println("Factorial of "+a+" is "+armstrong(a));
			
			sc.close();

		}
	public static boolean armstrong(int n) {
		int temp, last=0, digits=0,sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digits++;
			
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum=sum+  (int) Math.pow(last, digits);
			temp=temp/10;
		}
		
		if(sum==n) {
			return true;
		}
		else return false;
	}
	
	

}
