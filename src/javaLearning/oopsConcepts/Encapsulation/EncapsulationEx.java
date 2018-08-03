package javaLearning.oopsConcepts.Encapsulation;

public class EncapsulationEx {
	
	private String name;
	private int empId;
	private String companyName;
	
	public void setName(String iName){
		name = iName;
	}
	
	public void setId(int id){
		empId = id;
	}
	
	public void setCompanyName(String iCompanyName){
		companyName = iCompanyName;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public int getEmployeeId(){
		return empId;
	}
	
	

}
