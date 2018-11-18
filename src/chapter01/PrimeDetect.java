package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("판별할 수:");
		int number = scanner.nextInt();
		
		// 처리(소수인지 판별)
		boolean isPrime = true;
		int i = 2;
		while(i < number) {
			if(number % i == 0) {
				isPrime = false;
				break;
			} 
			i++;
		}
		
		
		// 출력
		if(isPrime) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		// 리소스 정리
		scanner.close();
	}

}
