package EXAM;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = num; 				    // for문을 위한 num값 보존
		int sum = 0;						// 값을 바로 더하기 위해 선언
		while (num > 0) { 					// 자연수가 아닐 경우엔 (num != 0)
			sum += num % 10; 				// 나머지 값을 sum에 더하기
			num /= 10; 						// 현재 num값의 마지막 자리수 제외
		} 									//
		System.out.println("합은: " + sum);

		int sum2 = 0;
		for (; num2 != 0; num2 /= 10) {
			sum2 += num2 % 10;

		}
		System.out.println("합은: " + sum2);
	}

}
