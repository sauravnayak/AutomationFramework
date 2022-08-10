package programs;

import java.util.Scanner;

public class PalindroneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number for which you want Check Palindrome: ");
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt();
		System.out.println("Number "+a+" is Palindrome : "+ palin(Integer.toString(a)));
		
		sc.close();
		

	}
	
	public static boolean palin(String n) {
		int left=0, right=n.length()-1;
		
		
		while(left<right) {
			if(n.charAt(left)!=n.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
		
	}

}
