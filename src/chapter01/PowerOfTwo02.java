package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 입력받기
		System.out.print("승수:");
		int power = scanner.nextInt();

		// 2의 power승 하기(처리)
		int result = 1;
		for(int count = 0; count < power; count++) {
			result = result * 2;
		}

		// 출력하기
		System.out.println("2의 " + power + "승은 " + result + "입니다.");
		
		// 자원정리
		scanner.close();
	}
}