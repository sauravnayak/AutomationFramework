package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumbertoWord {

	public static void main(String[] args) {
		System.out.println("Enter Number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=a;
		
		System.out.println("The number in word for "+ num+ " is :"+ word(num));
		 sc.close();

	}
	
	public static String word(int n) {

		int digit = String.valueOf(n).length();
		int temp = n;
		String s = "";
		while (temp > 0) {
			temp = temp / 10;
			digit++;
		}
		ArrayList<String> a = new ArrayList<String>();
		while (n > 0) {
			int lastd = n % 10;
			switch (lastd) {
			case 1:
				a.add("One ");
				break;
			case 2:
				a.add("two ");
				break;
			case 3:
				a.add("Three ");
				break;
			case 4:
				a.add("Four ");
				break;
			case 5:
				a.add("Five ");
				break;
			case 6:
				a.add("Six ");
				break;
			case 7:
				a.add("Seven ");
				break;
			case 8:
				a.add("Eight ");
				break;
			case 9:
				a.add("Nine ");
				break;
			case 0:
				a.add("Zero");
				break;
			}
			n = n / 10;

		}
		Collections.reverse(a);
		for (String st : a) {
			s = s + st;
		}
		return s;

	}
	
	

}
