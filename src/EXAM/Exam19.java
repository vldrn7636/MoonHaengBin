package EXAM;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �Է�");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();

		for (int i = len; i >= 1; i--) {
			for (int j = 1; j <= len; j++) {
				if (i > j)					
					System.out.print(" ");	// true�� ��� " "(����) ���
				else
					System.out.print("*");	// false�� ��� "*" ���
			}
			System.out.println();
		}
	}

}
