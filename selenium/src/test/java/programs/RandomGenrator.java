package programs;

import java.util.Random;

public class RandomGenrator {

	public static void main(String[] args) {
	
		Random random= new Random();
		
		System.out.println("Generating First random number:"+ random.nextInt());
		System.out.println("Generating Second random number:"+ random.nextInt(800000,1000000));
		/*
		 * System.out.println("Generating Third random number:" + Math.random());
		 * System.out.println("Generating Fourth random number:" + Math.random());
		 * System.out.println("Generating Fifth random number:" + Math.random());
		 * System.out.println("Generating Sixth random number:" + Math.random());
		 */
		
		

	}

}
