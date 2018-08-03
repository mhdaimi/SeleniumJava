package javaLearning.Advanced.superExample;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("This is the default constructor of Parent Class");
	}
	
	public ParentClass(String s){
		System.out.println("This is a parameterised constructor with String value " + s);
	}
	
	public ParentClass(int i){
		System.out.println("This is a parameterised constructor with integer value " + i);
	}
	
	public void printMessage(String msg){
		
		System.out.println("Printing from method printMessage in Parent Class");
	}

}
