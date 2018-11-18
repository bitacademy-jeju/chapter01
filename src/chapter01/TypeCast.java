package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		
		// implicity(암시적) type casting
		int i = 10;
		long l = i;
		System.out.println(i + ":" + l);
		
		// explicity(명시적) type casting
		long l2 = 123456789L;
		int i2 = (int)l2;
	}

}
