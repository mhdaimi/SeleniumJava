package javaLearning.Advanced.thisExample;

public class ThisExample {
	
	String name; 
	int employeeId;
	
	public ThisExample(String name, int employeeId) {
		//name = name;
		//employeeId = employeeId;
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public void printMessage(){
		System.out.println(name);
		System.out.println(employeeId);
	}

}
