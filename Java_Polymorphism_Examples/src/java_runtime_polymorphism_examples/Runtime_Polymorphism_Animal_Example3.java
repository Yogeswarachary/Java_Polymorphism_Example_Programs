package java_runtime_polymorphism_examples;

//Parent class
class Animal{
	//Method
	void eat() {
		System.out.println("eating...");
	}
}

//Child class
class Dog extends Animal{
	//Method
	void eat() {
		System.out.println("Dog eating...");
	}
}

//Child class
class Cat extends Animal{
	//Method
	void eat() {
		System.out.println("Cat eating...");
	}
}

//Child class
class Lion extends Animal{
	//Method
	void eat() {
		System.out.println("Lion eating...");
	}
}

//Main driving class
public class Runtime_Polymorphism_Animal_Example3 {
	public static void main(String[] args) {
		
		//Calling Animal class with IS-A relationship
		Animal animal;
				
		//Creating objects for each and every child class and
		//calling method with help of Object
		animal=new Animal();
		animal.eat();

		animal=new Dog();
		animal.eat();
		
		animal=new Cat();
		animal.eat();
		
		animal=new Lion();
		animal.eat();
		
		//If you want to work with the Runtime Polymorphism, Remember one thing
		//The child classes have the similar methods names and similar parameters
	}
}
