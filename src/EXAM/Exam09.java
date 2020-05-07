package EXAM;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		if (0 < num) {
			System.out.println("양수입니다");
		} else if (num < 0) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}

	}

}
