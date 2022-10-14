package super_keyword_examples;

//Parent class
class Flower{
	//Constructor
	Flower(){
		System.out.println("Hello from Flower class");
	}
}

//Child class
class Rose extends Flower{
	//Constructor
	Rose(){
		System.out.println("Hello from Rose class");
	}
}

//Driving class
public class Super_Provided_ByCompiler_Example4 {
	public static void main(String[] args) {
		//Creating object for the child class
		Rose obj1=new Rose();
	}
	
}
