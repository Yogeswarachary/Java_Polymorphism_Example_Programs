package java_method_binding_examples;

//Simply method overriding is the example for the Dynamic binding
public class Dynamic_binding_Example {
	//Parent class
	public static class SuperCls{
		//method
		void paint() {
			System.out.println("Super class painting");
		}
	}
	
	//Child class
	public static class SubCls{
		//method
		void paint() {
			System.out.println("Child class Painting");
		}
	}
	
	public static void main(String[] args) {
		//creating objects for parent and child class
		SuperCls obj1=new SuperCls();
		SubCls obj2=new SubCls();
		
		//Calling methods with the help of objects
		obj1.paint();
		obj2.paint();
	}
}
