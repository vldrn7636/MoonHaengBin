package EXAM;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);

		if ('0' <= ch && ch <= '9') {			// 한글자뿐만 아니라 5659559 같은 거도 문제없다.
			System.out.println("숫자입니다");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자입니다");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자입니다");		// 소문자와 대문자를 섞어 쓰면 맨 앞에걸로 
		} else {
			System.out.println("기타");
		}

	}

}
