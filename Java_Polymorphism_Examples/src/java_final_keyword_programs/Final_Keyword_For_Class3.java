package java_final_keyword_programs;

//final class Bike{}

//If we trying to extend the data from the parent class That is mentioned
//as the final class, then it will give you Compile time error
public class Final_Keyword_For_Class3{
	void run() {
		System.out.println("Running safely with 30Kmph");
	}
	
	public static void main(String[] args) {
		Final_Keyword_For_Class3 obj1=new Final_Keyword_For_Class3();
		obj1.run();
	}
}
