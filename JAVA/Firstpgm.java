package JAVA;
import java.util.Scanner ;  
public class Firstpgm {

	
	static int a = 12222; // static var
	 int b = 12345; //global var
	 
	 public void method1() {
		 int d = 980998;
		 System.out.println("Method 1 = "+a  +d);
	 }
	 
	 
	public static void main(String[] args) {
		
		Firstpgm f2 = new Firstpgm();
		int c = 1000; //local var
		
		System.out.println("Static var = "+a);
	//	System.out.println(b);
		System.out.println("Local var = " +c);
		
	f2.method1();
		
	}
	
}

