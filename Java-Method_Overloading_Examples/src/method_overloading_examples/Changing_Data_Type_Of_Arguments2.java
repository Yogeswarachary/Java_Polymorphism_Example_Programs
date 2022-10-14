package method_overloading_examples;

class Adder{
	//Method overloading
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b, double c) {
		return a+b+c;
	}
}

public class Changing_Data_Type_Of_Arguments2 {
	public static void main(String[] args) {
		System.out.println(Adder.add(1, 2));
		System.out.println(Adder.add(2.2, 2.1, 2.7));
	}
}
