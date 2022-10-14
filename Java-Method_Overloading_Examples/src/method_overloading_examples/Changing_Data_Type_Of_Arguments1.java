package method_overloading_examples;

public class Changing_Data_Type_Of_Arguments1 {
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b, double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(1, 3));
		System.out.println(add(1.5, 1.2, 1.3));
	}
}
