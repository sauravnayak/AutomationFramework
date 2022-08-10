package programs;

import java.util.Scanner;

public class PetersonNumber {
	int x=0;
   
	
	//145 = !1 + !4 + !5
	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=a;
		PetersonNumber p=new PetersonNumber();
		System.out.println("The number : "+ num+ " is :"+p.ispeterson(a));
		 sc.close();

	}
	public boolean ispeterson(int n) {
		int sum=0, rem=0,temp=n;
		while(n>0) {
			rem= n%10;
			sum+=factorial(rem);
			n/=10;
		}
		if(sum==temp)
		return true;
		else return false;

	}
	
	public  int factorial(int n) {
		int sum=1;
		while(n>=1) {
			sum=sum*n;
			n--;
		}
		return sum;

	}
	
	

}
