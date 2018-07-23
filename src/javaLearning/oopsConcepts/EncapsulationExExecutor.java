package javaLearning.oopsConcepts;

public class EncapsulationExExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationEx obj = new EncapsulationEx();
		obj.setCompanyName("ABC Limited");
		obj.setId(244786);
		obj.setName("Mohammad Daimi");
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Employee Id: " + obj.getEmployeeId());
		System.out.println("Company: " + obj.getCompanyName());
		
	}

}
