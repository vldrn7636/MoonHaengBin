package EXAM;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		char ch = str.charAt(0);

		System.out.println((int) ch);
		System.out.println((ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : "소문자아님"); // A=65 a=97 인걸 이용해 소문자를 대문자로 변환

	}

}
