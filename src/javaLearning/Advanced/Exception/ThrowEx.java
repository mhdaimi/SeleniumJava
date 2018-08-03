package javaLearning.Advanced.Exception;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Throwing manual exception...........");
			throw new Exception("Error throw kela");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
