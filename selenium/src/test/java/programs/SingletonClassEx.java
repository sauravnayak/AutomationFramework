package programs;

public class SingletonClassEx {
	
	private static SingletonClassEx singleston;
	int age;
	
	
private SingletonClassEx() {
 
	age=20;
	
}

public static SingletonClassEx getinstance() {
	if(singleston==null) {
		singleston=new SingletonClassEx();
	}
	return singleston;

}

public static void main(String[] args) {
		
	SingletonClassEx a=SingletonClassEx.getinstance();
	System.out.println("Age of object is :"+ a.age);
	SingletonClassEx b=SingletonClassEx.getinstance();
		b.age = 40;
		System.out.println("Age of object is :"+ a.age);	
		
	}

}
