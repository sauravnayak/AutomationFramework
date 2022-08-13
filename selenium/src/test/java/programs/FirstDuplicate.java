package programs;

import java.util.HashSet;

public class FirstDuplicate {

	public static void fustDuplicate(int[] a2) {

		int[] a = a2;

		HashSet<Integer> h = new HashSet<Integer>();

		for (int c : a) {

			if (h.contains(c)) {

				System.out.println("First Duplicate is : " + c);
				
			} else {
				h.add(c);
			}

		}

	}

	// . A String is given remove the white spaces,
	// reverse it and print the only odd position characters.

	public static void main(String[] args) {

		int[] a = { 1, 6, 8, 9, 15, 15 ,1};

		fustDuplicate(a);

	}

}
