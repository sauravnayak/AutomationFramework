package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

	public static void  frequencyOfChar(String s) {

		char[] a = s.toCharArray();
		
		HashMap<Character, Integer> charmap=new HashMap<Character, Integer>();
		for(char c :a) {
			
			if(charmap.containsKey(c)) {
				
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}
			
		}
		for(Map.Entry entry:charmap.entrySet()) {
			System.out.println("The Frequency of: "+entry.getKey()+" is:"+entry.getValue() );
			
		}
		

		
	}

	// . A String is given remove the white spaces,
	// reverse it and print the only odd position characters.

	public static void main(String[] args) {

		String str1 = "Kite";
		String str2 = "Alternate";
		str2=str2.toUpperCase();
		
		frequencyOfChar(str2);

	}

}
