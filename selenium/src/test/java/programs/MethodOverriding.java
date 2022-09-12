package programs;

public class MethodOverriding {
	
	
	

	public static void main(String[] args) {
	Bank a= new Bank();
	SBI b= new SBI();
	HDFC c= new HDFC();
	
	System.out.println("The Rate of Interest of RBI is:"+ a.getInterestRate());
	System.out.println("The Rate of Interest of SBI is:"+ b.getInterestRate());
	System.out.println("The Rate of Interest of HDFC is:"+ c.getInterestRate());
	}

}


class Bank{
	
	public double  getInterestRate() {
		
		
		return 7.0;
	}
	
}

class SBI extends Bank{
	
	public double getInterestRate() {
		
		
		return super.getInterestRate();
	}
	
}

class HDFC extends Bank{
	
	public double getInterestRate() {
		
		
		return 8.0;
	}
	
}
