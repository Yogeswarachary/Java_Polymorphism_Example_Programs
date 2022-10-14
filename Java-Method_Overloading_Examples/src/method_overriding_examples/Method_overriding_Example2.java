package method_overriding_examples;

//Java Program to demonstrate the real scenario of Java Method Overriding  
////where three classes are overriding the method of a parent class.  
//Creating a parent class
class Bank{
	//Method
	int getRateOfIntrest() {
		return 0;
	}
}

//Child class
class SBI extends Bank{
	//Method
	int getRateOfIntrest() {
		return 5;
	}
}

//Child class
class ICICI extends Bank{
	//Method
	int getRateOfintrest() {
		return 6;
	}
}

class HDFC extends Bank{
	//Method
	int getRateOfIntrest() {
		return 5;
	}
}

//Test class to create objects and call the methods
public class Method_overriding_Example2 {
	public static void main(String[] args) {
		
		//Creating objects for the child classes
		SBI obj1=new SBI();
		ICICI obj2=new ICICI();
		HDFC obj3=new HDFC();
		
		//printing the methods of the child classes
		System.out.println("SBI rate of intrest: "+obj1.getRateOfIntrest());
		System.out.println("ICICI rate of intrest: "+obj2.getRateOfintrest());
		System.out.println("HDFC rate of intrest: "+obj3.getRateOfIntrest());
	}
}
