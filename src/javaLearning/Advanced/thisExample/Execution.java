package javaLearning.Advanced.thisExample;

public class Execution {

	public static void main(String[] args) {
		ThisExample te = new ThisExample("Sacchidanand", 18056);
		te.printMessage();
		
		ThisExample te1 = new ThisExample("Mohammad", 17849);
		te1.printMessage();
	}
}
