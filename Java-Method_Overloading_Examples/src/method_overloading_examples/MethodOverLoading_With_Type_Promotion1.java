package method_overloading_examples;

public class MethodOverLoading_With_Type_Promotion1 {
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverLoading_With_Type_Promotion1 obj=new MethodOverLoading_With_Type_Promotion1();
		obj.sum(10, 20);
		obj.sum(29, 11, 20);
	}
}
