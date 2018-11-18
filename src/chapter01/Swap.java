package chapter01;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// SWAP Algorithm
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
