package programs;

public class MethodOverloading {
	
	
	public int add(int a, int b) {
		return a+b;
		
		
	}
	
	public int add(int a, int b, int c) {
		
		
		return a+b+c;
	}

	public static void main(String[] args) {
		
		MethodOverloading ob= new MethodOverloading();
		System.out.println(ob.add(6,8));
		System.out.println(ob.add(9, 8, 10));
		

	}

}
