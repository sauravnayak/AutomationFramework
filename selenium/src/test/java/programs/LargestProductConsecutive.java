package programs;

public class LargestProductConsecutive {

	public static void main(String[] args) {

		int a[] = new int[] { 15, 9, 18, 5, 1 };
		LargestProductConsecutive lp=new LargestProductConsecutive();
		
		int sum=lp.largest(a);
	System.out.println("largest product of two consecutive elements in Array  is " + sum);

	}

	public  int  largest(int n[]) {
		int max=0;
        for(int i=0;i<n.length-1;i++){
            
                int prod;
                prod=n[i]*n[i+1];
                if(max<prod){
                    max=prod;
                }
        }
        return max;
	
}
}
