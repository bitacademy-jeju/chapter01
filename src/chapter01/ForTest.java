package chapter01;

public class ForTest {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i = i + 1){
			System.out.println("test");
		}
		
		int i = 0;
		for(; i < 3;){
			System.out.println("test");
			i = i + 1;
		}
		
	}
}

