package super_keyword_examples;

//super is used to refer immediate parent class instance variable.
//Parent class
class Animal{
	String color="white";
}

//Child class
class Dog extends Animal{
	String color="black";
	//Method
	void printColor() {
		System.out.println(color);//black
		System.out.println(super.color);//prints animal class
	}
}

//Main class to drive the code
public class SuperKeywordExample1 {
	public static void main(String[] args) {
		//Creating object for the child class
		Dog obj=new Dog();
		//method calling with help of object name
		obj.printColor();
	}
}
