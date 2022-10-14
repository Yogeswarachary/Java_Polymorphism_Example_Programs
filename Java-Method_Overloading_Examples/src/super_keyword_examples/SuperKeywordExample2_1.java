package super_keyword_examples;

//Parent class
class Animals{ 
	//Method
	void eat1(){
		System.out.println("eating...");
	}  
}  
class Dogs extends Animals{  
	//Calling parent method
	void eat1(){
		System.out.println("eating bread...");
		} 
	//Method of a child class
	void bark(){
		System.out.println("barking...");
		}  
	//Method calling the Parent class
	void work(){  
		super.eat1();  
		bark();  
	}  
}  

public class SuperKeywordExample2_1 {
	public static void main(String[] args) {
		//Object creation
		Dogs obj=new Dogs();
		//Calling method with the help of the Object
		obj.work();
	}
}
