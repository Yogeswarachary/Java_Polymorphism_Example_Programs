package method_overloading_examples;

public class Changing_Number_Of_Arguments1 {
	//Method overloading
	static int add(int a, int b) {
		return a+b;
	}
	//Method overloading
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
	}
}
