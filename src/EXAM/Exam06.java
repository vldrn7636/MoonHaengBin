package EXAM;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		System.out.println("필요한 상자의 갯수 : " + ((num % 10 > 0) ? (num / 10) + 1 : num / 10)); // 상자엔 최대 10개까지

	}

}