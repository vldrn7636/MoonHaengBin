package EXAM;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = num; 				    // for���� ���� num�� ����
		int sum = 0;						// ���� �ٷ� ���ϱ� ���� ����
		while (num > 0) { 					// �ڿ����� �ƴ� ��쿣 (num != 0)
			sum += num % 10; 				// ������ ���� sum�� ���ϱ�
			num /= 10; 						// ���� num���� ������ �ڸ��� ����
		} 									//
		System.out.println("����: " + sum);

		int sum2 = 0;
		for (; num2 != 0; num2 /= 10) {
			sum2 += num2 % 10;

		}
		System.out.println("����: " + sum2);
	}

}
