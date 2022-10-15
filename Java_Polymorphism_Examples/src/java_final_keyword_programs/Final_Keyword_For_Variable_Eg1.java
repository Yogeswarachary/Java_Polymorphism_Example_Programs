package java_final_keyword_programs;

public class Final_Keyword_For_Variable_Eg1 {
	final int speedlimit=90;//final variable
	//method
	void run() {
		//it will compile time error
		//speedlimit=400;
		System.out.println(speedlimit);
	}
	
	public static void main(String[] args) {
		//creating object for the Class
		Final_Keyword_For_Variable_Eg1 obj1=new Final_Keyword_For_Variable_Eg1();
		//calling method with the help of the class Object
		obj1.run();
	}
}
