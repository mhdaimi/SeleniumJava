package javaLearning.oopsConcepts.Polymorphism;

public class ChildClass extends ParentClass {
	
	public void add(int x, int y){
		int c = x+y;
		System.out.println("In Child class - Addition is: " + c);
	}

}
