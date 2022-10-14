package super_keyword_examples;

class Vehicle{
	void drive() {
		System.out.println("Driving vehicle");
	}
}

class Bike extends Vehicle{
	void drive() {
		System.out.println("driving bike");
	}
	void driveBike() {
		System.out.println("bike running");
	}
	void run() {
		super.drive();
		driveBike();
	}
}

public class SuperKeywordExample2 {
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run();
	}
}
