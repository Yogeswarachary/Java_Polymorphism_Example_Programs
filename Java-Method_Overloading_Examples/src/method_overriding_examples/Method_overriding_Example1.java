package method_overriding_examples;

//Parent class
class Vehicle{
	//Method
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class Method_overriding_Example1 extends Vehicle{
	//Method
		void run() {
			System.out.println("Bike is running");
		}
		public static void main(String[] args) {
			Method_overriding_Example1 obj1=new Method_overriding_Example1();
			obj1.run();//Calling the method
		}
}
