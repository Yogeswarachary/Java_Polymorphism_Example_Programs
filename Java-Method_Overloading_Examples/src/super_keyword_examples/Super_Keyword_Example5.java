package super_keyword_examples;

//Parent class
class Person{
	int id;
	String name;
	
	//Constructor
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class Employee extends Person{
	float salary;
	Employee(int id,String name,float salary){
		super(id,name);//reusing the parent class constructor
		this.salary=salary;
	}
	
	//Method
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	
}
public class Super_Keyword_Example5 {
	public static void main(String[] args) {
		//Creating object for the child class
		Employee obj1=new Employee(1, "Divya", 40000);
		//calling a method using the object of the child class
		obj1.display();
	}
}
