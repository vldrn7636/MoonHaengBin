package EXAM;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {

		System.out.println("10���� 99������ ���ڸ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int result = (num % 10 == 0) ? num : (((num / 10) + 1) * 10);

		System.out.println(result + "-" + num + "=" + (result - num));

	}

}