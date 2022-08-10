package programs;

import java.util.Scanner;

public class NearestPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		nearestPalin(a);
		sc.close();
	}

	public static boolean isPalin(String s) {
		int left = 0, right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {

				return false;
			}
			left++;
			right--;
		}
		return true;

	}
	
	public static void nearestPalin(int n) {
		int low=n-1,high=n+1;
		
		
		while(!isPalin(Integer.toString(low))) {
			low--;
			
		}
		while(!isPalin(Integer.toString(high))) {
			high++;
			
		}
		if(Math.abs(n-low)<Math.abs(n-high)) {
			
			System.out.println(low);
		}
		else System.out.println(high);
		
	}

}
