package javaLearning.oopsConcepts;

public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = add(10, 20);
		System.out.println(sum);

		int result = add(10, 20, 30);
		System.out.println(result);
		
		float sum1 = add(10f, 2.5f);
		System.out.println(sum1);
	}
	
	public static int add(int x, int y){
		int result = 0;
		result = x + y;
		
		return result;
	}
	
	public static int add(int x, int y, int z){
		int result = 0;
		result = x + y + z;
		
		return result;
	}
	
	public static float add(float x, float y){
		float result = 0;
		result = x + y;
		
		return result;
	}

}
