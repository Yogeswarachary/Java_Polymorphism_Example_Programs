package method_overloading_examples;

public class MethodOverLoading_With_Type_Promotion2 {
	//Method
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}
	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}
	
	public static void main(String[] args) {
		MethodOverLoading_With_Type_Promotion2 obj1=new MethodOverLoading_With_Type_Promotion2();
		obj1.sum(20, 20);
	}
}
