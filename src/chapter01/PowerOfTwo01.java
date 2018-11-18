package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// System.out.println("승수:");
		// System.out.print("승수:\n");

		// 입력받기
		System.out.print("승수:");
		int power = scanner.nextInt();

		// 2의 power승 하기(처리)
		int result = 1;
		int count = 0;
		while (count < power) {
			result = result * 2;
			count++;
		}

		// 출력하기
		System.out.println("2의 " + power + "승은 " + result + "입니다.");

		scanner.close();
	}
}
