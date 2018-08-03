package javaLearning.Advanced.Exception;

public class ArithmaticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 0;
		try{
			int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
