package gfg;

import java.util.HashSet;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		/*
		 * Input: S="geeksforgeeks" Output: e Explanation: 'e' repeats at third
		 * position.
		 */
		String str= "geeksforgeeks";
		System.out.println("First repeated character in String is "+ firstRepChar(str));
		

	}
	
	public static String firstRepChar(String s) 
    { boolean flag=false;
        String res="";
        HashSet<Character> hs=new HashSet<Character> ();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hs.contains(c)){
                res+=c;
                flag=true;
                break;
            }
            else
                hs.add(c);
        }
        if(flag==true)
        return res;
        else
        
        return "-1";
    }

}
