package EXAM;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		if (0 < num) {
			System.out.println("����Դϴ�");
		} else if (num < 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("0�Դϴ�");
		}

	}

}
