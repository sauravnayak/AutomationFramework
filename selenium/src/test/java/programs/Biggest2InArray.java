package programs;

public class Biggest2InArray {

	/* Using temp variable 
	 * public static void main(String[] args) {
	 * 
	 * int[] a = { 18, 17, 9, 10 }; int bigind = 0, secind = 0, biggest, bigger;
	 * biggest = a[0]; for (int i = 0; i < a.length; i++) { if (a[i] > biggest) {
	 * bigind = i; biggest = a[i]; }
	 * 
	 * } a[bigind] = -1; bigger = a[0]; for (int i = 0; i < a.length; i++) { if
	 * (a[i] > bigger) { secind = i; bigger = a[i]; }
	 * 
	 * }
	 * 
	 * System.out.println(biggest + " " + bigger);
	 * 
	 * }
	 */
	
	public static void main(String[] args) {

		int[] a = {10, 20, 25, 63, 96, 57};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}

		System.out.println("Biggest" + " " + a[a.length-1]);
		System.out.println("Second Biggest" + " " + a[a.length-2]);

	}

}
