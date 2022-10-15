package java_runtime_polymorphism_examples;

//Parent class
class Shape{
	//method
	void draw() {
		System.out.println("drawing...");
	}
}

//Child class
class Circle extends Shape{
	//method
	void draw() {
		System.out.println("drawing circle...");
	}
}
//Child class
class Triangle extends Shape{
	//method
	void draw() {
		System.out.println("drawing triangle...");
	}
}

//child class
class Rectangle extends Shape{
	//method
	void draw() {
		System.out.println("draw rectangle...");
	}
}

public class Runtime_Polymorphism_Shape_Example2 {
	public static void main(String[] args) {
		
		//Creating IS-A relationship(Inheritance)
		Shape shape;
		
		//creating objects for Circle, Triangle, Rectangle
		//along with their methods respectively
		shape=new Circle();
		shape.draw();
		
		shape=new Triangle();
		shape.draw();
		
		shape=new Rectangle();
		shape.draw();
	}
}
