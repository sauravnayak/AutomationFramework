package programs;

import java.util.Arrays;

public class AlternateCharToUpperCase {

	public static String alternateToUpperCase(String s) {

		char[] a = s.toCharArray();

		for (int i = 0; i < s.length(); i = i + 2) {
			a[i] = Character.toUpperCase(a[i]);

		}
		String str = new String(a);

		return str;
	}

	// . A String is given remove the white spaces,
	// reverse it and print the only odd position characters.

	public static void main(String[] args) {

		String str1 = "Kite";
		String str2 = "Alternate";
		
		System.out.println("The Result is: " + alternateToUpperCase(str2));
		System.out.println("The Result is: " + alternateToUpperCase(str2));

	}

}
