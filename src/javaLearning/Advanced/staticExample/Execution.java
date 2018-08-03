package javaLearning.Advanced.staticExample;

public class Execution {

	public static void main(String[] args) {
		
		StaticExClass sc = new StaticExClass();
		System.out.println(sc.i);
		System.out.println(sc.j);
		System.out.println(sc.k);
		sc.i++;
		sc.k++;
		
		StaticExClass sc1 = new StaticExClass();
		System.out.println(sc1.i);
		System.out.println(sc1.k);
		
		sc1.printMessage();
		StaticExClass.display();
	}

}
