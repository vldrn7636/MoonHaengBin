package EXAM;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �ʸ� �Է��ϼ���");
		num = scan.nextInt();
		int h = 0;
		int m = 0;
		int s = 0;

		h = (num / 3600);
		m = ((num % 3600) / 60);
		s = ((num % 3600) % 60);
		System.out.println(h + "�� " + m + "�� " + s + "�� �Դϴ�");
		/*
		 * System.out.print(num/3600 + "��"); // 12345/3600 = 3��
		 * System.out.print((num%3600)/60 + "��"); // %�� ������ �� ex) 10%6 = 4
		 * System.out.print((num%3600)%60 + "��");
		 */
	}
}
