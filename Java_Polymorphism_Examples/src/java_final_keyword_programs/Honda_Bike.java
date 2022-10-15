package java_final_keyword_programs;

//Final_Keyword_For_Method
//Parent class
class Bike{
	final void run() {
		System.out.println("Running");
	}
}

public class Honda_Bike extends Bike {
	//this below line gives you Compile time error
//	void run() {
//		System.out.println("Running honda bike");
//	}
	public static void main(String[] args) {
		Honda_Bike honda=new Honda_Bike();
		honda.run();
	}
}
