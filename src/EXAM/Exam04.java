package EXAM;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int num = 0; // 5641

		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		System.out.println((num > 0) ? "���" : (num < 0) ? "����" : "0");
							//���ǽ�			   // true			 // false

	}

}
