package javaLearning.Advanced.staticExample;

public class StaticExClass {
	
	int i = 10;
	int j = 20;
	static int k = 100;
	
	static public void display(){
		System.out.println("Displaying...... from static method");
	}
	
	public void printMessage(){
		System.out.println("Displaying...... from method");
	}

}
