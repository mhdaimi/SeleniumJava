package javaLearning.oopsConcepts.AbstractionEx;

public abstract class Bike {
	
	public abstract void gear();
	
	public abstract void accelarate();

	public void brake(){
		
		System.out.println("Applying brakes...... from Bike");
	}

}
