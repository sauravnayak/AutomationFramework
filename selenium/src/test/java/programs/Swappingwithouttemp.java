package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swappingwithouttemp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping a: "+ a+ " b :"+ b);
		/*
		 * a=a^b; b=a^b; a=a^b; System.out.println("After Swapping a: "+ a+ " b :"+ b);
		 */
		 ArrayList<Integer> x= new ArrayList<Integer>();
		 x.add(a);
		 x.add(b);
		 System.out.println(x);
		 Collections.swap(x, 0, 1);
		 System.out.println("After Swapping a: "+ x.get(0)+ " b :"+ x.get(1));
		 System.out.println(x);
		 sc.close();
}
	
	

}
