package super_keyword_examples;

//Parent class
class Book{
	//Constructor
	Book(){
		System.out.println("Book class is calling");
	}
}

//Child class
class LongBook extends Book{
	//Constructor
	LongBook(){
		super();//This will call the parent class constructor
		System.out.println("Long book class is calling");
	}
}

public class Super_Keyword_Example3 {
	public static void main(String[] args) {
		//creating the object for the child class
		LongBook obj1=new LongBook();
	}
}
