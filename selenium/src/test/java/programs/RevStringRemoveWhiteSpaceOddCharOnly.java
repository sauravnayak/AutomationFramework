package programs;

public class RevStringRemoveWhiteSpaceOddCharOnly {
		
	
	
	// . A String is given remove the white spaces, 
	// reverse it and print the only odd position characters.
	
	public static void main(String[] args) {
		
		String str= "This is a test Automation Practice Question";
		//Automation Practice Question
		String[] s= str.split(" ");
		String temp="";
		for(String i:s) {
			temp=i+temp;
		}
		
		String res="";
		
		System.out.println("After Removing Whitespace and reversing String: "+str+":  is:  "+temp);
		for(int j=0;j<temp.length();j=j+2) {
			res=res+temp.charAt(j);
		}
		System.out.println("The only odd character String of: "+temp+" : is:  "+res);
		
	}

}
