package programs;

public class Constructor {
	
	int age ;
	String name;
	
	/* This is Default Constructor 
	 * public Constructor() { age=20; name="Saurav";
	 * 
	 * }
	 */
	
	// This is parametrized Constructor 
	public Constructor(int age, String name) {
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		
		Constructor a=new Constructor(20,"Saurav");
		System.out.println("The Age and Name is : "+ a.age+ " "+ a.name);
		a.age= 36;
		System.out.println("The Age and Name is : "+ a.age+ " "+ a.name);
	}

}
