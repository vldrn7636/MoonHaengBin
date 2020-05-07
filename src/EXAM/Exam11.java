package EXAM;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();

		if (year % 4 != 0) {
			System.out.println("평년입니다");
		} else if (year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else if (year % 100 == 0) {
			System.out.println("평년입니다");
		} else if (year % 100 != 0) {
			System.out.println("윤년입니다");
		} else if (year % 400 == 0) {
			System.out.println("윤년입니다");
		}

	}

}
