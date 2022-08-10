package programs;

public class PrimeNumber {

	public static void main(String[] args) {
	
		
		int n=203;
		int temp=3;
		boolean isprime=true;
		
		if (n%2==0) {
			isprime=false;
		}
		else {
			for (int i = 3;i <n/2; i=i+2) {
				if(n%i==0) {
					isprime=false;
					break;
					}
				
			}
			

		}
	System.out.println("Prime number: "+ isprime);
		
		
		
			
			
			

	}

}
