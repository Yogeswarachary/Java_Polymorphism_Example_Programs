package java_runtime_polymorphism_examples;

//Parent class
class Bank{
	//method
	float getRateOfIntrest() {
		return 0;
	}
}

//Child class
class SBI extends Bank{
	//method
	float getRateOfIntrest() {
		return 3.8f;
	}
}

//Child class
class HDFC extends Bank{
	//method
	float getRateOfIntrest() {
		return 4.3f;
	}
}

//child class
class Axis extends Bank{
	float getRateOfIntrest() {
		return 4.6f;
	}
}

//Main method driven class
public class Runtime_Polymorphism_Example1 {
	
	public static void main(String[] args) {
		
		//creating IS-A(inheritance)relation to the Bank class with main class
		Bank bank;
		
		//Object for sbi
		bank=new SBI();
		System.out.println("The SBI bank rate of intrest is: "+ bank.getRateOfIntrest());
		
		//Object for HDFC
		bank=new HDFC();
		System.out.println("The HDFC bank rate of intrest is: "+ bank.getRateOfIntrest());
		
		//Object for Axis
		bank=new Axis();
		System.out.println("The Axis bank rate of intrest is: "+bank.getRateOfIntrest());
	}
}
