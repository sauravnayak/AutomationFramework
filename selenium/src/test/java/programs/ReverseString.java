package programs;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String n) {
		String newstr="";
		for(int i=0;i<n.length();i++) {
			newstr=n.charAt(i)+newstr;
			
		}
		return newstr;
		
		

	}

	public static void main(String[] args) {
		
		System.out.println("Enter String which you want to Reverse: ");
		Scanner sc=new Scanner(System.in); 
		String a=sc.next();
		System.out.println("Reverse of "+a+" is "+reverse(a));
		sc.close();
		

	}

}
