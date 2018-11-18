package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		//처리 0 ~ input 까지의 합
		int sum = 0;
		for(int i = 0; i <= input; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		//출력
		System.out.println(sum);
		
		// 자원정리
		scanner.close();
	}

}
