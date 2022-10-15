package java_method_binding_examples;

public class Java_Static_Binding_Example {
	
	//Static nested class
	public static class ParentCls{
		
		//method for inner class
		static void print() {
			System.out.println("Parent class is called");
		}
	}
	
	//Child class for above parent class
	public static class ChildCls extends ParentCls{
		//method
		static void print() {
			System.out.println("Child class is called");
		}
	}
	
	//main method
	public static void main(String[] args) {
		//creating object for parent class
		ParentCls obj1=new ParentCls();
		ParentCls obj2=new ChildCls();
		
		//Calling method over above objects
		obj1.print();
		obj2.print();
	}
}


