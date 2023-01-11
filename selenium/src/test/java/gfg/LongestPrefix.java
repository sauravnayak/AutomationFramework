package gfg;

import java.util.Arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		/*
		 * N = 4 arr[] = {geeksforgeeks, geeks, geek, geezer} Output: gee Explanation:
		 * "gee" is the longest common prefix in all the given strings.
		 */
		
		String arr[] = {"geeksforgeeks", "geekgod", "geek", "geezer"};
		
		System.out.println("The Longest String is : "+ longestCommonPrefix(arr, 4));
		
		
	}
	
	 public static String longestCommonPrefix(String arr[], int n){
	     
	       Arrays.sort(arr);
	       if(n==0){
	           return "-1";
	       }
	       if(n==1){
	           
	           return arr[0];
	       }
	       int min=Math.min(arr[0].length(),arr[n-1].length());
	       int i=0;
	       while(i<min && arr[0].charAt(i)==arr[n-1].charAt(i))
	       i++;
	       if(i==0){
	           return "-1";
	       }
	       String res=arr[0].substring(0,i);
	       return res;
	        
	        
	    
	    }
}
