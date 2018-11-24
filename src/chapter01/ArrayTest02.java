package chapter01;

public class ArrayTest02 {

	public static void main(String[] args) {
		int     arrayInt1[]; //비추천
		int[]   arrayInt2;   //추천
		// 오류
		// int[10] arrayInt3;
		
		arrayInt2 = new int[5];
		arrayInt2[0] = 0;
		arrayInt2[1] = 1;
		arrayInt2[2] = 2;
		arrayInt2[3] = 3;
		arrayInt2[4] = 4;
		
		//배열 초기화
		int[] arrayInt3 = {0, 1, 2, 3, 4};
		
		//배열 초기화 오류
		//int[] arrayInt4;
		//arrayInt4 = {0, 1, 2, 3, 4};
		
		// 초기화(비추천)
		int[] arrayInt5 = new int[] {0, 1, 2, 3, 4};
		
		
		

	}

}
