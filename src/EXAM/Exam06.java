package EXAM;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		System.out.println("����� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		System.out.println("�ʿ��� ������ ���� : " + ((num % 10 > 0) ? (num / 10) + 1 : num / 10)); // ���ڿ� �ִ� 10������

	}

}