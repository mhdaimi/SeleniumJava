package javaLearning.Advanced.superExample;

public class SubClass1 extends ParentClass{
	
	public SubClass1() {
		super("blah");
		System.out.println("This is default constructor of sub class 1");
		super.printMessage("Hello");
	}
	
	public SubClass1(String s) {
		System.out.println("This is parameterised constructor of sub class 1 with String " + s);
	}

}
