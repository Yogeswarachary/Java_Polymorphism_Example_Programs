package method_overloading_examples;
class Adding{
	//Method overloading 
	static int sum(int a, int b) {
		return a+b;
	}
	//Method overloading
	static int sum(int a,int b,int c) {
		return a+b+c;
	}
}

public class Changing_Number_Of_Arguments2 {
	public static void main(String[] args) {
		//Printing values for the above overloaded methods
		System.out.println(Adding.sum(1,2));
		System.out.println(Adding.sum(1, 3, 2));
	}
}
