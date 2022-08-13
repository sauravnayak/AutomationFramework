package programs;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (a.length != b.length) {
			return false;

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;

		}

		return true;

	}

	// . A String is given remove the white spaces,
	// reverse it and print the only odd position characters.

	public static void main(String[] args) {

		String str1 = "Kite";
		String str2 = "tiKe";

		System.out.println("The Result is: " + isAnagram(str1, str2));

	}

}
