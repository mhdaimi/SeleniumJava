package javaLearning.basicPrograms;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 7;
		
		for (int i = 0; i < num; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		printStar();
		printPyramid();
	}
	
	public static void printStar(){
		
		int num = 7;
		int mum = 7;
		
		for (int i = 0; i < num; i++){
			for(int j = 0; j < mum; j++){
				System.out.print(" ");
			}
			mum-=1;
			for (int k = 0; k < i; k++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}
	
	public static void printPyramid(){
		int num = 6;
		for (int i = 0; i < num; i++){
			for(int j = num; j > i; j--){
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i-1; k++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
